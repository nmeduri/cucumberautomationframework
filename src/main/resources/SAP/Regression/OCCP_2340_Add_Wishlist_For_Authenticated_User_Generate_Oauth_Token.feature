Feature: OCCP-1561 PLP-Breadcrumb

	Description: To test the HYBRIS Test Cases for the story OCCP-1561
   
        
        Background: TC-1712 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - generate oauth token
        Given access token is available
        When user generate token
        Then user get the token
        
        @RegressionTest
        Scenario: TC-1713 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - add base product which don’t have variants to wishlist
        Given access token is available
        When user hits add product api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        
        @RegressionTest
        Scenario: TC-1714 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - add base product which has variants to wishlist
        Given access token is available
        When user add base proudct which has variant to the wishlist
        Then user should not able to the base product which has variant to the wishlist
        
        @RegresssionTest
        Scenario: TC-1715 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - add variant product to wishlist
        Given access token is available
        When user hit add variant product api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        
        @RegressionTest
        Scenario: TC-1716 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 201 (Created)
        Given access token is available
        When user hits the wishlist api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        
        @RegressionTest
        Scenario: TC-1717 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 400 (Bad Request)
        Given access token is available
        When user add invalid product to the wishlist
        Then should return 400 bad request
        
        @RegressionTest
        Scenario: TC-1718 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 401 (Unauthorized)
        Given access token is available
        When user access the invalid token
        Then should return 401 unauthorized
        
        @RegressionTest
        Scenario: TC-1719 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 403 (Forbidden)
        Given access token is available
        When user access invalid wishlist api
        Then should return 403_forbidden
        
        @RegressionTest
        Scenario: TC-1720 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 404 (Not Found) 
        Given access token is available
        When user hits not found api
        Then should return 404 not found

