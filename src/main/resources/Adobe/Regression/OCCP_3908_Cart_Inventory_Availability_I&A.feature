Feature: OCCP-3908 Cart - Inventory & Availability (I&A)
	Description: To test the ADOBE Test Cases for the story OCCP-3908
	
	@RegressionTest @WebView 
	Scenario: TC-3689 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify order is able to (Ship to Home)
  Given cart url is available
  When cart page is displayed for the product
  Then within the product card, approximate ship by date is displayed

  @RegressionTest @WebView 
	Scenario: TC-3690 OCCP-3908Cart - Inventory & Availability (I&A) - Verify order is able to (Pickup In-Store)
  Given cart url is available
  When cart page is displayed for the product
  Then within the product card, pickup time and day that product will be available is displayed
  
  @RegressionTest @WebView 
	Scenario: TC-3691 OCCP-3908Cart - Inventory & Availability (I&A) - Verify order is able to (Curbside Pickup Not Available)
  Given cart url is available
  When cart page is displayed for the product
  Then display the messaging 'Curbside Pickup Available At Checkout' or the 'Learn More' CTA 
  
  @RegressionTest @WebView 
	Scenario: TC-3692 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify order is able to (Quantity Selector - Global Banner Max)
  Given cart url is available
  When cart page is displayed for the product
  Then increase the quantity after reaching the maximum limit
  Then informational message You have reached the limit of global banner max value is displayed
  
  @RegressionTest @WebView
	Scenario: TC-3693 OCCP-3908Cart - Inventory & Availability (I&A) - Verify order is able to (Curbside Pickup Not Available)
  Given cart url is available
  When cart page is displayed for the product
  Then verify that the product limit message is displayed
  Then increase the quantity after reaching the maximum limit
  Then informational message You have reached the limit of global banner max value is displayed
 
 @RegressionTest @WebView 
	Scenario: TC-3694 OCCP-3908Cart - Inventory & Availability (I&A) - Verify user is able to order (Need More Order Online - Quantity Selector) 
  Given cart url is available
  When cart page is displayed for the product
  Then verify that the product limit message is displayed
  Then increase the quantity after reaching the maximum limit
  Then informational message You have reached the limit of global banner max value is displayed
 
 @RegressionTest @WebView 
	Scenario: TC-3695 OCCP-3908Cart - Inventory & Availability (I&A) - Verify user is able to order (Need More Order Online - Quantity Selector) 
  Given cart url is available
  When cart page is displayed for the product
  Then increase the quantity after reaching the maximum limit
  Then click on checkout CTA button
  Then Please resolve the issues in your cart before checking out along with a Close CTA toast message should be display  
  Then click on close button on the toast message
 
  @RegressionTest @WebView 
	Scenario: TC-3696 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify user is able to order (Need More Order Online - BOPIS)
  Given cart url is available
  When cart page is displayed for the product
  Then within the product card, pickup time and day that product will be available is displayed
  Then within the product card, approximate ship by date is displayed
 
  @RegressionTest @WebView 
	Scenario: TC-3697 OCCP-3908Cart - Inventory & Availability (I&A) - Verify user is able to order  (Need More Order Online - STH)
  Given cart url is available
  When cart page is displayed for the product
  Then within the product card, pickup time and day that product will be available is displayed
  Then within the product card, approximate ship by date is displayed
 
  