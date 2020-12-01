Feature: OCCP-1641 Footer : Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-1641
	
	
	@RegressionTest @WebView @WideScreen @TC-534
	Scenario: TC-534 Verify display of colour facet within facet panel modal - PLP Desktop/Desktop wide
	When plp url is available
	When plp is displayed
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	Then facet values will displayed as multi select colour swatches
	
	@RegressionTest @WebView @WideScreen @TC-536
	Scenario: TC-536 Verify Display of Colour Facet within horizontal Facet bar above product grid PLP - Desktop/Desktop wide 
	When plp url is available
	When plp is displayed
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	And click on close on facet option
	Then colour facet button is displayed with in horizontal facet bar that appears above the grid results
	
	@RegressionTest @MobileView @TabletView @TC-538
	Scenario: TC-538 Verify the display Colour facet within Facet Panel modal - PLP Mobile 
	When plp url is available
	When plp is displayed
	And click on sort and filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And facet panel modal has color facet
	
	@RegressionTest @WebView @WideScreen @TC-540
	Scenario: TC-540 Verify user selection on colour swatch on PLP - Desktop/Desktop wide  
	When plp url is available
	When plp is displayed
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	Then selected colour name should get added on to the selected section with in the color facet selected colour name should get added on to the selected section with in the color facet
	And click on close on facet option
	Then plp shows only the products with the selected colour
	
	@RegressionTest @MobileView @TabletView @TC-540
	Scenario: TC-540 Verify user selection on colour swatch on PLP - Mobile  
	When plp url is available
	When plp is displayed
	And click on sort and filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	Then selected colour name should get added on to the selected section with in the color facet selected colour name should get added on to the selected section with in the color facet
	And click on close on facet option
	Then plp shows only the products with the selected colour
	
	@RegressionTest @WebView @WideScreen @TC-542
	Scenario: TC-542 Verify the behavior of the PLP when user selects more than 1 colour swatch 
	Given open browser
	When plp url is available
	When plp is displayed
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	And select another color option from facet
	Then selected colour should get append in a comma seprated
	And click on close on facet option
	Then plp shows only the products with the selected colour
	
	@RegressionTest @WebView @WideScreen @TC-542M
	Scenario: TC-542 Verify the behavior of the PLP when user selects more than 1 colour swatch 
	Given open browser
	When plp url is available
	When plp is displayed
	#And click on sort and filters
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	And select another color option from facet
	Then selected colour should get append in a comma seprated
	
	@RegressionTest @WebView @WideScreen @TC-544
	Scenario: TC-544 Verify the behaviour when user deselects a color swatch that has been selected in PLP
	Given open browser
	When plp url is available
	When plp is displayed
	And click on more filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	Then selected colour name should get added on to the selected section with in the color facet selected colour name should get added on to the selected section with in the color facet
	And deselect a selected color swatch
	Then verify the selected colour name should get removed from the selected section
	
	@RegressionTest @MobileView @TabletView @TC-544M
	Scenario: TC-544 Verify the behaviour when user deselects a color swatch that has been selected in PLP
	Given open browser
	When plp url is available
	When plp is displayed
	And click on sort and filters
	Then verify color facet is available with in the facet panel modal
	And click on color facet
	And select color option from facet
	Then selected colour name should get added on to the selected section with in the color facet selected colour name should get added on to the selected section with in the color facet
	And deselect a selected color swatch
	Then verify the selected colour name should get removed from the selected section
	
	
