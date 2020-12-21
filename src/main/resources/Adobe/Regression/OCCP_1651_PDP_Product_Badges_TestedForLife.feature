Feature: 	OCCP-1651 PDP: Product Badges (Tested for Life)

	Description: To test the ADOBE Test Cases for the story OCCP-1651
	
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-1545
	Scenario: TC-1545 Verify the Tested For Life badge is displayed on the PDP when applicable
		
  	Given open browser
    When pdp tested for life badge product url is available
    When pdp page is displayed for the product
    Then tested for life badge is displayed for life category
    