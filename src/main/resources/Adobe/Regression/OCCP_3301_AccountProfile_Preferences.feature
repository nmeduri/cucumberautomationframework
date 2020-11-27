Feature: OCCP-3301 :Account- Profile and Preferences : View Shipping Address And Billing Address

	Description: To test the ADOBE Test Cases for the story OCCP-3301

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
	