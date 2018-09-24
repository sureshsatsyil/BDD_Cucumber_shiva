package com.qa.stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.pages.ETLHomePage;
import com.qa.pages.LoginPage;
import com.qa.util.ETLTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginButtonVerificationSteps extends ETLTestBase {
	LoginPage loginPage;
	ETLHomePage homepage;
	WebDriver driver;

	@Given("^usr opens browser$")
	public void usr_opens_browser() {
		ETLTestBase.initialization();
	}

	@Then("^Login Page has both Email and Password fields$")
	public void login_Page_has_both_Email_and_Password_fields() throws Throwable {
		loginPage = new LoginPage();
		boolean flag = false;
			if (LoginPage.username.isDisplayed()==true && LoginPage.password.isDisplayed()==true)
		{
			flag = true;
	
		}
	     Assert.assertTrue(flag);
	}

	@Then("^verify the Login button is disabled$")
	public void verify_the_Login_button_is_disabled() throws Throwable {
		boolean flag = LoginPage.loginBtn.isEnabled();
	    Assert.assertFalse(flag);
	}
	
	
	 @Then("^verify the Login button is enabled$")
		public void verify_the_Login_button_is_enabled() throws Throwable {
			boolean flag = LoginPage.loginBtn.isEnabled();
			Assert.assertTrue(flag);
		}
	 
}
