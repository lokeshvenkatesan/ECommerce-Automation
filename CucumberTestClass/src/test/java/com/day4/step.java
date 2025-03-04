package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	private static WebDriver driver;

	@Given("URL should be launched")
	public void url_should_be_launched() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("TestUserName");
		driver.findElement(By.id("pass")).sendKeys("TestPass");
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

}
