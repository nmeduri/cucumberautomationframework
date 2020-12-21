Feature: Health Check BVT

	Description: The purpose of this test to perform health check of BVT
   
   
    @RegressionTest @WebView @WideScreen @TC-3577
	Scenario: TC-3577	OCCP-3301 Account- Profile and Preferences : View Shipping Address And Billing Address - Verify That the user is able to View Shipping and Billing Address: Desktop, Desktop wide
	Given open browser
	When Account-address url is available
	When click on account from the header
	And verify and click on signin link
    When enter your email id -TC-3577
    And enter your password data -TC-3577
    And user click on sign in button 
	Then link card screen should be displayed
	And verify clicking on hi option
	Then click address dropdown option
	Then validate the addresses title is displayed
	Then validate the shipping information title is displayed
	Then validate the shipping information details are displayed
	Then validate the billing information title is displayed
	Then validate the billing information details are displayed
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-4706 OCCP-3308 - Verify the detail when user deletes  Credit Card/Payment Information 
	When Account payment info url is available
	Then Account payment info page is displayed
	Then Payment Information page with Credit Cards user have ever used for purchases is displayed
	Then click on X icon on payment method
	Then Verify Toast banner should be display on the top with a message of deletion
	
	@RegressionTest @WebView @WideScreen @TC-4005
	Scenario: TC-4005	OCCP-3337: FOOTER:Footer E-mail Sign Up, App Download, Accessibility-Verify the redirection when user clicks on Android App Store Logo - Desktop /Desktop Wide
	When login url is available
	And login page is displayed
	Then standard footer is displayed
	When click on Android App store logo
	Then should redirected to a new tab opens with details on App store download
	When fr locale login url is available
	And login page is displayed
	Then standard footer is displayed
	When click on Android App store logo
	Then should redirected to a new tab opens with details on App store download
	
	@RegressionTest @WideScreen
	Scenario: TC-2003,2011,1989 Verify the display of details when user logins with Triangle ID for the first time on Widescreen
	When login url is available
	When 2480-enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
   
	
