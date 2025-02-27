package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationTestDemo2 {

	// Before and After Class will execute only ONCE.
	
	@BeforeClass
	public void Login() {
		System.out.println("This is login");
	}

	@AfterClass()

	public void logout() {
		System.out.println("This is Logout");
	}

	@Test
	public void search() {
		System.out.println("This is Search");
	}

	@Test
	public void advancedSearch() {
		System.out.println("This is Advanced Search");
	}

}
