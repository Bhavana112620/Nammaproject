package stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.PageObjectClass2;

public class Steps2 {
	WebDriver driver;
	PageObjectClass2 ps;
	
	public Steps2() {
		this.driver=Step1.driver;
		ps=new PageObjectClass2(driver);
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/search&search");
	}
	@Given("User has logged in")
	public void user_has_logged_in() {
	    
	}

	@When("User enters a valid product name in the search box")
	public void user_enters_a_valid_product_name_in_the_search_box() {
	    
	}

	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
	    
	}

	@Then("User should see the searched product displayed")
	public void user_should_see_the_searched_product_displayed() {
		Assert.assertEquals(driver.getTitle(),"Search -");
	    
	}



}
