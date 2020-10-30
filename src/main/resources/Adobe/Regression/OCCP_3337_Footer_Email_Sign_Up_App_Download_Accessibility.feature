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
	
	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView
	Scenario: TC-3396 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify the User is able to click on Learn More CTA
	When footre url is available
	And pdp page is displayed for the product
	Then user should be directed to learn more section
	
	@RegressionTest @WebScreen @WideScreen @MobileView @TabletView @TC-3397
	Scenario: TC-3397 OCCP-3337 FOOTER: Footer E-mail Sign Up, App Download, Accessibility - Verify that User is able to click on Accessibility Icon
	Given open browser
	When footre url is available
	And pdp page is displayed for the product
	And click on accessibility logo
	Then user should be directed to accessibility section on new tab
	
	
	