Feature: OCCP-3588 Cart: Order Summary - Shipping Fees 
Description: To test the ADOBE Test Cases for the story OCCP-3588

	@RegressionTest @WebView 
	Scenario: TC-5954 OCCP-3588 Cart: Order Summary - Shipping Fees - Verify user clicks change CTA for Pick up at store
	Given cart url is available
  When cart page is displayed for the product
  Then click on the change CTA button
  And product availability flyout is displayed

  @RegressionTest @WebView 
	Scenario: TC-3553 OCCP-3588 Cart: Order Summary - Shipping Fees - BOPIS- Verify Store Info Tool Tip
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then click on the store name information tooltip icon
  And tool tip content should be displayed
  And click on view store details CTA
  Then user navigated to store information page
  
  @RegressionTest @WebView 
	Scenario: TC-3554 OCCP-3588 Cart: Order Summary - Shipping Fees - STH
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  And validate the Change CTA on order summary page
  And validate fees associated with STH and selected postal code is displayed
  
  @RegressionTest @WebView 
	Scenario: TC-3555 OCCP-3588 Cart: Order Summary - Shipping Fees - STH - Change Postal Code
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  And validate the Change CTA on order summary page
  And click on ship to home Change CTA
  Then validate postal code Modal is displayed
  
   @RegressionTest @WebView 
	Scenario: TC-3551 OCCP-3588 Cart: Order Summary - Shipping Fees - Verify BOPIS
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  And validate the pick up at store title on order summary page
  And validate on pick up at store Change CTA is displayed
  And Order Summary section should display the fees as free associated with the BOPIS fulfillment option selected
  
  @RegressionTest @WebView 
	Scenario: TC-3552 OCCP-3588 Cart: Order Summary - Shipping Fees -BOPIS- Verify Store Info Tool Tip
	When open browser
	Given cart url is available
  When cart page is displayed for the product
  Then user is displayed with order summary section on cart page
  And validate the pick up at store informational tool tip is displayed on order summary page
  And click on the pick up at store informational tooltip icon
  And tool tip content should be displayed
  And click on view store details CTA
  Then user navigated to store information page
  
  @RegressionTest @WebView 
	Scenario: TC-3476 OCCP-1306 Cart: Order Summary - Verify Empty Cart
	When open browser
	Given cart url is available
 Then verify the empty cart page