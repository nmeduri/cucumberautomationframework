Feature: OCCP-1181 Link Rewards Triangle
	Description: To test the ADOBE Test Cases for the story OCCP-1030
	
	@RegressionTest @WebView
	Scenario: TC-2485 Verfiy displaying Rewards Terms&Conditions screen on Desktop
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	Then register card button is displayed on terms and conditions page
	Then cancel button is displayed on terms and conditions page
	And verify when click on cancel button
	Then user should be navigate to the previous screen as complete your your profile screen
	

	