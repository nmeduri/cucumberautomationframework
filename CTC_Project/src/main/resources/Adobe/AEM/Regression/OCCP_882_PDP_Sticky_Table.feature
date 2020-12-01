Feature: OCCP-882 PDP Installations
	Description: To test the ADOBE Test Cases for the story OCCP-882
	
	@AEM @RegressionTest @TC-364
	Scenario: TC-364 Verify the ability of AEM content author to update the dropdown title & Sticky TOC headers 
	Given open browser
	When AEM author with access to configure the product sticky toc section
	And login to AEM using the credential as mentioned in the test data
	And click on sticky toc pannel
	And click on aem configure button
	And update the label for text field
	And user click on check button
	And click on the publish
	And pdp sticky toc url is available
	Then verify the changes published are correctly reflected
    And quit browser
	And open browser
	And AEM author with access to configure the product sticky toc section
	And login to AEM using the credential as mentioned in the test data
	And click on sticky toc pannel
	And click on aem configure button
	And revert the label for text field
	And user click on done button	
	
	
	
	