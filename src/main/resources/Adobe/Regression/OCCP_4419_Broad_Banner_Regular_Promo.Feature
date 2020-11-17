Feature: OCCP-4419 Broad Banner - Regular/Promo
	Description: To test the ADOBE Test Cases for the story OCCP-4419
	
	@RegressionTest @MobileView @TC-3518
	Scenario: TC-3518 OCCP-4419 Broad Banner - Regular/Promo- Verify when User is able to view the banner -Stacking in Mobile
	Given open browser
	When Broad banner url is available 
	Then broad banner image is displayed
	And broad banner title is displayed
	And broad banner description is displayed underneath the title
	And broad banner CTA is displayed at bottom
	
	@RegressionTest @WebView @WideScreen @TabletView @TC-3519
	Scenario: TC-3519 OCCP-4419 Broad Banner - Regular/Promo- Verify when User is able to view the banner | Desktop/desktop wide/Tablet
	Given open browser
	When Broad banner url is available 
	Then broad banner image is displayed
	And broad banner title is displayed
	And broad banner description is displayed underneath the title
	And broad banner CTA is displayed at bottom
	
	
	