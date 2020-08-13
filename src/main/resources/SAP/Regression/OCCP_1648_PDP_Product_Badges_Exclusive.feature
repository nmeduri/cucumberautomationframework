Feature: OCCP-1648 PDP: Product Badges (Exclusive)

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @SmokeTest
		Scenario: TC-1644 HYB-OCCP-1648 - OCCP-2348 HYB: DEV: Exclusive Badge Build	
	    Given occ api is available
        When user hits locale api
        Then user should be able to see badge value as Exclusive
       
        
  