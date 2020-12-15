Feature: 	OCCP-3633 Cart - Product Badges
Description: To test the ADOBE Test Cases for the story OCCP-3633

@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2909, TC-2921, TC-2915 Display of Product Badges in Cart page on Desktop
  Given open browser
  Given cart url is available
  When cart page is displayed for the product
  Then maximum of two badges should be displayed
  And the badges should not be clickable

@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2910, TC-2922, TC-2916 Pricing & Promo category badge on Desktop
  Given cart url is available
  When cart page is displayed for the product
  Then pricing and promo category badge should be displayed
  And the pricing and promo badge background color should be red
  
  @RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2911, TC-2923, TC-2917 Availability category badge on Desktop
  Given cart url is available
  When cart page is displayed for the product
  Then availability badge should be displayed
  And the availability badge background color should be yellow

 @RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2912, TC-2924, TC-2918 Recommendation category badge on Desktop
  Given cart url is available
  When cart page is displayed for the product
  Then recommendation badge should be displayed
  And the recommendation badge background color should be blue
  
  @RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2913, TC-2925, TC-2919 Unique category badge on Desktop
  Given cart url is available
  When cart page is displayed for the product
  Then unique category badge should be displayed
  And the unique category badge background color should be red with a white border
  
  @RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-2914, TC-2926, TC-2920 Unique category badge on Desktop
  Given cart url is available
  When cart page is displayed for the product
  Then the top two badges should be displayed below price
  And higher priority badge should be displayed first