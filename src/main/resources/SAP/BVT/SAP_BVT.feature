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
	

