Feature: OCCP-1825 Featured List: Informational Featured Lists with Icons (Authorable)
	Description: To test the ADOBE Test Cases for the story OCCP-1825
	
	@RegressionTest @AEM @TC-1837
	Scenario: TC-1837 Verify feaured list component is configurable on an authored page
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the feature list component on the authored page
	And user click on done button
	And click on preview button
	Then verify the configured image feature list component
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And reverse the feature list image changes
	And user click on done button
	
	@RegressionTeset @AEM
	Scenario: TC-1838 Verify the display of error message when mandatory fields are not added while authoring the content
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And do not fill the mandotary fields
	And user click on check button
	Then user should see authoring error message as  the mandatory fields are not entered
	And reverse the image one changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1839
	Scenario: TC-1839 Verify the display of error message when min. threshold for the tile are not met when authroing the featured list component while authoring the content  
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And fill minimum thershold value with less than min
	And user click on check button
	Then user should see error authoring message as the mininum thershold
	
	

	
	
	
	
	
	
	