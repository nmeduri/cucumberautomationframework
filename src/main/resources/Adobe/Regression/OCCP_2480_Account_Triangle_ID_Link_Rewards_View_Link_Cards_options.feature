Feature: OCCP-2480 Account/Triangle ID / Link Rewards / View Link Cards options

	Description: To test the ADOBE Test Cases for the story OCCP-2480
	
	@RegressionTest @WideScreen
	Scenario: TC-2003,2011,1989 Verify the display of details when user logins with Triangle ID for the first time on Widescreen
	Given open browser
	When login url is available
	When 2480-enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	
   @RegressionTest @WideScreen
	Scenario: TC-2004,2012,1990 Verify the flow to link loyalty card after account confirmation on Widescreen
	Given sign up url is available
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
	And user clicks on continue button
	Then link card screen should be displayed
	
	@RegressionTest @WideScreen
	Scenario: TC-2005,2013,1991 Verify the multiple card options available on link card screen on Widescreen
	Given login url is available
	When 2480-enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And get traiangle rewards card option should be displayed
	And get a new traiangle rewards card option should be displayed
	And get Master traiangle rewards card option should be displayed
	
	@RegressionTest @WideScreen
	Scenario: TC-2006,2014,1992 Verify hide the link screen option on the Link Card screen when -Triangle ID Login screen on Widescreen
	Given login url is available
	When enter hide link screen email details
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And Do not show me this again toggle button is available on the link card screen
	When click on the toggle from left to right
	And click on skip link
	Then pdp page is displayed for the product
	Given login url is available
	When enter hide link screen email details
	And user enter password
	And user click on sign in button
	Then pdp page is displayed for the product
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-1995,TC-2009,2017 Verify the display of tool tip for the "Do not show me this again" toggle button
    Given login url is available
	When 2480-enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And Do not show me this again toggle button is available on the link card screen
	When hover on the tool tip and verify the message
	Then click on the toggle from left to right
	And user should not see the tool tip message
	
	#@RegressionTest @WideScreen
	Scenario: TC-2007,2015,2016,1993,TC-1996 Verify hide the link screen option on the Link Card screen when -Email Validation
	Given open browser
	Given sign up url is available
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
	And user clicks on continue button
	Then link card screen should be displayed
	And Do not show me this again toggle button is available on the link card screen
	When click on the toggle from left to right
	And click on skip link
	Then pdp page should displayed
	#And open new window
	Given login url is available
	When user enter the previously registered email
	And user enter password
	And user click on sign in button
	Then pdp page should displayed
	
	#@RegressionTest @WideScreen @WebView
	Scenario: TC-2008,TC-1994 Verify hide the link screen option on the Link Card screen when -Email Validation screen- New browser on Widescreen and Webview
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
	And user clicks on continue button
	Then link card screen should be displayed
	And Do not show me this again toggle button is available on the link card screen
	When click on the toggle from left to right
	And click on skip link
	Then pdp page should displayed
	And quit browser
	Given open browser
	When login url is available
	When user enter the previously registered email
	And user enter password
	And user click on sign in button
	Then pdp page should displayed
	
	#@RegressionTest @WebView
	Scenario: TC-1996 Verify the skip functionality on the Link card screen
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And skip link text should be displayed
	When click on skip link
	Then pdp page should displayed
	
	#@RegressionTest @WideScreen @MobileView
	Scenario: TC-2010,2018 Verify the skip functionality on the Link card screen on Widescreen
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And Do not show me this again toggle button is available on the link card screen
	And click on skip link
