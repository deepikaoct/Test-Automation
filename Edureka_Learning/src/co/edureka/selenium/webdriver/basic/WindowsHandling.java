package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Iterator;
import java.util.Set;



public class WindowsHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		 driver.get("https:www.amazon.com");
		 
		 Set<String> ids;
		 ids = driver.getWindowHandles();
		 Iterator <String> id = ids.iterator();
		 String parentid = id.next();
		 String childid = id.next();
		 driver.switchTo().window(childid);
		
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(parentid);
		 System.out.println(driver.getTitle());
		 
		 
		 
		 
		 
		
	}

}
