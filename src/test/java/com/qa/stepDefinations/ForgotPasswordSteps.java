package com.qa.stepDefinations;

import org.junit.Assert;

import com.qa.pages.ETLHomePage;
import com.qa.pages.ForgotPasswordOptionsPage;
import com.qa.pages.ForgotPasswordPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PasswordResetRequestSentPage;
import com.qa.util.ETLTestBase;
import com.qa.util.ETLTestUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPasswordSteps extends ETLTestBase {
	LoginPage loginPage;
	ETLHomePage homepage;
	ForgotPasswordPage forgotpasswordpage;
	ForgotPasswordOptionsPage forgotPasswordOptionsPage;
	PasswordResetRequestSentPage passwordResetRequestSentPage;
	ETLTestUtil testutil;

	@When("^user click on the Forgot Password link then forgot password page opens$")
	public ForgotPasswordPage user_click_on_the_Forgot_Password_link_then_forgot_password_page_opens() throws Throwable {
		loginPage = new LoginPage();
		LoginPage.ForgotPasswordlink.click();
		return new ForgotPasswordPage();

	}

	@Then("^user finds Email field on the forgot password page$")
	public void user_finds_Email_field_on_the_forgot_password_page() throws Throwable {
		forgotpasswordpage = new ForgotPasswordPage();
		boolean flag = ForgotPasswordPage.fogotPassword_email.isDisplayed();
		Assert.assertTrue(flag);
		Thread.sleep(5000);

	}

	@Then("^user find the Next button which is in inactive state$")
	public void user_find_the_Next_button_which_is_in_inactive_state() throws Throwable {
		forgotpasswordpage = new ForgotPasswordPage();
		boolean flag = ForgotPasswordPage.fogotPassword_next.isEnabled();
		Assert.assertFalse(flag);
	}

	@Then("^user enters the valid Email ID on forgot password page then Next button becomes Active$")
	public void user_enters_the_valid_Email_ID_on_forgot_password_page_then_Next_button_becomes_Active()
			throws Throwable {
		ForgotPasswordPage.fogotPassword_email.sendKeys("suresh.kolluri@satsyil.com");
		boolean flag = ForgotPasswordPage.fogotPassword_next.isEnabled();
		Assert.assertTrue(flag);
		

	}

	@Then("^user clicks on the Next button then it goes to the reset Password page$")
	public ForgotPasswordOptionsPage user_clicks_on_the_Next_button_then_it_goes_to_the_reset_Password_page()
			throws Throwable {
		ForgotPasswordPage.fogotPassword_next.click();
		return new ForgotPasswordOptionsPage();

	}

	@Then("^two Reset Password options displayed$")
	public void two_Reset_Password_options_displayed() throws Throwable {
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals("Binary Fountain Forgot Password - Binary Fountain", title);
		boolean result = false;
		boolean flagEmail = ForgotPasswordOptionsPage.useVerificationEmailOption.isDisplayed();
		boolean flagQuestion = ForgotPasswordOptionsPage.useSecurityQuestion.isDisplayed();
		if (flagEmail == true && flagQuestion == true) {
			result = true;
		}

		Assert.assertTrue(result);
	}

	@Then("^use Verification Email to rest/update password option is selected by default$")
	public void use_Verification_Email_to_rest_update_password_option_is_selected_by_default() throws Throwable {
		boolean flag = ForgotPasswordOptionsPage.useVerificationEmailOption.isSelected();
		Assert.assertTrue(flag);
	}

	@Then("^user Clicks on the Submit button$")
	public void user_Clicks_on_the_Submit_button() throws Throwable {
		ForgotPasswordOptionsPage.submitButton.click();
	}

	@Then("^user find the confirmation message$")
	public void user_find_the_confirmation_message() throws Throwable {
		passwordResetRequestSentPage = new PasswordResetRequestSentPage();
		boolean flag = PasswordResetRequestSentPage.passWordRequestResentConfirmation.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
}