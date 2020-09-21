Feature: OCCP-1576 PDP: Product Badges

	Description: To test the ADOBE Test Cases for the story OCCP-1576
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-58, TC-299 Verify the Special Buy badge is displayed when applicable
	Given pdp url is available
    When pdp page is displayed for the product
    Then special buy is displayed
    Then the badge is displayed in pink color
    Then the badge persists and displays for all variants of the product
    
    @RegressionTest @WebView @MobileView @WideScreen
    Scenario: TC-68 Verify the In-Store Only Badge is displayed when applicable 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the editable badge label displays in store clearnce
    And the badge is displayed in Yellow color
   
    @RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-369 Verify the In-Store Only badge remains displayed when user selects a product variant 
	Given pdp url is available
    When pdp page is displayed for the product
    Then the editable badge label displays in store clearnce
    Then the badge persists and displays for all variants of the product
    