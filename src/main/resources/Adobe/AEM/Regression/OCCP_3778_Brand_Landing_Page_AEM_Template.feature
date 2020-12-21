Feature: 	OCCP-3778 OCCP-3778 Brand Landing Page - AEM Template
	Description: To test the ADOBE Test Cases for the story OCCP-3778
	
	@RegressionTest @AEM
	Scenario: TC-4051 OCCP-3778 Brand Landing Page - AEM Template- Verify Author using components that are pre-configured on the Brand Landing Page template to author content 	
	Given open browser
	When AEM author with access to Brand Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on brand landing page
	
	@RegressionTest @AEM
	Scenario: TC-4052 OCCP-3778 Brand Landing Page - AEM Template- Verify Author adding components onto the Brand Landing Page templates to create additional content
	Given open browser
	When AEM author with access to Brand Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on brand landing page
	And verify drag components here parsy display
	And click on drag components
	And click on insert component
	And user selects two featured tiles to configure
  And click on the publish button