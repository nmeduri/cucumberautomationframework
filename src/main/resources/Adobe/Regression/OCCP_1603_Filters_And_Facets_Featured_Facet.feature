Feature: OCCP-1603 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1603
	
	@RegressionTest @WebView @WideScreen @TC-374
    Scenario: TC-374 Verify the dynamic facet is properly displayed on mobile for PLP
    When plp url is available
    And click on more filters
    Then verify the rating facet is displayed
    And click on plus sign on  the dynamic ratings facet
    Then user is able to see rating filter
    And click on mius sign on rating facet
    Then the rating filter collapses in the dynamic facet
    And click on plus sign on  the dynamic ratings facet
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
    
    
    
    
    
    
    
    