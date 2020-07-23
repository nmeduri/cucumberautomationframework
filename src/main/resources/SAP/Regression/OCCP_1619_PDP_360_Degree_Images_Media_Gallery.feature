Feature: OCCP-1619 PDP: 360 Degree Images -Media Gallery

	Description: To test the HYBRIS Test Cases for the story OCCP-1619
       
        @Regression
		Scenario: TC-1462 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - is null or not null 	
	    Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        
        @RegressionTest
        Scenario: TC-1463 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - code
        Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And  user able to see media section with code
        And  user should be able to see media section with code and its value
        
        @RegressionTest
        Scenario: TC-1464 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - mediaType is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And user able to see media section with media type
        And media type value should be Images_360 in response
        
        @RegressionTest
        Scenario: TC-1465 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - mediaType is null 
        Given occ api is available
        When user hits the GET api without locale
        Then medias section should have in response without mediaType name and its value
        
        @RegressionTest
        Scenario: TC-1466 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias section with name and its value