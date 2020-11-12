
Feature: OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility

	Description: To test the ADOBE Test Cases for the story OCCP-3337
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-4005	OCCP-3337: FOOTER:Footer E-mail Sign Up, App Download, Accessibility-Verify the redirection when user clicks on Android App Store Logo - Desktop /Desktop Wide
	Given open browser
	When login url is available
	And login page is displayed
	Then standard footer is displayed
	When click on Android App store logo
	Then should redirected to a new tab opens with details on App store download
	When fr locale login url is available
	And login page is displayed
	Then standard footer is displayed
	When click on Android App store logo
	Then should redirected to a new tab opens with details on App store download
	
	@RegressionTest @WebView
	Scenario: TC-3414	OCCP-3337:FOOTER:Footer E-mail Sign Up, App Download, Accessibility-Verify when user hovers over a link an underline is displayed
	When login url is available
	And login page is displayed
	Then standard footer is displayed
	And footer links section should be displayed
	Then link should be underlined when hovers over any link on the footer links section
	When fr locale login url is available
	And login page is displayed
	Then standard footer is displayed
	And footer links section should be displayed
	Then link should be underlined when hovers over any link on the footer links section
	When fr locale login url is available
	And login page is displayed
	Then standard footer is displayed
	And footer links section should be displayed
	Then link should be underlined when hovers over any link on the footer links section
	
	#@RegressionTest @WebScreen @WideScreen @MobileView @TabletView
	Scenario: TC-3396 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify the User is able to click on Learn More CTA
	When footre url is available
	And footer page is displayed for the product
	Then user should be directed to learn more section
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-3397
	Scenario: TC-3397 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify that User is able to click on Accessibility Icon
	When footre url is available
	And footer page is displayed for the product
	And click on accessibility logo
	Then user should be directed to accessibility section on new tab

	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3389
	Scenario: TC-3389 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify that User is able to clicks on "Sign Up "Link
	When footre url is available
	And footer page is displayed for the product
	And click on sign up
	Then user should be directed to sign up section on new tab
	
	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3390
	Scenario: TC-3390 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify the redirection when user clicks on Apple App Store Logo - Desktop /Desktop Wide
	Given open browser
	When footre url is available
	And footer page is displayed for the product
	And click on apple store logo
	Then user should be directed to app store section on new tab
	
	@RegressionTest @WebScreen @WideScreen @MobileView @SmokeTest @TC-3394
	Scenario: TC-3394 Verify that User is able to click on Android Play Store- Mobile- Device is an Android device
	Given open browser
	Given footer url is available
	When footer page is displayed
	And in footer links section click on android play store logo
	Then android play store should be opened with details on app download
	
	@RegressionTest @MobileView @TC-3393
	Scenario: TC-3393 Verify that User is able to click on Apple App Store- Mobile- Device is not an apple device
	Given open browser
	Given footer url is available
	When footer page is displayed
	And in footer links section click on apple app store logo
	Then user should be directed to app store section on new tab
	
	@RegressionTest @MobileView @SmokeTest @TC-3395
	Scenario: TC-3395 Verify that User is able to clicks on Android Play Store Mobile- Device is not an android device
	Given open browser
	Given footer url is available
	When footer page is displayed
	And in footer links section click on android play store logo
	Then android play store should be opened with details on app download
	
	@RegressionTest @MobileView @SmokeTest @TC-3392
	Scenario: TC-3392 Verify that User is able to clicks on Apple App Store- Mobile- Device is an apple device/mobile
		Given open browser
		Given footer url is available
	When footer page is displayed
	And in footer links section access the apple app store logo and verify the url
	

	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3389
	Scenario: TC-3389 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify that User is able to clicks on "Sign Up "Link
	When footre url is available
	And footer page is displayed for the product
	And click on sign up
	Then user should be directed to sign up section on new tab
	
	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3390
	Scenario: TC-3390 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify the redirection when user clicks on Apple App Store Logo - Desktop /Desktop Wide
	Given open browser
	When footre url is available
	And footer page is displayed for the product
	And click on apple store logo
	Then user should be directed to app store section on new tab

@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3388
	Scenario: TC-3388 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify that User is able to view the Footer
	Given open browser
	Given footer url is available
	When footer page is displayed
	Then verify footer links section is displayed with the required fields 	
	And in footer links section click on android play store logo
	Then android play store should be opened with details on app download
  And in footer links section click on apple app store logo
  And should redirected to a new tab opens with details on App store download
  
	