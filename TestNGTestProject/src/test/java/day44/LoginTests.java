package day44;

import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority = 1, groups= {"sanity"})
	public void loginbyEmail() {
		System.out.println("Login by Email");

	}

	@Test(priority = 2, groups = {"sanity"})
	public void loginByFacebook() {
		System.out.println("Login by FB");
	}

	@Test(priority = 3, groups = {"sanity"})
	public void loginByTwitter() {
		System.out.println("Twitter Login");
	}
}
