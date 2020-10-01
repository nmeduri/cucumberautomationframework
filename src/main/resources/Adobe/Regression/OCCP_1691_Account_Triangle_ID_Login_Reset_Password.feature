Feature: OCCP-1691 Account/Triangle ID - Login - Reset Password 

	Description: To test the ADOBE Test Cases for the story OCCP-1691
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-590 Verify an inline error message is displayed when user re-enters the password incorrectly in the field
	Given sign up url is available
	When sign up page is displayed
	Then user enter password
	And user enter invalid retype password
	And the system displays an inline error that passwords do not match
	And the option to procced to the next screen is not selectable