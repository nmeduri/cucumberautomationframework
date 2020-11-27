Feature: OCCP-3301 Account- Profile and Preferences : View Shipping Address And Billing Address
Description: To test the ADOBE AEM Test Cases for the story OCCP-3214
	
	@RegressionTest @AEM @TC-3578
	Scenario: TC-3578	OCCP-3301 Account- Profile and Preferences : View Shipping Address And Billing Address-Verify that Customer is able to Configure label for the section (i.e. Addresses)

	Given open browser
	When aem author with access navigates to my account address screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit icon on header 
	And click on my account address component
	And click on aem configure button
	And configure address label
	And user click on done button
	And click on the publish button
	
@RegressionTest @AEM @TC-3579
	Scenario: TC-3579	OCCP-3301
Account- Profile and Preferences : View Shipping Address And Billing Address-Verify that Customer is able to Configure label for the sub-section (I.e. Shipping addresses, Billing addresses) and field (Address)

	Given open browser
	When aem author with access navigates to my account address screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit icon on header 
	And click on my account address component
	And click on aem configure button
	And configure shipping address label
	And user click on done button
	And click on the publish button