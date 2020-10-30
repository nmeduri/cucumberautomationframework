Feature: OCCP-3337 Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-3337
	
	
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
	
	
	
	
	
	
	
	