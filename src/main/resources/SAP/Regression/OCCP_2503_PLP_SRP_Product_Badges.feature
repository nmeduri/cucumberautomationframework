Feature: OCCP_2503: PLP/SRP - Product Badges

	Description: To test the HYBRIS Test Cases for the story OCCP-2503
	
				@RegressionTest
    		Scenario: TC-3083 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) -Verify status code 400
    		Given PLP occ api is available
    		When hit the product list api without giving base store id
    		Then should return 400 ok
   			And user should able to see error message
   			
   			@RegressionTest
    		Scenario: TC-3084 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) -  Verify status code 404
    		Given plp occ api is available for 404 status
    		When user hits product list api
    		Then should return 404 not found
   			And should get error message as there is no resource for path in response
   			
   			@RegressionTest
    		Scenario: TC-3085 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP)- Verify API providing valid Base store id
    		Given PLP occ api is available
    		When hits the product list api
    		Then should return 200 ok
    		Then should not have price data
    		
    		@RegressionTest
    		Scenario: TC-3086 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) - with single Base product
    		Given PLP occ api is available
    		When hits single base product list api
    		Then the badges that are configured for the product should return in the json response
    		
    		@RegressionTest
    		Scenario: TC-3087 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) - with single variant product
    		Given PLP occ api is available
    		When hits single variant product list api
    		Then the badges that are configured for the product should return in the json response
    		
    		@RegressionTest
    		Scenario: TC-3088,TC-3090, TC-3091 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) - with multiple Base product
    		Given PLP occ api is available
    		When hits the multiple base products list api
    		Then badges that are configured for the multiple products should return in the json response
    		
    		@RegressionTest
    		Scenario: TC-3089 HYB:OCCP-2503:OCCP-3857: Implement outbound OCC API for Product Badges(PLP) - with multiple variant product
    		Given PLP occ api is available
    		When hits the multiple variant products list api
    		Then badges that are configured for the multiple products should return in the json response
    		
    		@RegressionTest1
    		Scenario: TC-3092 HYB:OCCP-2503:OCCP-3857: Verify Product has variants and badges are applicable only to certain variants
    		Given PLP occ api is available
    		When hit product list api for product has variants and badges are applicable only to certain variants
    		Then badges that are configured for the multiple products should return in the json response
    		
    		
    		
    		
    		