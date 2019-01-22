
package smoketesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	
	WebDriver driver;
	
	@Test
	public void loginElement()
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		boolean loginEmailbox = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean passwordBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		
		Assert.assertTrue(loginEmailbox);
		Assert.assertTrue(passwordBox); 
		
	}
    
	@BeforeMethod
	public void setUp() {
	
		System.out.println("setting up the test");
    }

    @AfterMethod
	public void tearDown() {
    	
    	System.out.println("Closing the test");
        driver.close();
    }
}