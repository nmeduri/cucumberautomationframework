Feature: OCCP-870 PDP Information, Product Manual, 	Product Returns

	Description: To test the ADOBE Test Cases for the story OCCP-870
	   
    @RegressionTest @WebView @WideScreen
    Scenario: TC-105 Verify the product title is displayed on the PDP for a given product 
    Given open browser
    When pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-108 Verify the return policy link is displayed on the PDP for a given product
    Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    Then a link to the return policy section is displayed on the pdp under the resources sub section
    Then the return policy section title is displayed
    And verify the return policy description is displayed
    And the return policy link is displayed
    And scroll up to page
    And click on the return policy link
    Then the return policy opens in new tab
    
    @RegressionTest @WebView
    Scenario: TC-110 Verify the product code is displayed on the PDP
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
    @RegresionTest @MobileView @TabletView
    Scenario: TC-1307 Verify the product title is displayed on the PDP for a given product in Mobile  
    When pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product   
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-1312 Verify the product code is displayed on the PDP in Mobile
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
    @RegressionTest @WideScreen @WebView
    Scenario: TC-1316 Verify the product title is displayed on the PDP for a given product in Widescreen 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product title is displayed on the product 
    
    @RegressionTest @WideScreen
    Scenario: TC-1321 Verify the product code is displayed on the PDP in Widescreen 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the product code is displayed in buy box
    
    @RegressionTest @WideScreen @WebView
    Scenario: TC-1317 Verify the product romance copy is displayed on the PDP for a given product in Widescreen
    Given pdp url is available
    When pdp page is displayed for the product
    Then the romance copy section is displayed
    And romance copy section title is displayed
    And romance copy content is displayed
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-109 Verify the product manual is displayed on the PDP for a given product 
    Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    Then product manual title is displayed
    And product manual description is displayed
    And user save the product manual link url
    And product manual link is displayed
    #And user is click on product manual link
    #Then product manual pdf opens in new tab
	