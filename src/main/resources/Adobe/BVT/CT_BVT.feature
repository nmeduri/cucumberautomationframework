Feature: Health Check BVT

	Description: The purpose of this test to perform health check of API.

    @WebView @MobileView @WideScreen
    Scenario: TC-2586 Verify the warranty information is correctly displayed on the PDP
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product warranty information is displayed under Resources in Overview section of page
    And the warranty information of the product is correct
    
    @WebView @MobileView @WideScreen
    Scenario: TC-2587 Verify product specifications are displayed on PDP for desktop (less than 8 specifications) 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    And the specifications are displayed in tabular format
    And the specifications are displayed with title and values for each specification as individual rows
    And the specifications are less than 8 on the Desktop
    
    @WebView @MobileView @WideScreen @SmokeTest
    Scenario: TC-2589 Verify the return policy link is displayed on the PDP for a given product
    Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    Then a link to the return policy section is displayed on the pdp under the resources sub section
    Then the return policy section title is displayed
    And verify the return policy description is displayed
    And the return policy link is displayed
    And click on the return policy link
    Then the return policy opens in new tab
   
    @WebView @MobileView @WideScreen
    Scenario: TC-2588 Verify the product title is displayed on the PDP for a given product
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @WebView @MobileView @WideScreen
    Scenario: TC-3080 Verify the product code is displayed on the PDP
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
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
    

	
