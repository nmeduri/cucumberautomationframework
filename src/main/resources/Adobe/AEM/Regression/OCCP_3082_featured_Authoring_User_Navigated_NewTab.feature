Feature: OCCP-3082 Featured List |Product List| Authorable- Verify configuration of on clicking FL -user is navigated to new tab/same page
	Description: To test Navigated to New Tab or SamePage
	
	
	@RegressionTest @AEM 
	Scenario: OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Title for the Product FL |Mobile/Desktop/Desktop wide 
	Given open browser
	When AEM author with access to configure feature list FRURL
	And login to AEM using the credential as mentioned in the test data
	And click on featured product list panel
	And click on aem configure button
	And verify when the author configure for FL
	And user click on done button
	And click on the publish button
	And quit browser
 