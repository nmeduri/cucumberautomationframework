Feature: OCCP-1180 Get New Loyalty Card
	Description: To test the ADOBE Test Cases for the story OCCP-1180
	
	#@RegressionTest @WebView @WideScreen @MobileView @TabletView
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
	Scenario: TC-2472, TC-2484 Rewards T&C screen and Link Success screen on Desktop and Wide Desktop View
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
	And user clicks on continue button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	Then register card button is displayed on terms and conditions page
	And clicks on register card button
	Then user should taken to success screen
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-2470
	Scenario: TC-2470, TC-2478, TC-2482  Verfiy Field level validations on Personal Information on Desktop
	When login url is available
	When user 2488 enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify clicks on continue button
	Then user should be able to see an inline error message below the field
	
	@RegressionTest @WideScreen  @SmokeTest
	Scenario: TC-2481 Generate a New Loyalty card for signed in user and Cancel link redirection on Wide Desktop View
	When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And user clicks on cancel link
	Then user should be returned to initial link cards screen
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2480 Rewards T&C screen and Link Success screen
	Given sign up url is available
	Then sign up page is displayed
	And in mobile user enter email 
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When yopmail url is available
	Then verify email verification in mobile
	Then page your email has been verified displayed
	And user clicks on continue button
	Then link card screen should be displayed 
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And in mobile verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	And clicks on register card button
	Then user should navigate to success screen
	And switch on parent frame
	
	
