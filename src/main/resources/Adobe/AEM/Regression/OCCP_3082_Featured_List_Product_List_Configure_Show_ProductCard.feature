Feature: OCCP-3082 : Featured List |Product List|Authorable
	Description: To test Product Card disable/enable
	
	
	@RegressionTest @AEM @MobileView @TabletView
	Scenario: Verify configuration of display/hiding save story  on Product Card |Mobile/Desktop/Desktop 
	Given open browser
	When AEM author with access to configure feature list FRURL
	And login to AEM using the credential as mentioned in the test data
	And click on featured product list panel
	And click on aem configure button
	And user click on uncheck or check Hide Production Description checkbox
	And user click on done button
	And click on the publish button
	And quit browser