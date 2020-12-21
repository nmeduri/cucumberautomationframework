Feature: 	OCCP-3133 Cart: Eco Cart Fees
Description: To test the ADOBE Test Cases for the story OCCP-3133

    @RegressionTest @WebView @WideScreen @TC-3831
	Scenario: TC-3831 OCCP-3133 Cart - Eco Fees- Verify product quantity selected = 1
	Given cart url is available
    When cart page is displayed for the product
    And the quantity selected is one
    Then eco fees should be added to the price
    Then message should be shown to the user indicating that eco fees is included in the total
    Then an info icon should be present next to the message
    When fr cart url is available
    And the quantity selected is one
    Then eco fees should be added to the price
    Then message should be shown to the user indicating that eco fees is included in the total
    Then an info icon should be present next to the message
    
    
    @RegressionTest @WebView @WideScreen @TC-3833
	Scenario: TC-3833 OCCP-3133 Cart - Eco Fees- Verify Tool Tip Display
	Given cart url is available
    When cart page is displayed for the product
    And click on the info icon
    Then tool tip explaining eco fees should be displayed
    When fr cart url is available
    And click on the info icon
    Then tool tip explaining eco fees should be displayed
    
    @RegressionTest @WebView @WideScreen @TC-5440
	Scenario: TC-5440 OCCP-3133 Cart - Eco Fees- Verify Tool Tip Display- User clicks on close icon "x"
	When open browser
	Given cart url is available
    When cart page is displayed for the product
    And click on the info icon
    Then tool tip explaining eco fees should be displayed
    And click on eco tool tip close button
    Then echo tool tip should be closed
    When fr cart url is available
    And click on the info icon
    Then tool tip explaining eco fees should be displayed
    And click on eco tool tip close button
    Then echo tool tip should be closed