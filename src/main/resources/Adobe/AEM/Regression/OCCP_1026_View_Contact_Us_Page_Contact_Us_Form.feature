Feature: OCCP-1026 	OCCP-1026 View Contact Us page - part 1 (Contact Us Form)
Description: To test the ADOBE Test Cases for the story OCCP-1026

@RegressionTest @WebView @WideScreen
	Scenario: TC-6395 Verify that Author is able to Configure Page title
	When AEM author with access to contact us Page
  #And login to AEM using the credential as mentioned in the test data
  And click on contact us page title component
  And click on aem configure button
  And access contact us title property and configure the title text
  And user click on done button
  And click on the preview button
  Then verify the contact us title changes are reflected on ctc site