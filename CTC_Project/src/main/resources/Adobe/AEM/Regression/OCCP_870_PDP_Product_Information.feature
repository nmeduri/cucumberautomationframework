Feature: OCCP-870 PDP Product Information
	Description: To test the ADOBE Test Cases for the story OCCP-871
	
	@AEM
	Scenario: TC-1408 Verify the ability of a business user to author Overview Component on Product information
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on overview section
	And click on aem configure button
	And update the configure overview label
	And user click on done button
	And click on preview button
	Then the overview changes are reflect on site
	And click on edit button
	And click on overview section
	And click on aem configure button
	And reverse overview changes
	And user click on done button
	
	@AEM @TC-1409
	Scenario: TC-1409 Verify the ability of a business user to author Product Info Component 
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on resource section
	And click on aem configure button
	And update the user manual information
	And user click on done button
	And click on preview button
	Then the user manual changes are reflect on site
	And click on edit button
	And click on resource section
	And click on aem configure button
	And reverse user manual changes
	And user click on done button
	
	
	
	
	
	