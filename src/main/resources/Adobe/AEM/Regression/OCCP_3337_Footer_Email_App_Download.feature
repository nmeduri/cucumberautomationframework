Feature: OCCP-3337 Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-3337
	
	@RegressionTest @AEM
	Scenario: TC-3398 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to Configure text for " Be the First one to know " field
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And update be the first to know detail
	And user click on done button
	And click on preview button
	Then be the first to know changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And reverse be the first to know changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-3399 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure text for "Get your weekly flyer email directly to you" field
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And update the get your weekly flyer email directly to you field
	And user click on done button
	And click on preview button
	Then weekly flyer email directly changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And reverse weekly flyer email directly changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-3400 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure text for "Sign Up Now" field
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And update sign up now field
	And user click on done button
	And click on preview button
	Then weekly sign up changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And reverse weekly sign up changes
	And user click on done button
	
	@RegressionTest @AEM
	Scenario: TC-3401 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure destination URL for "Sign Up Now"
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure the destination url for sign up
	And user click on done button
	And click on preview button
	Then url for sign up changes are reflect on site
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And revert configure destination sign up url changes
	And user click on done button
	
	
	
	
	
	
	
	