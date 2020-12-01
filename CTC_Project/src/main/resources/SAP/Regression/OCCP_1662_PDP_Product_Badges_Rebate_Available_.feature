Feature: OCCP_1662: PDP: Product Badges (Rebate Available)

	Description: To test the HYBRIS Test Cases for the story OCCP-1662
       
      @RegressionTest
			Scenario: TC-1965 HYB:OCCP-2377-OCCP-1662 : Rebate badge build
	    Given occ api is available 
			When user hits the GET method product-1965
	    Then user should be able to see custom badge under badges container
	    And user should be able to see INSTANTREBATE badge under badges container