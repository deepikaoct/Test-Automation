package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	//utility to find the frame number in which a particular element you are looking for is present
	public static int frameNumber(WebDriver driver, By by) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {

				break;
			}
		}

		return i;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		int num = frameNumber(driver, By.xpath("ccc"));
		driver.switchTo().frame(num);
		driver.findElement(By.xpath("ccc")).click();
		driver.switchTo().defaultContent();

	}
}
