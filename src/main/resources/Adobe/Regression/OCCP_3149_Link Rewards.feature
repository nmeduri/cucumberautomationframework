Feature: OCCP-3149 Link Rewards 
Description: To test the ADOBE Test Cases for the story OCCP-3149
	
  @Regression @MobileView  @TabletView
  Scenario: TC-2137,2141 Verify the Field level validations on the Complete Your Profile screen on Mobile
    When login url is available 
    When enter email id
    And enter password data
    And user click on sign in button 
    Then user click on Get new triangle reward option 
    And verify clicks on continue button 
    And do not enter mandatory fields
    And verify clicks on continue button 
    Then validate inline error displayed when mandatory fields are not entered
    Then enter invalid details for the input fields 
    And verify clicks on continue button 
    Then validate inline error displayed when incorrect details are filled
    
  @RegressionTest @MobileView  @TabletView 
  Scenario: TC-2138,2142 Verify the T&C and Success screen details on Mobile 
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
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2136 Verify the details on Complete your profile screen on Mobile
	When login url is available
	When enter email id
	And enter password data 
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a pending loyalty card number
	And user click on continue button
	And verify when user enter valid information on complete your profile screen
	Then cancel button is displayed
	#And verify clicks on continue button
	#Then rewards terms and conditions should be displayed
	
	#@RegressionTest @MobileView @TabletView
  Scenario: TC-2130 Verify the T&C and Success screen details on Mobile 
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
	Then user has received the verification email on mobile
	And user tap on verification email on mobile
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
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2129 Verify the Field level validations on the Complete Your Profile screen
	Given login url is available 
	When enter email id
	And enter password data 
	And user click on sign in button 
	Then link card screen should be displayed 
	And verify when user clicks on the get a new triangle rewards card link 
	Then user should redirect to the get a new triangle rewards card screen 
	And verify clicks on continue button