Feature: OCCP-1671 Account/Triangle ID - Registration Create New Account

	Description: To test the ADOBE Test Cases for the story OCCP-1671
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-608 Verify the ability of a user to create new Triangle ID account
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	Then verfiy CASL appear dynamically on registration model
	Then verfiy opt-in appear dynamically on registration model
	Then verify user sees the option to optn in optional marketing offers and sales flyer subscription
	And user click on next button
	And email verification sent confirmation screen is displayed
	
#	@RegressionTest @WebView @MobileView @WideScreen
#	Scenario: TC-609 Verify an inline error message is displayed when user enters an invalid email ID on the screen
#	Given sign up url is available
#	When sign up page is displayed
#	And user enter invalid email
#	Then a message is displayed to the user informing the email address format is invalid
#	And user enter email
#	And user enter password
	
#	@RegressionTest @WebView @MobileView @WideScreen
#	Scenario: TC-611 Verify an inline error message is displayed when email ID is not entered on the screen
#	Given sign up url is available
#	When sign up page is displayed
#	And user enter password
#	And user enter retype password
#	And user click on create button
#	Then an inline error should display
#	And the option to procced to the next screen is not selectable
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-614 Verify the user's ability to provide CASL consent to opt into sales and offer flyers
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	Then verfiy CASL appear dynamically on registration model
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-615 Verify the user's ability to learn about CASL opt in via tool tip message
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And user select tool tip icon next to email me about offer and sales
	Then verify tool tip message email me about offer and sales is displayed
	And close the tooltip
	Then user is able to close the tooltip
	Then verfiy CASL appear dynamically on registration model

	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-616 Verify the ability of a user to log in with already existing credentials via Sign In option on the screen
	Given sign up url is available
	When sign up page is displayed
	And user click on sign on option
	Then login page is displayed
	
#	@RegressionTest
#	Scenario: TC-613 Verify an inline error message is displayed when user re-enters the password incorrectly in the field on the screen 
#	Given sign up url is available
#	When sign up page is displayed
#	And user enter email
#	And user enter password
#	And user enter invalid retype password
#	Then message password do not match is displayed
#	And the option to procced to the next screen is not selectable
	