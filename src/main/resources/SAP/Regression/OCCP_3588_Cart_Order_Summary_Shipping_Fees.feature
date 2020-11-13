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
    