Feature: OCCP-2999 PDP: Wishlist (Guest) 

	Description: To test the ADOBE Test Cases for the story OCCP-2999
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario:  	TC-1401 Verify an error message is displayed prompting the user to select all variants when user clicks the wihslist icon
	Given pdp url is available
    When pdp page is displayed for the product
    And click the wishlist item
    Then an error message is displayed prompting user to select all variant first
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @SmokeTest
	Scenario: TC-279 Verify a guest user is able to add products to the wishlist
	Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    And user select product
    And click the wishlist item
    Then item is successfully added into wish list 
    
    #@RegressionTest @WebView
    Scenario: TC-280 Verify the behavior of a PDP when guest user clears browser data
    Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    And user select product
    And click the wishlist item
    Then item is successfully added into wish list 
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-282 Verify the behavior of the page when a guest user adds variants to a product already added to the guest user's wishlist
    Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    And user select product
    #And click the wishlist item
    #Then item is successfully added into wish list 
    #And user select product
    Then wishlist icon becomes active in red color
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView
    Scenario: TC-1399 Verify the default state of the wishlist icon is displayed when guest user has not added products to wishlist
    Given pdp url is available
    When pdp page is displayed for the product
    Then the default state of wishlist icon is displayed
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView
    Scenario: TC-1400 Verify the default state of the wishlist icon is displayed when guest user has not selected the variant previously added to the wishlist 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the default state of wishlist icon is displayed
    
    