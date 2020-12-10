Feature: OCCP-1656 PDP : Product Badge (Online only)

	Description: To test the ADOBE Test Cases for the story OCCP-1622
	   
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-314
    Scenario: TC-314 Verify the 'Online Only' badge remains displayed when user selects a product variant 
    When pdp only online badge product url is available
    When pdp page is displayed for the product
    Then the online badge is displayed at product family level
    Then verify the online only badge is displayed for all variants
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-67
    Scenario: TC-67 Verify the Online Only Badge is displayed when applicable 
    When pdp only online badge product url is available
    When pdp page is displayed for the product
    Then online badge is displayed in yellow color
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-73
    Scenario: TC-73 Verify the Perfect Gift Badge is displayed when applicable
    When pdp perfect gift badge product url is available
    When pdp page is displayed for the product
    Then perfect gift badge product is displayed
    Then perfect gift badge is displayed in blue color
	