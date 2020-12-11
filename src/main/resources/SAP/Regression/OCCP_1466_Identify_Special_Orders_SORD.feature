Feature: OCCP_1466: Identify Special Orders (SORD)

	Description: To test the HYBRIS Test Cases for the story OCCP-1466
 					
		@RegressionTest
    Scenario: TC-4678 HYB-OCCP-1466 - OCCP-5963- special order flag in ADD to Cart - variant product - Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 4678-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then isSpecialOrder is true and status is Under Review in response
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then isSpecialOrder is True and status is Under Review should be displayed in GET response
    
    @RegressionTest
    Scenario: TC-4679 HYB-OCCP-1466 - OCCP-5963 - special order flag in ADD to Cart - variant product - Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And 4679-user hits add to Cart api for Authenticated user
    Then should return 200 ok
    Then isSpecialOrder is true and status is Under Review in response
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    Then isSpecialOrder is True and status is Under Review should be displayed in GET response
    
    @RegressionTest
    Scenario: TC-4680 HYB-OCCP-1466 - OCCP-5963 - special order flag in ADD to Cart - base product - Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
   	Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 4680-user hits add to Cart api with base product for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
    Scenario: TC-4681 HYB-OCCP-1466 - OCCP-5963 - special order flag in ADD to Cart - base product - Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api 
    When 4681-user hits add to Cart api with base product for Authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart
   
    @RegressionTest
    Scenario: TC-4682	HYB-OCCP-1466-OCCP-5963- special order flag in ADD to Cart - products that don’t have variants product - Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user products that don’t have variants
    Then should return 200 ok
    Then isSpecialOrder is true and status is Under Review in response
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then isSpecialOrder is True and status is Under Review should be displayed in GET response
    
    @RegressionTest
    Scenario: TC-4683 HYB-OCCP-1466-OCCP-5963 - special order flag in ADD to Cart-  products that don’t have variants product  - Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api for Authenticated user products that don’t have variants
    Then should return 200 ok
    Then isSpecialOrder is true and status is Under Review in response
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    Then isSpecialOrder is True and status is Under Review should be displayed in GET response
    
    