Feature: OCCP-1760 Welcome Back Message

	Description: To test the ADOBE Test Cases for the story OCCP-1760
	
	@RegressionTest
	Scenario: TC-657 Verify the login screen includes message (First name NOT available)
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	
	@RegressionTest
	Scenario: TC-657 Verify the login screen includes message (First name NOT available) (Mobile)
	Given log in url is available on mobile
	When enter email detail
	And user enter password
	And user click on sign in button
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	
	@RegressionTest
	Scenario: TC-657 Verify the login screen includes message (First name NOT available) (Wide Screen - Chrome)
	Given log-in url is available on wide screen chrome
	When enter email detail
	And user enter password
	And user click on sign in button
	When user is navigate on login page
	Then welcome back page is displayed
	And verify email id is prepopulated
	
	
	
	
	