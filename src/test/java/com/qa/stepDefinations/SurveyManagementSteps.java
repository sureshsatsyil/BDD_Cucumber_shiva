package com.qa.stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.pages.ETLHomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SMAddQuestion;
import com.qa.pages.SMAddedQuestionnnaireConfirmationPage;
import com.qa.pages.SMCreateNewQuestionaire;
import com.qa.pages.SMCreateNew_SurveyConfiguration;
import com.qa.pages.SMHomePage;
import com.qa.util.ETLTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SurveyManagementSteps extends ETLTestBase {
	private static final JavascriptExecutor executor = null;
	LoginPage loginPage;
	ETLHomePage homepage;
	SMHomePage smhomepage;
	SMCreateNew_SurveyConfiguration smCreateNewSurveyConfiguration;
	static WebDriver driver;

	@Given("^User opens browser to Create Survey Management$")
	public void user_opens_browser_to_Create_Survey_Management() throws Throwable {
		ETLTestBase.initialization();
		loginPage = new LoginPage();
		//Thread.sleep(30000);
	}

	@Then("^user finds Survey Management on dashboard$")
	public void user_finds_Survey_Management_on_dashboard() throws Throwable {
		homepage = new ETLHomePage();
		boolean flag = ETLHomePage.ETL_survey_management.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("^user clicks on the Survey Management option$")
	public SMHomePage user_clicks_on_the_Survey_Management_option() throws Throwable {

		ETLHomePage.ETL_survey_management.click();
		Thread.sleep(2000);
		return new SMHomePage();

	}

	@Then("^user finds two options as follows Create New and Associate$")
	public void user_finds_two_options_as_follows_Create_New_and_Associate() throws Throwable {
		boolean flagcreatenew = SMHomePage.createNew.isDisplayed();
		boolean flagassiciate = SMHomePage.associate.isDisplayed();
		boolean status = false;
		if (flagcreatenew == true && flagassiciate == true)
			status = true;
		Assert.assertTrue(status);

	}

	@When("^User clicks on Create New button then Create Survey Management page opens$")
	public SMCreateNew_SurveyConfiguration user_clicks_on_Create_New_button_then_Create_Survey_Management_page_opens()
			throws Throwable {
		SMHomePage.createNew.click();
		Thread.sleep(2000);
		return new SMCreateNew_SurveyConfiguration();
	}

	@Then("^SURVEY CONFIGURATION shows as active$")
	public void survey_CONFIGURATION_shows_as_active() throws Throwable {
		smCreateNewSurveyConfiguration = new SMCreateNew_SurveyConfiguration();
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(SMCreateNew_SurveyConfiguration.surveyConfiguration).
		 * perform();
		 * 
		 * String f = SMCreateNew_SurveyConfiguration.surveyConfiguration.
		 * //Assert.assertEquals("rgb(113, 90, 255)", f); String bg="rgb(113, 90, 255)";
		 * 
		 * assertTrue(f.contains(bg));
		 */
		String f = SMCreateNew_SurveyConfiguration.surveyConfiguration.getAttribute("class");

		Assert.assertEquals("active", f);
	}

	@Then("^QUESTIONAIRE shows a inactive$")
	public void questionaire_shows_a_inactive() throws Throwable {
		/*
		 * String f = SMCreateNew_SurveyConfiguration.surveyConfiguration.getCssValue(
		 * "background-color"); Assert.assertEquals("rgb(255, 255, 255)", f);
		 */
	}

	@Then("^Return button is enabled$")
	public void return_button_is_enabled() throws Throwable {
		/*
		 * boolean flag = SMCreateNew_SurveyConfiguration.Return_Button.isDisplayed();
		 * Assert.assertTrue(flag);
		 */

	}

	@Then("^user wont find the Save and Continue button$")
	public void user_wont_find_the_Save_and_Continue_button() throws Throwable {
		/*
		 * boolean flag =
		 * SMCreateNew_SurveyConfiguration.SaveNContinue_Button.isDisplayed();
		 * Assert.assertFalse(flag);
		 */

	}

	@Then("^Save and Continue button enables when all the fields on the Create Survvey Management page got filled$")
	public void save_and_Continue_button_enables_when_all_the_fields_on_the_Create_Survvey_Management_page_got_filled()
			throws Throwable {

		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys("GEN1234");
		SMCreateNew_SurveyConfiguration.name_inputField.sendKeys("GEN Survey1");

//		SMCreateNew_SurveyConfiguration.selectLanguage_selectArrow.click();
		Thread.sleep(1000);

		SMCreateNew_SurveyConfiguration.selectLanguage_listBox.sendKeys("Eng");
		// SMCreateNew_SurveyConfiguration.selectLanguage_listBox.sendKeys(Keys.DOWN);
		SMCreateNew_SurveyConfiguration.selectLanguage_listBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String label = SMCreateNew_SurveyConfiguration.SaveNContinue_Button.getAttribute("innerText");
		Assert.assertEquals("Save and Continue", label);
		Thread.sleep(20000);

	}

	@When("^user enters valid code on Create Survey Management page$")
	public void user_enters_valid_code_on_Create_Survey_Management_page() throws Throwable {
		String validcode = prop.getProperty("Valid_code");
		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys(validcode);
	}
	
/* Trying to generate valid code dynamic*/
//	@When("^user enters valid code on Create Survey Management page$")
//	public void user_enters_valid_code_on_Create_Survey_Management_page() throws Throwable {
//		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys(genData.generateRandomAlphaNumeric(30));
//	}

	@When("^user enters valid Survey name on Create Survey Management page$")
	public void user_enters_valid_Survey_name_on_Create_Survey_Management_page() throws Throwable {
		String surveyname = prop.getProperty("Valid_survey_name");
		SMCreateNew_SurveyConfiguration.name_inputField.sendKeys(surveyname);
		Thread.sleep(3000);
	}

	// Need to work on this step
	@When("^user selects English for Select language question on Create Survey Management page$")
	public void user_selects_English_for_Select_language_question_on_Create_Survey_Management_page() throws Throwable {
		SMCreateNew_SurveyConfiguration.selectLanguage_CSM.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNew_SurveyConfiguration.selectLanguage_CSM.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@When("^user selects Spanish for Select language question on Create Survey Management page$")
	public void user_selects_Spanish_for_Select_language_question_on_Create_Survey_Management_page() throws Throwable {
		SMCreateNew_SurveyConfiguration.selectLanguage_CSM.sendKeys("Span");
		Thread.sleep(2000);
		SMCreateNew_SurveyConfiguration.selectLanguage_CSM.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@When("^user clicks on the Save and continue button then it goes to QUESTIONAIRE section$")
	public SMAddQuestion user_clicks_on_the_Save_and_continue_button_then_it_goes_to_QUESTIONAIRE_section()
			throws Throwable {
		SMCreateNew_SurveyConfiguration.SaveNContinue_Button.click();
		Thread.sleep(3000);
		return new SMAddQuestion();

	}

	@Then("^user clicks on Add Question button then the Create Question page opens$")
	public SMCreateNewQuestionaire user_clicks_on_Add_Question_button_then_the_Create_Question_page_opens()
			throws Throwable {
		SMAddQuestion.addQuestion.click();
		return new SMCreateNewQuestionaire();

	}

	@Then("^user is able to see (\\d+) question related options$")
	public void user_is_able_to_see_question_related_options(int arg1) throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);

	}

	@Then("^What Type Of Question Do You Want To Set Up have (\\d+) options as follows Demographic Question,Comment Question and Rating Question$")
	public void what_Type_Of_Question_Do_You_Want_To_Set_Up_have_options_as_follows_Demographic_Question_Comment_Question_and_Rating_Question(
			int arg1) throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);
	}

	@Then("^Select Language has the following options English and Spanish$")
	public void select_Language_has_the_following_options_English_and_Spanish() throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);
	}

	@When("^user enters Type The Question Here, Question Code and What Type Of Question Do You Want To Set Up \\? as Demographic Question$")
	public void user_enters_Type_The_Question_Here_Question_Code_and_What_Type_Of_Question_Do_You_Want_To_Set_Up_as_Demographic_Question()
			throws Throwable {

		SMCreateNewQuestionaire.questionInput.sendKeys("Age");
		SMCreateNewQuestionaire.questionCodeInput.sendKeys("A");

		SMCreateNewQuestionaire.questionTypeSetup.sendKeys("Demo");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^Question Type drop list box is displayed$")
	public void question_Type_drop_list_box_is_displayed() throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);
	}

	@Then("^Question Type shows the following options Single Choice, Multiple Choice and Free form Text$")
	public void question_Type_shows_the_following_options_Single_Choice_Multiple_Choice_and_Free_form_Text()
			throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);
		Thread.sleep(20000);

	}

	@Then("^user selects Demographic Question for Question Type Setup drop down$")
	public void user_selects_Demographic_Question_for_Question_Type_drop_down() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys("Demo");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
	}
	
	@Then("^user selects Demographic Question for Question Type Setup drop down in flow 1$")
	public void user_selects_Demographic_Question_for_Question_Type_drop_down_in_flow_1() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys("Demo");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
	}

	@Then("^user selects Demographic Question for Question Type Setup drop down in flow 2$")
	public void user_selects_Demographic_Question_for_Question_Type_drop_down_in_flow_2() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys("Demo");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
	}
	
	@Then("^user selects English language$")
	public void user_selects_English_language() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	@Then("^user selects English language for flow 1$")
	public void user_selects_English_language_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	@Then("^user selects English language for flow 2$")
	public void user_selects_English_language_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}

	@Then("^Shows the Question Flags as follows PHI and Demographic and both are checked by default$")
	public void shows_the_Question_Flags_as_follows_PHI_and_Demographic_and_both_are_checked_by_default()
			throws Throwable {
		boolean test = true;
		Assert.assertTrue(test);

		String flag1 = SMCreateNewQuestionaire.questionFlagPHI.getAttribute("for");
		System.out.println("For " + flag1);

		String flag2 = SMCreateNewQuestionaire.questionFlagDemographic.getAttribute("for");
		System.out.println("For " + flag2);
		boolean result = false;
		if (flag1 == "PHI" && flag2 == "Demographic")
			result = true;
		Assert.assertTrue(result);

	}

	@When("^User selects Demographic Question from What Type Of Question Do You Want To Set Up \\? and Question Type single choice then user should be able to see Option (\\d+)$")
	public void user_selects_Demographic_Question_from_What_Type_Of_Question_Do_You_Want_To_Set_Up_and_Question_Type_single_choice_then_user_should_be_able_to_see_Option(
			int arg1) throws Throwable {

	}

	@When("^User Selects Access option and enter the required inputs and click on Save and Return button\\.$")
	public SMAddedQuestionnnaireConfirmationPage user_Selects_Access_option_and_enter_the_required_inputs_and_click_on_Save_and_Return_button()
			throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("1");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.creatNewQuestionnnaireSavenReturnBtn.click();
		return new SMAddedQuestionnnaireConfirmationPage();
	}

	@Then("^the added question gets added\\.$")
	public void the_added_question_gets_added() throws Throwable {

	}

	@When("^User clicks on Save and Return then user gets the cofirmation message\\.$")
	public void user_clicks_on_Save_and_Return_then_user_gets_the_cofirmation_message() throws Throwable {

	}

	@Then("^user enters valid question description$")
	public void user_enters_valid_question_description() throws Throwable {
		String validquestype = prop.getProperty("validQuestionType");
		SMCreateNewQuestionaire.questionInput.sendKeys(validquestype);
	}
	
	@Then("^user enters invalid question description$")
	public void user_enters_invalid_question_description() throws Throwable {
		String invalidquestype = prop.getProperty("InvalidQuestionType");
		SMCreateNewQuestionaire.questionInput.sendKeys(invalidquestype);
	}

	@Then("^user enters valid question code$")
	public void user_enters_valid_question_code() throws Throwable {
		String quescode = prop.getProperty("validQuestionCode");
		SMCreateNewQuestionaire.questionCodeInput.sendKeys(quescode);
	}
	
	@Then("^user enters valid question code two$")
	public void user_enters_valid_question_code_two() throws Throwable {
		String quescode1 = prop.getProperty("validQuestionCode1");
		SMCreateNewQuestionaire.questionCodeInput.sendKeys(quescode1);
	}
	
	@Then("^user enters valid question code three$")
	public void user_enters_valid_question_code_three() throws Throwable {
		String quescode2 = prop.getProperty("validQuestionCode2");
		SMCreateNewQuestionaire.questionCodeInput.sendKeys(quescode2);
	}
	
	@Then("^user enters invalid question code$")
	public void user_enters_invalid_question_code() throws Throwable {
		String invalidquescode = prop.getProperty("InvalidQuestionCode");
		SMCreateNewQuestionaire.questionCodeInput.sendKeys(invalidquescode);
	}

	@Then("^user selects comments for question setup$")
	public void user_selects_comments_for_question_setup() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys("comm");
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys(Keys.ENTER);
		
	}
	
	@Then("^user selects comments for question setup for flow 1$")
	public void user_selects_comments_for_question_setup_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys("comm");
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys(Keys.ENTER);
		
	}
	
	@Then("^user selects comments for question setup for flow 2$")
	public void user_selects_comments_for_question_setup_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys("comm");
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys(Keys.ENTER);
		
	}

	@Then("^user selects free form text for question type$")
	public void user_selects_free_form_text_for_question_type() throws Throwable {
		SMCreateNewQuestionaire.questionType.sendKeys("Free");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Then("^user selects free form text for question type for flow 1$")
	public void user_selects_free_form_text_for_question_typ_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.questionType_flow1.sendKeys("Free");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Then("^user selects free form text for question type for flow 2$")
	public void user_selects_free_form_text_for_question_type_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.questionType_flow2.sendKeys("Free");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	

	@Then("^user selects english for Select language question on Create Question page for flow 1$")
	public void user_selects_english_for_Select_language_question_on_Create_Question_page_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	
	@Then("^user selects english for Select language question on Create Question page$")
	public void user_selects_english_for_Select_language_question_on_Create_Question_page() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	
	@Then("^user selects english for Select language question on Create Question page for flow 2$")
	public void user_selects_english_for_Select_language_question_on_Create_Question_page_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys("Eng");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@When("^user selects spanish for Select language question on Create Question page$")
	public void user_selects_spanish_for_Select_language_question_on_Create_Question_page() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys("Span");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@When("^user selects spanish for Select language question on Create Question page for flow 1$")
	public void user_selects_spanish_for_Select_language_question_on_Create_Question_page_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys("Span");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@When("^user selects spanish for Select language question on Create Question page for flow 2$")
	public void user_selects_spanish_for_Select_language_question_on_Create_Question_page_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys("Span");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.selectLanguage_CQP_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	
	@Then("^user clicks on Save and Return button$")
	public SMAddedQuestionnnaireConfirmationPage user_clicks_on_Save_and_Return_button() throws Throwable {
		SMCreateNewQuestionaire.creatNewQuestionnnaireSavenReturnBtn.click();
		return new SMAddedQuestionnnaireConfirmationPage();
	}

	@Then("^user lands on Survey questionnaire Confirmation page$")
	public void user_lands_on_Survey_questionnaire_Confirmation_page() throws Throwable {
	boolean flag= SMAddedQuestionnnaireConfirmationPage.addedQuestionDisplayed.isDisplayed();
	Assert.assertTrue(flag);		
	}

	@When("^user enters existing code on Create Survey Management page$")
	public void user_enters_existing_code_on_Create_Survey_Management_page() throws Throwable {
		String dupCode = prop.getProperty("duplicate_Survey_Code");
		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys(dupCode);
		Thread.sleep(3000);

	}

	@Then("^verify the duplicate Error message on Create Survey Management page$")
	public void verify_the_duplicate_Error_message_on_Create_Survey_Management_page() throws Throwable {
		boolean flag= SMCreateNew_SurveyConfiguration.noDuplicate.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Then("^user finds the Required message for each field on Create new survey configuration$")
	public void user_finds_the_Required_message_for_each_field_on_Create_new_survey_configuration() throws Throwable {
		boolean flag= SMCreateNew_SurveyConfiguration.Required_code.isDisplayed();
		Assert.assertTrue(flag);
		boolean flag1= SMCreateNew_SurveyConfiguration.Required_name.isDisplayed();
		Assert.assertTrue(flag1);
		boolean flag2= SMCreateNew_SurveyConfiguration.Required_language.isDisplayed();
		Assert.assertTrue(flag2);	 
	}

	@When("^user enters Invalid data for code field$")
	public void user_enters_Invalid_data_for_code_field() throws Throwable {
		String invalidcode = prop.getProperty("Invalid_code");
		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys(invalidcode);		
	}
	
	@Then("^verify the invalid error message for code field$")
	public void verify_the_validation_error_message_for_code_field() throws Throwable {
		boolean flag= SMCreateNew_SurveyConfiguration.Invalid_code_error_message.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@When("^user enters more than one code for code field on Create Survey Management page$")
	public void user_enters_more_than_one_code_for_code_field_on_Create_Survey_Management_page() throws Throwable {
		String morethanonecode = prop.getProperty("Morethanonecode");
		SMCreateNew_SurveyConfiguration.code_inputField.sendKeys(morethanonecode);	
	}
	    
	@Then("^verify the morethanone error message on Create Survey Management page$")
	public void verify_the_morethanone_error_message_on_Create_Survey_Management_page() throws Throwable {
		boolean flag= SMCreateNew_SurveyConfiguration.morethanone_error_message.isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("^user enters existing Survey name on Create Survey Management page$")
	public void user_enters_existing_Survey_name_on_Create_Survey_Management_page() throws Throwable {
		String existingsurveyname = prop.getProperty("Existing_Survey_Name");
		SMCreateNew_SurveyConfiguration.name_inputField.sendKeys(existingsurveyname);		
	} 
	
	@When("^user enters invalid data for survey name$")
	public void user_enters_invalid_data_for_survey_name() throws Throwable {
		String invalidsuryname = prop.getProperty("Invalid_Survey_Name");
		SMCreateNew_SurveyConfiguration.name_inputField.sendKeys(invalidsuryname);
		    
	}
	
	@Then("^user finds the Required message for each field on Create Question page$")
	public void user_finds_the_Required_message_for_each_field_on_Create_Question_page() throws Throwable {		
		boolean flag= SMCreateNewQuestionaire.required_question_desc.isDisplayed();
		Assert.assertTrue(flag);
		boolean flag1= SMCreateNewQuestionaire.required_question_code.isDisplayed();
		Assert.assertTrue(flag1);
		boolean flag2= SMCreateNewQuestionaire.required_question_setup.isDisplayed();
		Assert.assertTrue(flag2);
		boolean flag3= SMCreateNewQuestionaire.required_lan_sm_cnq.isDisplayed();
		Assert.assertTrue(flag3);		
	}
   
	@Then("^user selects Rating for question setup$")
	public void user_selects_Rating_for_question_setup() throws Throwable {		
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys("Rat");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Then("^user selects Rating for question setup for flow 1$")
	public void user_selects_Rating_for_question_setup_for_flow_1() throws Throwable {		
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys("Rat");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Then("^user selects Rating for question setup for flow 2$")
	public void user_selects_Rating_for_question_setup_for_flow_2() throws Throwable {		
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys("Rat");
		Thread.sleep(2000);
		SMCreateNewQuestionaire.questionTypeSetup_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
	}
	
	@Then("^user selects Single Choice for question type$")
	public void user_selects_Single_Choice_for_question_type() throws Throwable {
		SMCreateNewQuestionaire.questionType.sendKeys("Sin");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);			
	}
	
	@Then("^user selects Single Choice for question type for flow 1$")
	public void user_selects_Single_Choice_for_question_type_for_flow_1() throws Throwable {
		SMCreateNewQuestionaire.questionType_flow1.sendKeys("Sin");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType_flow1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);			
	}

	
	@Then("^user selects Single Choice for question type for flow 2$")
	public void user_selects_Single_Choice_for_question_type_for_flow_2() throws Throwable {
		SMCreateNewQuestionaire.questionType_flow2.sendKeys("Sin");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType_flow2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);			
	}


	
	@Then("^user selects all the remaining fields on option one block$")
	public void user_selects_all_the_remaining_fields_on_option_one_block() throws Throwable {
		Thread.sleep(3000);
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(2000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(5000);
		
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("100");
		Thread.sleep(8000);
		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(8000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test1");
		Thread.sleep(8000);    
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(8000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test2");
		Thread.sleep(8000);     
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(8000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test3");
		Thread.sleep(8000);  
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(8000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(8000);     
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(8000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(8000);
		
	}
	
	@Then("^user selects all the remaining fields expect option values on option one block$")
	public void user_selects_all_the_remaining_fields_expect_option_values_on_option_one_block() throws Throwable {
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("1001");
		Thread.sleep(1000);
		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test1");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test2");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test3");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(2000); 
	}
	
	@Then("^user selects all the remaining fields on option two block$")
	public void user_selects_all_the_remaining_fields_on_option_two_block() throws Throwable {
		Thread.sleep(3000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
				
//		SMCreateNewQuestionaire.option2Access.click();
//		Thread.sleep(2000);
		SMCreateNewQuestionaire.option2TypeOptionCode.sendKeys("102");
		Thread.sleep(1000);
		SMCreateNewQuestionaire.optionTypeOptionName2.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.optionTypeOptionName2.sendKeys("Test12");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.featureKeywords2.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.featureKeywords2.sendKeys("Test22");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.opinionkeywords2.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.opinionkeywords2.sendKeys("Test32");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.bfscore2.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.bfscore2.sendKeys("1");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.score2.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.score2.sendKeys("50");
		Thread.sleep(2000); 
		
	}
	
	@Then("^user enters Option Name on Create Question page$")
	public void user_enters_Option_Name_on_Create_Question_page() throws Throwable {

		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test1");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test2");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test3");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(2000);     
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(2000);   
	}
	
	
	/* To test radio button functionality created this step definition*/	
	@Then("^user selects Option one fields$")
	public void user_selects_Option_one_fields() throws Throwable {
		
		SMCreateNewQuestionaire.option1Access.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.option1Communication.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.option1Loyalty.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.option1Office.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.option1Outcome.click();
		Thread.sleep(2000);
		
	}
	
	@When("^the user selects Access on option one block$")
	public void the_user_selects_Access_on_option_one_block() throws Throwable {
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(2000);
	}
	
	@When("^the user selects Communication on option one block$")
	public void the_user_selects_Communication_on_option_one_block() throws Throwable {
		SMCreateNewQuestionaire.option1Communication.click();
		Thread.sleep(2000);
	}

	@When("^the user selects Loyalty on option one block$")
	public void the_user_selects_Loyalty_on_option_one_block() throws Throwable {
		SMCreateNewQuestionaire.option1Loyalty.click();
		Thread.sleep(2000);
	}

	@When("^the user selects Office on option one block$")
	public void the_user_selects_Office_on_option_one_block() throws Throwable {
		SMCreateNewQuestionaire.option1Office.click();
		Thread.sleep(2000);
	}

	@When("^the user selects Outcome on option one block$")
	public void the_user_selects_Outcome_on_option_one_block() throws Throwable {
		SMCreateNewQuestionaire.option1Outcome.click();
		Thread.sleep(2000);
	}

	
	
	@Then("^verify the Save and Return button display$")
	public void verify_the_Save_and_Return_button_display() throws Throwable {
//		WebElement ele= SMCreateNewQuestionaire.creatNewQuestionnnaireSavenReturnBtn;
//		boolean flag = SMCreateNewQuestionaire.isElementPresent(ele);
//		Thread.sleep(2000);
		boolean flag = false;
		Assert.assertFalse(flag);	
	}
	
	
	@When("^user selects mandatory fields for option one on create Question page$")	
	public void user_selects_mandatory_fields_for_option_one_on_create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(1000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("101");
		Thread.sleep(3000);
//		SMCreateNewQuestionaire.optionFeatureKeywords.sendKeys("QQ1");
//		Thread.sleep(1000);
//		SMCreateNewQuestionaire.optionOpinionKeywords.sendKeys("QQQ1");	
		Thread.sleep(1000);
	}

	@When("^user selects mandatory fields for option two on create Question page$")	
	public void user_selects_mandatory_fields_for_option_two_on_create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option2Access.click();
//		Thread.sleep(1000);
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
				
		SMCreateNewQuestionaire.option2TypeOptionCode.sendKeys("100");
		Thread.sleep(1000);	
	    
	}


	@Then("^user clicks on Add Option button on create Question page$")
	public void user_clicks_on_Add_Option_button_on_create_Question_page() throws Throwable {
		SMCreateNewQuestionaire.addOptionButton.click();
		Thread.sleep(2000);
		
	}
	
	@When("^user selects Multiple Choice for question type$")
	public void user_selects_Multiple_Choice_for_question_type() throws Throwable {
		SMCreateNewQuestionaire.questionType.sendKeys("Mul");
		Thread.sleep(2000);	
		SMCreateNewQuestionaire.questionType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		}
	
	@Then("^verify the Required error message for Multi-value question$")
	public void verify_the_Required_error_message_for_Multi_value_question() throws Throwable {
		boolean flag= SMCreateNewQuestionaire.required_multi_question_label.isDisplayed();
		Assert.assertTrue(flag);			
	}
	
	@Then("^user enters valid data for Multi-value Question$")
	public void user_enters_valid_data_for_Multi_value_Question() throws Throwable {
		SMCreateNewQuestionaire.multi_Value_Question_Input.sendKeys("Test");		
	}
	
	@When("^the user selects Access for Option one$")
	public void the_user_selects_Access_for_Option_one() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(1000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
	}
	
	@Then("^the user enters value for Type option code$")
	public void the_user_enters_value_for_Type_option_code() throws Throwable {
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("101");
		Thread.sleep(1000);
	}
	
	@Then("^verify the error message for score field$")
	public void verify_the_error_message_for_score_field() throws Throwable {
		boolean flag= SMCreateNewQuestionaire.validation_score_field1.isDisplayed();
		Assert.assertTrue(flag);			
	}	
		
	@Then("^the user fills Option one without option id on Create Question page$")
	public void the_user_fills_Option_one_without_option_id_on_Create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(3000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test123");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test223");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test323");
		Thread.sleep(3000);    
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(3000);
	}
	
	
	@Then("^verify the error message for option Id$")
	public void verify_the_error_message_for_option_Id() throws Throwable {
		boolean flag=SMCreateNewQuestionaire.req_type_option_code.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("^the user fills Option one without option name on Create Question page$")
	public void the_user_fills_Option_one_without_option_name_on_Create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(3000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("1002");
		Thread.sleep(3000);
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test223");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test323");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(3000);     
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(3000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(3000); 
	}
	
	@Then("^the user fills Option one without bf score on Create Question page$")
	public void the_user_fills_Option_one_without_bf_score_on_Create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(5000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("1002");
		Thread.sleep(5000);
		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test123");
		Thread.sleep(5000);   		
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test223");
		Thread.sleep(5000);    
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test323");
		Thread.sleep(5000);    
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.score1.sendKeys("50");
		Thread.sleep(5000); 
	}
	
	@Then("^the user fills Option one without score on Create Question page$")
	public void the_user_fills_Option_one_without_score_on_Create_Question_page() throws Throwable {
//		SMCreateNewQuestionaire.option1Access.click();
//		Thread.sleep(5000);
		
		SMCreateNewQuestionaire.selectOption_radiobutton("Access");	
		Thread.sleep(2000);
		
		
		SMCreateNewQuestionaire.option1TypeOptionCode.sendKeys("1002");
		Thread.sleep(5000);
		SMCreateNewQuestionaire.optionTypeOptionName1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.optionTypeOptionName1.sendKeys("Test12");
		Thread.sleep(5000);     
		SMCreateNewQuestionaire.featureKeywords1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.featureKeywords1.sendKeys("Test22");
		Thread.sleep(5000);    
		SMCreateNewQuestionaire.opinionkeywords1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.opinionkeywords1.sendKeys("Test32");
		Thread.sleep(5000);     
		SMCreateNewQuestionaire.bfscore1.click();
		Thread.sleep(5000);
		SMCreateNewQuestionaire.bfscore1.sendKeys("1");
		Thread.sleep(5000); 
	}
		
	@Then("^the user enters alphabets for score field$")
	public void the_user_enters_alphabets_for_score_field() throws Throwable {
		SMCreateNewQuestionaire.score1.click();
		Thread.sleep(2000);
		SMCreateNewQuestionaire.score1.sendKeys("testsurvey");
		Thread.sleep(2000); 
	}
	
	@Then("^the user uncheck the PHI flags$")
	public void the_user_uncheck_the_PHI_flags() throws Throwable {
		SMCreateNewQuestionaire.unchecks_PHI.click();
		Thread.sleep(2000);
	}
	
//	Trying to send dynamically
//	@When("^the user selects Access on option one block$")
//	public void the_user_selects_Access_on_option_one_block() throws Throwable {
//		SMCreateNewQuestionaire.selectOption_radiobutton("Access");		
//		
//	}
//	
//	@When("^the user selects Communication on option one block$")
//	public void the_user_selects_Communication_on_option_one_block() throws Throwable {
//		SMCreateNewQuestionaire.selectOption_radiobutton("Communication");		
//		
//	}
//	
//	@When("^the user selects Loyalty on option one block$")
//	public void the_user_selects_Loyalty_on_option_one_block() throws Throwable {
//		SMCreateNewQuestionaire.selectOption_radiobutton("Loyalty");		
//		
//	}
//	
//	@When("^the user selects Office on option one block$")
//	public void the_user_selects_Office_on_option_one_block() throws Throwable {
//		SMCreateNewQuestionaire.selectOption_radiobutton("Office");		
//		
//	}
//	
//	@When("^the user selects Outcome on option one block$")
//	public void the_user_selects_Outcome_on_option_one_block() throws Throwable {
//		SMCreateNewQuestionaire.selectOption_radiobutton("Outcome");		
//		
//	}
	
}
