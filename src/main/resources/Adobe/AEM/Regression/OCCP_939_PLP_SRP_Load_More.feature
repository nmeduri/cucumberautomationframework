Feature: OCCP-939 PLP/SRP Load More
	Description: To test the ADOBE Test Cases for the story OCCP-939
	
	@RegressionTest @AEM
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