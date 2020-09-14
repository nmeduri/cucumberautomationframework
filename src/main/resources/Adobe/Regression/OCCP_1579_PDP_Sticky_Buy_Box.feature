Feature: OCCP-1579 PDP: Sticky Buy Box 

	Description: To test the ADOBE Test Cases for the story OCCP-1579
	
	@RegressionTest @WebView @WideScreen @SmokeTest
	Scenario: TC-566 Verify the Sticky Add to Cart is displayed when user scrolls down the buy box
	Given pdp url is available
	When pdp page is displayed for the product
	When user scrolls down past the buy box
	Then Sticky Add to Cart with product information must be displayed
	