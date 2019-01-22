
package co.edureka.selenium.webdriver.basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {
	
	WebDriver driver;
	
	
public void invokeBrowser() {
		
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
	

}

