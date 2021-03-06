Feature: OCCP-3111: Cart - Add to Wishlist

	Description: To test the HYBRIS Test Cases for the story OCCP-3111
	 
 		@RegressionTest
		Scenario: TC-3123 HYB:OCCP-3111:OCCP-4184: Verify  adding  product to wishlist from cart
		Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3123-user hits add to Cart api for authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When access token is available
    When authenticated user hits add wishlist api
    Then should return 201 created
    When authenticated user hits get wishlist api
    Then should return 200 ok
    Then the JSON should return wishListData
    And wishListData should have added product
    When user hits delete wishlist api
    Then should return 200 ok
  
    @RegressionTest
    Scenario: TC-3120	HYB:OCCP-3111:OCCP-4184: Authenticated user - add base product which don’t have variants to Cart
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api for Authenticated user base product which don’t have variants
    Then should return 400 ok
   	And user should not able to add base product to the cart
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    And cart entries should not get created with user details in GET cart authenticateduser response
    
    @RegressionTest
    Scenario: TC-3122 HYB:OCCP-3111:OCCP-4184:Guest user - Add to cart
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 4678-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And cart entries should created with Guest user details in GET cart response
    
    
    