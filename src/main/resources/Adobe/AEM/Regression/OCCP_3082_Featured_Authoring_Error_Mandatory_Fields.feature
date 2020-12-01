Feature: OCCP-3082 : Featured List |Product List|Authorable
	Description: To test Mandatory Fields
	
	
	@RegressionTest @AEM @TC-3918
	Scenario: OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Authoring Error for Mandatory fields
	Given open browser
	When AEM author with access to configure feature list URL
	And login to AEM using the credential as mentioned in the test data
	And click on featured product list panel
	And click on aem configure button
	And user clear product code
	And user verifies error display
 