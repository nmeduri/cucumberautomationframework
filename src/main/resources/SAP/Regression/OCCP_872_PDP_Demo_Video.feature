Feature: OCCP-872  PDP: Specifications

	Description: To test the HYBRIS Test Cases for the story OCCP-872
       

        @RegressionTest
		Scenario: TC-1490 HYB:OCCP-872:Verify Demo Video -Media Gallery - mediaType is not null 	
	    Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And user able to see media section with media type
        And media type value should be DEMO_VIDEOS in response
        
        
  