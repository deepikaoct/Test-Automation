package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
	WebDriver driver;
	JavascriptExecutor jse;
	
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
	
	public void searchCourse() {
		
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("java");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("homeSearchBarIcon")).click();
			
			jse = (JavascriptExecutor)driver;
//		jse.executeScript("scroll(0,500)");
			driver.findElement(By.id("d_wishlist-icon-585")).click();
//			driver.findElement(By.xpath("//class[contains(text(),'viewdetailsbtn')]")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		Day1 myobj = new Day1();
		myobj.invokeBrowser();
		myobj.searchCourse();
	}

}
