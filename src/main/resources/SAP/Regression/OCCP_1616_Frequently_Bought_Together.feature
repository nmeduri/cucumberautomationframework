Feature: OCCP_1616: Frequently Bought Together

	Description: To test the HYBRIS Test Cases for the story OCCP-1616

				@RegressionTest
        Scenario: TC-2167 Create Cart and Add to Cart e - Authenticated user -generate oauth token
    		Given access token is available
    		When user generate token
    		Then user get the token
    		Given access token is available
    		When user hits add product api for authenticated user
    		Then should return 201 created
    		And user hits delete api for authentication user
    		Then should return 200 ok   	
    		
    		@RegressionTest
    		Scenario: TC-2090 Get product info - Medias	
				Given occ api is available
    		When user hits the GET api with locale en
    		Then response JSON should have medias section 