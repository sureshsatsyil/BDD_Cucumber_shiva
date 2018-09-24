package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class LoginPage extends ETLTestBase {

	// Page Factory - OR:
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public static WebElement password;

	@FindBy(xpath = "//input[@value='LOGIN']")
	public static WebElement loginBtn;

	@FindBy(xpath = "//img[@class='gUGHxl']")
	public static WebElement BfLogo;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public static WebElement LoginSpan;

	@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
	public static WebElement ForgotPasswordlink;

	@FindBy(className = "modal-body")
	public static WebElement password_Expiry_window;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")
	public static WebElement password_Expiry_window_No;
	
	@FindBy(xpath = "//p[contains(text(),'Invalid username or password.')]")
	public static WebElement invalid_login_message;
	
//	password change modal "No" button
//	@FindBy(css = "div.modal-body > div > input.eupZoC")
//	public static WebElement no_button;
	
	@FindBy(css = "body > div:nth-child(10) > div > div.fade.in.modal > div > div > div.modal-body > div > input:nth-child(2)")
	public static WebElement no_button;
	
	
	
	

	// Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);// Global variables initialization
	}
	
}
