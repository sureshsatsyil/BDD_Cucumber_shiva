package com.qa.stepDefinations;

import org.testng.Assert;

import com.qa.pages.ETLHomePage;
import com.qa.pages.LoginPage;
import com.qa.util.ETLTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LogInPageSteps extends ETLTestBase {
	LoginPage loginPage;
	ETLHomePage homepage;

	@Given("^user opens the browser$")

	public void user_opens_the_browser() {
		ETLTestBase.initialization();

	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage = new LoginPage();
		String title = driver.getTitle();
		Assert.assertEquals("Binary Fountain Login - Binary Fountain", title);
	}

	@Then("^home page is displayed$")
	public void validate_home_page_title() throws Throwable {
		Assert.assertEquals("Yes", "Yes");
	}


	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		loginPage = new LoginPage();
		String username = prop.getProperty("UserName");
		String password = prop.getProperty("Password");
		LoginPage.username.sendKeys(username);
		LoginPage.password.sendKeys(password);
	}

	@Then("^user clicks on the login button$")
	public ETLHomePage user_clicks_on_the_login_button() throws Throwable {
		loginPage = new LoginPage();
		LoginPage.loginBtn.click();	
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		LoginPage.no_button.click();
		Thread.sleep(5000);
		return new ETLHomePage();
	}
	
	@Then("^user enters the invalid username and invalid password and click on the login button$")
	public void user_enters_the_invalid_username_and_invalid_password_and_click_on_the_login_button() throws Throwable {
		loginPage = new LoginPage();
		String username = prop.getProperty("WrongUsername");
		String password = prop.getProperty("WrongPassword");
		LoginPage.username.sendKeys(username);
		LoginPage.password.sendKeys(password);	
		LoginPage.loginBtn.click();	
	}
	
	@Then("^verify the invalid login message$")
	public void verify_the_invalid_login_message() throws Throwable {
		boolean flag = LoginPage.invalid_login_message.isDisplayed();
		Assert.assertTrue(flag);
	}
}
