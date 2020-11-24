Feature: OCCP-2724 Link Master Card - Error - Incorrect card information or not found
Description: To test the ADOBE Test Cases for the story OCCP-2724
	
	@RegressionTest @WebView @TC-2037
	Scenario: TC-2037 Card Information is incorrect/not found>
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And input all the triangle master card details
	And user click on continue button
	Then user should be redirected to card information is incorrect or not found error screen
	And verify when user click on try again button
	Then user should be redirected to link master card screen
	And master card page should be displayed without prepoulating previously entered details
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2282 View Link existing card screen
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And input all the triangle master card details
	And user click on continue button
	Then user should be redirected to card information is incorrect or not found error screen
	And user should see customer care contact number displayed
	And click on contact number
