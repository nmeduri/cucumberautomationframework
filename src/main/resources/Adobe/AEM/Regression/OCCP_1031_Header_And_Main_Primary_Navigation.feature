Feature: OCCP-1031 OCCP-1031 Header and Main Navigation | Primary Navigation | Desktop
Description: To test the ADOBE Test Cases for the story OCCP-1031
	
	@RegressionTest @AEM
	Scenario: TC-2512 Configure Title and Subtitle on Ownership Validation screen
	Given open browser
	When aem author with access navigates to header page
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem primary navigation card title
	And click on aem configure button
	And user should be able to author ctc logo
	And access and author the ctc logo property
	And user click on check button
	And click on the preview button
	Then the ctc logo changes should be reflected on ctc site