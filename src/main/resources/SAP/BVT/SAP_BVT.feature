Feature: Health Check BVT API 

	Description: The purpose of this test to perform health check of API.
	
	
	Scenario: TC-2085 Get product info- OCC API validation 
	Given occ api is available
	When user hits the GET api with locale en
	Then user gets the Product Info EN list.
	
	Scenario: TC-2086 Get product info for en, en_CA, FR_CA locales
	Given product Info FR_CA url is available. 
	When user hits the GET api with locale en
	Then user gets the Product Info EN list.
	When user hits get Product Info FR_CA API. 
	Then user gets the Product Info FR_CA list. 
	When user hits get Product Info EN_CA API. 
	Then user gets the Product Info EN_CA list.
	
    Scenario: TC-2087 Get list of catalog info
	Given  catalogs list url is available. 
	When  user hits get catalog list API. 
	Then user gets the catalog list.
	
	Scenario: TC-2088 Get catalog version info
	Given  catalog version API is available. 
	When  user hits the get catalog version api. 
	Then user gets the catalog version API response. 
	
	Scenario: TC-2089 Get product info - Badges
	Given occ api is available
    When user hits the GET api with locale en
    Then user should be able to see badge
    
    Scenario: TC-2090 Get product info - Medias	
	Given occ api is available
    When user hits the GET api with locale en
    Then response JSON should have medias section
    
    
    Scenario: TC-2091 Get product info - Variants, Features, Warranty
    Given occ api is available
    When user hits the GET api with locale en
    Then returned JSON should have warranty section in en locale
	And returned JSON should have warranty message name and its value in en locale
	When user hits the GET api with locale en
	Then returned JSON should display feature Bullets section
    When user hits the GET api with locale en
    Then user should be able to see multiple color variant in the JSON response  
    
    Scenario: TC-2092 Add wishlist, delete wishlist - Anonymous user 
    Given occ api is available
    When user hits add wishlist api
    Then response should returned GUID
    When user hits add product api for guid
    Then should return 201 created
    And user hits delete api for guid
    Then should return 200 ok
    
    Scenario: TC-2092 Add wishlist, delete wishlist - Authenticated user 
    Given access token is available
    When user generate token
    Then user get the token
    Given access token is available
    When user hits add product api for authenticated user
    Then should return 201 created
    And user hits delete api for authentication user
    Then should return 200 ok   	    
	    
	    
	    
     	    
	    
	    
	    
	

