package com.qa.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class SMCreateNewQuestionaire extends ETLTestBase {

	// Page factory-OR

	// Type The Question Here
	@FindBy(css = "#questionName")
	public static WebElement questionInput;

	// Question Code
	@FindBy(css = "#questionCode")
	public static WebElement questionCodeInput;

	// What Type Of Question Do You Want To Set Up ?
	@FindBy(css = "#react-select-4--value > div.Select-input > input")
	public static WebElement questionTypeSetup;	
	
	@FindBy(css = "#react-select-9--value > div.Select-input > input")
	public static WebElement questionTypeSetup_flow1;
	
	@FindBy(css = "#react-select-15--value > div.Select-input > input")
	public static WebElement questionTypeSetup_flow2;
	
//	Question Type
	@FindBy(css = "#react-select-7--value > div.Select-input > input")
	public static WebElement questionType;
	
	@FindBy(css = "#react-select-12--value > div.Select-input > input")
	public static WebElement questionType_flow1;	
	
	@FindBy(css = "#react-select-18--value > div.Select-input > input")
	public static WebElement questionType_flow2;
	
//	Multi value question
	@FindBy(xpath="//input[@id='multiValueQuestionLabel']")
	public static WebElement multi_Value_Question_Input;
	
	
	@FindBy(xpath="//*[@id=\"multiValueQuestionLabel\"]")
	public static WebElement multi_Value_Question_Input_flow1;
	

	// Select Language	
	@FindBy(css = "#react-select-5--value > div.Select-input > input")
	public static WebElement selectLanguage_CQP;
	
	@FindBy(css = "#react-select-10--value > div.Select-input > input")
	public static WebElement selectLanguage_CQP_flow1;	
	
	@FindBy(css = "#react-select-16--value > div.Select-input > input")
	public static WebElement selectLanguage_CQP_flow2;

	
	// Question Flags
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[6]/div/p")
	public static WebElement questionFlags;

	@FindBy(xpath = "//label[contains(text(),'PHI')]")
	public static WebElement questionFlagPHI;

	@FindBy(xpath = "//label[contains(text(),'Demographic')]")
	public static WebElement questionFlagDemographic;

	@FindBy(id = "binary_checkbox_search_Patient Satisfaction")
	public static WebElement opinion1Search;

	
//Option 1 block	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[1]/label/div/div/span")
	public static WebElement option1Access;	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[2]/label/div/div/span")
	public static WebElement option1Communication;
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[3]/label/div/div/span")
	public static WebElement option1Loyalty;
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[4]/label/div/div/span")
	public static WebElement option1Office;
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div[3]/div/div[5]/label/div/div/span")
	public static WebElement option1Outcome;
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div[1]/label/div/div/span")
	public static WebElement option2Access;	
	
		
//Option code field	
	@FindBy(id = "options[0].code")
	public static WebElement option1TypeOptionCode;
	
	// Need to do the mandatory check
//	Option1 add option fields	
	@FindBy(id = "options[1].code")
	public static WebElement option2TypeOptionCode;
		
		
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/input")
	public static WebElement optionTypeOptionName1;	
	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/input")
	public static WebElement featureKeywords1;	
	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[4]/div/div/div/div[2]/input")
	public static WebElement opinionkeywords1;	
	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[5]/div/div/div/div[2]/input")
	public static WebElement bfscore1;	
	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[6]/div/div/div/div[2]/input")
	public static WebElement score1;	
	
	
//	Option 2 fields	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/input")
	public static WebElement optionTypeOptionName2;		
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/div/div/div[2]/input")
	public static WebElement featureKeywords2;		
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[4]/div/div/div/div[2]/input")
	public static WebElement opinionkeywords2;	
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[5]/div/div/div/div[2]/input")
	public static WebElement bfscore2;		
	
	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div/div[2]/input")
	public static WebElement score2;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div[2]/div/div")
	public static WebElement addOptionButton;		
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/div/div/div")
	public static WebElement creatNewQuestionnnaireReturnBtn;

	@FindBy(css = "#next > div:nth-child(1)")
	public static WebElement creatNewQuestionnnaireSavenReturnBtn;
	
//	validations
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div[1]/div/p[2]")
	public static WebElement required_question_desc;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div[2]/div/div/p[2]")
	public static WebElement required_question_code;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div[3]/div/div[1]")
	public static WebElement required_question_setup;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div[4]/div/div[1]")
	public static WebElement required_lan_sm_cnq;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div[5]/div/p[2]")
	public static WebElement required_multi_question_label;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[6]/div/p[2]")
	public static WebElement validation_score_field1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]")
	public static WebElement req_type_option_code;
	
//	@FindBy(xpath = "//div[@id='content']/div/div[2]/div/div/div/div/div[6]/div/div/div/label")
//	public static WebElement unchecks_PHI;
	

	@FindBy(css = "#content > div > div.gsYlqHuubB3bKiaXdybMG > div > div > div > div.sc-keVrkP.jqmXwq > div:nth-child(6) > div > div > div:nth-child(1) > label")
	public static WebElement unchecks_PHI;
	
	
	// Initializing the Page Objects
	public SMCreateNewQuestionaire() {
		PageFactory.initElements(driver, this);// Global variables initialization
	}

	/* Actions */
	
	public static void selectOption_radiobutton(String option) {
	List<WebElement> ele = driver.findElements(By.cssSelector("div[data-qa=\"MozartRadio\"]"));
	System.out.println(ele.size());
	int x = 0;
	for (int i = 0; i < ele.size(); i++) {
		// Store the Radio Button names to the string variable, using 'Value'
		String sValue = ele.get(i).getText();
		// System.out.println(sValue);

		if (sValue.equalsIgnoreCase(option))
			x = ++i;
		

	}
		
	System.out.println("x value is :" + x);
	System.out.println(driver.findElement(By.cssSelector("label[for*='" + "400" + x + "_category0']")));
	WebElement element = driver.findElement(By.cssSelector("label[for*='" + x + "_category0']"));

	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);
	List<WebElement> ele1 = driver.findElements(By.cssSelector("div[data-qa=\"MozartTextBox\"]"));
	System.out.println(ele1.size());
	
	}
	
	public static boolean isElementPresent(WebElement ele){
        try{
            ele.isDisplayed();
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
	
	
}