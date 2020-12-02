Feature: OCCP-3759 : View Contact Us Page Part4(Page Elements Other Than Form)
	Description: To test the ADOBE Test Cases for the story OCCP-3759
	
	@RegressionTest @AEM
	Scenario: TC-4118 OCCP-3759 View Contact Us page - part 4(page elements other than form)- Verify Author is able to configure the Email Section Title, the Form Hyperlink and Icon 
	Given open browser
	When AEM author with access to configure Contact us authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on contact us component
	And click on aem configure button
	Then configure the select icon for email section on contact us component
	And configure the email title for email section on contact us component
	And configure the select format for promo tiles for email section on contact us component
	And configure the email link label for email section on contact us component
	And configure the email link value for email section on contact us component
	And configure the Select target to open the email link for email section on contact us component
	And user click on done button
	And click on preview button
	Then verify the configured contact us details are displayed
	When AEM author with access to configure Contact us fr locale authorable page
	And click on edit button
	And click on contact us component
	And click on aem configure button
	Then configure the select icon for email section on contact us component
	And configure the email title for email section on contact us component
	And configure the select format for promo tiles for email section on contact us component
	And configure the email link label for email section on contact us component
	And configure the email link value for email section on contact us component
	And configure the Select target to open the email link for email section on contact us component
	And user click on done button
	And click on preview button
	Then verify the configured contact us details are displayed
	
	
	
	
	