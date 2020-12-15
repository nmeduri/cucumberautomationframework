Feature: OCCP_960: Tires PDP - Road Rating for Tires

	Description: To test the HYBRIS Test Cases for the story OCCP-960
 					
		@RegressionTest
    Scenario: TC-5663,TC-5648 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings is not null
    Given occ api is available
    When user hits the GET PDP api with locale en for tireRoadRatings product
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section with ratingId and value
	  
	  @RegressionTest
    Scenario: TC-5664,TC-5649  HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings is null
    Given occ api is available
    When user hits the GET PDP api with locale en when tireRoadRatings is null
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section without ratingId and value
	  
	  @RegressionTest
    Scenario: TC-5665,TC-5650 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings-ratingId is not null
    Given occ api is available
    When user hits the GET PDP api with locale en for tireRoadRatings product
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section with ratingId is not null
	  
	  @RegressionTest
    Scenario: TC-5666,TC-5651 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings-ratingId is null
    Given occ api is available
    When user hits the GET PDP api with locale en when tireRoadRatings is null
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section without ratingId is null
	  
	  @RegressionTest
    Scenario: TC-5667,TC-5652 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings-value is not null
    Given occ api is available
    When user hits the GET PDP api with locale en for tireRoadRatings product
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section with value is not null
	  
	  @RegressionTest
    Scenario: TC-5669,,TC-5654 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating - Verify status code 400
    Given occ api is available
    When user hits the GET PDP api without basestoreid for tireRoadRatings product
    Then should return 400 ok
    
	  @RegressionTest
    Scenario: TC-5668,TC-5653 HYB:OCCP-960-OCCP-6610: Build OCC API to publish road rating- Verify tireRoadRatings-value is null
    Given occ api is available
    When user hits the GET PDP api with locale en when tireRoadRatings is null
    Then should return 200 ok
	  Then response JSON should have tireRoadRatings section with value is null
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  