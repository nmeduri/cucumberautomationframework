Feature: OCCP_1616: Frequently Bought Together

	Description: To test the HYBRIS Test Cases for the story OCCP-1616

	  					
				@RegressionTest
        Scenario: TC-2167 HYB:OCCP-1616:Create Cart and Add to Cart e - Authenticated user -generate oauth token
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		#When user hits the POST api for create cart
    		#Then response JSON should have code
    		#When Authenticated user Add to cart api
    		#When user hits add to Cart api for authenticated user
    		#Then should return 200 ok
    		
    		@RegressionTest1
    		Scenario: TC-2168, TC-3121 ,TC-3188 HYB:OCCP-1616: Guest user - Create cart	
    		Given Guest user create cart access token is available
    		When guest user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then response JSON should have guid
    		
    		@RegressionTest
    		Scenario: TC-2170 ,TC-3119, TC-3185 HYB:OCCP-1616: Registered user - Create cart
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
    	  
        @RegressionTest
				Scenario: TC-2169 HYB:OCCP-1616- OCCP-2448: Guest user - Add to cart
				Given Guest user create cart access token is available
   			When guest user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then guid is available in response JSON
    		When Anonymous user Add to cart api is available
    		And 2169-user hits add to Cart api for Anonymous user
    		Then should return 200 ok
    		When 3994-user hits GET Cart api for Anonymous user
    		Then should return 200 ok
    		And recently added product code is available in GET cart response
    		
    		@RegressionTest
				Scenario: TC-2172 HYB:OCCP-1616- OCCP-2448: Authenticated user -  add Varinat product 
				Given Registered user create cart access token is available
				#When user generate token
    		#Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When 2172-user hits add to Cart api for authenticated user
    		Then should return 200 ok 
    		When 2172-user hits GET Cart api for authenticated user
    		Then should return 200 ok
    		And recently added product code is available in GET cart authenticateduser response
    
   			@RegressionTest
        Scenario: TC-2171 HYB:OCCP-1616-OCCP-2448: Authenticated user - add base product which don’t have variants to Cart
    		Given Registered user create cart access token is available
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When user hits api for base product with no variants to Cart for authenticated user
    		Then should return 400 ok
   			And user should not able to add base product to the cart
    		