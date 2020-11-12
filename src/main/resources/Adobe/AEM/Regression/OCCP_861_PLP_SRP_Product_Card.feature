Feature: OCCP-861 PLP SRP Product Card
	Description: To test the ADOBE Test Cases for the story OCCP-861
	
	@AEM
	Scenario: TC-176 Verify AEM author is able to configure the list view for the product cards on PLP
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And configure the list view to off
	And user click on done button
	And click on preview button
	Then list view option is not displayed on plp
	Then all the products are displayed in grid view
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on list view on 
	And user click on done button
	And click on preview button
	Then all the products are displayed in grid view
	Then list view option is displayed on site
	
	@AEM @TC-177
	Scenario: TC-177 Verify AEM author is able to configure the header label of the feature section (list view) 
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And change the header label of the feature section
	And user click on done button
	And click on preview button
	And select list view button
	Then update feature header label on site
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And reverse feature header label changes
	And user click on done button
	
	@RegressionTest @AEM @TC-175
	Scenario: TC-175 Verify AEM author is able to configure the ratings and reviews feature
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on disable rating and review
	And user click on done button
	And click on the publish
	And plp url is available
    When plp is displayed
	Then verify the ratings and reviews section should are not displayed on the product card
    And quit browser
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on enable rating and review
	And user click on done button