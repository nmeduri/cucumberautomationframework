Feature: OCCP-3631 Cart - Quantity Selector
	Description: To test the ADOBE Test Cases for the story OCCP-3631
	
@RegressionTest @AEM @TC-3558
	Scenario: TC-3558 OCCP-3631 Cart - Quantity Selector-  Configure error message
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And update the Error Message Copy field
	And user click on done button
	And click on the publish button
	