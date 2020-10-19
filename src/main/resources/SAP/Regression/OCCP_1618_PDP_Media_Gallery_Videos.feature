Feature: OCCP-1618  PDP Media Gallery Videos

	Description: To test the HYBRIS Test Cases for the story OCCP-1618
       

        @RegressionTest
		Scenario: TC-1493 HYB-OCCP-1618-OCCP-2316:Verify Media Gallery Videos -Media Gallery - mediaType is not null  	
	    Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And user able to see media section with media type
        And media type value should be DEMO_VIDEOS in response
        
        
  