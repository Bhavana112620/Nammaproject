package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass1 {
	WebDriver driver;
	public PageObjectClass1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By emailaddress = By.id("input-email");
	By passw = By.id("input-password");
	By log = By.xpath("//input[@value='Login']");
	
	public void email() {
		driver.findElement(emailaddress).sendKeys("bhavana3edr65885exvfdd1239ppp9@gmail.com");
		
	}
	
	public void password() {
		 driver.findElement(passw).sendKeys("rabbit111");
	}
	
	public void login() {
		driver.findElement(log).click();
		
	}

}
