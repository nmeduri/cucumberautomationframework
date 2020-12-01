Feature: OCCP-3111 Cart - Add to Wishlist 
Description: To test the ADOBE Test Cases for the story OCCP-3111

	@RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-2983
	Scenario: TC-2983, TC-2980, TC-2986, Tc-2989 Display of message when Wishlist limit is reached
	Given open browser
	Given cart url is available
    When cart page is displayed for the product
    And click on add to wishlist when user reached maximum no of items permitted in wishlist 
    Then error message should be displayed you have reached the limit of 2 items added to wishlist
    And view wishlist and close links should be displayed
    And click on the close link
    Then the message should be closed 
    And close Browser
  
    @RegressionTest @WebView @WideScreen @TC-2981
	Scenario: TC-2981, TC-2984 Item is added to wishlist from cart (product not already in wishlist)
	Given open browser
	Given cart url is available
    When cart page is displayed for the product
    And in the cart page wishlist icon should be displayed next to the product
    Then access the product item and click on respective wishlist icon
    And on clicking product item should be added and moved successfully to wishlist
    And the item should be deleted or not displayed in the cart page
    Then item has been added to wishlist message should be displayed
    And a link should be displayed to view wishlist 
    And close Browser
  
    @RegressionTest @MobileView @TabletView
	Scenario: TC-2978, TC-2987 Item is added to wishlist from cart (product not already in wishlist)
	Given open browser
	Given cart url is available
    When cart page is displayed for the product
    And in the cart page wishlist icon should be displayed next to the product
    Then access the product item and click on respective wishlist icon
    And user has tapped on hamburger menu
    And on clicking product item should be added and moved successfully to wishlist
    And the item should be deleted or not displayed in the cart page
    Then item has been added to wishlist message should be displayed
    And a link should be displayed to view wishlist 
    And close Browser
  
    @RegressionTest @WebView @WideScreen
	Scenario: TC-2982 Item is added to wishlist from cart (product already in wishlist)
	Given open browser
	Given cart url is available
    When cart page is displayed for the product
    And in the cart page wishlist icon should be displayed next to the product
    Then access the product item and click on respective wishlist icon
    And on clicking product item should be added and moved successfully to wishlist
    And refresh the page
    Then access the product item and click on respective wishlist icon
    And on clicking product item should be not be added to wishlist as it is already present
    And the item should be deleted or not displayed in the cart page
    Then item has been added to wishlist message should be displayed
  
    @RegressionTest @MobileView @TabletView
	Scenario: TC-2979, TC-2988 Item is added to wishlist from cart (product not already in wishlist)
	Given open browser
	Given cart url is available
    When cart page is displayed for the product
    And in the cart page wishlist icon should be displayed next to the product
    Then access the product item and click on respective wishlist icon
    And user has tapped on hamburger menu
    And on clicking product item should be added and moved successfully to wishlist
    And refresh the page
    Then access the product item and click on respective wishlist icon
    And user has tapped on hamburger menu
    And on clicking product item should be not be added to wishlist as it is already present
    And the item should be deleted or not displayed in the cart page
    Then item has been added to wishlist message should be displayed
    And a link should be displayed to view wishlist 
  
  @RegressionTest @WebView @WideScreen @TC-3761
	Scenario: TC-3761 Verification of Clicking 'View Wishlist' link on the displayed message when item is added to wishlist from cart (product not already in wishlist)
	Given open browser
	Given cart url is available
  When cart page is displayed for the product
  And in the cart page wishlist icon should be displayed next to the product
  Then access the product item and click on respective wishlist icon
  Then item has been added to wishlist message should be displayed
  And a link should be displayed to view wishlist 
  Then click on the view Wishlist link
  And user is directed to the Wishlist page
  
  @RegressionTest @WebView @WideScreen @TC-3762
	Scenario: TC-3762 Verification of Clicking 'View Wishlist' link on the displayed message when item is added to wishlist from cart (product already in wishlist)
	Given open browser
	Given cart url is available
  When cart page is displayed for the product
  And in the cart page wishlist icon should be displayed next to the product
  Then access the product item and click on respective wishlist icon
  And on clicking product item should be added and moved successfully to wishlist
  And refresh the page
  Then access the product item and click on respective wishlist icon
  And on clicking product item should be not be added to wishlist as it is already present
  And the item should be deleted or not displayed in the cart page
  Then item has been added to wishlist message should be displayed
  And a link should be displayed to view wishlist 
  Then click on the view Wishlist link
  And user is directed to the Wishlist page
  