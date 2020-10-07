Feature: OCCP_4098: Update implemented OCC API to include baseStoreId

	Description: To test the HYBRIS Test Cases for the story OCCP-4098
	
		    @RegressionTest
    		Scenario: TC-3107 HYB:OCCP-4444-OCCP-4098: Update implemented OCC API to without  baseStoreId - PDP
    		Given occ api is available
    		When user hits pdp get method api without base store id
    		Then should return 400 bad request
    		
    		@RegressionTest
            Scenario: TC-3109 HYB:OCCP-4444-OCCP-4098: Update implemented OCC API to without baseStoreId - Add to Cart
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have code
    		When Authenticated user Add to cart api
    		Then user hits addtoCart api for authenticated user without base store id
    		Then should return 400 bad request
    			
    		Scenario: TC-3106,TC-1330 Verify Update implemented OCC API to include baseStoreId - PDP	
    		Given occ api is available 
			When user hits the GET api with Default
	        Then user should able to see the product brand title in the JSON response
    		
    		Scenario: TC-3108 ,TC-2173: Verify Update implemented OCC API to include baseStoreId - Add to Cart
    		Given Registered user create cart access token is available
    		When user generate token
    		Then user get the token
    		When user hits the POST api for create cart
    		Then response JSON should have created cart
    		Then response JSON should have code
    		Then should return 201 created