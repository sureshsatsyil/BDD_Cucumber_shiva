package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class SMAddQuestion extends ETLTestBase {

	// Page Factory-OR

	@FindBy(xpath = "//div[contains(text(),'Add Question')]")
	public static WebElement addQuestion;

	// Page Factory initialization

	// Actions implementation
	

	// Initializing the Page Objects
	public SMAddQuestion() {
		PageFactory.initElements(driver, this);// Global variables initialization
	}
	
	

}