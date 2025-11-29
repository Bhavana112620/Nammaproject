package stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.PageObjectClass1;

public class Step1 {
	static WebDriver driver;
	PageObjectClass1 po;
	public Step1() {
		this.driver=Steps.driver;
		po=new PageObjectClass1(driver);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("user enters email address")
	public void user_enters_email_address() {
	   po.email();
	}

	@And("user enters password")
	public void user_enters_password() {
	   po.password();
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		po.login();
	}

	@Then("user able to be in loginpage")
	public void user_able_to_be_in_loginpage() {
		Assert.assertEquals(driver.getTitle(),"My Account");
	    
	}
}
