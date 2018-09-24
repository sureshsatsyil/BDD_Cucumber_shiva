# Author- Suresh Kolluri
Feature: This feature is to test the login functionality for tools-etl.dev application 

#Login Button is in disabled state by default and gets enabled with a valid email input
@Smoke1234
Scenario: Login Button is disabled state by default 
	Given user opens the browser 
	Then user is on login page 
	And Login Page has both Email and Password fields 
	And verify the Login button is disabled 
	Then user enters the username and password 
	Then verify the Login button is enabled 
	Then close the browser
	
#Forgot password workflow	
Scenario: Forgot password happypath 
	Given user opens the browser 
	Then user is on login page 
	When user click on the Forgot Password link then forgot password page opens 
	Then user finds Email field on the forgot password page 
	And user find the Next button which is in inactive state 
	And user enters the valid Email ID on forgot password page then Next button becomes Active 
	Then user clicks on the Next button then it goes to the reset Password page 
	Then two Reset Password options displayed 
	And use Verification Email to rest/update password option is selected by default 
	Then user Clicks on the Submit button 
	Then user find the confirmation message 
	Then close the browser 
	
Scenario: Login button enables when credentials entered 
	Given user opens the browser 
	Then user is on login page 
	And Login Page has both Email and Password fields 
	And verify the Login button is disabled 
	Then user enters the username and password 
	Then close the browser	
	
#Validate tools-etl homepage 	
Scenario: Validate tools-etl homepage with valid credentials
	Given user opens the browser 
	Then user is on login page 
	Then user enters the username and password 
    Then user clicks on the login button 
	Then home page is displayed 
	Then close the browser 
	
Scenario: Validate tools-etl homepage with Invalid Credentails
	Given user opens the browser 
	Then user is on login page 
	Then user enters the invalid username and invalid password and click on the login button
    Then verify the invalid login message
	Then close the browser