Feature: OCCP-3631 Cart - Quantity Selector

	Description: To test the ADOBE Test Cases for the story OCCP-3631
	
	@RegressionTest @WebView @TC-3556
	Scenario: TC-3556	OCCP-3631 Cart - Quantity Selector- Verify user views the quantity selector box
	Given open browser
	When PDP product page is available
	Then Current quantity of the product in cart is displayed
	And Plus CTA to increase the quantity is displayed
 	And Minus CTA to decrease the quantity is displayed
 	And Minus CTA is disabled when quantity is 1
 	And Quantity should not be reduced to zero
 	And Quantity should not exceed the maximum defined quantity
 	
@RegressionTest @WebView @TC-3557
	Scenario: TC-3557	OCCP-3631 Cart - Quantity Selector- Verify user updates quantity
	Given open browser
	When PDP product page is available
	Then Current quantity of the product in cart is displayed
	And Plus CTA to increase the quantity is displayed
	And click plus CTA sign
	Then validate product quantity increase by 1 
 