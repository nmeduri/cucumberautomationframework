Feature: OCCP-1583 PDP: Regular Price

	Description: To test the ADOBE Test Cases for the story OCCP-1583
	
	@RegressionTest @WebView @WideScreen @SmokeTest
	Scenario: TC-456 Verify the product unit price is displayed on the PDP for products with no variants and no price reduction and no active deal
	Given pdp url is available
	When pdp page is displayed for the product
	Then Product Unit Price must be displayed
	
	@RegressionTest @MobileView
	Scenario: TC-456 Verify the product unit price is displayed on the PDP for products with no variants and no price reduction and no active deal
	Given pdp url is available
	When pdp page is displayed for the product
	Then user must see product unit price for mobile