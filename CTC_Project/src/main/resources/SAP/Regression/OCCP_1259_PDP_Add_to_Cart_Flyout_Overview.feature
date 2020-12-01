Feature: OCCP-1259  PDP Add to Cart Flyout: Overview

	Description: To test the HYBRIS Test Cases for the story OCCP-1259
    
    @RegressionTest
    Scenario: TC-3965 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user -Adding the product to the cart which has no variants 
    having product reference as product having no variants
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3965-user hits add to Cart api for Anonymous user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
      
    @RegressionTest
		Scenario: TC-3970 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user - Adding the product to the cart which has variants 
		and having product reference as base product having  variants
		Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3970-user hits add to Cart api for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart
    
    @RegressionTest
		Scenario: TC-3976 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user - Adding the product to the cart which has variants and 
		having product reference as base product having  variants
		Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3976-user hits add to Cart api for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart  
		
		@RegressionTest
    Scenario: TC-3969 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user -Adding the product to the cart which has  variants and 
    having product reference as product having  variants
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3969-user hits add to Cart api for Anonymous user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
    
    @RegressionTest
    Scenario: TC-3975 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user -Adding the product to the cart which has variants and having 
    product reference as product having  variants
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3975-user hits add to Cart api for authenticated user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
    
    @RegressionTest
    Scenario: TC-3967 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user -Adding the product to the cart which has no variants and 
    having product reference as base product having  variants
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3967-user hits add to Cart api for Anonymous user
    Then should return 400 ok
    And user should not able to add base product to the cart  
    
    @RegressionTest
		Scenario: TC-3973 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user -Adding the product to the cart which has no variants and having 
		product reference as base product having  variants
		Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3973-user hits add to Cart api for authenticated user
    Then should return 400 ok
    And user should not able to add base product to the cart  
    
    @RegressionTest
    Scenario: TC-3968 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user -Adding the product to the cart which has  variants having 
    product reference as product having no variants
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3968-user hits add to Cart api for Anonymous user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
	
	  @RegressionTest
    Scenario: TC-3974 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user -Adding the product to the cart which has variants having product 
    reference as product having no variants
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3975-user hits add to Cart api for authenticated user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
    
    @RegressionTest
    Scenario: TC-3966 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Ananymous user -Adding the product to the cart which has no variants and 
    having product reference as product having  variants
    Given Guest user create cart access token is available
    When guest user hits the POST api for create cart
    Then response JSON should have created cart
    Then response JSON should have code
    Then guid is available in response JSON
    When Anonymous user Add to cart api is available
    When 3966-user hits add to Cart api for Anonymous user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
    
    @RegressionTest
    Scenario: TC-3972 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user -Adding the product to the cart which has no variants and having 
    product reference as product having  variants
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3972-user hits add to Cart api for authenticated user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
    
    @RegressionTest
    Scenario: TC-3971 HYB:OCCP-1259-OCCP-4488: Build Cart fly out -Auth user -Adding the product to the cart which has no variants having 
    product reference as product having no variants
    Given Registered user create cart access token is available
    When user generate token
    Then user get the token
    When user hits the POST api for create cart
    Then response JSON should have code
    When Authenticated user Add to cart api
    When 3971-user hits add to Cart api for authenticated user
    Then should return 200 ok   
    Then ctcproduct container is available in response
    And code should be available in ctcproduct container
    And description should be available in ctcproduct container
    And name should be available in ctcproduct container
    And productReferences container is available in response
    And description is available in productReferences container
    And quantity is available in productReferences container
    And referenceType is available in productReferences container
    And variantMatrix container is available in response
    And elements container is available in variantMatrix container
    And variant code is available in parentVariantCategory container
    And displayName is available in variantValueCategory container
    And name is available in variantValueCategory container
    And sequence is available in variantValueCategory container
    And description is available in target container
    And name is available in target container
    And preselected value should be true
    And productBrand should be displayed
    And medias container should be displayed
  