Feature: OCCP-1680 User logging in from Email Verification Link

	Description: To test the ADOBE Test Cases for the story OCCP-1680
	
	
	@RegressionTest @WebView @WideScreen @Demo
	Scenario: TC-1437 Verify the user is automatically logged in after clicking on the email confirmation link
	Given open browser
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
	And user click on verification email
	And user click on here to verify email link
	Then page your email has been verified displayed
	And switch on parent frame
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-1437 Verify the user is automatically logged in after clicking on the email confirmation link (Mobile)
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
	And user tap on verification email on mobile
	And user click on here to verify email link
	Then page your email has been verified displayed
	
	