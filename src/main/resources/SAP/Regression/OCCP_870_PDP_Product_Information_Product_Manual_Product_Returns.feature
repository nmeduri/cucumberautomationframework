Feature: OCCP_870_PDP_Product_Information_Product_Manual_Product_Returns

	Description: To test the HYBRIS Test Cases for the story OCCP-870
       
      @RegressionTest
			Scenario: TC-1330 HYB:OCCP-870 - Verify display of product brand title	
	    Given occ api is available 
			When user hits the GET api with Default
	    Then user should able to see the product brand title in the JSON response
	    
	    @RegressionTest
	    Scenario: TC-1335 HYB:OCCP-870 : Verify display of User Manual for Product is not available	
	    Given occ api is available 
			When user hit the GET api for user manual
	    Then User Manual link is not displayed
	    
	    @RegressionTest
	    Scenario: TC-1325 HYB:OCCP-870 : Verify Product Title in JSON Response
	    Given occ api is available 
	    When user hits the GET api with Default
	    Then user should able to see the product brand title in the JSON response
	    
	    @RegressionTest
	    Scenario: TC-1326 HYB:OCCP-870 : Verify Description (Product Romance Copy ) is not null in JSON Response

	    Given occ api is available
	    When user hits GET api
	    Then user should be able to see product Description and its value in en in JSON Response
	    
	    @RegressionTest
	    Scenario: TC-1332 HYB:OCCP-870 : Verify Display Product code in JSON Response
	    Given occ api is available 
			When user hits the GET api with Default
			Then user should able to see the product code in the JSON response
		
			@RegressionTest
			Scenario: TC-1331 HYB:OCCP-870 : Verify Display Product Manual Link in JSON Response
			Given occ api is available 
			When user hits the GET method with Default locale for product manaul link
			Then user should be able to see the product manual link in the JSON response
		
			@RegressionTest
			Scenario: TC-1328 HYB:OCCP-870 - Verify Description is not null and language as en in JSON Response
			Given occ api is available
			When user hits the product info API
			Then user should be able to see product description is not null
		
			@RegressionTest
			Scenario: TC-1329 HYB:OCCP-870 - Verify Description is not null and language as en_CA or fr_CA in JSON Response 
			Given occ api is available
	    When user hits GET method with locale as en ca for description
	    Then user should be able to see product Description and its value in en in JSON Response
	    When user hits GET with locale as fr ca for description
	    Then user should be able to see product Description and its value in en in JSON Response
	     
	    @RegressionTest
	    Scenario: TC-1334 HYB:OCCP-870 : Verify disply of Brand Information when  Product is not available
	    Given occ api is available 
			When user hit the GET api for Brand Information
	    Then brand title should not displayed
	    
	    @RegressionTest1
	    Scenario: TC-1491 HYB:OCCP-870-OCCP-2817: Add storeName to Product Details OCC
	    Given occ api is available 
			When user hits the GET product API-1491
			Then user should able to see the product brand title's value in the JSON response
	    And user should be able to see product Description and its value in en in JSON Response
	    And user should be able to see the product manual link in the JSON response
	    And user should able to see the product code in the JSON response
	    And user should able to see the product brand title in the JSON response
	    
	    @RegressionTest1
	    Scenario: TC-1492 HYB:OCCP-870-OCCP-2817: Add storeName to Product Details OCC and language as en_CA or fr_CA  in JSON Response 
	    Given occ api is available 
			When user hits the GET method product API for en ca locale
			Then user should able to see the product brand title's value in the JSON response
	    And user should be able to see product Description and its value in en in JSON Response
	    And user should be able to see the product manual link in the JSON response
	    And user should able to see the product code in the JSON response
	    And user should able to see the product brand title in the JSON response
	    
	    