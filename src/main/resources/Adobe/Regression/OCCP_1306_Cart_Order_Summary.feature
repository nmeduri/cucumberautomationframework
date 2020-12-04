Feature: 	OCCP-1306 Cart: Order Summary
Description: To test the ADOBE Test Cases for the story OCCP-1306

@RegressionTest @WebView
	Scenario: TC-3477 OCCP-1306 Cart: Order Summary - Verify Cart with Products
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  Then validate Taxes as the summation of all of the taxes associated to the line items in the cart should be displayed
  Then validate Total as the summation of the Subtotal is displayed
  
  @RegressionTest @WebView
	Scenario: TC-3478 OCCP-1306 Cart: Order Summary - Verify Cart with Products - Save Message
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  Then validate the saving message should be displayed

  @RegressionTest @WebView 
	Scenario: TC-3476 OCCP-1306 Cart: Order Summary - Verify Empty Cart
	When open browser
	Given cart url is available
 Then verify the empty cart page