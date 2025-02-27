package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaPage {

	WebDriver driver;

	// constructor create
	 LaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(name = "email")
	WebElement txtusername;
	@FindBy(name = "password")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@type ='button']")
	WebElement clickbtn;

	//Action Methods
	public void setUserName(String user) {
		txtusername.sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys("Admin@123");
	}
	
	public void clickLogin() {
		clickbtn.click();
	}
	
	
}

