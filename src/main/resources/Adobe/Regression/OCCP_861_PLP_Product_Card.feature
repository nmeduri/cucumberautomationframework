Feature: OCCP-861 PLP/SRP - Product Card - Regular Products (Non-Variant)

	Description: To test the ADOBE Test Cases for the story OCCP-861
       
    @RegressionTest @WebView @MobileView
    Scenario: TC-156 Verify the product card displays the product title on PLP 
    Given plp url is available
    When plp is displayed
    And scroll up to page
    Then plp page is visible in grid view
    And product card displays the product card title
    And scroll up to page
    Then user clicks on list view button
    Then plp page is visible in list view
    And product card displays the product card title
    
    @RegressionTest @WebView @WideView
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
