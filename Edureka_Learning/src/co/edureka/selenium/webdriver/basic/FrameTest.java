package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://jqueryui.com/droppable/");
		 //this gets the total number of frames in the webpage
		 driver.findElements(By.tagName("iframe")).size();
		 //this switch to the first index of the frame
		 driver.switchTo().frame(0);
		 //finding  the frame inside the webpage using the tagname iframe
		 //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe['demo-frame']")));
		 
		 driver.findElement(By.id("draggable")).click();;
		 Actions a = new Actions(driver);
		 WebElement sour = driver.findElement(By.id("draggable"));
		 WebElement targ = driver.findElement(By.id("droppable"));
		 a.dragAndDrop(sour, targ).build().perform();
		 driver.switchTo().defaultContent();
		 

	}

}
