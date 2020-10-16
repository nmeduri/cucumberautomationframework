Feature: OCCP_1309: Cart - View Filled Cart

	Description: To test the HYBRIS Test Cases for the story OCCP-1309
 					
		@RegressionTest
    Scenario: TC-3994 HYB:OCCP-1309-OCCP-2835: Anaymous user - Build Api to support to modify and save STH  option -  Update Cart   		
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
    Then ship to home should be displayed
    And quantity should be displayed in update cart response
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed In_Get_Response
    And quantity should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-3999 HYB:OCCP-1309-OCCP-2835: Build Api to support to modify and save STH option -Update Cart - Verify status code 400  		
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3999-user hits add to Cart api for Anonymous user
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
    When 3999-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 4000-user hits update Cart api for Anonymous user
    Then should return 404 not found
    
    
    
    
    