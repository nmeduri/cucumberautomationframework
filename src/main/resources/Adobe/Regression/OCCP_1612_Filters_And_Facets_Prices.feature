Feature: OCCP-1612 Filters and Facets : Delivery & Pick up Option

	Description: To test the ADOBE Test Cases for the story OCCP-1612
	
	@RegressionTest @WebView @WideScreen @TC-185
    Scenario: TC-185 Verify the Price facet is properly displayed on a PLP on Web/Wide Screen
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    Then user is able to enter mininum price
    Then user is able to enter maximum price
    Then product result refreshed abiding to the price range entered and preselected the other filter option
    And click on close on facet option
    Then the number of price matching product result is displayed
   
    @RegressionTest @MobileView @TabletView @TC-187
    Scenario: TC-187 Verify the Price facet is properly displayed on a PLP on Mobile
    When plp url is available
    And click on sort and filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    Then user is able to enter mininum price
    Then user is able to enter maximum price
    Then product result refreshed abiding to the price range entered and preselected the other filter option
    And click on close on facet option
    Then the number of price matching product result is displayed
    
    @RegressionTest @WebView @WideScreen @TC-189
    Scenario: Verify the selected price range is added as a pill on the top the grid/list on a PLP page
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    Then click on checkbox price filter
    And click on close on facet option
    Then the selected price range is on pill
    And user clicks on list view button
    Then the selected price range is on pill
    And click on more filters
    And click on clear all facet
    Then product result are refreshed
    
    @RegressionTest @WebView @WideScreen @TC-191
    Scenario: TC-191 Verify an error message is displayed on a PLP when user enters a max price less than the min price
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    And enter minimum price more than maximum
    Then user is able to enter maximum price
    Then error is displayed when enter minimum price more than maximum
    
    @RegressionTest @WebView @WideScreen @TC-193
    Scenario: TC-193 Verify the functionality of All values above on a PLP
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    And enter only minimum price in the range
    And click on close on facet option
    Then pill is added above the range and more result
    And user clicks on list view button
    Then pill is added above the range and more result
    
    @RegressionTest @WebView @WideScreen @TC-195
    Scenario: TC-195 Verify the functionality of 'All values below' on a PLP
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    And enter only maximum price in the range
    And click on close on facet option
    Then pill is added the range as '0-123'
    And user clicks on list view button
    Then pill is added the range as '0-123'
    
    @RegressionTest @WebView @WideScreen @TC-200
    Scenario: TC-200 Verify the pills are updated when reapplying price filter with new values on a PLP
    When plp url is available
    And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    Then user is able to enter mininum price
    Then user is able to enter maximum price
    And click on close on facet option
    Then the number of price matching product result is displayed
    
    
    