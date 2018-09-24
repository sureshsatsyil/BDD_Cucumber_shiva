package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ETLTestBase;

public class SMCreateNew_SurveyConfiguration extends ETLTestBase {

	// Page Factory-OR
	// SURVEY CONFIGURATION
	/*
	 * @FindBy(css =
	 * "html body div#content div._3sz-Jorbvi2LDO38TpQcMl div.gsYlqHuubB3bKiaXdybMG div div.PVgXrWRAT3CPk1GGm0gVM div.sc-kaNhvL.eQyhJD div.sc-kgAjT.gEnSxD ul.sc-cJSrbW.jftdHt li.active"
	 * ) public static WebElement surveyConfiguration;
	 */

	@FindBy(xpath = "//li[@class='active']")
	public static WebElement surveyConfiguration;
	// li[@class='active']

	// QUESTIONAIRE
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")

	public static WebElement questionaire;

	// Lables definition
	@FindBy(xpath = "p[contains(text(),'Code (only alphabet and number allowed)')]")
	public static WebElement code_label;

	@FindBy(xpath = "p[contains(text(),'Name (Example: PG Service Line 15)')]")
	public static WebElement name_label;

	@FindBy(xpath = "p[contains(text(),'Select Language')]")
	public static WebElement selectLanguage_label;

	// Fields definition

	@FindBy(name = "code")
	public static WebElement code_inputField;

	@FindBy(name = "name")
	public static WebElement name_inputField;

	@FindBy(css = ".Select-input > input:nth-child(2)")
	public static WebElement selectLanguage_listBox;
	//selectLanguage_listBox's class NameSelect-value sc-hqyNC fzmHoE
	
	@FindBy(xpath = "//*[contains(text(),'English')]")
	public static WebElement selectLanguage_English;
	
	
//	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/span[1]/div[1]")					
//	public static WebElement selectLanguage_listBox_input;
	
//	working old
//	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[2]/span[1]")
//	public static WebElement selectLanguage_selectArrow;
	
//	new
	@FindBy(css = ".Select-input > input")
	public static WebElement selectLanguage_CSM;
	
//	@FindBy(xpath = "//*[@id=\"react-select-3--value\"]/div[2]")
//	public static WebElement selectLanguage_listBox_english;

	/*
	 * trying for select box Select dropdown = new
	 * Select(driver.findElement(By.className("Select-placeholder")));
	 */

	// Fields mandatory check

	@FindBy(xpath = "//div[@class='sc-exkUMo eHgKXS']//div[1]//div[1]//p[2]")
	public static WebElement code_mandatoryCheck;

	@FindBy(xpath = "//div[@class='sc-exkUMo eHgKXS']//div[2]//div[1]//p[2]")
	public static WebElement name_mandatoryCheck;

	@FindBy(xpath = "//div[contains(text(),'Required')]")
	public static WebElement selectLanguage_mandatoryCheck;

	// Duplication check

	@FindBy(xpath="//p[contains(text(),'No Duplicate')]")
	public static WebElement noDuplicate;

	// Return button

	@FindBy(xpath = "//div[@class='sc-chPdSV jeAHOm']")
	public static WebElement Return_Button;

	// Save &Continue button

	@FindBy(css = "#next > div:nth-child(1)")
	public static WebElement SaveNContinue_Button;
	
	
//	validations
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/p[2]")
	public static WebElement Required_code;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/p[2]")
	public static WebElement Required_name;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]")
	public static WebElement Required_language;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/p[2]")
	public static WebElement Invalid_code_error_message;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/p[2]")
	public static WebElement morethanone_error_message;
	
	

	// Page Factory initialization

	public SMCreateNew_SurveyConfiguration() {
		PageFactory.initElements(driver, this);
	}

	
}
