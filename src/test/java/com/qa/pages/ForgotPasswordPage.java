package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends ETLHomePage {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement fogotPassword_email;
	
	 @FindBy(xpath = "//input[@value='Next']")
	 public static WebElement fogotPassword_next;
	
	// Initializing the Page Objects
	public ForgotPasswordPage() throws Throwable {
		PageFactory.initElements(driver, this);

	}
	
}
