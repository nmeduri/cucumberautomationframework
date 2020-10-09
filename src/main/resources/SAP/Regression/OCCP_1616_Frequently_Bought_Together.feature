Feature: OCCP_1616: Frequently Bought Together

	Description: To test the HYBRIS Test Cases for the story OCCP-1616

	  					
				@RegressionTest
        Scenario: TC-2167 HYB:OCCP-1616:Create Cart and Add to Cart e - Authenticated user -generate oauth token
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When user hits add to Cart api for authenticated user
    		Then should return 200 ok   	
    		
    		@RegressionTest
    		Scenario: TC-2168 HYB:OCCP-1616: Guest user - Create cart	
    		Given Guest user create cart access token is available
    		When guest user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then response JSON should have guid
    		
    		@RegressionTest
    		Scenario: TC-2170 HYB:OCCP-1616: Registered user - Create cart
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then response JSON should have guid
    		
    		@RegressionTest
    		Scenario: TC-2173 HYB:OCCP-1616: Add to cart for authenticated user - check status 201 (Created)
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then should return 201 created
    		
    		@RegressionTest
    		Scenario: TC-2174 HYB:OCCP-1616:Add to cart for authenticated user - check status 400 (Bad Request)
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When 400 status code when user hits add to Cart api for authenticated user
    		Then should return 400 bad request
        
        @RegressionTest
    		Scenario: TC-2176 HYB:OCCP-1616:Add to cart for authenticated user-check status 403 (Forbidden)
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Status 403 Authenticated user Add to cart access token is available
    		Then user hits add to Cart api for authenticated user
    		Then should return 403_forbidden
        
        @RegressionTest
    		Scenario: TC-2177 HYB:OCCP-1616:Add to cart for authenticated user-check status 404 (Not Found)
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When 404 status code when user hits add to Cart api
    		Then user hits add to Cart api for authenticated user
    		Then should return 404 not found
        
        @RegressionTest
    		Scenario: TC-2175 HYB:OCCP-1616:Add to cart for authenticated user - check status 401 (Unauthorized)
    		Given Authenticated user Add to cart api
    		When user hits invalid token	
    	  Then should return 401 unauthorized
    	  
        