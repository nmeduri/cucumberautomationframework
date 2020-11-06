Feature: OCCP-2723 Reward Card Already Linked
	Description: To test the ADOBE Test Cases for the story OCCP-2723
	
	@RegressionTest @AEM @TC-1503
	Scenario: TC-1503 Verify the ability of a content author to configure Image and the text on the screen. 
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the credential as mentioned in the test data
	And click on aem link existing card title
	And click on aem configure button
	And click on error screen tab
	And configue try again button on the card already enrolled error screen
	And configure image on the card already enrolled error screen
	And user click on done button
	And click on the publish
	And navigate on existing card page
	And enter card number which is assigned to other account
	And user click on continue button
	Then configured image is displayed on screen
	Then configured try again buttton text on screen
	And quit browser
	And open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the credential as mentioned in the test data
	And click on aem link existing card title
	And click on aem configure button
	And click on error screen tab
	And revert error image changes
	And revert button text changes
	And user click on done button
	
	
	
	