package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority=1)
	public void openApp() {
		Assert.assertTrue(false);
	}
	
	
	@Test(priority=2, dependsOnMethods = {"openApp"})
	public void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	public void search() {
		Assert.assertTrue(true);

	}
	
	@Test(priority=4, dependsOnMethods = {"login", "search"})
	public void advSearch()
	{
		Assert.assertTrue(true);

	}
}
