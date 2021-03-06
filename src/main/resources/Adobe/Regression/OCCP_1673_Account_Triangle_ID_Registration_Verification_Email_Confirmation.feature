Feature: OCCP-1673 Account/Triangle ID - Registration Verification Email Confirmation

	Description: To test the ADOBE Test Cases for the story OCCP-1673

	@RegressionTest @WebView @WideScreen
	Scenario: TC-599 Verify the system sends the user an email with email verification link when they select Create upon successfully entering all the information on the account creation screen
	When sign up url is available
	Then sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-599 Verify the system sends the user an email with email verification link when they select Create upon successfully entering all the information on the account creation screen (Mobile)
	When signup url is available on mobile
	Then sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then user has received the verification email on mobile