Feature: OCCP-2286 Link Rewards By Triangle Master Card
	Description: To test the ADOBE Test Cases for the story OCCP-2286
	
	@RegressionTest @AEM @TC-4763
	Scenario: TC-4763 OCCP-3753 Checkout : Contact Info - Guest User & Authenticated User- Verify configure the Title label - Contact Information
	Given open browser
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And configure the contact information title
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	And user navigate to checkout contact info page
	Then configured contact info title is displayed on publish page
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And revert the contact information title
	And user click on check button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4764
	Scenario: TC-4764 OCCP-3753 Checkout : Contact Info - Guest User & Authenticated User- Verify Configure the field title label
	Given open browser
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And configure the field title label
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	And user navigate to checkout contact info page
	Then configured field title are displayed on publish page
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And revert the field title label
	And user click on check button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4765
	Scenario: TC-4765 OCCP-3753 Checkout : Contact Info - Guest User & Authenticated User- Verify Configure the CTA button 'Next'
	Given open browser
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And configure the next cta button label
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	And user navigate to checkout contact info page
	Then configured next cta button label is displayed on publish page
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And revert the next cta button label
	And user click on check button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4766
	Scenario: TC-4766 OCCP-3753 Checkout : Contact Info - Guest User & Authenticated User- Verify Configure the tooltip message
	Given open browser
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And configure tool tip message
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	And user navigate to checkout contact info page
	Then configured tool tip message is displayed on publish page
	And quit browser
	And open browser
	When login to the backend system of checkout contact info
	And login to AEM using the credential as mentioned in the test data
	And click on checkout contact info panel
	And click on aem configure button
	And click on contact information tab
	And revert tool tip message
	And user click on check button
	And click on preview button
	And click on the publish button
	
	
	
	

	
	
	
	