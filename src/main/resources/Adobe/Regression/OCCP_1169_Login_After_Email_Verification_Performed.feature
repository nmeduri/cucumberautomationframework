Feature: OCCP-1169 Account/Triangle ID - Login after email verification performed

	Description: To test the ADOBE Test Cases for the story OCCP-1169
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-669, TC-670 Verify the ability of a user to navigate to the Forgot Password screen from in order to reset P/W if required
	Given login url is available
	When login page is displayed
	And user click on forgot password
	Then forgot password page is displayed
	
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
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-662, TC-661 Verify the ability of a user to login into the Triangle ID account (Standard login, No linked card) 
	Given pdp url is available
	When click on account from the header
	And click on the login from the header
	When login page is displayed
    When enter email detail
	And user enter password
	And user click on sign in button
	
	
	

	