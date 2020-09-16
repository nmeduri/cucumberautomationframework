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
	