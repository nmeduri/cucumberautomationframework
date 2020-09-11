Feature: OCCP-870 PDP Information, Product Manual, 	Product Returns

	Description: To test the ADOBE Test Cases for the story OCCP-870
       
    @RegressionTest @WebView @WideScreen
    Scenario: TC-105 Verify the product title is displayed on the PDP for a given product 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @RegressionTest @WebView
    Scenario: TC-108 Verify the return policy link is displayed on the PDP for a given product 
    Given pdp url is available
    When pdp page is displayed for the product
    Then a link to the return policy section is displayed on the pdp under the resources sub section
    Then the return policy section title is displayed
    And verify the return policy description is displayed
    And the return policy link is displayed
    And click on the return policy link
    Then the return policy opens in new tab
    
    @RegressionTest @WebView
    Scenario: TC-110 Verify the product code is displayed on the PDP
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
    @RegresionTest @MobileView
    Scenario: TC-1307 Verify the product title is displayed on the PDP for a given product in Mobile  
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product   
    
    @RegressionTest @MobileView
    Scenario: TC-1312 Verify the product code is displayed on the PDP in Mobile
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
    @RegressionTest @WideScreen
    Scenario: TC-1316 Verify the product title is displayed on the PDP for a given product in Widescreen 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @RegressionTest @WideScreen
    Scenario: TC-1321 Verify the product code is displayed on the PDP in Widescreen 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
	