Feature: OCCP-1566 Auto Complete Suggestion
	Description: To test the ADOBE Test Cases for the story OCCP-1566
	
	@RegressionTest @AEM
	Scenario: TC-490 Verify the content author is able to configure number of keyword suggestions
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And update the number of keyword suggesiton
	And user click on done button
    And click on edit button
	And click on search bar
	And click on aem configure button
	And revert the number of keyword suggesiton
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-491 Verify the content author is able to configure number of category suggestions
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And update the number of keyword category
	And user click on done button
    And click on edit button
	And click on search bar
	And click on aem configure button
	And revert the number of keyword category
	And user click on done button
	
	@RegressionTest @AEM @TC-492
	Scenario: TC-492 Verify the content author is able to configure number of product suggestions
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And update the number of product suggestion
	And user click on done button
    And click on edit button
	And click on search bar
	And click on aem configure button
	And revert the number of product suggestion
	And user click on done button
	
	@RegressionTest @AEM @TC-496
	Scenario: TC-496 Verify the content author is able to edit the terms 'suggestions', 'products' and 'categories'
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And update the product terms
	And update the categories terms
	And update the suggestions terms
	And user click on done button
    And click on edit button
	And click on search bar
	And click on aem configure button
	And revert the product terms
	And revert the categories terms
	And revert the suggestions terms
	And user click on done button
	
	@RegressionTest @AEM @TC-497
	Scenario: TC-497 Verify the content author is able to enable/disable the overlay 
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And disable the overlay
	And user click on done button
    And click on edit button
	And click on search bar
	And click on aem configure button
	And enable the overlay
	And user click on done button
	
	
	