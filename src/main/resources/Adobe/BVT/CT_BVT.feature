Feature: Health Check BVT

	Description: The purpose of this test to perform health check of API.
   
    @WebView @MobileView @WideScreen
    Scenario: TC-2588 Verify the product title is displayed on the PDP for a given product
    Given open browser
    When pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @WebView @MobileView @WideScreen
    Scenario: TC-2591 Verify the product card displays the product primary image on PLP
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    And product card displays the product primary image
    And scroll up to page
    And scroll up to page
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    And product card displays the product primary image
    
    @WebView @MobileView @WideScreen
    Scenario: TC-2592 Verify the product card displays the product title on PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    Then plp page is visible in grid view
    And product card displays the product card title
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    And product card displays the product card title
    
    @RegressionTest @WebView @WideScreen
	Scenario: TC-40 Verify the sticky navigation feature of filter menu
	When plp url is available
    When plp is displayed
    And scroll down the window below the view point
    Then the sorting option remains displayed at the top of the page in the sticky nav
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-608 Verify the ability of a user to create new Triangle ID account
	When sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	
	#@RegressionTest @WebView
	Scenario: TC-2804 Verification of display of Primary Navigation - Desktop 
	When pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if primary navigation is present
	Then the primary navigation should be displayed after the pencil banner
    

	
