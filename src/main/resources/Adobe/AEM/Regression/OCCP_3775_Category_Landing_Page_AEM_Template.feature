Feature: 		OCCP-3775 Category Landing Page - AEM Template
	Description: To test the ADOBE Test Cases for the story OCCP-3775
	
	@RegressionTest @AEM @TC-4053
	Scenario: TC-4053 OCCP-3775 Category Landing Page - AEM Template- Verify Author using components that are pre-configured on the template to author content
	Given open browser
	When AEM author with access to category Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on category landing page
	
	@RegressionTest @AEM @TC-4054
	Scenario: TC-4054 OCCP-3775 Category Landing Page - AEM Template- Verify Author adding components onto the page template to reference additional content
	Given open browser
	When AEM author with access to category Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on category landing page
	And verify drag components here parsy display
	And click on drag components
	And click on insert component
	And user selects two featured tiles to configure
  And click on the publish button
  
