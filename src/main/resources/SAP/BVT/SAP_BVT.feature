Feature: Health Check BVT API 

	Description: The purpose of this test to perform health check of API.


Scenario: health check of API. 
	Given  Health check url is available. 
	When  User hits the BVT api. 
	Then User get the API Response. 
		
Scenario: to verify catalogs list API. 
	Given  catalogs list url is available. 
	When  user hits get catalog list API. 
	Then user gets the catalog list. 
		
Scenario: to verify the catalog API. 
	Given  catalog API is available. 
	When  user hits the get catalog api. 
	Then user gets the catalog API response. 
	
Scenario: to verify the catalog version API. 
	Given  catalog version API is available. 
	When  user hits the get catalog version api. 
	Then user gets the catalog version API response. 
	
Scenario: to verify  Product Info of FR_CA 
	Given product Info FR_CA url is available. 
	When user hits get Product Info FR_CA API. 
	Then user gets the Product Info FR_CA list. 
	
Scenario: to verify  Product Info of EN_CA 
	Given product Info EN_CA url is available. 
	When user hits get Product Info EN_CA API. 
	Then user gets the Product Info EN_CA list.
	
Scenario: to verify Product Info - Badge	
	    Given occ api is available
        When user hits locale api
        Then user should be able to see badge value as Exclusive	
        
Scenario: to verify Product Info - medias	
	    Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        
        
Scenario: to verify Product Info - warranty
        Given occ api is available 
		When user hits the GET api with locale as en_ca
	    Then returned JSON should have warranty section in en_CA locale
	    And returned JSON should have warranty message name and its value in en_ca locale
	    
Scenario: to verify Product Info - feature	
	    Given occ api is available
        When user hits the GET api without locale
        Then returned JSON should display feature Bullets section
        And returned JSON should display feature description
        And returned JSON should display description value in locale en
        
Scenario: to verify Product Info - variant 	
	    Given occ api is available
        When user hits locale api
        Then user should be to see multiple color variant in the JSON response    

        
Scenario: to verify AddToWishlist OCC API for Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hit add product api for guid
        Then should return 201 created 
        
Scenario: to verify RemoveWishEntryList OCC API with Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hit add product api for guid
        Then should return 201 created
        And user hits delete api for guid
        Then should return 200 created           	    
	    
	    
	    
	

