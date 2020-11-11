Feature: OCCP-1574 PDP Varinats
	Description: To test the ADOBE Test Cases for the story OCCP-1574
	
	@RegressionTest @AEM @TC-335
	Scenario: TC-335 Verify the ability of a business author to author Variants Functionality on PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And update the authorable size label
	And update the authorable color label
	And user click on done button
	And click on edit button
	And click on buy box section
	And click on aem configure button
	And revert the authorable size label
	And revert the authorable color label
	And user click on done button
	
	
	
	