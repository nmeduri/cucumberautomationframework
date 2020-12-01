Feature: OCCP-871 PDP Installations

	Description: To test the ADOBE Test Cases for the story OCCP-871
	   
    @RegressionTest @WebView @WideScreen @SmokeTest
    Scenario: TC-116, TC-1305 Verify the functionality of the PDP page when a product is eligible for service installation  
    When pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    Then Get it installed indicator is displayed on the pdp
    Then message available at checkout is displayed on the pdp
    Then installation icon is displayed on pdp
    Then tool tip icon is displayed on installation indicator
    And scroll up to page
    And click on tool tip icon
    Then tool tip box opens and tool tip message along with close button is displayed 
    And click on close button on installation indicator
    And scroll up to page
    And scroll up to page
    And click on tool tip icon
	Then tool tip box opens and tool tip message along with close button is displayed 
	
	@RegressionTest @MobileView @TabletView
    Scenario: TC-116, TC-1303 Verify the functionality of the PDP page when a product is eligible for service installation 
    When pdp url is available
    When pdp page is displayed for the product
    Then Get it installed indicator is displayed on the pdp
    Then message available at checkout is displayed on the pdp
    Then installation icon is displayed on pdp
    Then tool tip icon is displayed on installation indicator
    And scroll up to page
    And click on tool tip icon
    Then tool tip box opens and tool tip message along with close button is displayed 
    And click on close button on installation indicator
    And click on tool tip icon
	Then tool tip box opens and tool tip message along with close button is displayed 
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-118 User verifies no indicator for service installation is displayed on PDP when the product is not eligible for service installation 
	Given pdp url for no service installation
	When pdp page is displayed for the product
	Then no indicator for service installation is displayed
	Then no corresponding message is displayed
	Then no corresponding tooltip is displayed
	
	@RegressionTest @WebView @WideScreen @TC-1304
	Scenario: TC-1304 User verifies no indicator for service installation is displayed on PDP when the product is not eligible for service installation 
	Given pdp url for no service installation
	When pdp page is displayed for the product
	Then no indicator for service installation is displayed
	Then no corresponding message is displayed
	Then no corresponding tooltip is displayed
	
	
	