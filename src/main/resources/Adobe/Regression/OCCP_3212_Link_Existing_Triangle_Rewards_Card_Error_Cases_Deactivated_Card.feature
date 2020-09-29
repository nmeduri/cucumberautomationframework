Feature: OCCP-3212 Account/Triangle ID - Link Rewards | Link Existing Triangle Rewards Card | Failure/Error Cases | Deactivated Card

Description: To test the ADOBE Test Cases for the story OCCP-3212

@RegressionTest @WebView @WideScreen 
	Scenario: TC-2396, TC-2385 Verfiy the display of Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then error message is displayed informing card is deactivated
	And user click on try again 
	Then user should navigate to link existing triangle card screen without prepopulated data
	And user enter card number that is deactivated
	And user click on continue button
	And user click on cancel button
	Then user should navigate to link cards screen
	
	@RegressionTest @WideScreen 
	Scenario: TC-2399, Verify the 'Try Again' button on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then try again button should be present in the error screen
	
	@RegressionTest @WideScreen 
	Scenario: TC-2400, Verify the 'Cancel' button on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then cancel button should be present in the error screen
	
	@RegressionTest @WideScreen 
	Scenario: TC-2397, Verify the Error image on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then error message is displayed informing card is deactivated
	And error image should be present in the error screen
	
	@RegressionTest @WideScreen
	Scenario: TC-2398, Verify the ErrorText on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then error message is displayed informing card is deactivated
	And user verify's error text
	
	@RegressionTest @WideScreen 
	Scenario: TC-2401, Verify the UI of Link Cards screen screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	And user cick on triangle rewards card
	And user enter card number that is deactivated
	And user click on continue button
	Then triangle id logo is displayed on screen
	Then error message is displayed informing card is deactivated
	Then try again button should be present in the error screen
	Then cancel button should be present in the error screen
	And error image should be present in the error screen
	