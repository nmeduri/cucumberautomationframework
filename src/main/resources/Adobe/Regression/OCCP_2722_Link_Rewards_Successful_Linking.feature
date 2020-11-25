Feature: OCCP-2722 Account/Triangle ID - Link Rewards | Successful linking
Description: To test the ADOBE Test Cases for the story OCCP-2722

@RegressionTest @MobileView
  Scenario: TC-2209 Generate a new Loyalty Rewards Card | Success
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
	And verify when user enter valid information on complete your profile screen 
	And verify clicks on continue button 
	Then rewards terms and conditions should be displayed 
	Then register card button is displayed on terms and conditions page
	And clicks on register card button
	Then user should taken to success screen
	And new triangle rewards card number should be dislayed
	And continue cta should be displayed
	And switch on parent frame
	
	@RegressionTest @MobileView
  Scenario: TC-2212 Continue Button
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
	And verify when user enter valid information on complete your profile screen 
	And verify clicks on continue button 
	Then rewards terms and conditions should be displayed 
	Then register card button is displayed on terms and conditions page
	And clicks on register card button
	Then user should taken to success screen
	And new triangle rewards card number should be dislayed
	And continue cta should be displayed
	Then user clicks on continue button
	And pdp page is displayed for the product
	And switch on parent frame
	
	@RegressionTest @WebView @WideScreen @TC-2210
	Scenario: TC-2210, TC-2211 Generate a new Loyalty Rewards Card
	Given open browser
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
	And clicks on register card button
	Then user should taken to success screen
	And new triangle rewards card number should be dislayed
	And continue cta should be displayed
	And switch on parent frame