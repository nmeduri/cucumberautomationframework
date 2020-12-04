Feature: 	OCCP-1648 PDP: Product Badges (Exclusive)

	Description: To test the ADOBE Test Cases for the story OCCP-1648
	
    @RegressionTest @TC-75
	  Scenario: TC-75 Verify the Exclusive Badge is displayed when applicable
	  When open browser
	  When pdp url for Exclusive badge is available
    When pdp page is displayed for the product
    Then the exclusive badge label displays in product page
    Then verify the exclusive badge in yellow color is displyed
    Then the exclusive badge is applicable to all variants and remains displayed
  
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-372
	  Scenario: TC-372 Verify the 'Exclusive' badge remains displayed when user selects a product variant
	  When open browser
	  When pdp url for Exclusive badge is available
    When pdp page is displayed for the product
    Then the exclusive badge label displays in product page
    Then the exclusive badge is applicable to all variants and remains displayed
  