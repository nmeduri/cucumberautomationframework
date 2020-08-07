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
        
  