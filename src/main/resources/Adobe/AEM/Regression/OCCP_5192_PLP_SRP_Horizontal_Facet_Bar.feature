Feature: OCCP-939 PLP/SRP Load More
	Description: To test the ADOBE Test Cases for the story OCCP-939
	
	@RegressionTest @AEM @TC-4650
	Scenario: TC-4650 OCCP-5192 PLP / SRP - Horizontal Facet Bar-  Author configures display text for More Filters (Desktop CTA) & Sort & Filter (Mobile CTA) buttons
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on facet bar tab
	And configure more filters label
	And configure sort and filters label
	And user click on done button
	And click on preview button
	And click on the publish button
	When plp url is available
    When plp is displayed
	Then configured more filters label is displayed on publish page
	And quit browser
	And open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on facet bar tab
	And revert more filters label
	And revert sort and filters label
	And user click on done button
	And click on preview button
	And click on the publish button
	
	