Feature: OCCP-939 PLP/SRP Load More
	Description: To test the ADOBE Test Cases for the story OCCP-939
	
	@RegressionTest @AEM @Demo
	Scenario: TC-337 Verify the ability of an AEM content author to configure initial product results load on a PLP page
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And update the number of product cards to be initially displayed for list gird view on plp
	And user click on done button
	And click on preview button
	Then the changes are reflected on a plp for both list grid view 
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And reverse the product number changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-338 Verify the ability of an AEM content author to configure number of the results to be displayed when "Show More" is clicked on a PLP
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And update the number of the results to be displayed when show more is clicked
	And user click on done button
	And click on preview button
	And click on aem show more button
	Then show more count changes are reflected on a PLP for both gird list views
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse show more changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-339 Verify the ability of an AEM content author to configure number of products to be returned as results from search engine response on a PLP
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And update the search response count
	And user click on done button
	And click on preview button
	And click on aem show more button
	Then search response count changes are reflected on a PLP for both grid list views
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse show more changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-340 Verify the ability of an AEM content author to edit that copy for pagination result message from AEM
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And edit copy for first part of the pagination result
	And user click on done button
	And click on preview button
	And click on aem show more button
	Then pagination result message changes are reflected on a PLP both grid list views
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse pagination result message changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-341 Verify the ability of an AEM content author to edit text for "Show More" CTA label
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And edit the text for show more cta
	And user click on done button
	And click on preview button
	Then the show more text changes are reflect on plp for both grid list views
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse show more button changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-342 Verify the ability of an AEM content author to edit copy for the first part of the end of pagination message
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And edit copy for the first part of the end of pagination message
	And user click on done button
	And click on preview button
	Then the end of pagination message changes are reflected on a plp for both list grid view
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse end of pagination message changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-343 Verify the ability of an AEM content author to configure the label for 'Back to Top' button from AEM
	When AEM author with access to configure intial product result load on the page
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And edit label for back to top button
	And user click on done button
	And click on preview button
	Then the end of pagination message changes are reflected on a plp for both list grid view
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on show more tab
	And reverse end of pagination message changes
	And user click on done button
	