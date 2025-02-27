package day44;

import org.testng.annotations.Test;

public class signUp {

	@Test(priority = 1, groups = {"regression"})
	public void signUpbyEmail() {
		System.out.println("signUp by Email");

	}

	@Test(priority = 2, groups = {"regression"})
	public void signUpByFacebook() {
		System.out.println("signUp by FB");
	}

	@Test(priority = 3, groups = "regression")
	public void signUpByTwitter() {
		System.out.println("Twitter signUp");
	}
}
