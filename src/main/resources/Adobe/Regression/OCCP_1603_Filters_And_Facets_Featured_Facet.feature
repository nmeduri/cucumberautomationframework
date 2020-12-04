Feature: OCCP-1603 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1603
	
	@RegressionTest @WebView @WideScreen @TC-373
    Scenario: TC-373 Verify the dynamic facet is properly displayed for PLP
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
    
    @RegressionTest @WebView @WideScreen @TC-374
    Scenario: TC-374 Verify the dynamic facet is properly displayed on mobile for PLP
    When plp url is available
    And click on sort and filters
    Then verify the rating facet is displayed
    And click on plus sign on  the dynamic ratings facet
    Then user is able to see rating filter
    And click on mius sign on rating facet
    Then the rating filter collapses in the dynamic facet
    And click on plus sign on  the dynamic ratings facet
    And select a ratings facet value
    And click on close on facet option
    Then the filter results is displayed at the grid list
    Then user click on list view button on mobile
    Then plp page is visible in list view
    Then the filter results is displayed at the grid list
    And user clicks on grid view button Mobile
    And click on sort and filters
    And click on clear all facet
    And click on close on facet option
    Then ratings pill are removed from the top
    And click on sort and filters
    Then product result are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-379
    Scenario:  	TC-379 Verify the selected filter(s) are added as a pill on the top of PLP page
    When plp url is available
    And click on more filters
    Then verify the rating facet is displayed
    And click on ratings facet
    And select a ratings facet value
    And click on close on facet option
    Then the filter results is displayed at the grid list
    And click on clear all pill
    Then ratings pill are removed from the top
    And click on more filters
    Then product result are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-377
    Scenario:  	TC-377 Verify the persistence of the all filters when navigating from PDP to PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And click see more sorting
    And Select sort option price high to low
    And click on close on facet option
    Then all products results are rearranged from highest to lowest price
    And click on prodcuct card title
    When pdp page is displayed for the product
    And back from pdp page
    When plp is displayed
    Then the selected filters are persistant
    
    
    
    
    
    
    
    