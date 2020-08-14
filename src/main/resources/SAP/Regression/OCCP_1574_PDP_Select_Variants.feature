Feature: OCCP-1574 PDP: Select Variants

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario: TC-1336 HYB:OCCP-1574: Verify multiple colour variants for a product 	
	    Given occ api is available
        When user hits GET api
        Then user should be able to see multiple color variant in the JSON response
        
        @RegressionTest
		Scenario: TC-1337 HYB:OCCP-1574: Verify multiple sizes for a product
	    Given occ api is available
        When user hits GET api
        Then user should be able to see multiple size variant in the JSON response
        
        @RegressionTest
		Scenario: TC-1338 HYB:OCCP-1574: Verify multiple sizes and colours for product
	    Given occ api is available
        When user hits GET api
        Then user able to see multiple size and colours in the response
        
        @RegressionTest
        Scenario: TC-1497 HYB:OCCP-1574: Verify variants product 
        Given occ api is available
        When user hits GET api
        Then JSON response should have variants of product data only
        
        @RegressionTest
        Scenario: TC-1339 HYB:OCCP-1574: Verify when the Product has no variants
        Given occ api is available
        When user hits GET api
        Then variant sector should unavailable
        And sku id for the product is displayed
        
        
  