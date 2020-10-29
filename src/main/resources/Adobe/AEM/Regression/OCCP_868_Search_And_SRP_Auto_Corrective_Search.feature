Feature: OCCP-868 Search and SRP-Auto corrective search
	Description: To test the ADOBE Test Cases for the story OCCP-868
	
	#@RegressionTest @AEM
	Scenario: TC-143 Verify AEM author is able to configure the corrective search message
	Given open browser
	When AEM author with access to configure the corrective search message
	And login to AEM using the credential as mentioned in the test data
	And click on aem search title
	And click on aem configure button
	And configure the corrective search message
	And user enter search title
	And user enter results label
	And user enter not result title
	And user enter similar result title
	And user enter suggestive message
	And user enter search result threshold
	And user click on check button
	#And close Browser
