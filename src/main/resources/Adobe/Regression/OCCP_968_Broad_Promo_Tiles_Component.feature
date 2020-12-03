Feature: OCCP-968 : Broad Promo Tiles component
	Description: To test the ADOBE Test Cases for the story OCCP-968
		
	@RegressionTest @WebView @WideScreen @MobileView @TC-3506
	Scenario: TC-3506 OCCP-968: Verify user is able to view Broad Promo Tiles component 
	Given open browser
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	And user should be able to see broad promo tiles
	When broad promo tiles FR url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	And user should be able to see broad promo tiles
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-3507 OCCP-968: Broad Promo Tiles component with image, title, sub-title, save story and CTA is shown to user
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	Then user should be able to see broad promo tiles
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	And promotion image should display for each tile
	And promotion title should display for each tile
	And promotion sub-title should display for each tile
	And promotion CTA button should display for each tile
	And promotion key-line should display for each tile
	And promotion offer should display for each tile
	When broad promo tiles FR url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	Then user should be able to see broad promo tiles
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	And promotion image should display for each tile
	And promotion title should display for each tile
	And promotion sub-title should display for each tile
	And promotion CTA button should display for each tile
	And promotion key-line should display for each tile
	And promotion offer should display for each tile
	
	@RegressionTest @MobileView
	Scenario: TC-3507 OCCP-968: Broad Promo Tiles component with image, title, sub-title, save story and CTA is shown to user
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	Then user should be able to see broad promo tiles
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	And mobile promotion image should display for each tile
	And promotion title should display for each tile
	And promotion sub-title should display for each tile
	And promotion CTA button should display for each tile
	And promotion key-line should display for each tile
	When broad promo tiles FR url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	Then user should be able to see broad promo tiles
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	And mobile promotion image should display for each tile
	And promotion title should display for each tile
	And promotion sub-title should display for each tile
	And promotion CTA button should display for each tile
	And promotion key-line should display for each tile
	
	#@RegressionTest @WebView @WideScreen 
	Scenario: TC-3508 OCCP-968: Verify user is able to click on a featured tile button/image and navigate to the corresponding page 
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user should be able to see broad promo tiles
	And promotion image should display for each tile
	When promotion CTA button is clickable
	Then user should be on automotive page
	When promotion image is clickable
	Then user should be on automotive page
	When broad promo tiles FR url is available
	When broad promo tiles page is displayed
	Then user should be able to see broad promo tiles
	And promotion image should display for each tile
	When promotion CTA button is clickable
	Then user should be on automotive page
	When promotion image is clickable
	Then user should be on automotive page
	
	#@RegressionTest @MobileView
	Scenario: TC-3508 OCCP-968: Verify user is able to click on a featured tile button/image and navigate to the corresponding page 
	When broad promo tiles FR url is available
	When broad promo tiles page is displayed
	Then user should be able to see broad promo tiles
	And mobile promotion image should display for each tile
	When mobile promotion CTA button is clickable
	Then user should be on automotive page
	When mobile promotion image is clickable
	Then user should be on automotive page
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user should be able to see broad promo tiles
	And mobile promotion image should display for each tile
	When mobile promotion image is clickable
	Then user should be on automotive page
	When mobile promotion CTA button is clickable
	Then user should be on automotive page
	
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-3509 OCCP-968: A user is able to browse promo and able to see tiles in a single row one next to the other 
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	And user should be able to see broad promo tiles
	And 2broad promo tiles should display the tiles in a single row,one next to the other
	
	@RegressionTest @MobileView
	Scenario: TC-3510 OCCP-968: A user is able to browse promo and  the promo tiles stacked one below the other in both variations
	When broad promo tiles EN url is available
	When broad promo tiles page is displayed
	Then user scrolls to the broad promo tiles 
	Then user should be able to see broad promo tiles
	And Broad promo tiles should be stacked one below the other
	
	
	