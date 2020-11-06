Feature: OCCP_1651: PDP: Product Badges (Tested For Life)

	Description: To test the HYBRIS Test Cases for the story OCCP-1651
       
      @RegressionTest
			Scenario: TC-1891 HYB:OCCP-1651-OCCP-2354 : Tested For Life Badge Build
	    Given occ api is available 
			When user hits the GET method product API-1888
	    Then user should be able to see custom badge under badges container
	    And user should be able to see Tested For Life badge under badges container