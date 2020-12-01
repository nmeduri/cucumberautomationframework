Feature: OCCP_1654: PDP: Product Badges (New Arrival)

	Description: To test the HYBRIS Test Cases for the story OCCP-1654
       
      @RegressionTest
			Scenario: TC-2187 HYB:OCCP-1654-OCCP-2364: New Arrival Badge display for base product
	    Given occ api is available 
			When user hits the GET method product-1965
	    Then user should be able to see custom badge under badges container
	    And user should be able to see NEWARRIVAL badge under badges container
	    
	    @RegressionTest
			Scenario: TC-2188 HYB:OCCP-1654-OCCP-2364: New Arrival Badge display for variant product
	    Given occ api is available 
			When user hits the GET method base product with variants-2188
	    Then user should be able to see custom badge under badges container
	    And user should be able to see NEWARRIVAL badge under badges container