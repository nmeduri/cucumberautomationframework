Feature: OCCP_1665: PDP: Product Badge (Special Buy)

	Description: To test the HYBRIS Test Cases for the story OCCP-1665
       
      @RegressionTest
			Scenario: TC-1888 HYB:OCCP-1665-OCCP-2366: Special Buy Badge Build
	    Given occ api is available 
			When user hits the GET method product API-1888
	    Then user should be able to see custom badge under badges container
	    And user should be able to see Special Buy badge under badges container