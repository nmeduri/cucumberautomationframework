Feature: OCCP-862 PLP Sorting
	Description: To test the ADOBE Test Cases for the story OCCP-862
	
	@AEM @Smoke
	Scenario: TC-351 Verify the ability of an AEM content author to configure to hide Sorting Option on a PLP 
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And select sorting tab
	And user select hide option
	And user click on done button
	And click on preview button
	Then sort option is not displayed on the site
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And select sorting tab
	And user click on unhide option
	And user click on done button
	