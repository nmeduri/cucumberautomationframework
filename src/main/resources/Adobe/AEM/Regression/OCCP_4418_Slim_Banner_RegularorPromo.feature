Feature: OCCP-4418  Slim Banner (Regular/Promo)
	Description: To test the ADOBE Test Cases for the story OCCP-4418
	
	@RegressionTest @AEM @TC-3497
	Scenario: TC-3497 OCCP-4418 Slim Banner (Regular/Promo)- Verify Display of Authoring Error (errors for the authors) for Mandatory fields
	Given open browser
	When aem author with access navigates to slim banner screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on Slim banner panel
	And click on aem configure button
  And verify error message in slim banner page when mandatory fields are not entered and click on save
  And author the mandatory fields in slim banner page
  And user click on check button
	And click on the preview button
	Then validate the changes are updated on slim banner site
	
	