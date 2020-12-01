Feature: OCCP_1309: Cart - View Filled Cart

	Description: To test the HYBRIS Test Cases for the story OCCP-1309
 					
		@RegressionTest
    Scenario: TC-3994 HYB:OCCP-1309-OCCP-2835: Anonymous user - Build Api to support to modify and save STH  option -  Update Cart   		
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
    #Then ship to home should be displayed
    And quantity should be displayed in update cart response
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-3999 HYB:OCCP-1309-OCCP-2835: Build Api to support to modify and save STH option -Update Cart - Verify status code 400  		
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
    When 3999-user hits update Cart api for Anonymous user
    Then should return 400 ok
    
    @RegressionTest
    Scenario: TC-4000 HYB:OCCP-1309-OCCP-2835: Build Api to support to modify and save STH option -Update Cart -Verify status code 404
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
    When 4000-user hits update Cart api for Anonymous user
    Then should return 404 not found
    
    @RegressionTest
    Scenario: TC-4100 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save STH option - Add to Cart- Anonymous user
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
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4101 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save BOPIS option - Add to Cart- Anonymous user
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
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-3998 HYB:OCCP-1309-OCCP-2835- Auth user - Build Api to support to modify and save STH and BOPIS  option - Update Cart with base product  		
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3976-user hits add to Cart api for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    When user hits update Cart api with base product for authenticated user-STH
    Then should return 400 ok
    And user should not able to add base product to the cart
      
    @RegressionTest
    Scenario: TC-4102 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save STH and BOPIS option - Add to Cart- Anonymous user-Base product
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then guid is available in response JSON
    Then response JSON should have code
    When Anonymous user Add to cart api is available
    When user hits add to Cart api with base product for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4103 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save STH option - Add to Cart- Auth user
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
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And quantity should be displayed in GET cart response
   
    @RegressionTest
    Scenario: TC-4104 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save STH and BOPIS option - Add to Cart- Auth user
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
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-4105 HYB:OCCP-1309-OCCP-5439: Build Api to support to modify and save STH and BOPIS option - Add to Cart- Auth  user-Base product
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with base product for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
		Scenario: TC-4141 HYB:OCCP-1309-OCCP-2834: Verify attribute  "isServiceProduct " in product information API
	  Given occ api is available
    When user hits GET api
    Then isServiceProduct should be displayed true or false
    
    @RegressionTest
    Scenario: TC-4142 HYB:OCCP-1309-OCCP-2834: GetCart API - Verify display of "Add deliveryPointOfService" and "deliveryMode" attribure when API is Set to DEFAULT
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart DEAFULT api for Anonymous user
    Then should return 200 ok
    When user hits GET Cart DEFAULT api for Anonymous user
    Then should return 200 ok
    Then Add deliveryPointOfService is available in json response
    And deliveryMode is available in json response
    
    @RegressionTest
    Scenario: TC-4143 HYB:OCCP-1309-OCCP-2834: GetCart API - Verify display of "Add deliveryPointOfService" and "deliveryMode" attribure when API is Set to FULL
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When hits add to Cart api for Anonymous user-BOPIS option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then Add deliveryPointOfService is available in json response
    And deliveryMode is available in json response
    
    @RegressionTest
    Scenario: TC-4144 HYB:OCCP-1309-OCCP-2834: Verify when user is on PDP and wants to add same product variant to cart with different fulfillment options
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
    When Anonymous user Add to cart api is available
    When hits add to Cart api for Anonymous user-BOPIS option
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container 
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And Pick Up Store should be displayed in Get Response
    And quantity should be displayed in GET cart response
    
    
    