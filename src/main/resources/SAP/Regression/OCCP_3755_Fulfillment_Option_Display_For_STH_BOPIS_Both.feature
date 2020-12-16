Feature: OCCP-3755: Fulfillment Option Display for STH/BOPIS/Both

	Description: To test the HYBRIS Test Cases for the story OCCP-3755
	
    @RegressionTest
    Scenario: TC-5567 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Auth user- STH
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
    When update cart api with deliveryAddress with postal code for Authenticated user
    And user hits update Cart api with deliveryAddress with postal code for authenticated user
    Then should return 200 ok
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And response JSON should have deliveryAddress with postal code
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    
    @RegressionTest
    Scenario: TC-5570 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Anonymous user - STH
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
    #When 3994-user hits update Cart api for Anonymous user
    #Then should return 200 ok
    When update cart api with deliveryAddress and postal code for Anonymous user
    And user hits update Cart api with deliveryAddress with postal code for Anonymous user
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And response JSON should have deliveryAddress with postal code
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    
    @RegressionTest
    Scenario: TC-5568 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Auth user - BOPIS
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
    When update cart api with deliveryAddress with postal code for Authenticated user
    And user hits update Cart api with deliveryAddress with postal code for authenticated user
    Then should return 200 ok
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And response JSON should have deliveryAddress with postal code
    And response JSON should have deliveryPointOfService details under pickupOrderGroups for that entry
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
    
    @RegressionTest
    Scenario: TC-5571 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Anonymous user - BOPIS
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
    When update cart api with deliveryAddress and postal code for Anonymous user
    And user hits update Cart api with deliveryAddress with postal code for Anonymous user
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And response JSON should have deliveryAddress with postal code
    And response JSON should have deliveryPointOfService details under pickupOrderGroups for that entry
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
   
    @RegressionTest
    Scenario: TC-5569 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Auth user - STH&BOPIS
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api with STH for authenticated user
    Then should return 200 ok
    When user hits add to Cart api BOPIS for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When update cart api with deliveryAddress with postal code for Authenticated user
    And user hits update Cart api with deliveryAddress with postal code for authenticated user
    Then should return 200 ok
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And response JSON should have deliveryPointOfService details under pickupOrderGroups for that entry
    And response JSON should have deliveryAddress with postal code
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
    And shiptohome should be displayed in Get Response
    
    @RegressionTest
    Scenario: TC-5572 HYB-OCCP-3755-OCCP-5220- Build logic to display fulfilment Option in Checkout- Anonymous user - STH&BOPIS
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3994-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    When hits add to Cart api for Anonymous user-BOPIS option
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When update cart api with deliveryAddress and postal code for Anonymous user
    And user hits update Cart api with deliveryAddress with postal code for Anonymous user
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And response JSON should have deliveryPointOfService details under pickupOrderGroups for that entry
    And response JSON should have deliveryAddress with postal code
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And Pick Up Store should be displayed in Get Response
    And shiptohome should be displayed in Get Response
    
    