Feature: OCCP-862 PLP Sorting

	Description: To test the ADOBE Test Cases for the story OCCP-862
	
	@RegressionTest @WebView @WideScreen @TC-40
	Scenario: TC-40 Verify the sticky navigation feature of filter menu	
	When plp url is available
    When plp is displayed
    And scroll down the window below the view point
    Then the sorting option remains displayed at the top of the page in the sticky nav
    
    #@RegressionTest @WebView @WideScreen @TC-348
    Scenario: TC-348 Verify the functionality of the Customer Ratings High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And click see more sorting
    And select the sorting option customer ratings high to low
    And click on close on facet option
    Then All the product results are rearranged from highest customer ratings high to lowest customer ratings
    
    @RegressionTest @WebView @WideScreen @TC-345
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And click see more sorting
    And Select sort option price high to low
    And click on close on facet option
    Then all products results are rearranged from highest to lowest price
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP (Mobile)
    When plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And Select sort option price high to low
    And user click on close button
    Then all products results are rearranged from highest to lowest price

    @RegressionTest @WebView @WideScreen @TC-347
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And click see more sorting
    And select sorting option Newest Arrivals

    @RegressionTest @MobileView @TabletView
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And select sorting option Newest Arrivals
    And user click on close button

    @RegressionTest @WebView @WideScreen @TC-346
	Scenario: TC-346 Verify the functionality of the Price Low to High sorting option on a PLP
	Given plp url is available
	And scroll up to page
	When user clicks on the Sort by 
	And click see more sorting
	And user selects Price Low to High as sorting option
	Then all the product results should be rearranged from lowest to highest price
		
	@RegressionTest @MobileView @TabletView
	Scenario: TC-346 Verify the functionality of the Price Low to High sorting option on a PLP
	Given plp url is available
	When plp is displayed
	And scroll up to page
	When user clicks on the Sort by 
	And user selects Price Low to High as sorting option
	And user click on close button
	Then all the product results should be rearranged from lowest to highest price
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-348 Verify the functionality of the Customer Ratings High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
	And scroll up to page
    And click on sort by option
    And select the sorting option customer ratings high to low
    And user click on close button
    Then All the product results are rearranged from highest customer ratings high to lowest customer ratings
    
    @RegressionTest @WebView @WideView @TC-44
    Scenario: TC-44 Verify the previously selected sorting option is displayed when the user clicks 'Back' from a product detail page
    Given open browser
    Given plp url is available
    When plp is displayed
	And scroll up to page
	And click on sort by option
	And click see more sorting
	And select sorting option Newest Arrivals
	And enter product in search bar
	And user click on search icon
	And back from page
	Then plp is displayed
	Then the previously selected sorting option is persisted