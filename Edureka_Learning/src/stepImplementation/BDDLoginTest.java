package stepImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLoginTest {
	 WebDriver driver;
	 
	
   @Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");
	   System.out.println("User is on the login Page");
	   	   
		
	}
 	@When("^user enters correct username and correct password$")
   public void user_enters_correct_username_and_correct_password () {
 		System.out.println("user enters correct username and correct password");
	   
   }
   
 	@Then("^user gets confirmation$")
 	public void user_gets_confirmation() {
 		
 		System.out.println("user gets confirmation");
 		
 	}

}
