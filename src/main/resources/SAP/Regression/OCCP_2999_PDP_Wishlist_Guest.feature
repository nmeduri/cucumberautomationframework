Feature: OCCP-2999 PDP: Wishlist (Guest)

	Description: To test the HYBRIS Test Cases for the story OCCP-2999
       
       
        @RegressionTest
        Scenario: TC-1612 HYB:OCCP-3003:OCCP-2999: Verify for 409 status when invoking AddToWishlist OCC API with Anonymous User and empty GUID for multiple times
        Given occ api is available
        When user hits add product api for empty guid
        When user hits add product api for empty guid
        Then should return 409 status code
        And user hits delete api for empty guid

        @RegressionTest
		Scenario: TC-1613 HYB:OCCP-3003:OCCP-2999: Verify AddToWishlist OCC API for Anonymous User and empty GUID 	
	    Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        
        @RegressionTest
        Scenario: TC-1614 HYB:OCCP-3003:OCCP-2999: Verify Status Code when invoking AddToWishlist OCC API with Anonymous User and empty GUID	
	    Given occ api is available
        When user hits add product api for empty guid
        Then should return 201 created
        And user hits delete api for empty guid
        
        @RegressionTest
        Scenario: TC-1615 HYB:OCCP-3003:OCCP-2999: Verify for CONFLICT status	
	    Given occ api is available
        When user hits add product api for empty guid
        Then should return 201 created
        When user hits add product api for empty guid
        Then should return 409 status code
        And user hits delete api for empty guid

        @RegressionTest
        Scenario: TC-1616 HYB:OCCP-3003:OCCP-2999: Verify AddToWishlist OCC API for Anonymous User and with GUID
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        Then should return 201 created
        
        @RegressionTest
        Scenario: TC-1617 HYB:OCCP-3003:OCCP-2999: Verify AddToWishlist OCC API with existing data
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        When user hits add product api for guid
        Then should return error message
        
        @RegressionTest
        Scenario: TC-1618 HYB:OCCP-3003:OCCP-2999: Verify getWishlist OCC API 
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        When user hits get wishlist api
        Then returned JSON should have wishListData
        And wishListData container should have entries container
        And entries container should have container availableAction
        And entries container should have rating section
        And entries container should have section externalmedia
        
        @RegressionTest
        Scenario: TC-1619 HYB:OCCP-3003:OCCP-2999: Verify getWishlist OCC API- json name and value
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        When user hits get wishlist api
        And entries contains productCode
        And entries should have name
        And entries should have addedDate
        And entries should have productStatus
        
        @RegressionTest
        Scenario: TC-1622 HYB:OCCP-3003:OCCP-2999: Verify Status Code when invoking RemoveWishEntryList OCC API with Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        Then should return 201 created
        And user hits delete api for guid
        Then should return 200 ok
        
        @RegressionTest
        Scenario: TC-1710 HYB:OCCP-3003:OCCP-2999: add Base Product that have variants to the AddToWishlist OCC API for Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hit api add base product that have variant to wishlist guid
        Then user should not able to the base product which has variant to the wishlist
        
        @RegressionTest
        Scenario: TC-1711 HYB:OCCP-3003:OCCP-2999: add variant Product to the AddToWishlist OCC API for Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hit add variant product api for guid
        Then should return 201 created
        
        @RegressionTest
        Scenario: TC-1709 HYB:OCCP-3003:OCCP-2999: add Base Product that don’t have variants to the AddToWishlist OCC API for Anonymous User
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hit add base product api for guid
        Then should return 201 created
        
        @SmokeTest
        Scenario: TC-1621 HYB:OCCP-3003:OCCP-2999: Verify getWishlist OCC API- json for availableActions container 
        Given occ api is available
        When user hits add wishlist api
        Then response should returned GUID
        When user hits add product api for guid
        When user hits get wishlist api
        Then user should able to see availableActions container
        And user should be able to see isAddToCartEnabled
        And user should be able to see values
  