Feature: OCCP_3935: Cart I&A - Postal Code Modal

	Description: To test the HYBRIS Test Cases for the story OCCP-3935
 					
		@RegressionTest
    Scenario: TC-4835 HYB-OCCP-3935-OCCP-5739- Cart: Shipping Fees recalculation on update Postal Code - Anonymous - user
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
    
    