Feature: 	OCCP-3308 Account- Profile and Preferences : View Payment Information

	Description: To test the ADOBE Test Cases for the story OCCP-3308

	@RegressionTest @WebView @WideScreen 
	Scenario: TC-4706 OCCP-3308 - Verify the detail when user deletes  Credit Card/Payment Information 
	
	When Account payment info url is available
	Then Account payment info page is displayed
	Then Payment Information page with Credit Cards user have ever used for purchases is displayed
	Then click on X icon on payment method
	Then Verify Toast banner should be display on the top with a message of deletion

	@RegressionTest @WebView @WideScreen 
	Scenario: TC-4704 OCCP-3308 - Verify the detail when user views  Payment Information page 
	
	When Account payment info url is available
	Then Account payment info page is displayed
	Then Payment Information page with Credit Cards user have ever used for purchases is displayed
	Then Card Number ending in Last 4 digits of the card is displayed
	Then Expiry date is displayed for the card
	