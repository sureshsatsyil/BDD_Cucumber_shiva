package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class ForgotPasswordOptionsPage extends ETLTestBase {

	// Page Factory-OR
	@FindBy(xpath = "//input[@value='email']")
	public static WebElement useVerificationEmailOption;

	@FindBy(xpath = "//input[@value='question']")
	public static WebElement useSecurityQuestion;

//	@FindBy(xpath = "//input[@value='Submit']")
//	public static WebElement submitButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement submitButton;
	

	@FindBy(xpath = "//input[@value='Cancel']")
	public static WebElement cancelButton;

	// Initializing the elements

	public ForgotPasswordOptionsPage() {
		PageFactory.initElements(driver, this);
	}

}