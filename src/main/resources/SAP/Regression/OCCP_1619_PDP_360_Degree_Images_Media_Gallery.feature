Feature: OCCP-1619 PDP: 360 Degree Images -Media Gallery

	Description: To test the HYBRIS Test Cases for the story OCCP-1619
       

        @RegressionTest
				Scenario: TC-1462 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - is null or not null 	
	      Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        
        @RegressionTest
        Scenario: TC-1463 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - code
        Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And  user able to see media section with code
        
        @RegressionTest
        Scenario: TC-1464 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - mediaType is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have medias section
        And user able to see media section with media type
        And media type value should be Images_360 in response
        
        @RegressionTest
        Scenario: TC-1465 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - mediaType is null 
        Given occ api is available
        When user hits to GET api
        Then medias section should have in response without mediaType name and its value
        
        @RegressionTest
        Scenario: TC-1466 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias section with name and its value
        
        @RegressionTest
        Scenario: TC-1467 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is null
        Given occ api is available
        When 1476-user hits the GET api without locale
        Then response should have medias section without name and its value
        
        @RegressionTest
        Scenario: TC-1468 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is not null and lang as eng
        Given occ api is available
        When user hits the GET api with locale en
        Then response JSON should have section medias with name and its value in english
        
        @RegressionTest
        Scenario: TC-1469 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is not null and lang as en_CA
        Given occ api is available
        When user hits the GET api with locale as en_ca
        Then JSON should have medias section with name and its value in en CA
        
        @RegressionTest
        Scenario: TC-1470 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - name is not null and lang as fr_CA
        Given occ api is available
        When user hits the GET api with locale as fr_ca
        Then response JSON should have medias with name and value in fr_ca
        
        @RegressionTest
        Scenario: TC-1471 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - externalURL is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response JSON should have section medias with externalURL and its value
        
        @RegressionTest
        Scenario: TC-1472 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - externalURL is null
        Given occ api is available
        When 1476-user hits the GET api without locale
        Then response should have medias without externalUrl and its value
        
        @RegressionTest
        Scenario: TC-1473 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - damPath is not null 
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias with damPath and its value
        
        @RegressionTest
        Scenario: TC-1474 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - damPath is null
        Given occ api is available
        When 1476-user hits the GET api without locale
        Then response should have medias without damPath and its value
        
        @RegressionTest
        Scenario: TC-1475 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - order is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias with order and its value
        
        @RegressionTest
        Scenario: TC-1477 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - videoImageThumbnailURL is not null
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias section with videoImageThumbnailURL and its value
        
        @RegressionTest
        Scenario: TC-1479 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - videoImageThumbnailDAMPath is not null 
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medias section with videoImageThumbnailDAMPath and its value
        
        @RegressionTest
        Scenario: TC-1481 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - alttext is not null 
        Given occ api is available
        When user hits the GET api without locale
        Then response should have medisas section with alttext and value in english
        
        @RegressionTest
        Scenario: TC-1483 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - alttext is not null and lang as eng
        Given occ api is available 
				When user hits the GET api with locale en
				Then response should have medisas section with alttext and value in english
		
				@RegressionTest
        Scenario: TC-1484 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - alttext is not null and lang as en_CA
        Given occ api is available 
				When user hits the GET api with locale as en_ca
				Then response should have medisas section with alttext and value in english
		
				@RegressionTest
				Scenario: TC-1485 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - alttext is not null and lang as fr_CA
				Given occ api is available 
				When user hits the GET api with locale as fr_ca
				Then JSON response should have medias section with alttext and value in fr_CA
		
				@RegressionTest
				Scenario: TC-1486 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - isPrimary is not null
				Given occ api is available
				When user hits the GET api without locale
				Then response should have medias section with isPrimary and its value
		
				@RegressionTest
				Scenario: TC-1488 HYB:OCCP-1619:Verify 360 Degree Images -Media Gallery - isListingThumbnailImage is not null
				Given occ api is available
				When user hits the GET api without locale
				Then JSON response should have medias section with isListingThumbnailImage and value
		
		 		@RegressionTest
     		Scenario: TC-1476 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - order is  null
     		Given occ api is available
     		When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
     		And response should have medias without order and its value
     
     		@RegressionTest
     		Scenario: TC-1478 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - videoImageThumbnailURL is  null
     		Given occ api is available
     		When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
     		Then response should have medias section without videoImageThumbnailURL and its value
     
     		@RegressionTest
     		Scenario: TC-1480 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - videoImageThumbnailDAMPath is  null
     		Given occ api is available
     		When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
     		Then response should have medias section without videoImageThumbnailDAMPath and its value
     
     		@RegressionTest
        Scenario: TC-1482 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - alttext is  null
        Given occ api is available
        When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
        Then response should have medias section without alttext and value in english
        
        @RegressionTest
				Scenario: TC-1487 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - isPrimary is  null
				Given occ api is available
				When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
				Then response should have medias section without isPrimary and its value
				
				@RegressionTest
				Scenario: TC-1489 HYB:OCCP-1619: Verify 360 Degree Images -Media Gallery - isListingThumbnailImage is  null
				Given occ api is available
				When 1476-user hits the GET api without locale
     		Then response JSON should have medias section
				Then JSON response should have medias section without isListingThumbnailImage and value
        
  