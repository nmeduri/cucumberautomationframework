Feature: OCCP-1619 PDP: Sticky Buy Box

	Description: To test the HYBRIS Test Cases for the story OCCP-1579
       

        @RegressionTest
		Scenario: TC-1340 HYB:OCCP-1579: Verify product Brand 	
	    Given occ api is available
        When user hits the GET api without locale
        Then product brand should be displayed in JSON response
        
        @RegressionTest
        Scenario: TC-1341 HYB:OCCP-1579: Verify product title
        Given occ api is available
        When user hits the GET api without locale
        Then product title should be displayed in JSON response
        
        @RegressionTest
        Scenario: TC-1342 HYB:OCCP-1579: Verify product title and language as en_CA or fr_CA in JSON Response
        Given occ api is available
        When user hits the GET api with locale as fr_ca
        Then response JSON should have product title name and its value in fr ca
        When user hits the GET api with locale as en_ca
        Then response should have product title name and its value in en ca
        
        @RegressionTest
        Scenario: TC-1343 HYB:OCCP-1579: Verify product Price
        Given occ api is available
        When user hits the GET api without locale
        Then product price should be displayed in JSON response
        
        @RegressionTest
        Scenario: TC-1344 HYB:OCCP-1579: Verify product Price format when language as en_CA or fr_CA in JSON Response
        Given occ api is available
        When user hits the GET api with locale as fr_ca
        Then fr ca should product French text for PDP
        When user hits the GET api with locale as en_ca
        Then en ca should produce English text for PDP
        When user hits the GET api with locale en
        Then en ca should produce English text for PDP
        
        @RegressionTest
        Scenario: TC-1345 HYB:OCCP-1579: Verify product Image
        Given occ api is available
        When user hits the GET api without locale
        Then product image should be displayed in JSON response
        
        
        
  