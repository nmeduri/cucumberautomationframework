	And Available Service description is displayed
	And Available Service price is displayed
	And Add Service to Cart” CTA is displayed
	
	@RegressionTest @WebView @TC-3524
	Scenario: TC-3524	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify Customer clicks “Add Service to Cart” (Error)
	Given open browser
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
 	And Add Service to Cart” CTA is displayed
 	Then click on add service to cart button
 	And validate the error message displayed
 	
 	@RegressionTest @WebView @TC-3521
	Scenario: TC-3521	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify  Customer views Applicable Service Add-On (Multiple Options Collapsed)
	Given open browser
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
  Then Service Add-On Available box is displayed
 	And messaging for number of services available is be displayed
 	And clickable expansion chevron is displayed
 	
 	@RegressionTest @WebView @TC-3522
	Scenario: TC-3522	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify Customer views Applicable Service Add-Ons (Multiple Options Expanded)
	Given open browser
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
  Then Service Add-On Available box is displayed
 	And clickable expansion chevron is displayed
 	Then click on the expandable chevron
 	And Service Add-Ons options are displayed
 	And the Service Add-Ons Available box is expanded
	And Available Service description is displayed
	And Available Service price is displayed
	And continue to Cart CTA is displayed	
	
	@RegressionTest @WebView @TC-3523
	Scenario: TC-3523	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify  Customer clicks “Add Service to Cart” (Success)
	Given open browser
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
 	And Add Service to Cart” CTA is displayed
 	Then click on the expandable chevron
 	Then select the service addon option
 	Then click on add service to cart button
 	And validate the success message displayed