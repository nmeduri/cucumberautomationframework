Feature: OCCP-1576 Product Badges

	Description: To test the HYBRIS Test Cases for the story OCCP-1576
   
        
        Background: TC-1712 HYB:OCCP-2344:OCCP-2340: Add Wishlist for authenticated user - generate oauth token
        Given access token is available
        When user generate token
        Then user get the token
        
        @RegressionTest
        Scenario: TC-1735 HYB:OCCP-3276:OCCP-1576-Custom Badges - verify OCC API is returning the custom badges 
        Given occ api is available
        When user hits the GET api with locale en
        Then user should be able to see custom badge under badges container