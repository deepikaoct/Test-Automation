package co.edureka.selenium.webdriver.basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksHandling extends LoginClas {

	

	


	public LinksHandling(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
		// limiting the scope of the driver to only footage so that hover on the dev
		// tools and get only the footer id

		WebElement prefoot = driver.findElement(By.id("prefooter"));
		System.out.println(prefoot.findElements(By.tagName("a")).size());


		WebElement col = prefoot.findElement(By.xpath("//div[@id='links']/nav/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());

		// check all the links in the column , get the count and iterate through the
		// count of links in the column and click
		// each and every link in a tag
		for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) {

			String linkonnewtab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			col.findElements(By.tagName("a")).get(i).sendKeys(linkonnewtab);
		}

			Thread.sleep(5000);
			Set <String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
			

		}
	}

}
