Feature: OCCP-1030 FOOTER: Simple Footer
Description: To test the ADOBE Test Cases for the story OCCP-1030

	#@RegressionTest @AEM
	Scenario: TC-2868 AEM user configures url for text Legal
	Given open browser
	When aem author with access navigates to footer page
	And login to AEM using the right credentials as mentioned in the test data
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author url for text legal
	And access the property and author url for text legal
	And user click on check button
	And click on the preview button
	Then legal text label changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2869 AEM user can edit text for Terms & Conditions
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author text for terms and conditions
	And access the property and author text for terms and conditions
	And user click on check button
	And click on the preview button
	Then terms and conditions text label changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2870 AEM user configures url for text Terms & Conditions
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author url for terms and conditions
	And access the property and author url for terms and conditions
	And user click on check button
	And click on the preview button
	Then terms and conditions url changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2871 AEM user can edit text for Privacy Policy
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author text for privacy policy
	And access the property and author text for privacy policy
	And user click on check button
	And click on the preview button
	Then privacy policy text label changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2872 AEM user configures url for text Privacy Policy
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author url for privacy policy
	And access the property and author url for privacy policy
	And user click on check button
	And click on the preview button
	Then privacy policy url changes are reflected on ctc site
	
	@AEM @Regression
	Scenario: TC-2867 Verification of Authoring of text Legal via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the legal text is authorable
	Then access the text property and author the text mentioned in test data
	And user click on done button
	And click on preview button
	Then the changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the legal text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2868 Verification of Authoring of URL for text Legal via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify if URL for Legal Text is authorable
	Then access the text property and author the URL mentioned in the test data
	And user click on done button
	And click on preview button
	Then scroll down to AEM footer
	Then the legal text URL changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the legal text URL changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2869 Verification of Authoring of textfor  "Terms & Conditions" via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the term and conditions text is authorable
	Then access the text property and author the terms and condition text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
  Then the terms n condition text changes are reflected on a footer component 
  And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the TnC text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2870 Verification of Authoring of URL for text Terms & Conditions via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the term and conditions text URL is authorable
	Then access the text property and author the terms and condition URL mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the terms n condition URL changes are reflected on a footer component 
  And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the TnC URL changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2871 Verification of Authoring of textfor  "Privacy Policy" via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Privacy Policy text is authorable
	Then access the text property and author the Privacy Policy text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Privacy Policy text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Privacy Policy text text changes
	And user click on done button
	
  @AEM @Regression 
	Scenario: TC-2872 Verification of Authoring of URL for text Privacy Policy via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Privacy Policy text URL is authorable
	Then access the text property and author the Privacy Policy URL mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Privacy Policy URL changes are reflected on a footer component 
  And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Privacy Policy URL changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2873 Verification of Authoring of text Site Map via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Site map text is authorable
	Then access the text property and author the Site map text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Site map text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Site map text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2874 Verification of Authoring of URL for text Site Map via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Site Map text URL is authorable
	Then access the text property and author the Site Map URL mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Site Map URL changes are reflected on a footer component
  And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Site Map URL changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2875 Verification of Authoring of text Accessibility via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Accessibility text is authorable
	Then access the text property and author the Accessibility text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Accessibility text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Accessibility text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2876 Verification of Authoring of URL for text Accessibility via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Accessibility URL is authorable
	Then access the text property and author the Accessibility URL mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Accessibility URL changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Accessibility URL changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2877 Verification of Authoring of text Copyright Label via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Copyright text is authorable
	Then access the text property and author the Copyright text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Copyright text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Copyright text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2878 Verification of Authoring of text for Legal Disclaimer via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And verify the Legal Disclaimer text is authorable
	Then access the text property and author the Legal Disclaimer text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the Legal Disclaimer text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the Legal Disclaimer text changes
	And user click on done button
	
	@AEM @Regression
	Scenario: TC-2879 Verification of Authoring of text View More/View Less via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	Then click on footer component
	And click on aem configure button
	And Verify if View More Text is authorable
	And Verify if View Less Text is authorable
	Then access the text property and author the View more text mentioned in test data
	Then access the text property and author the View less text mentioned in test data
	And user click on done button
	And click on preview button
	And click on edit button
	Then scroll down to AEM footer
	And click on preview button
	Then the view more text changes are reflected on a footer component
	Then the view Less text changes are reflected on a footer component
	And click on edit button
	Then click on footer component
	And click on aem configure button
	And reverse the View More text changes
	And reverse the View less text changes
	And user click on done button
	
	@AEM @Regression @SmokeTest
	Scenario: TC-2880 Verification of Authoring  to open up the Footer links on same page/new tab via AEM
	Given open browser
	When AEM author with access to configure the footer component section
	And login to AEM using the credential as mentioned in the test data
	Then scroll down to AEM footer
	And click on preview button
	Then the legal text URL changes are reflected on a footer component
	Then the terms n condition URL changes are reflected on a footer component 
	Then the Accessibility URL changes are reflected on a footer component
	Then the Privacy Policy URL changes are reflected on a footer component 
	Then the Site Map URL changes are reflected on a footer component
	
	
	
