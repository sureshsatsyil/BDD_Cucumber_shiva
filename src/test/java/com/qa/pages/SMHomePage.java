package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class SMHomePage extends ETLTestBase {

	// Page factory-OR

	// Create new Button
//	@FindBy(xpath = "//div[contains(text(),'Create New Survey')]")
	@FindBy(xpath = "//div[@id='createNewSurvey']")
	public static WebElement createNew;
	
	// Associate Button
	@FindBy(xpath = "//div[contains(text(),'Associate Surveys')]")
	public static WebElement associate;
	// Page Factory initialization

	// Actions implementation

	// Createnew will navigate to SM Create New

	// Initializing the Page Objects

	public SMHomePage() {
		PageFactory.initElements(driver, this);// Global variables initialization
	}

	// Clicking on Create new button
	public SMCreateNew_SurveyConfiguration clickOnCreateNew() {
		createNew.click();
		return new SMCreateNew_SurveyConfiguration();
	}

	// Clicking on Associate button

	public SMClientAssociate clickOnAssociate() {
		associate.click();
		return new SMClientAssociate();

	}

	public boolean isCreateNewAssociateButtonsDisplayed() {

		if (createNew.isDisplayed() == true && associate.isDisplayed() == true) {
			return true;
		} else
			return false;

	}

}
