Feature: OCCP_1272: Cart Bulk Items - Delivery Options

	Description: To test the HYBRIS Test Cases for the story OCCP-1272
 					
		@RegressionTest
    Scenario: TC-6250 HYB:OCCP-1272-OCCP-7290: White Glove Delivery Options - execute OCCP API with "CurbSide" delivery option
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And deliveryCost should be displayed in GET cart response
    When anonymous user hits update cart api with CurbSide white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And CURBSIDE should be displayed in GET cart response
    And updated deliveryCost should displayed in GET cart response with CurbSide delivery option
    
    @RegressionTest
    Scenario: TC-6252 HYB:OCCP-1272-OCCP-7290: White Glove Delivery Options- execute OCCP API with "IN_HOME_DELIVERY" delivery option
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And deliveryCost should be displayed in GET cart response
    When anonymous user hits update cart api with IN_HOME_DELIVERY white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And IN_HOME_DELIVERY should be displayed in GET cart response
    And updated deliveryCost should displayed in GET cart response with IN_HOME_DELIVERY delivery option
    
    @RegressionTest
    Scenario: TC-6254 HYB:OCCP-1272-OCCP-7290: White Glove Delivery Options- execute OCCP API with "IN_HOME_DELIVERY_PACKAGING_REMOVAL" delivery option
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And deliveryCost should be displayed in GET cart response
    When anonymous user hits update cart api with IN_HOME_DELIVERY_PACKAGING_REMOVAL white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And IN_HOME_DELIVERY_PACKAGING_REMOVAL should be displayed in GET cart response
    And updated deliveryCost should displayed in GET cart response with IN_HOME_DELIVERY_PACKAGING_REMOVAL delivery option
    
    @RegressionTest
    Scenario: TC-6257, TC-6259 HYB:OCCP-1272-OCCP-7290: TC-6257 HYB:OCCP-1272-OCCP-7290:White Glove Delivery Options- execute getCart API to verify delivery option is not null
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When anonymous user hits update cart api with CurbSide white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And CURBSIDE should be displayed in GET cart response
    And storeWhiteGloveFee section with values should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-6258 HYB:OCCP-1272-OCCP-7290:White Glove Delivery Options- execute getCart API to verify delivery option is  null
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with BOPIS POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with BOPIS POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When anonymous user hits update cart api with CurbSide white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And whiteGloveServiceType should not displayed in GET cart response
    And storeWhiteGloveFee section with values should be displayed in GET cart response
    
    @RegressionTest
    Scenario: TC-6256 HYB:OCCP-1272-OCCP-7290: White Glove Delivery Options - execute OCCP API with any delivery option
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When user hits add to Cart api for Anonymous user with POS
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When user hits update Cart api for Anonymous user with POS
    Then should return 200 ok
    Then deliveryMode container is available in response
    Then deliveryMode code is available in deliveryMode container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    And deliveryCost should be displayed in GET cart response
    When anonymous user hits update cart api with IN_HOME_DELIVERY_PACKAGING_REMOVAL white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And IN_HOME_DELIVERY_PACKAGING_REMOVAL should be displayed in GET cart response
    And updated deliveryCost should displayed in GET cart response with IN_HOME_DELIVERY_PACKAGING_REMOVAL delivery option
    When user hits update Cart api for Anonymous user with BOPIS POS
    Then should return 200 ok
    When anonymous user hits update cart api with CurbSide white glove delivery option
    Then should return 200 ok
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then recently added product code is available in GET cart response
    And WhiteGloveServiceType should not be updated in GET cart response
    And storeWhiteGloveFee section with values should be displayed in GET cart response
    
    