Feature: OCCP-871 PDP Installations

	Description: To test the HYBRIS Test Cases for the story OCCP-871
       
       
		Scenario: TC-1365 HYB:OCCP-871: Verify service installation is not null	
	    Given occ api is available
        When user hits the GET api without locale
	    Then returnred JSON should have service installation
	    And returned JSON should have value in default locale en 
	    
	    
	    Scenario: TC-1366 HYB:OCCP-871: Verify service installation is null
	    Given occ api is available
        When user hits the GET method without locale for service installation api
	    Then returned JSON response should not have service installation name and value
	    
	    
	    Scenario: TC-1367 HYB:OCCP-871: Verify service installation is not null and locale is en
	    Given occ api is available
	    When user hits the GET api with locale as en_ca
	    Then returnred JSON should have service installation
	    And returned JSON should have value in default locale en
	    
	    
	    Scenario: TC-1368 HYB:OCCP-871: Verify service installation is not null and locale is en_CA
	    Given occ api is available
	    When user hits the GET api with locale as en_ca
	    Then returnred JSON should have service installation
	    And returned JSON should have value in en ca
	    
	    Scenario: TC-1369 HYB:OCCP-871: Verify service installation is not null and locale is fr_CA
	    Given occ api is available
	    When user hits the GET api with locale as fr_ca
	    Then returnred JSON should have service installation
	    And returned JSON should have value in fr ca