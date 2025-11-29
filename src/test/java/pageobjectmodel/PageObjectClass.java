package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass {
	WebDriver driver;
	//constructors
	 public PageObjectClass(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	By fn=By.id("input-firstname");
	By ln=By.id("input-lastname");
	By em=By.id("input-email");
	By tl=By.id("input-telephone");
	By pass=By.id("input-password");
	By cp=By.id("input-confirm");
	By rd=By.xpath("//input[@value='0']");
	By pp=By.xpath("//input[@name='agree']");
	By cb=By.xpath("//input[@value='Continue']");
	
	//ActionMethods
	
	public void firstname(){
		driver.findElement(fn).sendKeys("Shayli");
		
	}
	
	public void lastname() {
		driver.findElement(ln).sendKeys("KM");
		
	}
	
	public void email() {
		
		driver.findElement(em).sendKeys("bhavana33edr77777655exvfnmdd12555391ppp9@gmail.com");
	}
	
	public void telephone() {
		driver.findElement(tl).sendKeys("8861478865");
		
	}
	
	public void password() {
		driver.findElement(pass).sendKeys("rabbit111");

		
	}
	
	public void passwordconfirm() {
		driver.findElement(cp).sendKeys("rabbit111");
		
	}
	
	public void radiobutton() {
		driver.findElement(rd).click();
		
	}
	
	public void privacypolicy() {
		driver.findElement(pp).click();
		
	}
	
	public void continuebutton() {
		driver.findElement(cb).click();
		
	}

}
