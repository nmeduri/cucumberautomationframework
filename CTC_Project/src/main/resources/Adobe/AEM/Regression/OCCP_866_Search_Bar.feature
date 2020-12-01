Feature: OCCP-866 Search Bar
	Description: To test the ADOBE Test Cases for the story OCCP-866
	
	@AEM @Smoke
	Scenario: TC-151 Verify AEM author is able to configure the placeholder label 
	Given open browser
	When AEM author with access to configure the place holder label
	And login to AEM using the credential as mentioned in the test data
	And click on search bar
	And click on aem configure button
	And configure the placeholder label from AEM
	And user click on done button
	And click on preview button
	Then the updated placeholder label is displayed on the site
	And click on edit button
	And click on search bar
	And click on aem configure button
	And reverse place holder changes
	And user click on done button
	