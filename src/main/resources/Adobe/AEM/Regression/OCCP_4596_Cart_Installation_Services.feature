Feature: OCCP-4596 Cart Installation Services
	Description: To test the ADOBE Test Cases for the story OCCP-4596
	
	@RegressionTest @AEM @TC-4617
	Scenario: TC-4617 OCCP-4596 - Verify user is able to configure  text label for "Service Add-On"
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on service tab
	And configue the label for service add on
	And user click on done button
	And click on preview button
	And click on the publish button
	And cart url is available
	Then configured service add label changes are displayed on publish page
	And quit browser
	And open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on service tab
	And revert the changes for service add on
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4616
	Scenario: TC-4616 OCCP-4596 - Verify User is able to configure text label for "X installation services available"
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on service tab
	And configure the text label for x installation services available
	And user click on done button
	And click on preview button
	And click on the publish button
	And cart url is available
	Then configured installation service label is displayed on publish page
	And quit browser
	And open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on service tab
	And revert the text label for x installation services available
	And user click on done button
	And click on preview button
	And click on the publish button

	
	
	
	