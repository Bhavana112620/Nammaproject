package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectClass2 {
	WebDriver driver;
	//constructors
	 public PageObjectClass2(WebDriver driver)
	{
		this.driver=driver;
	}
	 
	 
	 By searchbx = By.xpath("//input[@placeholder='Search']");
	 By searchbu = By.xpath("//button[@class='btn btn-default btn-lg']");

	 
	 public void searchbox() {
		 driver.findElement(searchbx).sendKeys("iphone");
		 
	 }
	 
	 
	 public void searchbutton() {
		 driver.findElement(searchbu).click();
		 
	 }
	 
	
}
