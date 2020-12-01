Feature: OCCP-3722 : Login/Registration Template

	Description: To test the ADOBE Test Cases for the story OCCP-3722
	
	@RegressionTest @AEM
	Scenario: TC-3600	OCCP-3722: Login/Registration Template-Verify author is able to add Login components while configuring Login/Registration template
	Given open browser
	When AEM author with access to configure login page component
	And login to AEM using the credential as mentioned in the test data
	And click on gigya integration component
	And click on aem configure button
	And select gigya Screen1 dropdown
	And select gigya Screen2 dropdown
	And user click on done button
	And click on the publish button
	And quit browser
	When open browser
	When hit login page publish url
	And Remove Cookies
	And refresh the page
	And login page is displayed
	When for fr locale AEM author with access to configure login page component
	And login to AEM using the credential as mentioned in the test data
	And click on gigya integration component
	And click on aem configure button
	And select gigya Screen1 dropdown
	And select gigya Screen2 dropdown
	And user click on done button
	And click on the publish button
	And quit browser
	When open browser
	When hit fr login page publish url
	And Remove Cookies
	And refresh the page
	And login page is displayed
	
	@RegressionTest @AEM
	Scenario: TC-4003	OCCP-3722: Login/Registration Template-Verify author is able to add Registration specific components while configuring Login/Registration template
	When AEM author with access to configure registration page component
	And login to AEM using the credential as mentioned in the test data
	And click on gigya integration component
	And click on aem configure button
	And select registration screen from gigya Screen1 dropdown
	And select registration screen from gigya Screen2 dropdown
	And user click on done button
	And click on the publish button
	And quit browser
	When open browser
	When hit registration page publish url
	And Remove Cookies
	And refresh the page
	Then registration page is displayed
	When for fr locale AEM author with access to configure registration page component
	And login to AEM using the credential as mentioned in the test data
	And click on gigya integration component
	And click on aem configure button
	And select registration screen from gigya Screen1 dropdown
	And select registration screen from gigya Screen2 dropdown
	And user click on done button
	And click on the publish button
	And quit browser
	When open browser
	When hit fr registration page publish url
	And Remove Cookies
	And refresh the page
	Then registration page is displayed

	