Feature: OCCP-2803 Account/Triangle ID - Link Rewards | Link Existing Active Loyalty card to the account

	Description: To test the ADOBE Test Cases for the story OCCP-2803
	
	@RegressionTest @WebView @MobileView @WideScreen @SmokeTest
	Scenario: TC-2510 Verification of Entering loyalty data: Field level validations - Desktop Wide
  Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is active
	And user click on continue button
	
	
	
	

	
	
	
	
	
	
	