package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordResetRequestSentPage extends ETLHomePage {

	// Page Factory-OR
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]")
	public static WebElement passWordRequestResentConfirmation;

	// Page Factory initialization
	public PasswordResetRequestSentPage() throws Throwable {
		PageFactory.initElements(driver, this);
	}
	
}
