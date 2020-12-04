Feature: 	OCCP-1650 PDP: Product Badges (Perfect Gift)

	Description: To test the ADOBE Test Cases for the story OCCP-1650
	
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-311
	Scenario: TC-311 Verify the 'Perfect Gift' badge remains displayed when user selects a product variant
	  When pdp url for perfect gift badge is available
    When pdp page is displayed for the product
    Then the perfect gift badge label displays in product family level page
    Then the perfect gift badge is applicable to all variants and remains displayed
  