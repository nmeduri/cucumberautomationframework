Feature: OCCP-1642  PDP Gallery Videos

	Description: To test the HYBRIS Test Cases for the story OCCP-1642
       
        @RegressionTest
		Scenario: TC-1494 HYB-OCCP-1642:Verify Image Gallery -Media Gallery - mediaType is not null	
	    Given occ api is available
        When user hits the method GET with out locale for Gallery Videos
        Then response JSON should have medias section
        And user able to see media section with media type
        And media type value should be GALLERY_IMAGE in response
        
        
  