package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	
	WebDriver driver;
	
public void InvokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

public void NavigategetCommands()
{
	
	try {
		
	
	driver.navigate().to("https://www.flipkart.com");
	driver.findElement(By.xpath("//span[starts-with(text(),'Appliances')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Microwave Oven')]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	}catch (InterruptedException e) {
		e.printStackTrace();
		
		
	}
	
}

public void closeMethod() {
	driver.close();
}
	
	
public static void main(String[] args) {
	
	NavigateCommands obj2 = new NavigateCommands();
	obj2.InvokeBrowser();
	obj2.NavigategetCommands();
}
}
