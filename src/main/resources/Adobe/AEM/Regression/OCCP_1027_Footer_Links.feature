Feature: OCCP-1027 Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-1027
	
	@RegressionTest @AEM
	Scenario: TC-2104 Verify user is able to configure the text for links under "Customer Support" Section on Footer via AEM
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update customer service sub section tilte details
	And user click on done button
	And click on preview button
	Then the customer service sub section changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the customer service section changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-2105 Verify user is able to configure the text for links under "Services & Solutions" Section on Footer via AEM
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update service and solutions sub section tilte details
	And user click on done button
	And click on preview button
	Then the service and solution sub section changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the service and solutions section changes
	And user click on done button
	
	@RegressionTest @AEM 
	Scenario: TC-2106 Verify user is able to configure the text for links under "About Us" Section on Footer via AEM 
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update about us sub section tilte details
	And user click on done button
	And click on preview button
	Then the about us sub section changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the about us section changes
	And user click on done button
	
	@RegressionTest @AEM @Regress
	Scenario: TC-2107 Verify user is able to configure the text for links under "Legal" Section on Footer via AEM 
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update legal sub section tilte details
	And user click on done button
	And click on preview button
	Then the legal sub section changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the legal section changes
	And user click on done button
	
	@RegressionTest @AEM @Regress
	Scenario: TC-2108 Verify user is able to configure the destination url for texts under "Customer Support" Section on Footer via AEM
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update customer service destination url
	And user click on done button
	And click on preview button
	Then the customer service sub url changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the customer service url changes
	And user click on done button
	
	@RegressionTest @AEM @Regress
	Scenario: TC-2109 Verify user is able to configure the destination url for texts under "Services & Solutions" Section on Footer via AEM 
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update service and solutions sub url details
	And user click on done button
	And click on preview button
	Then the service and solution sub url changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the service and solutions url changes
	And user click on done button
	
	@RegressionTest @AEM 
	Scenario: TC-2110 Verify user is able to configure the destination url for texts under "About Us" Section on Footer via AEM
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update about us sub url details
	And user click on done button
	And click on preview button
	Then the about us sub url changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the about us url changes
	And user click on done button
	
	@RegressionTest @AEM @Regress
	Scenario: TC-2111 Verify user is able to configure the destination url for texts under "Legal" Section on Footer via AEM
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And update legal sub section url details
	And user click on done button
	And click on preview button
	Then the legal sub url changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And reverse the legal url changes
	And user click on done button
	
	