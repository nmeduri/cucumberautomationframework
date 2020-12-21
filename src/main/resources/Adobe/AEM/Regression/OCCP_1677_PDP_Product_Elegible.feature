Feature: OCCP-1677 PDP : Product Eleigible
	Description: To test the ADOBE Test Cases for the story OCCP-1677
	
	@RegressionTest @AEM @TC-1699
	Scenario: TC-1699 Verify the ability of a business user to configure "Available by" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure text label available by
	And user click on check button
	And click on the publish button
	When pdp url is available
	Then configured available by label is displayed on publish page
    And quit browser
	And open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And revert text label available by
	And user click on check button
	And click on the publish button
	
	@RegressionTest @AEM @TC-1698
	Scenario: TC-1698 Verify the ability of a business user to configure "Curbside pickup available" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure text label curbside pickup available
	And user click on check button
	And click on the publish button
	When pdp url is available
	Then configured curbside pickup available label is displayed on publish page
    And quit browser
	And open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And revert text label curbside pickup available
	And user click on check button
	And click on the publish button
	
	@RegressionTest @AEM @TC-1701
	Scenario: TC-1701 Verify the ability of a business user to configure "Ship to Home" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure ship to home label
	And user click on check button
	And click on the publish button
	When pdp url is available
	Then configured ship to home label is updated on publish page
    And quit browser
	And open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And revert ship to home label
	And user click on check button
	And click on the publish button
	
	@RegressionTest @AEM @TC-1700
	Scenario: TC-1700 Verify the ability of a business user to configure "Check nearby stores" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configue check nearby stores label
	And user click on done button
	And click on the publish button
	When pdp url is available
	Then configured check nearby stores label is updated on publish page
    And quit browser
	And open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And revert check nearby stores label
	And user click on check button
	And click on the publish button
	
	@RegressionTest @AEM @TC-1703
	Scenario: Verify the ability of a business user to configure "Change" label on the PDP
	Given open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And configure change label
	And user click on done button
	And click on the publish button
	When pdp url is available
	Then configured change label is updated on publish page
    And quit browser
	And open browser
	When AEM author with access to configure the product specifications section
	And login to AEM using the credential as mentioned in the test data
	And click on buy box section
	And click on aem configure button
	And click on fulfillment tab
	And revert change label
	And user click on check button
	And click on the publish button
	
	
	
	