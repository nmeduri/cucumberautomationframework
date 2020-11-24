Feature: OCCP_3588: Cart: Order Summary - Shipping Fees

	Description: To test the HYBRIS Test Cases for the story OCCP-3588
	
	 	@RegressionTest
    Scenario: TC-4111 HYB:OCCP-3588-OCCP-5219-Cart: Order Summary- Shipping Fees calculation-Update Cart-as Anonymous user-with delivery method-STH-with base product
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then guid is available in response JSON
    Then response JSON should have code
    When Anonymous user Add to cart api is available
    When user hits add to Cart api with base product STH for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    When user hits update Cart api with base product STH for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4113 HYB:OCCP-3588-OCCP-5219-Cart: Order Summary - Shipping Fees calculation-Update Cart - as Anonymous user - with delivery method - BOPIS
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then guid is available in response JSON
    Then response JSON should have code
    When Anonymous user Add to cart api is available
    When user hits add to Cart api with base product for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    When user hits update Cart api with base product for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4115 HYB:OCCP-3588-OCCP-5219:  HYB:DEV:Cart: Order Summary-Shipping Fees calculation-Update Cart-as Authenticated user-with delivery method- STH
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with base product STH for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    When user hits update Cart api with base product for authenticated user-STH
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4117 HYB:OCCP-3588-OCCP-5219:  HYB:DEV:Cart: Order Summary-Shipping Fees calculation-Update Cart-Authenticated user - with delivery method-BOPIS
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with base product for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    When user hits update Cart api with base product BOPIS for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4150 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary - Shipping Fees calculation-Add To Cart- Base  Product -Anonymous user- Delivery menthod - STH
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then guid is available in response JSON
    Then response JSON should have code
    When Anonymous user Add to cart api is available
    And user hits add to Cart api with base product STH for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4154 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary - Shipping Fees calculation-Add To Cart- Base  Product -Authenticated user- Devliery menthod - STH
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with base product STH for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4149 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary - Shipping Fees calculation-Add To Cart-Variant Product -Anonymous user- Devliery menthod - STH
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3994-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4151 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary - Shipping Fees calculation-Add To Cart-Variant Product -Anonymous user- Devliery menthod - BOPIS
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When hits add to Cart api for Anonymous user-BOPIS option
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
    @RegressionTest
    Scenario: TC-4153 HYB:OCCP-3588-OCCP-5437-Cart: Shipping Fees calculation-Add To Cart-Variant Product -Authenticated user- Devliery menthod - STH
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api with STH for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4155 HYB:OCCP-3588-OCCP-5437-Cart: Shipping Fees calculation-Add To Cart-Variant Product -Authenticated user- Devliery menthod - BOPIS
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api BOPIS for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
    @RegressionTest
    Scenario: TC-4110 HYB:OCCP-3588-OCCP-5219 -Cart: Order Summary- Shipping Fees calculation-Update Cart- as Anonymous user- with delivery method-STH-Variant Product
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3994-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits update Cart api for Anonymous user
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    And quantity should be displayed in update cart response 
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4112 HYB:OCCP-3588-OCCP-5219-Cart: Order Summary- Shipping Fees calculation-Update Cart-as Anonymous user- with delivery method- BOPIS-Variant Product
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When hits add to Cart api for Anonymous user-BOPIS option
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api BOPIS for Anonymous user-variant Product
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    And quantity should be displayed in update cart response 
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
    @RegressionTest
    Scenario: TC-4114 HYB:OCCP-3588-OCCP-5219-Cart: Order Summary- Shipping Fees calculation-Update Cart- as Authenticated user- with delivery method- STH
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api with STH for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api STH for Authenticated user-variant Product
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    And quantity should be displayed in update cart response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4116 HYB:OCCP-3588-OCCP-5219-Cart: Order Summary - Shipping Fees calculation-Update Cart- as Authenticated user- with delivery method - BOPIS
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api BOPIS for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api BOPIS for Authenticated user-variant Product
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    And quantity should be displayed in update cart response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
    @RegressionTest
    Scenario: TC-4152 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary- Shipping Fees calculation-Add To Cart- Standalone  Product -Ananymous user- Delivery menthod - BOPIS
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When hits add to Cart api for Anonymous user standalone product-BOPIS option
    When hits add to Cart api for Anonymous user standalone product-BOPIS option
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container 
    And deliveryMode BOPIS is available in json response
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
    @RegressionTest1
    Scenario: TC-4156 HYB:OCCP-3588-OCCP-5437-Cart: Order Summary - Shipping Fees calculation-Add To Cart- Standalone  Product -Authenticated user- Devliery menthod - BOPIS
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api for Authenticated user standalone product-BOPIS option
    #And hits add to Cart api for Authenticated user standalone product-BOPIS option
    #And user hits add to Cart api BOPIS for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And deliveryMode BOPIS is available in json response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    Then Delivery cost should displayed in GET cart response for BOPIS
    
     
    
    
    
    