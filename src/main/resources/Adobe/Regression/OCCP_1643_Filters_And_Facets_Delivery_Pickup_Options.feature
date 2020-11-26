Feature: OCCP-1643 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1643

	@RegressionTest @WebView @WideScreen @TC-4720
    Scenario: TC-4720 OCCP-1643 - Verify the display of Delivery & Pick-Up Facet within Facet Panel modal-Desktop/Desktop wide
    Given open browser
    When plp url is available
    When plp is displayed
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    Then facet value pay and pickup is displayed
    Then facet value home delivey is displayed
    When plp fr url is available
    
    @RegressionTest @WebView @WideScreen @TC-4721
    Scenario: TC-4721 OCCP-1643 - Verify the display of  Delivery & Pick-Up Facet  CTA within within the horizontal facet bar that appears above the results grid -Desktop/Desktop wide
    When plp url is available
    When plp is displayed
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    Then delivery and pickup facet is prioritized as one of top five
    
    @RegressionTest @MobileView @TabletView @TC-4722
    Scenario: OCCP-1643 - Verify the display of  Delivery & Pick-Up facet within Facet Panel modal-Mobile
    Given open browser 
    When plp url is available
    When plp is displayed
    And click on sort and filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    Then facet value pay and pickup is displayed
    Then facet value home delivey is displayed
    
    