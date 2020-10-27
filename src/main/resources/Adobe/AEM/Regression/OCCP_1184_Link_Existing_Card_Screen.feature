Feature: OCCP-1184 Link Existing Card Screen
	Description: To test the ADOBE Test Cases for the story OCCP-1184
	
	@RegressionTest @AEM
	Scenario: TC-2275 Configure Title and Subtitle on Link Loyalty Card screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author screen title
	And access the title property and author the title
	And user should be able to author screen sub title
	And access the sub title property and author the title
	And user click on check button
	And click on the preview button
	Then the title and sub title changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2276 Configure label for 'tooltip' fields (like Not sure what...)
	When aem author with access navigates to link existing card screen
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author tooltip label
	And access the property and author the tooltip label
	And user click on check button
	And click on the preview button
	Then the tooltip label changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2277 Configure tool tip text
	When aem author with access navigates to link existing card screen
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author tooltip text
	And access the property and author the tooltip text
	And user click on check button
	And click on the preview button
	Then the tooltip text changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2279 Configure label (Don't have....) and link for 'Get one here' CTA
	When aem author with access navigates to link existing card screen
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author Don't have a Triangle Rewards™ Card text
	And access the property and author the Don't have a Triangle Rewards™ Card text
	And user should be able to author label and link for 'Get one here' CTA
	And access 'Get one here' CTA property and author link and label
	And user click on check button
	And click on the preview button
	Then all the label and link changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2280 Configure label for 'Cancel' CTA
	When aem author with access navigates to link existing card screen
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author Cancel CTA
	And access the property and author the Cancel text
	And user click on check button
	And click on the preview button
	Then cancel label changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2281 Configure label for 'Input' fields (like last 12 digits...)
	When aem author with access navigates to link existing card screen
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And user should be able to author input field
	And access the property and author input field text
	And user click on check button
	And click on the preview button
	Then input field label changes should be reflected on ctc site
	And close browser