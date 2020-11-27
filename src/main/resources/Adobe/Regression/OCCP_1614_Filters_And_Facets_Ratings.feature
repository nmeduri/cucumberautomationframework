Feature: OCCP-1614 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1614
	
	@RegressionTest @WebView @WideScreen @TC-182
    Scenario:  	TC-182 Verify the selected rating is added as a pill on the top the grid/list on a PLP page
    When plp url is available
    And click on more filters
    Then verify the rating facet is displayed
    And click on ratings facet
    And select a ratings facet value
    And click on close on facet option
    Then the filter results is displayed at the grid list
    Then user clicks on list view button
    Then plp page is visible in list view
    Then the filter results is displayed at the grid list
    And user click on grid view button
    And click on more filters
    And click on clear all facet
    And click on close on facet option
    Then ratings pill are removed from the top
    And click on more filters
    Then product result are refreshed
    
    
    
    
    
    
    