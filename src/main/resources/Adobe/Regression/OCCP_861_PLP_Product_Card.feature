Feature: OCCP-861 PLP/SRP - Product Card - Regular Products (Non-Variant)

	Description: To test the ADOBE Test Cases for the story OCCP-861
   
    @RegressionTest @WebView @WideScreen
    Scenario: TC-156 Verify the product card displays the product title on PLP 
    Given quit browser
	When open browser
    When plp url is available
    When plp is displayed
    And scroll up to page
    Then plp page is visible in grid view
    And product card displays the product card title
    And scroll up to page
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    And product card displays the product card title
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-156 Verify the product card displays the product title on PLP (Mobile)
    When plp url is available
    When plp is displayed
    And scroll up to page
    Then plp page is visible in grid view
    And product card displays the product card title
    And scroll up to page
    And scroll up to page
    Then user click on list view button on mobile
    Then plp page is visible in list view
    And product card displays the product card title
	
    @RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-161
	Scenario: TC-161 Verify the system doesn't display the ratings and review section on PLP when the customer rating is 0 for a given product
	Given plp url is available
    When plp is displayed
    And scroll up to page
    And scroll up to page
    Then rating and review section should not be displayed if customer rating is zero
    
    @RegressionTest @WebView @WideScreen @TC-163
    Scenario: TC-163 Verify the product card in grid view displays the product secondary image on PLP on Desktop/Desktop wide
	Given plp url is available
    When plp is displayed
    And scroll up to page
    And hovers primary image area A
    Then secondary image is displayed
    And move coursor away from image area
    Then the image must switch back to the primary image
    
    Scenario: TC-163 Verify the product card in grid view displays the product secondary image on PLP on Desktop/Desktop wide
	Given plp url is available
    When plp is displayed
    And scroll up to page
    And hovers on mobile in primary image area A
    Then mobile secondary image is displayed
    And move coursor away from image area
    Then the image must switch back to the primary image
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-162 Verify the product card displays the product primary image on PLP
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    Then primary image is displayed in grid view
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    Then primary image is displayed in grid view
    
     @RegressionTest @MobileView @TabletView
    Scenario: TC-162 Verify the product card displays the product primary image on PLP (Mobile)
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    Then primary image is displayed in grid view
    And scroll up to page
    Then user click on list view button on mobile
    Then plp page is visible in list view
    Then primary image is displayed in grid view
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-169 Verify the system has the ability to switch between views (grid to list) 
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-169 Verify the system has the ability to switch between views (grid to list)  (Mobile)
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    And scroll up to page
    Then user click on list view button on mobile
    Then plp page is visible in list view
    
    @RegressionTest @WebView @WideScreen 
    Scenario: TC-170 Verify the system has the ability to switch between views (list to grid) 
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    And scroll up to page
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    And user click on grid view button
    Then plp page is visible in grid view
    Then primary image is displayed in grid view

    @RegressionTest @MobileView @TabletView
    Scenario: TC-170 Verify the system has the ability to switch between views (list to grid) (Mobile)
    Given plp url is available
    When plp is displayed
    Then plp page is visible in grid view
    And scroll up to page
    Then user click on list view button on mobile
    Then plp page is visible in list view
    And user clicks on grid view button Mobile
    Then plp page is visible in grid view
    Then primary image is displayed in grid view
    
    @RegressionTest @WebView @WideScreen @TC-164
    Scenario: TC-164 Verify the product card in list view displays the product feautures on PLP on Desktop 	12538 - One Digital Platform – 
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And the product card name  on the product card is displayed
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-173 Verify the Secondary Image does not appear on Hover on Card in Mobile Breakpoint
	Given plp url is available
    When plp is displayed
    And scroll up to page
    And hovers on mobile in primary image area A
    Then secondary image is not displayed
