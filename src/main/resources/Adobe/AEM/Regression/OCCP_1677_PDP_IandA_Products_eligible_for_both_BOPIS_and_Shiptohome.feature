Feature: OCCP-1677 PDP I&A - Products eligible for both BOPIS and Ship to home
	Description: To test the ADOBE Test Cases for the story OCCP-1677
	
	@AEM @Smoke @TC-1695
	Scenario: TC-1695 Verify the ability of a business user to configure "Get it in store" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure get it in store label
	And user click on done button
	And click on preview button
	Then the updated get it in store label is displayed on site

	@AEM @Smoke @TC-1696
	Scenario: TC-1696 Verify the ability of a business user to configure "In stock" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure in stock label
	And user click on done button
	And click on preview button
	Then the updated in stock label is displayed on site
	
	@AEM @Smoke @TC-1697
	Scenario: TC-1697 Verify the ability of a business user to configure "Free pick up in store" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure free PickUp In Store label
	And user click on done button
	And click on preview button
	Then the updated free PickUp In Store label is displayed on site
	