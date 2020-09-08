Feature: OCCP-2999 PDP: Wishlist (Guest) 

	Description: To test the ADOBE Test Cases for the story OCCP-2999
	
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario:  	TC-1401 Verify an error message is displayed prompting the user to select all variants when user clicks the wihslist icon
	Given pdp url is available
    When pdp page is displayed for the product
    And click the wishlist item
    Then an error message is displayed prompting user to select all variant first