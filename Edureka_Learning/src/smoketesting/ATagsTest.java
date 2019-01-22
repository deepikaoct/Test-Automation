package smoketesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
WebDriver driver;
	
	@Test
	public void loginElement()
	
	{
		System.out.println("Running the test");
		boolean createAccountPresent = false;
		//
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		
		int numberOfAElements = aElements.size();
		System.out.println("There are " + numberOfAElements + " a tags on the page");
		
		for (WebElement aElement : aElements) {
			System.out.println(aElement.getText());
			if(aElement.getText().equals("CREATE ACCOUNT")) {
				createAccountPresent = true;
				break;
				
			}
		}
		//Assertion
		Assert.assertTrue(createAccountPresent);
	}
    
	@BeforeMethod
	public void setUp() {
	
		System.out.println("setting up the test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		
    }

    @AfterMethod
	public void tearDown() {
    	
    	System.out.println("Closing the test");
        driver.close();
    }
}
