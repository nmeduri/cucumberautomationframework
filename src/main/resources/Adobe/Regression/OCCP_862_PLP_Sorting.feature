Feature: OCCP-862 PLP Sorting

	Description: To test the ADOBE Test Cases for the story OCCP-862
	
	@RegressionTest @WebView
	Scenario: TC-40 Verify the sticky navigation feature of filter menu
	Given plp url is available
    When plp is displayed
    And scroll down the window below the view point
    Then the sorting option remains displayed at the top of the page in the sticky nav
    
    @RegressionTest @WebView
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And click on sort by option 
    And Select sort option price high to low
    Then all products results are rearranged from highest to lowest price
    
    @RegressionTest @MobileView
    Scenario: TC-345 Verify the functionality of the Price High to Low sorting option on a PLP (Mobile)
    Given plp url is available
    When plp is displayed
    And click on sort by option 
    And Select sort option price high to low
    And user click on close button
    Then all products results are rearranged from highest to lowest price
    
    @RegressionTest @WebView 
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And click on sort by option
    And select sorting option Newest Arrivals
    
    @RegressionTest @MobileView @SmokeTest
    Scenario: TC-347 Verify the functionality of the Newest Arrivals sorting option on a PLP
    Given plp url is available
    When plp is displayed
    And click on sort by option
    And select sorting option Newest Arrivals
    And user click on close button
