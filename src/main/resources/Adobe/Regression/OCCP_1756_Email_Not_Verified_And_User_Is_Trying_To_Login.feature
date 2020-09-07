Feature: OCCP-1756 Email not verified and User is trying to Login

	Description: To test the ADOBE Test Cases for the story OCCP-1756
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-640 Verify the user is prompted to perform email verification if the verification has not been done already
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And user click on next button
	Then email verification sent confirmation screen is displayed
	When user is navigate on login page
	When login page is displayed
	And user enter username
	And user enter password
	And user click on sign in button
	When user click resend email verification
	Then message verification email is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	
	@RegressionTest @MobileView
	Scenario: TC-640 Verify the user is prompted to perform email verification if the verification has not been done already (Mobile)
	Given signup url is available on mobile
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And user click on next button
	Then email verification sent confirmation screen is displayed
	When user is navigate on login page
	When login page is displayed
	And user enter username
	And user enter password
	And user click on sign in button
	When user click resend email verification
	Then message verification email is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then user has received the verification email on mobile
	
	
	
	
	