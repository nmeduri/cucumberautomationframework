	Feature: OCCP-2073 BANNER: Information Banner
	Description: To test the ADOBE Test Cases for the story OCCP-2073 
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
  Scenario: TC-2051,TC-2052,TC-2053 User is able to view the Informational Banner Desktop, WideScreen, Mobile
	When pdp url is available
	When pdp page is displayed for the product
	Then access the header and verify if information banner is present above the header
	And user should be able to see configured text and background
	And verify if user is able to see configured hyperlink
	