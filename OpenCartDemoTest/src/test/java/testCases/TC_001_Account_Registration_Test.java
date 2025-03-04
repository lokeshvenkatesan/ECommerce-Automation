package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_Account_Registration_Test extends BaseClass {

	@Test
	public void verify_Account_registration() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();

		AccountRegistrationPage ar = new AccountRegistrationPage(driver);
		ar.setFirstName(generateRandomString().toUpperCase());
		ar.setPassword("Lokesh@123");
	}

	
}
