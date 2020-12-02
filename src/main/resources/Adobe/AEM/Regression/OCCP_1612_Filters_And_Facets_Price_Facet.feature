Feature: OCCP-1612 Filters And Facets : Price Facets
	Description: To test the ADOBE Test Cases for the story OCCP-1612
	
	@RegressionTest @AEM @TC-197
	Scenario: TC-197 Verify the content author is able to configure Min/Max price labels
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And update the min max price label
	And user click on done button
	And click on the publish button
	When plp url is available
	When plp is displayed
	And click on more filters
    Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
	Then min price and max price changes are update on site
	And quit browser
	And open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And revert the min max price label
	And user click on done button
	And click on the publish button
	
	@RegressionTest @AEM @TC-198
	Scenario: TC-198 Verify the content author is able to configure error message regarding the price facet values 
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And click on error tab
	And update the content error message regarding the price facet values
	And user click on done button
	And click on the publish button
	When plp url is available
	When plp is displayed
	And click on more filters
	Then the user views the price facet as generic facet on the panel
    Then the price facet can be clicked to collapse and open using plus icon
    And enter minimum price more than maximum
    And user is able to enter maximum price
    Then error message changes are reflect on site
	And quit browser
	And open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And click on error tab
	And revert the content error message regarding the price facet values
	And user click on done button
	And click on the publish button

	
	
	
	