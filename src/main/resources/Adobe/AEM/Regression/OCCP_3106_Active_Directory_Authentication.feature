Feature: OCCP-3106 AEM Login : Active Directory Authentication
	Description: To test the ADOBE Test Cases for the story OCCP-3106
	
	@RegressionTest @AEM @TC-3439
	Scenario: TC-3439 OCCP-3106- Verify user login is authenticated 
	Given open browser
	When go to aem login page
	And login to AEM using the credential as mentioned in the test data
	Then verify user should get navigated to the AEM home page
	
	
	