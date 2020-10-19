Feature: OCCP-1760 Welcome Back Message

	Description: To test the ADOBE Test Cases for the story OCCP-1760
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-657 TC-658 Verify the login screen includes message (First name NOT available)
	#Given quit browser
	Given open browser
	When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	And user click on switch account
	When login page is displayed
	Then populated email id is not displayed
	Then populated password is not displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-657 TC-658 Verify the login screen includes message (First name NOT available)
	When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	And user click on switch account
	When login page is displayed
	Then populated email id is not displayed
	Then populated password is not displayed
	And Remove Cookies
	Given login url is available
	
	
	
	

	