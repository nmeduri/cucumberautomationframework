Feature: OCCP-1181 Link Rewards Triangle
	Description: To test the ADOBE Test Cases for the story OCCP-1030
	
	@RegressionTest @WebView @WideScreen @SmokeTest
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
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2486 Verfiy Saving the consent on this step and feeding it back to Gigya profile  Displaying Rewards T&C on Desktop
	Given sign up url is available
	Then sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	And user click on verification email
	And user click on here to verify email link
	Then page your email has been verified displayed
	And switch on parent frame
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
	And clicks on register card button
	Then user should taken to success screen
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2487 Verfiy Download T&C and Displaying Rewards T&C on Desktop 
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
	Then terms and conditions should open user's browser whether pdf
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2487 Verfiy Download T&C and Displaying Rewards T&C on Desktop 
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
	And verify when click on cancel button
	Then user should be navigate to the previous screen as complete your your profile screen

	