Feature: OCCP-983 PDP: Features

	Description: To test the ADOBE Test Cases for the story OCCP-983
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-77 Verify user's ability to see product features using a mobile device
	When pdp url is available
	When pdp page is displayed for the product
	Then user must see all features of the product displayed in a bulleted list
	And quit browser
	
	@RegressionTest @WebView @WideScreen @MobileView @TableView
	Scenario: TC-320 Verify the features section is not available in Overview section of a PDP when the product doesn't have features available in product catalog
	When pdp product url is available
	And pdp page is displayed for the product
	Then feature section is not available in overview section
	Then resource section is displayed
	