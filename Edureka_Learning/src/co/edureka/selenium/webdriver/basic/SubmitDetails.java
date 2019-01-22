package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitDetails {
	
    static WebDriver driver;
		

		//invoke the browser
		public void logInThePage() {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
		
		public static void submittingReports() {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver.findElement(By.name("q")).sendKeys("java");
			driver.findElement(By.name("btnK")).click();
			
		}

public static void main (String[] args) {
SubmitDetails obb = new SubmitDetails();
obb.logInThePage();
submittingReports();




}



	
		
	

}
