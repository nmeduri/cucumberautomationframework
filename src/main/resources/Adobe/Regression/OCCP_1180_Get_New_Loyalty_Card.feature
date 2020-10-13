Feature: OCCP-1181 Link Rewards Triangle
	Description: To test the ADOBE Test Cases for the story OCCP-1181
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-2469, TC-2477 Verfiy Generate a New Loyalty card for signed in user and Cancel link redirection on Desktop
	When login url is available
	When user 2488 enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2472 Verfiy Rewards Terms&Conditions screen and screen on Desktop 
	When login url is available
	When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	Then register card button is displayed on terms and conditions page
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-2470, TC-2478 Verfiy Field level validations on Personal Information on Desktop
	When login url is available
	When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify clicks on continue button
	Then user should be able to see an inline error message below the field
	

	