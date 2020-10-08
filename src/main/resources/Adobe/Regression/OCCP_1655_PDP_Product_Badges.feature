Feature: OCCP-1655 PDP: Product Badges

	Description: To test the ADOBE Test Cases for the story OCCP-1655
	
    @RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-369 Verify the In-Store Only badge remains displayed when user selects a product variant 
	Given open browser
	When pdp url is available
    When pdp page is displayed for the product
    Then the editable badge label displays in store clearnce
    Then the in store only badge is applicable to all variants and remains displayed
    
    @WebView @WideScreen @MobileView @TabletView
	Scenario: close browser
	Given Close Browser
    
    