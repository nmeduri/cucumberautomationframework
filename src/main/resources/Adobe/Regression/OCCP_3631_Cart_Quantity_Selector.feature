Feature: OCCP-3631 Cart - Quantity Selector

	Description: To test the ADOBE Test Cases for the story OCCP-3631
	
	@RegressionTest @WebView @TC-3556
	Scenario: TC-3556	OCCP-3631 Cart - Quantity Selector- Verify user views the quantity selector box
	When PDP product page is available
	Then Current quantity of the product in cart is displayed
	And Plus CTA to increase the quantity is displayed
 	And Minus CTA to decrease the quantity is displayed
 	And Minus CTA is disabled when quantity is 1
 	And Quantity should not be reduced to zero
 	And Quantity should not exceed the maximum defined quantity
 	
	@RegressionTest @WebView @TC-3557
	Scenario: TC-3557	OCCP-3631 Cart - Quantity Selector- Verify user updates quantity
	When PDP product page is available
	Then Current quantity of the product in cart is displayed
	And Plus CTA to increase the quantity is displayed
	And click plus CTA sign
	Then validate product quantity increase by 1 
 
 	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4564	OCCP-3631 Cart- Quantity Selector- Verify user enters in number greater than "maximum quantity for product" in the quantity selector box
	When cart page url is available
	Then cart page title is displayed
	And quantity selector box is displayed
	When user enters number greater than maximum quantity for product in the quantity selector box
	Then error message maximum quantity of the product is exceeded is displayed
	And The quantity selector box is highlighted
	When enter number in quantity box that is not integer
	Then user do not allowed  to enter the number that is not integer value
	When user enter number in the quantity box that is greater than maximum quantity
	Then greater than maximum quantity is not updated in the quantity box
	
	#@RegressionTest1 @WebView @WideScreen @MobileView
	Scenario: TC-4561	OCCP-3631 Cart - Quantity Selector- Verify user updates quantity- User enters in number in the quantity selector box
	When cart page url is available
	Then cart page title is displayed
	And quantity selector box is displayed
	When user enters number is greater than 0 and is equal to or lessthan maximum quantity in quantity selector box
	Then The updated quantity must be number
	And Price of the product updated accordingly 
	
	
	