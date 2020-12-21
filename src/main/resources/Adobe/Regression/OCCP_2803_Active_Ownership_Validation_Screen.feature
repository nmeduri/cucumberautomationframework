Feature: OCCP-2803 Link Existing Active Loyalty card to the account- Active Ownership Validation
Description: To test the ADOBE Test Cases for the story OCCP-2803

	@RegressionTest @WebView @MobileView @WideScreen @Tablet @TC-2503
	Scenario: TC-2501,TC-2500, TC-2502 View Active Ownership Validation Screen
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
	
	@RegressionTest @WideScreen @TabletView
	Scenario: TC-2510,TC-2511 Entering loyalty data: Field level validations
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	Then user should be redirected to active ownership validation screen
	And user click on continue button
	Then user should be redirected to active ownership validation screen
	And postal code property should be present
	And year of birth property should be present
	And user click on continue button
	Then postal code and yob inline errors should be displayed
	And validate the postal code does not enter more than 7 characters
	And user click on continue button
	Then incorrect postal code inline error should be displayed
	
	@RegressionTest @MobileView
	Scenario: TC-2521 Verification of  Redirection of user from Error screen to Active Ownership Validation and Link Cards screen
	Given login url is available
	When enter email for OCCP 2803
	And enter password for OCCP 2803
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	And enter postal code
	And in mobile enter year of birth
	And user click on continue button
	And verify when user click on try again button
	And postal code property should be present
	And enter postal code
	And in mobile enter year of birth
	And user click on continue button
	And verify user click on cancel button	

	@RegressionTest @TabletView @2524
	Scenario: TC-2524 Verification of  Redirection of user from Error screen to Active Ownership Validation and Link Cards screen
	Given login url is available
	When enter email for OCCP 2803
	And enter password for OCCP 2803
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	And enter postal code
	And in tablet enter year of birth
	And user click on continue button
	And verify when user click on try again button
	And postal code property should be present
	And enter postal code
	And in mobile enter year of birth
	And user click on continue button
	And verify user click on cancel button	
	
	
	
	@RegressionTest  @WideScreen @2523
	Scenario: TC-2522, TC-2523 Verification of  Redirection of user from Error screen to Active Ownership Validation and Link Cards screen
	Given login url is available
	When enter email for OCCP 2803
	And enter password for OCCP 2803
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	And enter postal code
	And enter year of birth
	And user click on continue button
	And verify when user click on try again button
	And postal code property should be present
	And enter postal code
	And enter year of birth
	And user click on continue button
	And verify user click on cancel button
	
	
	
	
	
	
	
	