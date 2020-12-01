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
    
    @RegressionTest @WebView @WideScreen @TC-178
    Scenario:  	TC-178 Verify the Ratings facet is properly displayed on a PLP on Desktop/Desktop wide
    When plp url is available
    And click on more filters
    Then verify the rating facet is displayed
    And click on ratings facet
    Then facet value must be displayed through star icons
    And click on mius sign on rating facet
    Then the rating filter collapses in the dynamic facet
    And click on plus sign on  the dynamic ratings facet
    Then user is able to see rating filter
    And select a ratings facet value
    And click on close on facet option
    Then the filter results is displayed at the grid list
    Then user clicks on list view button
    Then plp page is visible in list view
    Then the filter results is displayed at the grid list
    
     @RegressionTest @MobileView @TabletView @TC-180
    Scenario: TC-180 Verify the Ratings facet is properly displayed on a PLP
    When plp url is available
    And click on sort and filters
    Then verify the rating facet is displayed
    And click on ratings facet
    Then facet value must be displayed through star icons
    And click on mius sign on rating facet
    Then the rating filter collapses in the dynamic facet
    And click on plus sign on  the dynamic ratings facet
    Then user is able to see rating filter
    And select a ratings facet value
    And click on close on facet option
    Then the filter results is displayed at the grid list
    
    
    
    
    
    
    