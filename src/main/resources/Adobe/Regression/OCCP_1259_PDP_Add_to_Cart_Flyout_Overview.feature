Feature: OCCP-1259 PDP Add to Cart Flyout: Overview

	Description: To test the ADOBE Test Cases for the story OCCP-1259
	
	@RegressionTest @WebView @WideScreen @MobileView @TC-3481
	Scenario: TC-3481 OCCP-1259: PDP Add to Cart Flyout: Overview- Verify when Customer views Product Information on the Added to Cart Flyout
	When pdp add to cart product flyout url is available
	Then the product title is displayed on the product
	And select variants on pdp page
	When user clicks on add to cart button
	Then the added to cart flyout should be displayed
	And primary image for the product added should be displayed
	And product brand should be displayed
	And product title should be displayed
	And variant Selection should be displayed
	When pdp add to cart product flyout for fr locale url is available
	Then the product title is displayed on the product
	And select variants on pdp page
	When user clicks on add to cart button
	Then the added to cart flyout should be displayed
	And primary image for the product added should be displayed
	And product brand should be displayed
	And product title should be displayed
	And variant Selection should be displayed
	