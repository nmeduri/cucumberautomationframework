Feature: OCCP-1672 Login Forgot Password

	Description: To test the ADOBE Test Cases for the story OCCP-1672
	
	@RegressionTest
	Scenario: TC-1440 Verify the user has the ability to go back to Login screen while resetting password
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user click back to sign in
	Then login page is displayed
	
	@RegressionTest
	Scenario: TC-1440 Verify the user has the ability to go back to Login screen while resetting password (Mobile)
	Given log in url is available on mobile
	When login page is displayed
	And user click on forgot password
	And user click back to sign in
	Then login page is displayed
	
	@RegressionTest
	Scenario: TC-1440 Verify the user has the ability to go back to Login screen while resetting password (Wide Screen - Chrome)
	Given log-in url is available on wide screen chrome
	When login page is displayed
	And user click on forgot password
	And user click back to sign in
	Then login page is displayed
	
	@RegressionTest
	Scenario: TC-1441 Verify the user is informed with user-friendly inline error that the email entered in is not in the correct format
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user enter incorrect email
	And user click on send button
	Then user friendly inline error is displayed

    @RegressionTest
	Scenario: TC-1441 Verify the user is informed with user-friendly inline error that the email entered in is not in the correct format (Mobile)
	Given log in url is available on mobile
	When login page is displayed
	And user click on forgot password
	And user enter incorrect email
	And user click on send button
	Then user friendly inline error is displayed
	
	@RegressionTest
	Scenario: TC-1441 Verify the user is informed with user-friendly inline error that the email entered in is not in the correct format (Wide Screen - Chrome)
	Given log-in url is available on wide screen chrome
	When login page is displayed
	And user click on forgot password
	And user enter incorrect email
	And user click on send button
	Then user friendly inline error is displayed	
	
	