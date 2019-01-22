package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Synchronization {
	
	public void waitMethod() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.com");
	 Actions a = new Actions(driver);
	 WebElement elem = driver.findElement(By.id("nav-link-accountList"));

	 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	//context click will help to right click on particular element. this line of code
	 //is moving to a particular element and right clicking it 
	 a.keyUp(Keys.SHIFT);
	 a.moveToElement(elem).contextClick().build().perform();
	 
	 
	}
public static void main (String[] args)
{
Synchronization s = new Synchronization();
s.waitMethod();
}
}



