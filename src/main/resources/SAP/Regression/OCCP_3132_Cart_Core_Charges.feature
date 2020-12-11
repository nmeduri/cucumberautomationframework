Feature: OCCP_3132: Cart - Core Charges

	Description: To test the HYBRIS Test Cases for the story OCCP-3132
 					
		@RegressionTest
    Scenario: TC-4826	HYB-OCCP-3132-OCCP-5657- Build OCC API Outbound API for Core Charges for Cart page - Variant product- Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user variant product
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges and total prices should be displayed in the JSON response
  	When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges and total prices should be displayed in GET cart JSON response
    When 4826-user hits update Cart api for Anonymous user
    Then should return 200 ok
    And baseCoreCharges and total prices should be displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4827	HYB-OCCP-3132-OCCP-5657- Build OCC API Outbound API for Core Charges for Cart page - Variant product- Anonymous user-With out core charges
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user variant product With out core charges
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges should not displayed in the Add to cart JSON response
  	When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges should not displayed in GET cart JSON response
    When 4827-user hits update Cart api for Anonymous user
    Then should return 200 ok
    And baseCoreCharges should not displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4830	HYB-OCCP-3132-OCCP-5657 - Build OCC API Outbound API for Core Charges for Cart page - Variant product- Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api with STH for authenticated user
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges and total prices should be displayed in the JSON response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
  	And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges and total prices should be displayed in GET cart JSON response
    When user hits update Cart api STH for Authenticated user-variant Product
    Then should return 200 ok
    And baseCoreCharges and total prices should be displayed in update cart JSON response
  	
  	@RegressionTest
    Scenario: TC-4831	HYB-OCCP-3132-OCCP-5657 - Build OCC API Outbound API for Core Charges for Cart page - Variant product- Auth user-With out core charges
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with STH for authenticated user variant Product without core charges
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges should not displayed in the Add to cart JSON response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
  	And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges should not displayed in GET cart JSON response
    When user hits update Cart api STH for Authenticated user- variant Product without core charges
    Then should return 200 ok
    And baseCoreCharges should not displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4828 HYB-OCCP-3132-OCCP-5657- Build OCC API Outbound API for Core Charges for Cart page -product do not have variant- Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user products that don’t have variants
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges and total prices should be displayed in the JSON response
  	When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges and total prices should be displayed in GET cart JSON response
    When user hits update Cart api for Anonymous user products that don’t have variants
    Then should return 200 ok
    And baseCoreCharges and total prices should be displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4832 HYB-OCCP-3132-OCCP-5657 - Build OCC API Outbound API for Core Charges for Cart page- product do not have variant - Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And user hits add to Cart api for Authenticated user products that don’t have variants
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges and total prices should be displayed in the JSON response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
  	And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges and total prices should be displayed in GET cart JSON response
    When user hits update Cart api STH for Authenticated user product that don’t have variants
    Then should return 200 ok
    And baseCoreCharges and total prices should be displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4829	HYB-OCCP-3132-OCCP-5657- Build OCC API Outbound API for Core Charges for Cart page - product do not have variant- Anonymous user-With out core charges
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user product do not have variants without core charges
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges should not displayed in the Add to cart JSON response
  	When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges should not displayed in GET cart JSON response
    When user hits update Cart api for Anonymous user product do not have variants without core charges
    Then should return 200 ok
    And baseCoreCharges should not displayed in update cart JSON response
    
    @RegressionTest
    Scenario: TC-4833	HYB-OCCP-3132-OCCP-5657 - Build OCC API Outbound API for Core Charges for Cart page - product do not have variant- Auth user-With out core charges
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And hits add to Cart api with STH for authenticated user do not have variants without core charges
    Then should return 200 ok
    Then product is added to cart should be displayed in the JSON response
    And baseCoreCharges should not displayed in the Add to cart JSON response
    When hits GET Cart api for authenticated user
    Then should return 200 ok
  	And cart entries should created with Anonymous user details in GET cart response
    And baseCoreCharges should not displayed in GET cart JSON response
    When user hits update Cart api STH for Authenticated user do not have variants without core charges
    Then should return 200 ok
    And baseCoreCharges should not displayed in update cart JSON response
    