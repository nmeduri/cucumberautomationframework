Feature: OCCP-1648 PDP: Product Badges (Exclusive)

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario:  TC-1646 HYB-OCCP-1656 - OCCP-2363 HYB: DEV: Online Only Badge Build	
	    Given occ api is available
        When user hits GET method for product badges
        Then user should be able to check badge value onlineonly in JSON response
        
  