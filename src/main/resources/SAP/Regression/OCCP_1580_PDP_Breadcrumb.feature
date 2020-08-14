Feature: OCCP-869  PDP: Specifications

	Description: To test the HYBRIS Test Cases for the story OCCP-869
       

        @RegressionTest
		Scenario: TC-1460 HYB:OCCP-1580:OCCP-2430:Verify Breadcrumb 	
	    Given occ api is available
        When user hits GET api
        Then user should be able to find category code and name
        
        
  