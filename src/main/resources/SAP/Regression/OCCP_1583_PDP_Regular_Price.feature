Feature: OCCP-1583 PDP: Regular Price

	Description: To test the HYBRIS Test Cases for the story OCCP-1583
       

        @RegressionTest
		Scenario: TC-1361 HYB:OCCP-1583:Verify display of price when given product is a base Product and dont have variants  	
	    Given occ api is available
        When user hits locale api
        Then returned JSON should display only price for different price type
        
        @RegressionTest
        Scenario: TC-1362 HYB:OCCP-1583:Verify display of price when given product is base Product and have variants but price is same for all variants
        Given occ api is available
        When user hits locale api
        Then returned JSON should display same price for different variant
        
        @RegressionTest
        Scenario: TC-1363 HYB:OCCP-1583: Verify display of price when given product is base Product and have variants and prices are different
        Given occ api is available
        When user hits locale api
        Then returned JSON should display price range
        
        @RegressionTest
        Scenario: TC-1364 HYB:OCCP-1583:Verify display of price when Given product code is variant product code
        Given occ api is available
        When user hits api for variant option
        Then returned JSON Should display  only price