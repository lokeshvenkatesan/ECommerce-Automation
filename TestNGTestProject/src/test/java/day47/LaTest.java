package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaTest {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		
	}
	
	@Test
	void TestLogin() {
		LaPage la = new LaPage(driver);
		la.setUserName("Test");
		la.setPassword("Password");
		la.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "Search");
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
