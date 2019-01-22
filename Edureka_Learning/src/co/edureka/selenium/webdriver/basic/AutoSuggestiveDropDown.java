package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.JavascriptExecutor;



public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		
	
		// javascript DOM can extract hidden elements
		// because selenium cannot find hidden elements
		// investigate if the object has any hidden properties
		
JavascriptExecutor js = (JavascriptExecutor) driver;
String script = "return document.getElementById(\"fromPlaceName\").value;";
String text = (String)js.executeScript(script);
System.out.println(text);
while(!text.equalsIgnoreCase("BENGALURU")) {
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	text = (String)js.executeScript(script);
	

}

}
}