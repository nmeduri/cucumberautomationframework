Feature: OCCP-871 PDP Installations
	Description: To test the ADOBE Test Cases for the story OCCP-871
	
	@AEM @Smoke
	Scenario: TC-364 Verify the ability of AEM content author to update the dropdown title & Sticky TOC headers 
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	
	
	And click on buy box section
	And click on aem configure button
	And update the configure installations information
	And user click on done button
	And click on preview button
	Then the updated configure installations information are displayed on site
	And click on edit button
	And click on buy box section
	And click on aem configure button
	And reverse installation information changes
	And user click on done button
	
	
	
	