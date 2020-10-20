Feature: OCCP-1574 PDP: Select Variant

	Description: To test the ADOBE Test Cases for the story OCCP-1574

	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-328 Verify the display of the PDP when a product has multiple sizes available with no size guide 
	Given open browser 
	When pdp url is available
	When pdp page is displayed for the product
	Then the swatch with sizes is displayed
	Then the size label is displayed
	Then unavailabe size is displayed
	And select one of the available size
	Then available size is successfully selected
	Then the lable of selected size is displayed
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-330 Verify the display of the PDP when a product has multiple sizes and colours
	Given pdp url is available
	When pdp page is displayed for the product
	Then the colour selector is displayed first
	Then the size selector is displayed second
	And a default color is displayed
	Then unavailabe size is displayed
	And select one of the available size
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-325  Verify the ability of a user to select another color variant
	Given pdp url is available
	When pdp page is displayed for the product
	Then the colour selector is displayed first
	Then a default color is displayed
	And Select a different colour variant
	Then the lable of selected color is displayed
	

	
	