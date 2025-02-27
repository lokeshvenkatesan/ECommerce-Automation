package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTestDemo {

	@BeforeMethod
	public void Login()
	{
		System.out.println("This is login");
	}
	
	@Test
	public void search()
	{
		System.out.println("This is Search");
	}
	
	@Test
	public void advancedSearch()
	{
		System.out.println("This is Advanced Search");
	}
	
	@AfterMethod
	
	public void logout()
	{
		System.out.println("This is Logout");
	}
	
}
