Feature: 	OCCP-3783 Microseason Landing Page - AEM Template
	Description: To test the ADOBE Test Cases for the story OCCP-3783
	
	@RegressionTest @AEM @TC-4049
	Scenario: TC-4049 OCCP-3783 Microseason Landing Page - AEM Template- Verify Author using components that are pre-configured on the template to author content	
	Given open browser
	When AEM author with access to Microseason Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on microseason landing page
	
	@RegressionTest @AEM @TC-4050
	Scenario: TC-4050 OCCP-3783 Microseason Landing Page - AEM Template- Verify Author adding components onto the MicroSeasons Landing Page templates to create additional content	
	Given open browser
	When AEM author with access to Microseason Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	Then validate different components are preconfigured on microseason landing page
	And verify drag components here parsy display
	And click on drag components
	And click on insert component
	And user selects two featured tiles to configure
  And click on the publish button
  
  @RegressionTest @AEM @TC-6884
	Scenario: TC-6884 OCCP-3783 Microseason Landing Page - AEM Template- Verify Author replaces masthead banner with edge to edge banner	
	Given open browser
	When AEM author with access to Microseason Landing authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on Banner selector component
	And click on aem configure button
	And select edge to edge as banner type
	And user click on done button
	And validate the Standard Masthead should be replaced with the authored Edge to Edge banner
  