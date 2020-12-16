Feature: 	OCCP-3665 Account- Profile and Preference | Update Personal Information
	Description: To test the ADOBE Test Cases for the story OCCP-3665
	
	@RegressionTest @WebView @WideScreen @TC-3591
	Scenario:TC-3591 OCCP-3665 Account- Profile and Preference | Update Personal Information -  Verify That the user is able to Configure field and CTA Label
	Given open browser
	When AEM author with access to configure account profile page
	And login to AEM using the credential as mentioned in the test data
	And click on account profile component
	And click on aem configure button
	Then configure the account profile field label and CTA text
	And user click on done button
	And click on the publish button

@RegressionTest @WebView @WideScreen @TC-3592
	Scenario:TC-3592 OCCP-3665 Account- Profile and Preference | Update Personal Information -  Verify That the user is able to Configure Toast Banner Label
	Given open browser
	When AEM author with access to configure account profile page
	And login to AEM using the credential as mentioned in the test data
	And click on account profile component
	And click on aem configure button
	Then configure the account profile toast banner text
	And user click on done button
	And click on the publish button
	
	@RegressionTest @WebView @WideScreen @TC-3593
	Scenario:TC-3593 OCCP-3665 Account- Profile and Preference | Update Personal Information -  Verify That the user is able to  Update Label for the Model Pop up
	Given open browser
	When AEM author with access to configure account profile page
	And login to AEM using the credential as mentioned in the test data
	And click on account profile component
	And click on aem configure button
	Then configure the account profile modal pop up
	And user click on done button
	And click on the publish button

	
	