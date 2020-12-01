Feature: OCCP-2803 Link Existing Active Loyalty card to the account- Active Ownership Validation
Description: To test the ADOBE Test Cases for the story OCCP-2803

	@RegressionTest @WebView @MobileView @TC-2501
	Scenario: TC-2501,TC-2500 View Active Ownership Validation Screen
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	Then user should be redirected to active ownership validation screen
	And in the screen header text should be present
	And sub header text should be present
	And postal code property should be present
	And year of birth property should be present
	And continue cta should be displayed
	And ability to go back cancel link should  be displayed
	
	
	
	@RegressionTest @WebView
	Scenario: TC-2512 -Verification of Authoring of Title and Subtitle on Ownership Validation screen via AEM
	
	Given that author wants to configure title and subtitle on the screen
	When content author configure title
	Then the configured title should be displayed on the screen
	
	
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And Ownership Validation tab should be displayed
	And Title and Subtitle should be successfully authored.
	And User click on Done button
	When User navigates to Publish page
	Then the changes should be displayed
	
		