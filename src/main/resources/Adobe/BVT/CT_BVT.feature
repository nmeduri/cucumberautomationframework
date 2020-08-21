Feature: Health Check BVT

	Description: The purpose of this test to perform health check of API.

    Scenario: TC-11 Verify the warranty information is correctly displayed on the PDP
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product warranty information is displayed under Resources in Overview section of page
    And the warranty information of the product is correct
    
    Scenario: TC-101 Verify product specifications are displayed on PDP for desktop (less than 8 specifications) 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    And the specifications are displayed in tabular format
    And the specifications are displayed with title and values for each specification as individual rows
    And the specifications are less than 8 on the Desktop
    
    Scenario: TC-105 Verify the product title is displayed on the PDP for a given product
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    Scenario: TC-108 Verify the return policy link is displayed on the PDP for a given product
    Given pdp url is available
    When pdp page is displayed for the product
    Then a link to the return policy section is displayed on the pdp under the resources sub section
    Then the return policy section title is displayed
    And verify the return policy description is displayed
    And the return policy link is displayed
    And click on the return policy link
    Then the return policy opens in new tab

	
