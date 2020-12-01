Feature: OCCP-3132-Cart Core Charges
Description: To test the ADOBE Test Cases for the story OCCP-3132

	@RegressionTest @WebView @WideScreen @MobileView @TC-3837
	Scenario: TC-3837 OCCP-3132 Cart - Core Charges- Verify Product quantity selected = 1
	Given open browser
	Given cart url is available
  When cart page is displayed for the product
  Then a message should be shown to the user indicating that core fees is included in the total

  @RegressionTest @WebView @WideScreen @MobileView @TC-3838
	Scenario: TC-3838 OCCP-3132 Cart - Core Charges- Verify Product quantity selected is greater than 1
	Given open browser
	Given cart url is available
  When cart page is displayed for the product
  And cart page product quantity is selected grater than one
  Then a message should be shown to the user indicating that core fees is included in the total

  @RegressionTest @WebView @WideScreen @MobileView @TC-3839
	Scenario: TC-3839 OCCP-3132 Cart - Core Charges- Verify Tool Tip Display
	Given open browser
	Given cart url is available
  When cart page is displayed for the product
  Then click on the tool tip displayed beside the core charges fee
  And validate the tool tip message displayed
  And click on close button on tool tip message
  And validate the tooltip message is not displayed

  