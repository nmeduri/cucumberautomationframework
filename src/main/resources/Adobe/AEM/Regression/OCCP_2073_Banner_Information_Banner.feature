	Feature: OCCP-2073 BANNER: Information Banner
	Description: To test the ADOBE Test Cases for the story OCCP-2073
	
	@RegressionTeset @AEM
	Scenario: TC-1838 Verify the display of error message when mandatory fields are not added while authoring the content
	Given open browser
	When AEM author with access navigates to configure information banner authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on information banner component
	And click on aem configure button
	And do not fill the information text mandotary field
	And user click on check button
	Then user should see authoring error message as  the mandatory fields are not entered