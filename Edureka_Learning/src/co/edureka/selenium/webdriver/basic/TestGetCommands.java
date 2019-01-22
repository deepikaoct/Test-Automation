package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class TestGetCommands{
		
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
	
	
public void getCommands() {
	try {
		
	
	driver.get("http://www.amazon.in");
	String TitleOfThePage = driver.getTitle();
	
	System.out.println("the title of the page" +TitleOfThePage);
	driver.findElement(By.linkText("Today's Deals")).click();
	String CurrentUrl = driver.getCurrentUrl();
	System.out.println("The Current URL of the Page is " +CurrentUrl);
	System.out.println("The Current Page Source is:" +driver.getPageSource());	
	
	}catch (Exception e) {
		e.printStackTrace();	
	}

	}
	public static void main(String[] args) {
		
		TestGetCommands obj1 = new TestGetCommands();
		obj1.InvokeBrowser();
		obj1.getCommands();
		
		
		

		
	}
}