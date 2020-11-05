Feature: OCCP-2809 Account/Triangle ID - Link Rewards | Link Existing Triangle rewards Card | Failure/Error Cases | Balance Validation (Pending Card) and Card Status check

Description: To test the ADOBE Test Cases for the story OCCP-2809

  @RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2265,TC-2256,TC-2270 Verify the error messages when Bad Card number/ Closed/Victim/Non Existing card numbers are provided by the user on <Link Existing Card> screen
  Given open browser
  When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is closed
	And user click on continue button
	Then verify an error message is displayed informing card is closed
	And verify when user click on try again button 
	Then user should navigate to link existing triangle card screen without prepopulated data
  And user enters a loyalty card number that is closed
	And user click on continue button
	And verify when user click on cancel button
	Then user should navigate to link cards screen
	And user enters a Non-Existing card number
	And user click on continue button
	Then verify an error message is displayed informing card does not exist 
	And verify when user click on try again button 
	Then user should navigate to link existing triangle card screen without prepopulated data
	Given close Browser