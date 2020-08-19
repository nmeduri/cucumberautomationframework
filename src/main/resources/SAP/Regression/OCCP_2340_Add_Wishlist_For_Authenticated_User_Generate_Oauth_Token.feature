Feature: OCCP-2340 Wishlist (Authenticated User)

	Description: To test the HYBRIS Test Cases for the story OCCP-2340
        
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
        
        @RegressionTest
        Scenario: TC-1721 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - check status 409 (Conflict)
        Given access token is available
        When user hits add product api for authenticated user
        When user hits add product api for authenticated user
        Then should return 409 conflict
        And user hits delete api for authentication user
        
        @RegressionTest
        Scenario: TC-1726 HYB:OCCP-3145:OCCP-2340: delete Wishlist for authenticated user
        Given access token is available
        When user hits add product api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        Then should return 200 ok
        
        @RegressionTest
        Scenario: TC-1727 HYB:OCCP-3145:OCCP-2340: delete Wishlist - verify status code 200 OK
        Given access token is available
        When user hits add product api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        Then should return 200 ok
        
        @RegressionTest
        Scenario: TC-1728 HYB:OCCP-3145:OCCP-2340: delete Wishlist - verify status code 400 Bad Request
        Given access token is available
        When user hits add product api for authenticated user
        Then should return 201 created
        And user hits delete api for authentication user
        And user hits delete api for authentication user
        Then should return 400 ok
        
        @RegressionTest
        Scenario: TC-1729 HYB:OCCP-3145:OCCP-2340: delete Wishlist - verify status code 401 Unauthorized
        Given access token is available
        When user hits delete api for unauthorized token
        Then should return 401 unauthorized
        
        @RegressionTest
        Scenario: TC-1730 HYB:OCCP-3145:OCCP-2340: delete Wishlist - verify status code 404 Not Found
        Given access token is available
        When user hits delete api for not found status
        Then should return 404 not found
        
        @RegressionTest
        Scenario: TC-1722 HYB:OCCP-3146:OCCP-2340: Get Wishlist for authenticated user
        Given access token is available
        When user hits get api for authenticated user
        Then should return 200 ok
        
        @RegresisonTest
        Scenario: TC-1723 HYB:OCCP-3146:OCCP-2340: Get Wishlist for authenticated user - check status 200 (OK) 
        Given access token is available
        When user hits get api for authenticated user
        Then should return 200 ok
        
        @RegressionTest
        Scenario: TC-1724 HYB:OCCP-3146:OCCP-2340: Get Wishlist for authenticated user - check status 401 (Unauthorized)
        Given access token is available
        When user hits get api for unauthenticated user
        Then should return 401 unauthorized
        
        @RegressionTest
        Scenario: TC-1725 HYB:OCCP-3146:OCCP-2340: Get Wishlist for authenticated user - check status 404 (Not Found) 
        Given access token is available
        When user hits get api for not found status
        Then should return 404 not found
