package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class SMAddedQuestionnnaireConfirmationPage extends ETLTestBase{
	
	
	//Page Factory-OR
	
	@FindBy(css=".sc-jRuhRL > div:nth-child(1) > div:nth-child(1)")
	public static WebElement smQuestionConfirmationAddQuestion;
	
	@FindBy(css="#prev > div:nth-child(1)")
	public static WebElement smQuestionConfirmationReturn;
	
	@FindBy(css="#next > div:nth-child(1)")
	public static WebElement smQuestionConfirmationSavenReturn;
//	
//	@FindBy(xpath="//div[@class='sc-eEieub bBsDji']")	
//	public static WebElement addedQuestionDisplayed;
	
//	shiva
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div")	
	public static WebElement addedQuestionDisplayed;
	
	
	
	
	// Initializing the Page Objects
		public SMAddedQuestionnnaireConfirmationPage() {
			PageFactory.initElements(driver, this);// Global variables initialization
		}
		

}
