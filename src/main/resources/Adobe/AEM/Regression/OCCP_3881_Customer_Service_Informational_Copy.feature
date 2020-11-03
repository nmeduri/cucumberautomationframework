Feature: OCCP-3722 : Login/Registration Template

	Description: To test the ADOBE Test Cases for the story OCCP-3722
	
	@RegressionTest @AEM
	Scenario: TC-3420	OCCP-3881 :Customer Service - Informational Copy (Authorable) -Verify that Customer is able to Configure title
	Given open browser
	When AEM author with access to configure customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on title and content component
	And click on aem configure button
	Then update title of customer service
	And user click on done button
	And click on the preview button
	Then title changes should be reflected on ctc site
	And Remove Cookies
	When AEM author with access to configure to fr locale customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on title and content component
	And click on aem configure button
	Then update title of customer service
	And user click on done button
	And click on the preview button
	Then title changes should be reflected on ctc site
	And quit browser
	
	
	#@RegressionTest @AEM
	Scenario: TC-3421	OCCP-3881 :Customer Service -Informational Copy (Authorable) -Verify that Customer is able to Configure subtitle	
	When AEM author with access to configure customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on title and content component
	And click on aem configure button
	Then update subtitle of customer service
	And user click on done button
	And click on the preview button
	Then sub title changes should be reflected on ctc site
	And Remove Cookies
	When AEM author with access to configure to fr locale customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on title and content component
	And click on aem configure button
	Then update subtitle of customer service
	And user click on done button
	And click on the preview button
	Then sub title changes should be reflected on ctc site
	And quit browser
	
	@RegressionTest @AEM
	Scenario: TC-3422	OCCP-3881 :Customer Service - Informational Copy(Authorable) -Verify that Customer is able to Configure Title CTA on the Link List
	Given open browser
	When AEM author with access to configure customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on link list component
	And click on aem configure button
	Then update title of link list
	And user click on done button
	And click on the preview button
	Then clickable title should be displayed
	And Remove Cookies
	When AEM author with access to configure to fr locale customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on link list component
	And click on aem configure button
	Then update title of link list
	And user click on done button
	And click on the preview button
	Then clickable title should be displayed
	And quit browser
	
	
	@RegressionTest @AEM
	Scenario: TC-3423	OCCP-3881 :Customer Service - Informational Copy (Authorable) -Verify that Customer is able to Configure Message Description on the Link List
	Given open browser
	When AEM author with access to configure customer service page component
	And Remove Cookies
	And refresh the page
	And login to AEM using the credential as mentioned in the test data
	And click on link list component
	And click on aem configure button
	Then update description of link list
	And user click on done button
	And click on the preview button
	Then description should be displayed
	And Remove Cookies
	When AEM author with access to configure to fr locale customer service page component
	And login to AEM using the credential as mentioned in the test data
	And click on link list component
	And click on aem configure button
	Then update description of link list
	And user click on done button
	And click on the preview button
	Then description should be displayed
	