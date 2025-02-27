package day44;

import org.testng.annotations.Test;

public class payments {

	@Test(priority = 1, groups = {"sanity", "regression", "functional"})
	public void paymentinRupees() {
		System.out.println("signUp by Email");

	}

	@Test(priority = 2, groups = {"sanity", "regression", "functional"})
	public void paymentinDollars() {
		System.out.println("signUp by FB");
	}

}
