Feature: OCCP-874 PDP Warranty

	Description: To test the ADOBE Test Cases for the story OCCP-874
	   
    @RegressionTest @WebView @MobileView @WideScreen @TabletView
    Scenario: TC-11 Verify the warranty information is correctly displayed on the PDP
    When pdp url is available
    When pdp page is displayed for the product
    Then the product warranty information is displayed under Resources in Overview section of page
    And the warranty information of the product is correct
      

	