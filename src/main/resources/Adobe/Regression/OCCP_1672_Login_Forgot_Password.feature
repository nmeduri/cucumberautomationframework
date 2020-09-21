Feature: OCCP-1672 Login Forgot Password

	Description: To test the ADOBE Test Cases for the story OCCP-1672
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1440 Verify the user has the ability to go back to Login screen while resetting password
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user click back to sign in
	Then login page is displayed
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1441 Verify the user is informed with user-friendly inline error that the email entered in is not in the correct format
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user enter incorrect email
	And user click on send button
	Then user friendly inline error is displayed
	
	@RegressionTest @WideScreen @WebView
	Scenario: TC-1442 Verify the user is able to resend reset password link on the email from the screen
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user fill emaildetails for forgot password
	And user click on send button
	And user click resend-passowrd link
	When mailinator url is available
	Then user enter reset password email detail in mailinator inbox
	And user click on go button
	And user click on verification email
	
	@RegressionTest @MobileView
	Scenario: TC-1442 Verify the user is able to resend reset password link on the email from the screen
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user fill emaildetails for forgot password
	And user click on send button
	And user click resend-passowrd link
	When mailinator url is available
	Then user enter reset password email detail in mailinator inbox
	And user click on go button
	And user tap on verification email on mobile
	
	@RegressionTest @WideScreen @WebView @MobileView
	Scenario: TC-1442 Verify the user is able to resend reset password link on the email from the screen
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user fill emaildetails for forgot password
	And user click on send button
	Then email sent password screen is displayed
	
	@RegressionTest @WideScreen @WebView @MobileView @SmokeTest
	Scenario: TC-1439 Verify the user's ability to receive a link to reset password over the email (Email Not Entered)
	Given login url is available
	When login page is displayed
	And user click on forgot password
	Then the email address is not popualated
	And user fill emaildetails for forgot password
	And user click on send button
	Then email sent password screen is displayed
	
	