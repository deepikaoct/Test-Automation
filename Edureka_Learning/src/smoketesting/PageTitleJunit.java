package smoketesting;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageTitleJunit {
	
	WebDriver driver;
	@Test
	public void PageTitleTest()
	{
	    String WebUrl="https:www.google.com";
		driver.get(WebUrl);
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.fail("we intentionally failed this test");		
		}

 @Before
public void setUp()
{
System.out.println("Setting up the test");
System.out.println("Running this test");
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();
	
}

  @After
public void tearDown()
{
	  System.out.println("Close this test");
	  driver.close();
	  System.out.println("Closed the browser");
}

}