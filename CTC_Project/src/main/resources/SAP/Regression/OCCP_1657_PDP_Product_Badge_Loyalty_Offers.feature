Feature: OCCP_1657: PDP: Product Badge (Loyalty offers)

	Description: To test the HYBRIS Test Cases for the story OCCP-1657
       
      @RegressionTest
			Scenario: TC-1966 HYB:OCCP-1657-OCCP-2549 : Loyalty offers Badge Build
	    Given occ api is available 
			When user hits the GET method product API-1966
	    Then user should be able to see custom badge under badges container
	    And user should be able to see LOYALTYOFFERS badge under badges container