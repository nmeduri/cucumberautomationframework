Feature: OCCP-1760 Welcome Back Message

	Description: To test the ADOBE Test Cases for the story OCCP-1760
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-657 Verify the login screen includes message (First name NOT available)
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	When user is navigate on login page
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-658 Verify the ability of a user to switch accounts if required 
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	When user is navigate on login page
	Then welcome back page is displayed
	And user click on switch account
	When login page is displayed
	Then populated email id is not displayed
	Then populated password is not displayed
	
	
	
	

	