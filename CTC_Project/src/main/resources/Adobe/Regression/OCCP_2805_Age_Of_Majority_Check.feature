Feature: 	OCCP-2805 Account/Triangle ID - Link Rewards / Age of Majority Check
  
  Description: To test the ADOBE Test Cases for the story OCCP-2805

  @Regression @MobileView @WebView 
  Scenario: TC-2593,TC-2602, TC-2607 Verfiy Age of Majority Reached on Complete Your Profile screen on Desktop
  Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	
	#@Regression @MobileView @WebView @WideScreen
    Scenario: TC-2594,TC-2603,TC-2608 Verfiy Age of Majority is NOT Reached on Complete Your Profile screen
    Given login url is available
	When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information and select year of birth not reached age majority check
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	
	#@Regression @MobileView @WebView @WideScreen
    Scenario: TC-2595,TC-2604,TC-2609 Verfiy More Information Required on Complete Your Profile screen on Desktop
    Given login url is available
    When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter year of birth that equals age of majority
	Then verify Month of Birth and Date of Birth fields appears 
	
	#@Regression @MobileView @WebView @WideScreen
	Scenario: TC-2596,2605,2610 Verfiy More Information Required User's Birthday is Before Current Date  on Complete Your Profile screen 
    Given login url is available
	When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information and select year of birth for age majority check
	Then verify Month of Birth and Date of Birth fields appears
	Then enter birthday before current date
	And verify clicks on continue button
	Then rewards terms and conditions should be displayed
	
	#@Regression @MobileView @WebView @WideScreen
	Scenario: TC-2597,2606,TC-2611 Verfiy More Info Required - User's Birthday is After Current Date on Complete Your Profile screen
    Given login url is available
	When enter detail email
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information and select year of birth for age majority check
	Then verify Month of Birth and Date of Birth fields appears
	Then enter birthday after current date
	And verify clicks on continue button
	Then verify user should see an error screen with Age of majority message
	And verify when user click on try again button
	And verify when user click on cancel button
