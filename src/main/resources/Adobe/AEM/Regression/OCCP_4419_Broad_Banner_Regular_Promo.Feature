Feature: OCCP-4419 Broad Banner - Regular/Promo
	Description: To test the ADOBE Test Cases for the story OCCP-4419
	
	@RegressionTest @AEM @TC-3516
	Scenario: TC-3516 OCCP-4419 Broad Banner - Regular/Promo- Verify Configuration of the elements within the Broad Banner component
	Given open browser
	When aem author with access navigates to broad banner screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on Broad banner panel
	And click on aem configure button
	Then verify banner image field is authorable in Broad Banner component
	Then verify Alt text field is authorable in Broad Banner component
	Then verify Image orientation field is authorable in Broad Banner component
	Then verify banner title field is authorable in Broad Banner component
	And user click on done button
	
	@RegressionTest @AEM @TC-3517
	Scenario: TC-3517 OCCP-4419 Broad Banner - Regular/Promo- Verify Display of Authoring Error (errors for the authors) for Mandatory fields
	Given open browser
	When aem author with access navigates to broad banner screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on Broad banner panel
	And click on aem configure button
	And error message displayed when mandatory fields not entered
	And Fill all the mandatory fields 
	And user click on done button
	And click on the preview button
	Then the broad banner changes are updated on site
	