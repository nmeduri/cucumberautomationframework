Feature: OCCP-2297 Account/Triangle ID - Registration - CASL Subscription

	Description: To test the ADOBE Test Cases for the story OCCP-2297
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1417 Verify Email subscription is toggled off by default when user is registering with a new email on CASL subscription screen
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	Then verify the CASL-subscription is toggled off by default
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1419 Verify the ability of a user to turn the subscription toggle on to opt into CASL 
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And scroll up to page
	And user click on toggle CASL subscription button
	Then user is able to click toggle CASL subscription button
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1421 Verify the ability of a user to view the tooltip on the CASL subscription screen to learn more about the program
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And scroll up to page
	And user select tool tip icon next to email me about offer and sales
	Then verify tool tip message email me about offer and sales is displayed
	And close the tooltip
	Then user is able to close the tooltip
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1420 Verify the ability of a user to turn the subscription toggle off to opt out of CASL
	Given sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And scroll up to page
	And user click on toggle CASL subscription button
	Then user is able to click toggle CASL subscription button
	And user click on toggle CASL subscription button
	Then verify the CASL subscription is toggled off
	
	
	
	
	
	
	