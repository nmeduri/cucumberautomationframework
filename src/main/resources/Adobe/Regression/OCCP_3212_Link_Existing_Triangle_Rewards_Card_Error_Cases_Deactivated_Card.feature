Feature: OCCP-3212 Account/Triangle ID - Link Rewards  Link Existing Triangle Rewards Card  Failure/Error Cases  Deactivated Card

Description: To test the ADOBE Test Cases for the story OCCP-3212

    @RegressionTest @WebView @WideScreen 
	Scenario: TC-2396, TC-2385 Verfiy the display of Link Cards screen when Card is Deactivated in Wide Desktop view
	Given open browser
	When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message is displayed informing card is deactivated
	And verify when user click on try again button 
	Then user should navigate to link existing triangle card screen without prepopulated data
	And user enters a loyalty card number that is deactivated
	And user click on continue button
	Then verify an error message is displayed informing card is deactivated
	And verify when user click on cancel button
	Then user should navigate to link cards screen
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-2399, Verify the 'Try Again' button on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then try again button should be present in the error screen
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-2400, Verify the 'Cancel' button on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	And user click on continue button
	Then cancel button should be present in the error screen

	@RegressionTest @WebView @WideScreen 
	Scenario: TC-2397, Verify the Error image on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	And user click on continue button
	Then verify an error message is displayed informing card is deactivated
	And error image should be present in the error screen
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-2398, Verify the ErrorText on Link Cards screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	And user click on continue button
	Then verify an error message is displayed informing card is deactivated
	And user verify's error text present in the error screen
	
	#@RegressionTest @WideScreen @WebView
	Scenario: TC-2401, Verify the UI of Link Cards screen screen when Card is Deactivated in Wide Desktop view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user enters a loyalty card number that is deactivated
	And user click on continue button
	Then triangle id logo is displayed on screen
	Then verify an error message is displayed informing card is deactivated
	Then try again button should be present in the error screen
	Then cancel button should be present in the error screen
	And error image should be present in the error screen
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-3052 Verfiy the display of screen when Card is Deactivated on Desktop
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	Then try again button should be present in the error screen
	And verify when user click on try again button
	Then user should navigate to link existing triangle card screen without prepopulated data
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2390 Verfiy the display of screen when Card is Deactivated in Mobile view
	Given open browser
	When login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	Then try again button should be present in the error screen
	And verify when user click on try again button
	Then user should navigate to link existing triangle card screen without prepopulated data
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2391 Verify the Error image on screen when Card is Deactivated in Mobile view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	And verify error image on screen
	Then user should be able to see the error image on screen
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2392 Verify the ErrorText on screen when Card is Deactivated in Mobile view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	Then user should be able to see the error text on screen
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2393 Verify the 'Try Again' button on screen when Card is Deactivated in Mobile view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	Then try again button should be present in the error screen
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2394 Verify the 'Cancel' button on screen when Card is Deactivated in Mobile view
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And verify when user enters a loyalty card number that is deactivated
	Then user should be able to enter the loyalty card number successfully which is deactivated
	And user click on continue button
	Then verify an error message appears informing that card is deactivated
	And user is able to see the click link on screen	
	
	@WebView @WideScreen @MobileView @TabletView
	Scenario: close browser
	Given Close Browser