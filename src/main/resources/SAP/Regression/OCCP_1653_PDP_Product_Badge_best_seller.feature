Feature: OCCP_1653: PDP: Product Badge (best seller)

	Description: To test the HYBRIS Test Cases for the story OCCP-1653
       
      @RegressionTest
			Scenario: TC-1889 HYB:OCCP-1653-OCCP-2365: Best Seller Badge Build
	    Given occ api is available 
			When user hits the GET method product API-1888
	    Then user should be able to see custom badge under badges container
	    And user should be able to see  Best Seller badge under badges container