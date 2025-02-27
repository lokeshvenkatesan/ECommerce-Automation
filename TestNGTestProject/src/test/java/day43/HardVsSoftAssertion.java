package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	// @Test
	public void hardAssertion() {
		System.out.println("TC1");
		Assert.assertEquals(101, 102);
		System.out.println("TC2");
	}

	@Test
	public void softAssertion() {
		System.out.println("TC1");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(101, 102);
		System.out.println("TC2");
		sa.assertAll(); // this will actually print the result (if failed)
	}

}
