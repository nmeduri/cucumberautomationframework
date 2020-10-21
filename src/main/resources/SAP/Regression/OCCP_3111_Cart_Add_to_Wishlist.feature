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
  
    