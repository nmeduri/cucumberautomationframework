Feature: OCCP-1604 Filter and Facets
	Description: To test the ADOBE Test Cases for the story OCCP-1604
	
	@RegressionTest @AEM @TC-411
	Scenario: TC-411 Verify AEM content author is able to hide the toggle altogether on on the PLP component
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on premium filter tab
	And hide the toogle altogether on plp component
	And user click on check button
	And click on the publish
	And plp url is available
    When plp is displayed
	Then the toogle is not displayed for that particular page
    And quit browser
	And open browser
	And AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on premium filter tab
	And show the toogle altogether on plp component
	And user click on done button	
	
	@RegressionTest @AEM @TC-409
	Scenario: TC-409 Verify AEM content author is able to hide the toggle altogether on on the PLP component
	Given open browser
	When AEM author with access to configure intial product result load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on PLP Pannel
	And click on aem configure button
	And click on premium filter tab
	Then verify the option to show/hide the toogle altogether is dispalyed on template
	Then verify the option is dispalyed on template
	