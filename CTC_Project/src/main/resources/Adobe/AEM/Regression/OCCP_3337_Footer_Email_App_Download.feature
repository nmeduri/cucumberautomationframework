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
	
	@RegressionTest @AEM
	Scenario: TC-3403 OCCP-3337 :FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure text for "Download The App "
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure the text for download the app field
	And user click on done button
	And click on the preview button
	Then updated changes should be reflected on the published instance
	
	@RegressionTest @AEM
	Scenario: TC-3404 OCCP-3337 : FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure text for "Learn More"
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure the text for learn more field
	And user click on done button
	And click on the preview button
	Then updated learn more changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3406 OCCP-3337 : FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure destination url for Apple App store Logo
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure the destination URL for apple app store logo
	And user click on done button
	And click on the preview button
	Then updated apple app store url changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3409 OCCP-3337 : FOOTER:Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure destination url for Play store Logo
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure destination URL for play store logo
	And user click on done button
	And click on the preview button
	Then updated play store url changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3411 OCCP-3337:FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure logo for Accessibility
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the logo for accessibility field
	And user click on done button
	And click on the preview button
	Then updated accessibility Logo changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3413 OCCP-3337:FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure the Accessibility Icon link to open up on same page/new tab
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the accessibility icon link on same page or new tab
	And user click on done button
	And click on the preview button
	Then updated accessibility link changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3410 OCCP-3337:FOOTER:Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configures to open up the Play Store link on same page/new tab
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the android play app target on same page or new tab
	And user click on done button
	And click on the preview button
	Then updated android play store link changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3407 OCCP-3337:FOOTER:Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configures to open up the App Store link on same page/new tab
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the apple app store target on same page or new tab
	And user click on done button
	And click on the preview button
	Then updated apple app store link changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3402 OCCP-3337:FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure to open up the Sign Up Link in same page/new tab
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the weekly flyer target on same page or new tab
	And user click on done button
	#And click on the preview button
	And click on the publish button
	When hit fr login page publish url
	Then updated weekly_flyer target changes should be reflected on the site
	
	@RegressionTest @AEM
	Scenario: TC-3412 OCCP-3337 : FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify authore is able to configure destination url for Accessibility Icon
	When AEM author with access to configure footer load on the page
	And click on edit button
	#And login to AEM using the credential as mentioned in the test data
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	And configure the destination URL for accessibility icon
	And user click on done button
	And click on the preview button
	Then updated accessibility url changes should be reflected on the site
	
	@RegressionTest @AEM @TC-3405
	Scenario: TC-3405 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure Apple App store Logo
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the apple app store logo
	And user click on done button
	And click on the preview button
  Then updated apple app store logo changes should be reflected on the site
	
	@RegressionTest @AEM @TC-3408
	Scenario: TC-3408 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility -Verify author is able to configure Play store Logo
	Given open browser
	When AEM author with access to configure footer load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on footer Pannel
	And click on aem configure button
	And click on download and accessibility tab
	Then configure the google play store logo
	And user click on done button
	And click on the preview button
  Then updated google play store logo changes should be reflected on the site
	