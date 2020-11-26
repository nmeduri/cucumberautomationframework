Feature: OCCP-1613 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1613
	
	@RegressionTest @WebView @WideScreen @TC-203
    Scenario: TC-203 Verify the Brand facet is properly displayed on SRP on Desktop/Desktop wide
    When plp url is available
    When plp is displayed
    And click on more filters
    Then verify the user is able to view the brand facet as generic facet
    And verify the brand facet can be clicked to expand using plus icon
    Then brand facet value are displayed with the number of results
    And click on see more
    Then remaining brands are displayed for the user to select
    And select a single brand from the facet value
    Then indication of sucess is displayed for single brand item
    And click on close on facet option
    Then the number of matching single brand result is displayed
    And click on more filters
    And verify the brand facet can be clicked to expand using plus icon
    And select multiple brands from facet value
    Then indication sign is disiplayed for multiple product
    And click on close on facet option
    Then matching results are displayed for multiple selected brand
    And click on more filters
    And verify the brand facet can be clicked to expand using plus icon
    And deselect brands from selection
    And click on close on facet option
    And click on more filters
    And verify the brand facet can be clicked to expand using plus icon
    Then product results are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-204
    Scenario: TC-204 Verify the Brand facet is properly displayed on a PLP on mobile 
    When plp url is available
    When plp is displayed
    And click on sort and filters
    Then verify the user is able to view the brand facet as generic facet
    And verify the brand facet can be clicked to expand using plus icon
    Then brand facet value are displayed with the number of results
    And click on see more
    Then remaining brands are displayed for the user to select
    And select a single brand from the facet value
    Then indication of sucess is displayed for single brand item
    And click on close on facet option
    Then the number of matching single brand result is displayed
    And click on sort and filters
    And verify the brand facet can be clicked to expand using plus icon
    And select multiple brands from facet value
    Then indication sign is disiplayed for multiple product
    And click on close on facet option
    Then matching results are displayed for multiple selected brand
    And click on sort and filters
    And verify the brand facet can be clicked to expand using plus icon
    And deselect brands from selection
    And click on close on facet option
    And click on sort and filters
    And verify the brand facet can be clicked to expand using plus icon
    Then product results are refreshed
    
    
    