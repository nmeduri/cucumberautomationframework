Feature: OCCP-1652 PDP: Product Badges (TOP RATED)

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario: TC-1647 HYB-OCCP-1652 - OCCP-2363 HYB: DEV: Top Rated Badge Build		
	    Given occ api is available
        When user hits GET api
        Then user should be able to see badge value as Top Rated
       
        
  