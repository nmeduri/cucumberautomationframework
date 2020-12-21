Feature: OCCP-1579 PDP Stickey Box
	Description: To test the ADOBE Test Cases for the story OCCP-1579
	
	@RegressionTest @AEM @TC-575
	Scenario: TC-575 Verify the ability of the business user to centrally author the Sticky Buy Box
	Given open browser
	When AEM author with access to configure the product sticky toc section
	And login to AEM using the credential as mentioned in the test data
	And click on sticky panel
	And click on aem configure button
	And update the label atc cta desktop button
	And update the label atc cta mobile button
	And user click on check button
	And click on the publish button
	And pdp sticky toc url is available
	When pdp page is displayed for the product
	Then verify button cta desktop update on site
    And quit browser
	And open browser
	And AEM author with access to configure the product sticky toc section
	And login to AEM using the credential as mentioned in the test data
	And click on sticky panel
	And click on aem configure button
	And revert the label atc cta mobile button
	And user click on done button	
	
	
	
	