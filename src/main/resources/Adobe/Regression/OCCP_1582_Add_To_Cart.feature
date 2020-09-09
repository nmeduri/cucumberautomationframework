Feature: OCCP-1582 PDP: Add to Cart-CTA (BOPIS & Ship To Home)

	Description: To test the ADOBE Test Cases for the story OCCP-1582
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-1549 Verify an error is displayed on PDP when user increases the quantity in the quantity selector box above 99 
	Given pdp url is available
    When pdp page is displayed for the product
    And user enter number in the quantity box that is greater than maximum quantity
	Then greater than maximum quantity is not updated in the quantity box
	
	
	