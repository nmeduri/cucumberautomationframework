Feature: OCCP-1643 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1643

	@RegressionTest @WebView @WideScreen @TC-4720
    Scenario: TC-4720 OCCP-1643 - Verify the display of Delivery & Pick-Up Facet within Facet Panel modal-Desktop/Desktop wide
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
    Scenario: TC-4722 OCCP-1643 - Verify the display of  Delivery & Pick-Up facet within Facet Panel modal-Mobile
    When plp url is available
    When plp is displayed
    And click on sort and filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    Then facet value pay and pickup is displayed
    Then facet value home delivey is displayed
    
    @RegressionTest @WebView @WideScreen @TC-4723
    Scenario: TC-4723 OCCP-1643 - Verify the details when user selects a single Delivery & Pick-Up facet
    When plp url is available
    When plp is displayed
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    And select a delivery and pick up value
    Then visiual indicating the same with in the facet via the check mark is displayed
    And click on close on facet option
    Then corrosponding pill with the facet value name is added on the pill bar
    
    @RegressionTest @WebView @WideScreen @TC-4724
    Scenario: TC-4724 OCCP-1643 - Verify the details when user selects more than one Delivery & Pick-Up facet value
    When plp url is available
    When plp is displayed
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    And select more than one delivery and pick up option
    #Then visiual indicating the same with in the facet via the check mark is displayed
    And click on close on facet option
    Then corrosponding pill with the facet value name is added on the pill bar
    
    @RegressionTest @WebView @WideScreen @TC-4725
    Scenario: TC-4725 OCCP-1643 - Verify the details when user deselect already selected Delivery & Pick-Up facet value
    When plp url is available
    When plp is displayed
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    And select a delivery and pick up value
    And click on close on facet option
    Then corrosponding pill with the facet value name is added on the pill bar
    And click on more filters
    Then delivery and pick up facet option is displayed in facet panel model
    And click on delivery and pickup facet option
    And select a delivery and pick up value
    And click on close on facet option
    Then corrosponding pill delivery and option with the facet value name is removed on the pill bar
    
    