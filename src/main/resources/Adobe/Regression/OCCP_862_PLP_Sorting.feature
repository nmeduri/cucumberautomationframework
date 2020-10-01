Feature: OCCP-862 PLP Sorting

	Description: To test the ADOBE Test Cases for the story OCCP-862
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-40 Verify the sticky navigation feature of filter menu
	Given plp url is available
    When plp is displayed
    And scroll down the window below the view point
    Then the sorting option remains displayed at the top of the page in the sticky nav
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And Select sort option price high to low
    Then all products results are rearranged from highest to lowest price
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP (Mobile)
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And Select sort option price high to low
    And user click on close button
    Then all products results are rearranged from highest to lowest price

    @RegressionTest @WebView @WideScreen
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And select sorting option Newest Arrivals

    @RegressionTest @MobileView @TabletView
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And select sorting option Newest Arrivals
    And user click on close button

#Dinesh
    @RegressionTest @WebView @WideScreen 
	Scenario: TC-346 Verify the functionality of the Price Low to High sorting option on a PLP
	Given plp url is available
	And scroll up to page
	When user clicks on the Sort by 
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
    
    @RegressionTest @WebView @WideScreen 
    Scenario: TC-348 Verify the functionality of the Customer Ratings High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option
    And select the sorting option customer ratings high to low
    Then All the product results are rearranged from highest customer ratings high to lowest customer ratings
    
    
    @RegressionTest @MobileView @TabletView
    Scenario: TC-348 Verify the functionality of the Customer Ratings High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
	And scroll up to page
    And click on sort by option
    And select the sorting option customer ratings high to low
    And user click on close button
    Then All the product results are rearranged from highest customer ratings high to lowest customer ratings
