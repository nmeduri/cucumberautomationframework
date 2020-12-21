Feature: OCCP-1184 Link Existing Card Screen
	Description: To test the ADOBE Test Cases for the story OCCP-1184
	
	@RegressionTest @MobileView @TabletView @WideScreen
	Scenario: TC-2272, TC-2282, TC-2285 View Link existing card screen
	Given quit browser
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	Then link existing card screen should be displayed
	And header text should be displayed
	And sub header should be displayed
	And text header for input Card number starting with 6345 should be displayed
	And tool tip message and tool tip should be displayed
	And continue cta should be displayed
	And action button get one here link to move to generate card flow should be displayed
	And ability to go back cancel link should  be displayed
	
	@RegressionTest @WebView @MobileView @TabletView @WideScreen
	Scenario: TC-2273, TC-2283, TC-2286 View Link existing card screen field validation
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	Then link existing card screen should be displayed
	And enter card number which is not in the correct format
	And user click on continue button
	Then inline error should be displayed
	And enter more than 16 characters including 4 prepopulated
	Then system should not allow user to enter more than 16 characters including the 4 prepopulated
	
	@RegressionTest @MobileView @TabletView @WideScreen @WebView @2274
	Scenario:TC-2274, TC-2284, TC-2287 Link existing card screen Card Validations
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	Then link existing card screen should be displayed
	And enter luhn check bad card number
	And user click on continue button
	Then respective bad card number error message should be displayed
	And verify when user click on try again button
	Then user should be redirected to link existing card page
	And enter pending card number if threshold card balance greater than 100
	And user click on continue button
	Then respective threshold card balance greater than 100 error message should be displayed
	And verify when user click on try again button
	Then user should be redirected to link existing card page
	And enter card number which is assigned to other account
	And user click on continue button
	Then respective card assigned to other account error message should be displayed
	
	
	
	