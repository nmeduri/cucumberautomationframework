Feature: OCCP-1576 PDP: Product Badges

	Description: To test the ADOBE Test Cases for the story OCCP-1576
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-58, TC-299 Verify the Special Buy badge is displayed when applicable
	Given pdp url is available
    When pdp page is displayed for the product
    Then special buy is displayed
    Then the badge is displayed in pink color
    Then the badge persists and displays for all variants of the product
    
    