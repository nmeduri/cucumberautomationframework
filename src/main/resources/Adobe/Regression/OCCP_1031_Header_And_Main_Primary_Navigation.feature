Feature: OCCP-1031 Header and Main Navigateion - Primary Navigation
	Description: To test the ADOBE Test Cases for the story OCCP-1031
	
	@RegressionTest @WebView
	Scenario: TC-2804 Verification of display of Primary Navigation - Desktop 
	Given pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if primary navigation is present
	Then the primary navigation should be displayed after the pencil banner
	
	@RegressionTest @WebView
	Scenario: TC-2805 Verification of display of Primary Navigation - Desktop Wide 
	Given pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if primary navigation is present
	Then the primary navigation should be displayed after the pencil banner
	

	