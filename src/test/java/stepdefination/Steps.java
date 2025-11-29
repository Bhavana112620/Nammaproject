package stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.PageObjectClass;
import pageobjectmodel.PageObjectClass1;

public class Steps {
	public static WebDriver driver;
	PageObjectClass pc;
	
	@Given("user has launched the browser and the application")
	public void user_has_launched_the_browser_and_the_application() throws InterruptedException {
		driver=new ChromeDriver();
		Hooks.driver=driver;
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		pc= new PageObjectClass(driver);
	
	}
	
	@When("user enter valid firstname")
	public void user_enter_valid_firstname() {
		
		pc.firstname();
	   
	}

	@And("user enter valid lastname")
	public void user_enter_valid_lastname() {
	    pc.lastname();
	}

	@And("user enter valid email")
	public void user_enter_valid_email() {
	    pc.email();
	}

	@And("user enter valid telephone")
	public void user_enter_valid_telephone() {
	    pc.telephone();
	}

	@And("user enter valid password")
	public void user_enter_valid_password() {
		pc.password();
	}

	@And("user enter valid password confirm")
	public void user_enter_valid_password_confirm() {
		pc.passwordconfirm();
	}

	@And("user click on radio button")
	public void user_click_on_radio_button() {
		pc.radiobutton();
	}

	@And("user click on privacy policy checkbox")
	public void user_click_on_privacy_policy_checkbox() {
		pc.privacypolicy();
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {
		pc.continuebutton();
	}

	@Then("user able to be in homepage")
	public void user_able_to_be_in_homepage() {
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	}



}
