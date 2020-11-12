Feature: OCCP-4028 Two Featured Tiles component

	Description: To test the ADOBE Test Cases for the story OCCP-4028
	
	
	@RegressionTest @WebView @TC-3491
	Scenario: TC-3491	OCCP-4028 Two Featured Tiles component - Verify when User browsing page containing Two Featured Tiles
	Given open browser
	When Two Featured Tiles component url is available
	Then Two Featured Tiles page is displayed
  And title of Two Featured Tiles should be displayed
  And promotion image is displayed
  And promotion title is displayed
  And promotion sub-title is displayed
  And promotion CTA button or link is displayed
  
@RegressionTest @WebView @TC-3492
	Scenario: TC-3492	OCCP-4028 Two Featured Tiles component - Verify when User browsing page containing Two Featured Tiles
	Given open browser
	When Two Featured Tiles component url is available
	Then Two Featured Tiles page is displayed
  And click on the CTA link present in two featured tile page
  And user navigated to corresponding CTA link page
 
 @RegressionTest @WebView @MobileView @TC-3493
	Scenario: TC-3493	OCCP-4028 Two Featured Tiles component - Verify when User browsing component on a Mobile device / screen
	Given open browser
	When Two Featured Tiles component url is available
	Then Two Featured Tiles page is displayed
  And title of Two Featured Tiles should be displayed
  And featured tiles stacked, one below the other should be displayed
  
  @RegressionTest @WebView @WideScreen @TC-3494
	Scenario: TC-3494	OCCP-4028 Two Featured Tiles component - Verify when User browsing component on a Desktop/Desktop wide screen
	Given open browser
	When Two Featured Tiles component url is available
	Then Two Featured Tiles page is displayed
  And title of Two Featured Tiles should be displayed
  And featured tiles stacked, one below the other should be displayed
 