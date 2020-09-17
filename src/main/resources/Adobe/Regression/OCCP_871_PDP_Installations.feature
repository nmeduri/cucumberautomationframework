Feature: OCCP-871 PDP Installations

	Description: To test the ADOBE Test Cases for the story OCCP-871
       
    @RegressionTest @WebView @WideScreen
    Scenario: TC-116, TC-1305 Verify the functionality of the PDP page when a product is eligible for service installation  
    Given pdp url is available
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
	And user clicks on any where
	
	@RegressionTest @MobileView
    Scenario: TC-116, TC-1303 Verify the functionality of the PDP page when a product is eligible for service installation  
    Given pdp url is available
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