package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesToPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		driver.findElement(By.xpath("//a[@href='/cricket-match/live-scores']")).click();
		driver.findElement(By.xpath("//nav[@class='cb-mat-mnu']/a[3]")).click();
		driver.findElement(By.xpath("//a[@title='South Africa vs Pakistan, 3rd Test Scorecard']")).click();

	}

}
