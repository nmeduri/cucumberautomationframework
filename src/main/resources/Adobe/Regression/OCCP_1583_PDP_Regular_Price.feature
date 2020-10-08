Feature: OCCP-1583 PDP: Regular Price

	Description: To test the ADOBE Test Cases for the story OCCP-1583
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-456 Verify the product unit price is displayed on the PDP for products with no variants and no price reduction and no active deal
	Given open browser
	When pdp url is available
	When pdp page is displayed for the product
	Then Product Unit Price must be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-456 Verify the product unit price is displayed on the PDP for products with no variants and no price reduction and no active deal
	Given open browser
	When pdp url is available
	When pdp page is displayed for the product
	Then user must see product unit price for mobile
	
	@WebView @WideScreen @MobileView @TabletView
	Scenario: close browser
	Given Close Browser