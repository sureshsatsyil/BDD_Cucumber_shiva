Feature: verify surverymanagement Functionality

	##Working1 @SM_001 @SOCIAL-2984
	@Smoke11
Scenario: 1 Create a survey with valid data in code field with English Language 
	Given User opens browser to Create Survey Management 
	Then user enters the username and password 
	Then user clicks on the login button	 
	Then user finds Survey Management on dashboard 
	Then user clicks on the Survey Management option 
	When User clicks on Create New button then Create Survey Management page opens 
	When user enters valid code on Create Survey Management page 
	When user enters valid Survey name on Create Survey Management page 
	When user selects English for Select language question on Create Survey Management page 
	When user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then user clicks on Add Question button then the Create Question page opens 
	Then user enters valid question description 
	Then user enters valid question code 
	Then user selects comments for question setup 
	Then user selects free form text for question type 
	Then user selects english for Select language question on Create Question page 
	Then user clicks on Save and Return button 
	Then user lands on Survey questionnaire Confirmation page 
	Then close the browser 
	
	#Working2 @SM_002 @SOCIAL-29844	
	@Smoke1234	
Scenario: 2 Create a survey with existing code field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button	
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters existing code on Create Survey Management page 
	Then  verify the duplicate Error message on Create Survey Management page 
	Then  close the browser 
	
	#Working3 @SM_003 @SM_010 @SM_007 @SOCIAL-29844
	@Smoke11
Scenario: 3 Field level validations Create new survey configuration page for code, name and language 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	Then user finds the Required message for each field on Create new survey configuration
	Then  close the browser 
		
	#Working4 @SM_004 @SOCIAL-29844
	@Smoke11
Scenario: 4 Create a survey with invalid data code field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When user enters Invalid data for code field 
	Then verify the invalid error message for code field
	Then  close the browser 
	
	#Working5 @SM_005 @SOCIAL-29844
Scenario: 5 Create a survey with more than one code in the code field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When user enters more than one code for code field on Create Survey Management page 
	Then verify the morethanone error message on Create Survey Management page 
	Then  close the browser 
	
	#Working6 @SM_006 @SOCIAL-29844
	@Smoke11
Scenario: 6 Create a survey with existing survey name field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	And  user enters valid code on Create Survey Management page 
	And  user enters existing Survey name on Create Survey Management page 
	When user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects comments for question setup 
	And  user selects free form text for question type 
	And  user selects english for Select language question on Create Question page 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser 
	
	#working7 @SM_008 @SOCIAL-29844 SOCIAL-30409 
Scenario: 7 Create a survey with invalid data for survey name field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	And user enters valid code on Create Survey Management page 
#	SOCIAL-30409 created to fix this issue
	When user enters invalid data for survey name 	
	#Then verify the validation error message 
	Then  close the browser 
    
	#working8 @SM_009 @SOCIAL-29844	
	@Smoke11
Scenario: 8 Create a survey with valid data in code field with Spanish Language 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page
	When  user selects Spanish for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects comments for question setup 
	And  user selects free form text for question type
	When  user selects spanish for Select language question on Create Question page 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser 
		
	#Working8 @SM_011 @SM_013 @SOCIAL-29844
	@Smoke11	
Scenario: 9 Create a survey without any values and verify the error messages for question description, question code, question setup and select language 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	Then user finds the Required message for each field on Create new survey configuration 
	Then  close the browser 
	
	#Working9 @SM_012 @SOCIAL-29844	
	@Smoke11
Scenario: 10 Create a survey with all special charcters in question decription 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens
	Then user enters invalid question description
	Then  close the browser 
		

	#Working10 @SM_014 @SOCIAL-29844 
Scenario: 11 Create a survey with all special charcters in question ID 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description
	Then  user enters invalid question code
	Then  close the browser 
	
	
	#Working11 @SM_015 @SOCIAL-29844 @SOCIAL-30410 
Scenario: 12 Create a survey with more than one question id 
	Given User opens browser to Create Survey Management 
	Then user enters the username and password	
	Then user clicks on the login button 
	Then user clicks on the Survey Management option 
	When User clicks on Create New button then Create Survey Management page opens 
	When user enters valid code on Create Survey Management page 
	When user enters valid Survey name on Create Survey Management page 
	When user selects English for Select language question on Create Survey Management page 
	When user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then user clicks on Add Question button then the Create Question page opens 
	And user enters valid question description
#	New SOCIAL-30410 created to fix this issue
#	Then user enters more than one code for question id 
#	Then verify the error message displayed for question id 
	Then close the browser 
		
	#working12 @SM_017 @SM_018 @SOCIAL-29844
	@Smoke11
Scenario: 13 Create a survey without any values and verify the error messages for question description, question code, question setup and select language 
	Given User opens browser to Create Survey Management 
	Then user enters the username and password	
	Then user clicks on the login button 
	Then user clicks on the Survey Management option 
	When User clicks on Create New button then Create Survey Management page opens 
	When user enters valid code on Create Survey Management page 
	When user enters valid Survey name on Create Survey Management page 
	When user selects English for Select language question on Create Survey Management page 
	When user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then user clicks on Add Question button then the Create Question page opens 
	Then user finds the Required message for each field on Create Question page
	Then close the browser
	
	#working13 @SM_016 @SOCIAL-29844 clarification
Scenario: 14 Create a survey with  Same question id for different questions in a same survey
	Given User opens browser to Create Survey Management 
	Then user enters the username and password	
	Then user clicks on the login button 
	Then user clicks on the Survey Management option 
	When User clicks on Create New button then Create Survey Management page opens
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page
	When  user selects Spanish for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects comments for question setup 
	And  user selects free form text for question type
	When  user selects spanish for Select language question on Create Question page 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
	
	#Working14 @SM_019 @SOCIAL-29844 
	@Smoke11		
Scenario: 15 Create a survey with rating question and single choice option 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	And  user selects Single Choice for question type 
	Then user selects english for Select language question on Create Question page
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser 


	#Last step pending @SM_020 @SOCIAL-29844
	@Shiva1		 
Scenario: 16 Create a survey with rating question, single choice question type and without adding any option 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup
	When  user selects Single Choice for question type 
	And  user selects english for Select language question on Create Question page 
	Then verify the Save and Return button display 
	Then  close the browser
		
	#Working @SM_021 @SOCIAL-29844 	
	@Shiva1
Scenario: 17 Create a survey with rating question , single choice question type and with more than one any option 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	When  user selects Single Choice for question type 
	And  user selects english for Select language question on Create Question page
	When  user selects mandatory fields for option one on create Question page
	Then user clicks on Add Option button on create Question page	
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to code @SM_022 @SM_023 @SM_024 @SM_025 @SOCIAL-29844 
	@Shiva1
Scenario: 18 Create a survey with Rating question type with multiple choice option 
	         create a Survey with Rating question type with multiple choice option and do not provide label names
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup
  	When  user selects Multiple Choice for question type
	Then verify the Required error message for Multi-value question
	#There is no validation for Multi-value question
#	Then user enters invalid data for Muti-value question	
#	Then verify the error message for Multi-value question
	#There is no validation for Multi-value question 
#	Then user enters more than one label for Muti-value question 
#	Then verify the error message for Multi-value question
    Then  user enters valid data for Multi-value Question
	And  user selects english for Select language question on Create Question page 
	Then  user selects all the remaining fields on option one block
	Then user clicks on Add Option button on create Question page
	Then  user selects all the remaining fields on option two block
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	# @SM_026 @SOCIAL-29844 
	@Shiva1
Scenario: 19 Create Rating Survey multiple choice as question type and provide single add option 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description  
	And  user enters valid question code 
	And  user selects Rating for question setup
	When  user selects Multiple Choice for question type 
	Then  user enters valid data for Multi-value Question 
	And  user selects english for Select language question on Create Question page 
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	# yet to define, Need clarification from business on requirement
#	Then  verify the error message 
	Then  close the browser
	
	#yet to code #need clarification from business @SM_027 @SOCIAL-29844
	@Shiva1
Scenario: 20 Create a survey with rating question(multiple/single choice option ) without providing option id
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 	
	When  user selects Multiple Choice for question type 	
	Then  user enters valid data for Multi-value Question 
	And  user selects english for Select language question on Create Question page	
	And the user fills Option one without option id on Create Question page
	Then  verify the error message for option Id
	Then  close the browser
	
	#yet to code #need clarification from business @SM_028 @SOCIAL-29844	
	@Shiva1
Scenario: 21 Create a survey with rating question(multiple/single choice option) without providing option name
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	When  user selects Multiple Choice for question type 
	Then  user enters valid data for Multi-value Question 
	And  user selects english for Select language question on Create Question page 
	And the user fills Option one without option name on Create Question page
	Then  user clicks on Save and Return button 
	# yet to define, Need clarification from business on requirement
#	Then  verify the error message 
	Then  close the browser
	
	#yet to code #need clarification from business @SM_029 @SOCIAL-29844
	@Shiva1
Scenario: 22 Create a survey with rating question(multiple/single choice option ) without providing bf score 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	When  user selects Multiple Choice for question type 
	Then  user enters valid data for Multi-value Question 
	And  user selects english for Select language question on Create Question page 
	And the user fills Option one without bf score on Create Question page
	Then  user clicks on Save and Return button 
	# yet to define, Need clarification from business on requirement
#	Then  verify the error message 	
	Then  close the browser
	
	#yet to code #need clarification from business @SM_030 @SOCIAL-29844
	@Shiva1
Scenario: 23 Create a survey with rating question(multiple/single choice option ) without providing score 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	When  user selects Multiple Choice for question type 
	Then  user enters valid data for Multi-value Question 
	And  user selects english for Select language question on Create Question page 
	And the user fills Option one without score on Create Question page
	Then  user clicks on Save and Return button 
	# yet to define, Need clarification from business on requirement
#	Then  verify the error message 		
	Then  close the browser
		
	#yet to code @SM_031 @SOCIAL-29844	
	@Shiva1
Scenario: 24 Create a survey with rating question(multiple/single choice option ) by entering alphabets in the score field 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	And  user selects Rating for question setup 
	When  user selects Single Choice for question type
	And  user selects english for Select language question on Create Question page 
	When the user selects Access for Option one
	Then the user enters value for Type option code
	And  the user enters alphabets for score field
	Then verify the error message for score field
	Then  close the browser
	
	#yet to code @SM_032 @SOCIAL-29844	
	@Shiva1
Scenario: 25 Create Survey with Demographic Question with PHI flag is true 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	Then user selects Demographic Question for Question Type Setup drop down 
	Then user selects free form text for question type
	And  user selects english for Select language question on Create Question page 
	And Shows the Question Flags as follows PHI and Demographic and both are checked by default 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to design @SM_033 @SOCIAL-29844
	@Shiva1
Scenario: 26 Create a survey with Demographic question without checking PHI flag 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 	 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	Then user selects Demographic Question for Question Type Setup drop down
	Then user selects free form text for question type 
	And  user selects english for Select language question on Create Question page 
	Then the user uncheck the PHI flags
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to design @SM_034 @SOCIAL-29844
	@Shiva1
Scenario: 27 Create a survey with Demographic question with single choice option 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section  
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	Then user selects Demographic Question for Question Type Setup drop down 
	When  user selects Single Choice for question type 
	And  user selects english for Select language question on Create Question page 
	Then the user uncheck the PHI flags 
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to code @SM_035 @SOCIAL-29844 passed		
Scenario: 28 Create a survey with combination of rating and comments survey 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section  
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code
	Then user selects comments for question setup
	Then user selects free form text for question type 
	And  user selects english for Select language question on Create Question page 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code two
	And  user selects Rating for question setup for flow 1
	When  user selects Single Choice for question type for flow 1
	And  user selects english for Select language question on Create Question page for flow 1
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to code @SM_036 @SOCIAL-29844 issue	
Scenario: 29 Create a survey with combination of rating and demographic survey 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code two 
	Then user selects Demographic Question for Question Type Setup drop down
	Then user selects free form text for question type
	And  user selects english for Select language question on Create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code three
	And  user selects Rating for question setup
	When  user selects Single Choice for question type
	And  user selects english for Select language question on Create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser
		
	#yet to code @SM_037 @SOCIAL-29844
Scenario: 30 Create a survey with combination of comments and demographic survey 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password 
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code two
	Then user selects comments for question setup
	Then user selects free form text for question type
	And  user selects english for Select language question on Create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code three
	Then user selects Demographic Question for Question Type Setup drop down in flow 1
	Then user selects free form text for question type for flow 1
	And  user selects english for Select language question on Create Question page for flow 1
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
    Then  close the browser
		
	#yet to design @SM_038 @SOCIAL-29844
	@Shiva1	
Scenario: 31 Create a survey with combination of ratings, comments and demographic survey 
	Given  User opens browser to Create Survey Management 
	Then  user enters the username and password	
	Then  user clicks on the login button 
	Then  user finds Survey Management on dashboard 
	Then  user clicks on the Survey Management option 
	When  User clicks on Create New button then Create Survey Management page opens 
	When  user enters valid code on Create Survey Management page 
	When  user enters valid Survey name on Create Survey Management page 
	When  user selects English for Select language question on Create Survey Management page 
	When  user clicks on the Save and continue button then it goes to QUESTIONAIRE section 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code 
	Then user selects comments for question setup
	Then user selects free form text for question type 
	And  user selects english for Select language question on Create Question page 
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code two
	Then user selects Demographic Question for Question Type Setup drop down in flow 1
	Then user selects free form text for question type for flow 1
	And  user selects english for Select language question on Create Question page for flow 1
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  user clicks on Add Question button then the Create Question page opens 
	And  user enters valid question description 
	And  user enters valid question code three 
	And  user selects Rating for question setup for flow 2
	When  user selects Single Choice for question type for flow 2
	And  user selects english for Select language question on Create Question page for flow 2
	When  user selects mandatory fields for option one on create Question page
	Then  user clicks on Save and Return button 
	Then  user lands on Survey questionnaire Confirmation page 
	Then  close the browser		
