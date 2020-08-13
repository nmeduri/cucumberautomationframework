Feature: OCCP-1648 PDP: Product Badges (Exclusive)

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario: TC-1645 HYB-OCCP-1650 - OCCP-2570 HYB:Dev:Perfect Gift badge build 
	    Given occ api is available
        When user hits locale api
        Then user should be able to see badge value as PERFECTGIFT
       
        
  