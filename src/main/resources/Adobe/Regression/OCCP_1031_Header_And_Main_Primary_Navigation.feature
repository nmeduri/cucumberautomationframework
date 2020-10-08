Feature: OCCP-1031 Header and Main Navigateion - Primary Navigation
	Description: To test the ADOBE Test Cases for the story OCCP-1031
	
	
	@RegressionTest @WebView
	Scenario: TC-2804 Verification of display of Primary Navigation - Desktop 
	Given open browser
	When pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if primary navigation is present
	Then the primary navigation should be displayed after the pencil banner
	
	@RegressionTest @WideScreen
	Scenario: TC-2805 Verification of display of Primary Navigation - Desktop Wide 
	Given open browser
	When pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if primary navigation is present
	Then the primary navigation should be displayed after the pencil banner
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2802, TC-2803 Verification of Options present on Primary Navigation - Desktop - Desktop Wide
	Given pdp url is available
	When pdp page is displayed for the product
	Then in primary navigation verify the options present
	And store name is displayed
	And store status is displayed
	And closing hours is displayd
	And chervon is displayed
	And click on wish list icon
	Then on clicking user should be redirected to configured page
	And click on cart icon
	Then on clicking user redirect to cart page
	
	@WebView @WideScreen @MobileView @TabletView
	Scenario: close browser
	Given Close Browser
	

	