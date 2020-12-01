Feature: OCCP-1641 PRP SRP Filter And Facets
	Description: To test the ADOBE Test Cases for the story OCCP-1641
	
	@AEM @RegressionTest @TC-547
	Scenario: TC-547 Verify the ability of a content author to configure the color facet title on PLP
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And configure facet author on plp template
	And user click on done button
	And click on the publish
	When plp url is available
	When plp is displayed
	And click on sort facet
	Then content author updates the facet tile
	And quit browser
	And open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And revert facet title
	And user click on done button
	
	@AEM @RegressionTest @TC-549
	Scenario: TC-549 Verify the content author is unable to configure the truncation logic and sort order 
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And configure selected label on plp template
	And user click on done button
	And click on the publish
	When plp url is available
	When plp is displayed
	And click on sort facet
	And click on color facet
	Then content author updates the selected label
	And quit browser
	And open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on facet panel
	And click on aem configure button
	And revert selected label
	And user click on done button
	