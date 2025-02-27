package day43;

import org.testng.annotations.Test;

public class AssertionDemo {

	@Test

	public void testTitle() {

		String exp_title = "OpenCart";
		String act_title = "OpenCart";

		if (exp_title.equals(act_title)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}

}
