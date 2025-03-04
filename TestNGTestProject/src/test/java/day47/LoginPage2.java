package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	// Constructor method
	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// Locators
	@FindBy(name = "username")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;

	// Action methods
	public void setUserName(String User) {
		txt_username.sendKeys(User);
	}

	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}

}
