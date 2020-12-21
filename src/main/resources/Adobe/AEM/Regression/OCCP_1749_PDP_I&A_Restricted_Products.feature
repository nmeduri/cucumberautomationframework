Feature: OCCP-1749 PDP I&A - Restricted Products
	Description: To test the ADOBE Test Cases for the story OCCP-1749
	
	@AEM @Smoke @TC-1885
	Scenario: TC-1885 Verify "In-store purchase only" label is configurable via AEM	
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure In-store purchase only label
	And user click on done button
	And click on the publish button
	
	@AEM @Smoke @TC-1886
	Scenario: TC-1886 Verify "Visit your preferred store to purchase" label is configurable via AEM
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure vist preffered store to  purchase only label
	And user click on done button
	And click on the publish button
	