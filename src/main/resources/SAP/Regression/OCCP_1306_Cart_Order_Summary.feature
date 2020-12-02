Feature: OCCP_1306: Cart: Order Summary

	Description: To test the HYBRIS Test Cases for the story OCCP-1306
 					
		@RegressionTest
    Scenario: TC-5117,TC-4334,TC-5959	HYB-OCCP- 1306- OCCP-6238 : Tax Calculation Update -TaxRow -  Get Cart API -Anonymous user
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then 1309-guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 5117-user hits add to Cart api for Anonymous user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When 3994-user hits GET Cart api for Anonymous user
    Then should return 200 ok
    Then taxes and taxlines should be displayed
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And Pick Up Store should be displayed in Get Response
    
    @RegressionTest
    Scenario: TC-5958 HYB-OCCP-1306-OCCP-7352-Tax Calculation Update - Auth user
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    And 5958-user hits add to Cart api for Authenticated user
    Then should return 200 ok
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    When hits GET Cart api for authenticated user
    Then should return 200 ok
    Then taxes and taxlines should be displayed
    Then deliveryMode container is available in GET response
    And deliveryMode code is available in GET response
    And shiptohome should be displayed in Get Response
    And Pick Up Store should be displayed in Get Response
    
    