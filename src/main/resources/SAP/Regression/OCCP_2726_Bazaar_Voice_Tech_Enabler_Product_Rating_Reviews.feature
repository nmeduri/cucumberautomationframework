Feature: OCCP-2726 Product Ratings & Reviews

	Description: To test the HYBRIS Test Cases for the story OCCP-2726
       
        @RegressionTest
		Scenario: TC-1649 HYB-OCCP-2726 - OCCP-2728: HYB:Dev: Build outbound Api for Bazzar Voice - en		
	    Given occ api is available
		When user hits the GET api with locale en
        Then user able to see rating values as numberOfReviews
        And user is able to see rating value as averageRating
        
        @RegressionTest
		Scenario: TC-1650 HYB-OCCP-2726 - OCCP-2728: HYB:Dev: Build outbound Api for Bazzar Voice - CA FR		
	    Given occ api is available
		When user hits the GET api with locale as fr_ca
        Then user should be able to see rating values as numberOfReviews for CA FR
        And user should be able to see rating value as averageRating CA FR
       
        
  