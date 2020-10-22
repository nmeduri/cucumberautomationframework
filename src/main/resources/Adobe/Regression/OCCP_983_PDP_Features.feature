Feature: OCCP-983 PDP: Features

	Description: To test the ADOBE Test Cases for the story OCCP-983
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-77 Verify user's ability to see product features using a mobile device
	When pdp url is available
	When pdp page is displayed for the product
	Then user must see all features of the product displayed in a bulleted list
	And quit browser
	