Feature: OCCP-3082 : Featured List |Product List|Authorable
	Description: To test Hiding Save Story
	
	
	@RegressionTest @AEM 
	Scenario: Verify configuration of display/hiding save story  on Product Card |Mobile/Desktop/Desktop 
	Given open browser
	When AEM author with access to configure feature list FRURL
	And login to AEM using the credential as mentioned in the test data
	And click on featured product list panel
	And click on aem configure button
	And user verify hiding save story checkbox
	And user click on done button
	And click on the publish button
	And quit browser