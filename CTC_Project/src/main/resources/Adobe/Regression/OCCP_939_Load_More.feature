Feature: OCCP-939 PDP: Load More

	Description: To test the ADOBE Test Cases for the story OCCP-939
	
	@RegressionTest @MobileView @TabletView @WebView @WideScreen @TC-49
	Scenario: TC-49, TC-54 Verify "Load More" options is not displayed when number of results is max
	Given plp url is available
    When plp is displayed
    Then load more button is not displayed on the plp
    
    @RegressionTest @MobileView @TabletView @WebView @WideScreen @TC-52
	Scenario: TC-52 Verify the 'Back to the top' option is displayed on the PLP when the user has arrived at the bottom of the page
	Given plp url 'show more' is available
    When plp is displayed
    Then load more button is displayed
    And click on load more
    And click on load more
    Then end pagination message is displayed
    Then back to top button is displayed
    And click on back to top button
    And scroll up to page
    And scroll up to page
    Then user clicks on list view button
    And click on back to top button
    
    
	