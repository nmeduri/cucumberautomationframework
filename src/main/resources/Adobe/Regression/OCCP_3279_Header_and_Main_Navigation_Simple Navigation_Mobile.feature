Feature: OCCP-3279 Header and Main Navigation - Simple Navigation  Mobile

	Description: To test the ADOBE Test Cases for the story OCCP-3279
		
	@RegressionTest @MobileView @TC-3830
	Scenario: TC-3830	OCCP-3279 Header and Main Navigation - Simple Navigation  Mobile- Verify Options available on the Simple header  Checkout flow  Mobile
    When checkout url is available
	When checkout page is displayed
	Then brand logo should be displayed
	And contact number of customer service should be displayed
    And Click on the customer service number