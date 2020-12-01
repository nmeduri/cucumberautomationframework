Feature: OCCP-1613 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1613
	
	@RegressionTest @WebView @WideScreen @TC-203
    Scenario: TC-203 Verify the Brand facet is properly displayed on SRP on Desktop/Desktop wide
    When srp url is available
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
    
    @RegressionTest @MobileView @TabletView @TC-204
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
    
    @RegressionTest @WebView @WideScreen @TC-206
    Scenario: TC-206 Verify the selected brand is added as a pill on the top the grid/list on a PLP page
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
    And click on clear all facet
    Then product result are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-207
    Scenario: TC-207 Verify the selected brand is added as a pill on the top the grid/list on an SRP page
    When srp url is available
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
    And click on clear all facet
    Then product result are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-202
    Scenario: TC-202 Verify the Brand facet is properly displayed on a PLP on Desktop/Desktop wide
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
    Then product result are refreshed
    
    @RegressionTest @MobileView @TabletView @TC-205
    Scenario: TC-205 Verify the Brand facet is properly displayed on an SRP on mobile 
    When srp url is available
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
    Then product result are refreshed
    
    
    