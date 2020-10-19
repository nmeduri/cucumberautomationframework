Feature: OCCP-1650 PDP: Product Badges PERFECTGIFT

	Description: To test the HYBRIS Test Cases for the story OCCP-1650
       

        @RegressionTest
		Scenario: TC-1645 HYB-OCCP-1650 - OCCP-2570 HYB:Dev:Perfect Gift badge build 
	    Given occ api is available
        When user hits GET api
        Then user should be able to check badges detail as PERFECTGIFT in response
       
        
  