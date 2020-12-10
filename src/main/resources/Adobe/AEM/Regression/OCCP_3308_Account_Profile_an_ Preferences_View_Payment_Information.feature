Feature: 	OCCP-3308 Account- Profile and Preferences : View Payment Information
Description: To test the ADOBE AEM Test Cases for the story OCCP-3308
	
	@RegressionTest @AEM 
	Scenario: TC-4726 OCCP-3308 - Verify user is able to   Configure CTA label and Link for No Payment info scenario

	Given open browser
	When aem author with access navigates to my account payment screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on my account payment component
	And click on aem configure button
	And configure text label for CTA to Continue Shopping
	And configure navigation link  for CTA to Continue Shopping
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM 
	Scenario: TC-4707 OCCP-3308 - Verify user is able to  Configure Message for No Payment info scenario

	Given open browser
	When aem author with access navigates to my account payment screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on my account payment component
	And click on aem configure button
	And configure No payment info Title
	And configure No payment info message
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM 
	Scenario: TC-4708 OCCP-3308 - Verify user is able to  Configure Toast banner text message
	Given open browser
	When aem author with access navigates to my account payment screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on my account payment component
	And click on aem configure button
	And configure Toast Banner Success Message
	And configure Toast Banner Error Message
	And user click on done button
	And click on preview button
	And click on the publish button
	