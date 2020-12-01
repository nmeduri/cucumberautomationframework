Feature: OCCP_3054: Analytics - Product Recommendation Click

	Description: To test the HYBRIS Test Cases for the story OCCP-3054
	
				@RegressionTest
    		Scenario: TC-3098 HYB:OCCP-3054-OCCP-3856: Update product list APIs for analytics data- ratings and reviews-En	
    		Given PLP occ api is available
    		When user hits product list api for EN
    		Then Ratings are displayed
    		And Reviews are displayed
    		
    		@RegressionTest
    		Scenario: TC-3099 HYB:OCCP-3054-OCCP-3856: Update Variant product list APIs for analytics data- ratings and reviews-En
    		Given PLP occ api is available
    		When user hits variant product list api for EN
    		Then Ratings are displayed
    		And Reviews are displayed
    		
    		@RegressionTest
    		Scenario: TC-3100 HYB:OCCP-3054-OCCP-3856: Update product list APIs for analytics data- ratings and reviews-FR_CA
    		Given PLP occ api is available
    		When user hits product list api for fr_CA
    		Then Ratings are displayed
    		And Reviews are displayed
    		
    		@RegressionTest
    		Scenario: TC-3101 HYB:OCCP-3054-OCCP-3856: Update Varinat product list APIs for analytics data- ratings and reviews-FR_CA
    		Given PLP occ api is available
    		When user hits product list api for fr_CA
    		Then Ratings are displayed
    		And Reviews are displayed
    		