Feature: OCCP-1169 Account/Triangle ID - Login after email verification performed

	Description: To test the ADOBE Test Cases for the story OCCP-1169
	
	@RegressionTest
	Scenario: TC-669 Verify the ability of a user to navigate to the Forgot Password screen from in order to reset P/W if required
	Given login url is available
	When login page is displayed
	And user click on forgot password
	Then forgot password page is displayed
	
	@RegressionTest
	Scenario: TC-669 Verify the ability of a user to navigate to the Forgot Password screen from in order to reset P/W if required (Mobile)
	Given log in url is available on mobile
	When login page is displayed
	And user click on forgot password
	Then forgot password page is displayed
	
	@RegressionTest
	Scenario: TC-669 Verify the ability of a user to navigate to the Forgot Password screen from in order to reset P/W if required (Wide Screen - Chrome)
	Given log-in url is available on wide screen chrome
	When login page is displayed
	And user click on forgot password
	Then forgot password page is displayed
	
	@RegressionTest
	Scenario: TC-672 Verify user gets friendly inline error message displayed on the screen when credentials entered are not correct 
	Given login url is available
	When login page is displayed
	And user enter invalid credential email
	And user click on sign in button
	Then message field required is displayed
	When user is navigate on login page
	When login page is displayed
	When enter email detail
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
	And user enter invalid credential email
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
    When enter email detail
	And user enter password
	And user click on sign in button
	
	@RegressionTest
	Scenario: TC-672 Verify user gets friendly inline error message displayed on the screen when credentials entered are not correct (Mobile)
	Given log in url is available on mobile
	When login page is displayed
	And user enter invalid credential email
	And user click on sign in button
	Then message field required is displayed
	When user is navigate on login page
	When login page is displayed
	When enter email detail
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
	And user enter invalid credential email
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
    When enter email detail
	And user enter password
	And user click on sign in button
	
	@RegressionTest
	Scenario: TC-672 Verify user gets friendly inline error message displayed on the screen when credentials entered are not correct (Wide Screen - Chrome)
	Given log-in url is available on wide screen chrome
	When login page is displayed
	And user enter invalid credential email
	And user click on sign in button
	Then message field required is displayed
	When user is navigate on login page
	When login page is displayed
	When enter email detail
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
	And user enter invalid credential email
	And user enter invalid password
	And user click on sign in button
	Then an inline error is displayed
	When user is navigate on login page
	When login page is displayed
    When enter email detail
	And user enter password
	And user click on sign in button
	
	
	