package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class ETLHomePage extends ETLTestBase {

	/* Page Factory-OR */
	// HomePage Logo
	@FindBy(xpath = "//img[@id='logo']")
	public static WebElement ETL_home_logo;

	// Content Menu
	@FindBy(xpath = "//div[contains(text(),'Content')]")
	public static WebElement ETL_content_menu;

	// Survey Menu
	@FindBy(xpath = "//div[contains(text(),'Survey')]")
	public static WebElement ETL_survey_menu;

	// Client Menu
	@FindBy(xpath = "//div[contains(text(),'Client')]")
	public static WebElement ETL_client_menu;

	// LogIn user name
	@FindBy(xpath = "//div[@class='SnzBeUVXgXLdUspF5lhMd']")
	public static WebElement ETL_user_name_display;

	// User Badge
	@FindBy(xpath = "//div[@class='sc-kpOJdX gdwoGU']")
	public static WebElement ETL_User_Badge;

	// Content Management
	@FindBy(xpath = "//h4[@id='home-ContentManagement']")
	public static WebElement ETL_content_management;

	// Survey Management
	@FindBy(xpath = "//h4[@id='home-SurveyManagement']")
	public static WebElement ETL_survey_management;

	// Client Configuration
	@FindBy(xpath = "//h4[@id='home-ClientConfiguration']")
	public static WebElement ETL_client_configuration;

	// Content Status
	@FindBy(xpath = "//h4[@id='home-ContentStatus']")
	public static WebElement ETL_content_status;

	// User Status
	@FindBy(xpath = "//h4[@id='home-UserStatus']")
	public static WebElement ETL_user_status;

	// Initializing the Page Objects:
	public ETLHomePage() throws Throwable {
		PageFactory.initElements(driver, this);
			}

	
}