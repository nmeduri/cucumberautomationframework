Feature: OCCP-1042-Customer Service - Accordion (Authorable)

	Description: To test the ADOBE Test Cases for the story OCCP-1042
	
@RegressionTest @AEM @TC-3267
	Scenario: TC-3267 OCCP-1042 -Customer Service - Accordion (Authorable) -Verify that the customer is able to view Accordion Title
	Given open browser
	When AEM author with access to configure customer service page component
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to accordion pannel
	And click on Accordion component
	And click on aem configure button
	Then update title of Accordion
	And user click on done button
	And click on edit button
	Then scroll down to accordion pannel
	And click on the preview button
	Then validate the accordion title change is displayed on site
	
	@RegressionTest @AEM @TC-3268
	Scenario: TC-3268 OCCP-1042 - Customer Service - Accordion (Authorable) -Verify that the customer is able to view Accordion Headers
	Given open browser
	When AEM author with access to configure customer service page component
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to accordion pannel
	And click on Accordion component
	And click on aem configure button
	Then update Header of Accordion
	And user click on done button
	And click on edit button
	Then scroll down to accordion pannel
	And click on the preview button
	Then validate the accordion header change is displayed on site