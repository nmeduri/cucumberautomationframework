Feature: OCCP-2852 Primary Navigation | Mobile
  
  Description: To test the ADOBE Test Cases for the story OCCP-2852

@Regression @MobileView
  Scenario: TC-2901 View of Primary Navigation on the Mobile view
   Given pdp url is available
   When pdp page is displayed for the product
   Then primary navigation should be visible in the header
   And primary navigation should consist of hamburger menu
   And primary navigation should consist of banner logo
   And primary navigation should consist of store locator icon
   And primary navigation should consist of cart icon
   And primary navigation should consist of search bar
   And user has tapped on hamburger menu
   Then x icon should be displayed
   And user clicks on banner logo
   Then user should navigate back to home page 
   And user clicks on store locator icon
   Then store locator fly out should expand
   And user clicks on store locator fly out cross icon
   And user clicks on cart icon
   Then user should navigate to cart page
   And user scrolls down the page
   Then search bar dissappears and search icon should be shown on the header
   And user clicks into the search bar or on the search icon
   Then full search take over the page
   
   @Regression @MobileView
  	Scenario: TC-2906 Search bar on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of search bar
   	And user taps into the search bar
   	Then full search take over the page
   	And user taps on x icon on search take over page
   	And user scrolls down the page
   	Then search bar dissappears and search icon should be shown on the header
   	
   	@Regression @MobileView
  	Scenario: TC-2907 Search icon on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of search bar
   	And user scrolls down the page
   	Then search bar dissappears and search icon should be shown on the header
   	And user taps on the search icon
   	Then full search take over the page
   
   @Regression @MobileView
  	Scenario: TC-2902 Hamburger on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of hamburger menu
   	And user has tapped on hamburger menu
    Then x icon should be displayed
    And click on x icon in hamburger menu
    Then expended menu should be closed and hamburger menu icon should be displayed
   
 		@Regression @MobileView
  	Scenario: TC-2903 Banner Logo on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of banner logo
   	And user clicks on banner logo
  	Then user should navigate back to home page
  	
  	@Regression @MobileView
  	Scenario: TC-2904 Store Locator Icon on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of store locator icon
   	And user clicks on store locator icon
   	Then store locator fly out should expand
   	
   	@Regression @MobileView
  	Scenario: TC-2905 Cart icon on Mobile view (portrait or landscape view)
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And primary navigation should consist of cart icon
   	And user clicks on cart icon
   	Then user should navigate to cart page
   	
   	@Regression @MobileView
  	Scenario: TC-2908 Pencil Banner is not applicable for the Mobile view
  	Given pdp url is available
   	When pdp page is displayed for the product
   	Then primary navigation should be visible in the header
   	And pencil banner should not display for the mobile view