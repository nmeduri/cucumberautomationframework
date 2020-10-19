Feature: OCCP-869 PDP : Specifications
	Description: To test the ADOBE Test Cases for the story OCCP-869
	
	@RegressionTest @AEM
	Scenario: TC-318 Verify a business user author is able to configure Specifications section on PDP in AEM 
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on specifications section
	And click on aem configure button
	And update specifications label
	And update set number of specifications
	And update the view more specifications label
	And update the view less specifications label
	And user click on done button
	And click on preview button
	Then changes are reflected on ctc site
	And click on edit button
	And click on specifications section
	And click on aem configure button
	And revert specification changes
	And user click on done button