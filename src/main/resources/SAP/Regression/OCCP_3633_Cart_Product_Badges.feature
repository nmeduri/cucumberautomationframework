Feature: OCCP_3633: Cart - Product Badges

	Description: To test the HYBRIS Test Cases for the story OCCP-3633

				@RegressionTest
				Scenario: TC-3187 , TC-3190 HYB:OCCP-3633:OCCP-4186: Auth user - Verify Get Cart API to  display Product Badges		
				Given Registered user create cart access token is available
				When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When 2172-user hits add to Cart api for authenticated user
    		Then should return 200 ok 
    		When 2172-user hits GET Cart api for authenticated user
    		Then should return 200 ok
    		And recently added product code is available in GET cart authenticateduser response
    		Then all the product Badges should be displayed
    		
    		@RegressionTest
				Scenario: TC-3191 HYB:OCCP-3633:OCCP-4186: Auth user - Verify Get Cart API to  display Product Badges when multiple products are added to cart		
				Given Registered user create cart access token is available
				When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		When user hits multiple products adding to Cart api for authenticated user
    		Then should return 200 ok 
    		When 2172-user hits GET Cart api for authenticated user
    		Then should return 200 ok
    		And recently added product code is available in GET cart authenticateduser response
    		Then all the product Badges should be displayed
    		
    		@RegressionTest
				Scenario: TC-3192 HYB:OCCP-3633:OCCP-4186: Guest user - Verify Get Cart API to  display Product Badges when multiple products are added to cart
				Given Guest user create cart access token is available
   			When guest user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then guid is available in response JSON
    		When Anonymous user Add to cart api is available
    		And multiple products adding to Cart api for guest user
    		Then should return 200 ok
    		When 3994-user hits GET Cart api for Anonymous user
    		Then should return 200 ok
    		And recently added product code is available in GET cart response
				Then all the product Badges should be displayed
				
    		
    		