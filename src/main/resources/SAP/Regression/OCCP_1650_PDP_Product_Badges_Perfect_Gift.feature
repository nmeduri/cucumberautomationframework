Feature: OCCP-1650 PDP: Product Badges PERFECTGIFT

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario: TC-1645 HYB-OCCP-1650 - OCCP-2570 HYB:Dev:Perfect Gift badge build 
	    Given occ api is available
        When user hits GET api
        Then user should be able to see badge value as PERFECTGIFT
       
        
  