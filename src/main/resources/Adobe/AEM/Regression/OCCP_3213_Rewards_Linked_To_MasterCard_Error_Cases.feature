Feature: OCCP-3213 Link Existing Triangle Rewards Card | Failure/Error Cases | Rewards Linked to Triangle MasterCard
	Description: To test the ADOBE AEM Test Cases for the story OCCP-3213
	
	@RegressionTest @AEM
	Scenario: TC-2184 Configure label for 'Try Again' CTA
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And access the try again cta property and configure the text 
	And user click on check button
	And click on the preview button
	And enter a loyalty card number which redirects to error screen
	And user click on continue button
	Then the tryagain text changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2185 Configure label for 'Cancel' CTA
	When aem author with access navigates to link existing card screen
	And click on edit icon on header
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And access the cancel cta property and configure the text 
	And user click on check button
	And click on the preview button
	And enter a loyalty card number which redirects to error screen
	And user click on continue button
	Then the cancel text changes should be reflected on ctc site