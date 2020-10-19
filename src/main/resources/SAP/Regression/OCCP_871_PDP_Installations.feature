Feature: OCCP-871 PDP Installations

	Description: To test the HYBRIS Test Cases for the story OCCP-871
       
       
        @RegressionTest
		Scenario: TC-1365 HYB:OCCP-871: Verify service installation is not null	
	    Given occ api is available
        When user hits the GET method without locale for service installation
	    Then returnred JSON should have service installation
	    

	    @RegressionTest
	    Scenario: TC-1366 HYB:OCCP-871: Verify service installation is null
	    Given occ api is available
        When user hits the GET api without locale
	    Then returned JSON response should not have service installation name and value
	    

	    @RegressionTest
	    Scenario: TC-1367 HYB:OCCP-871: Verify service installation is not null and locale is en
	    Given occ api is available
	    When user hits the GET api with locale as en for service installation
	    Then returnred JSON should have service installation
	    

	    @RegressionTest
	    Scenario: TC-1368 HYB:OCCP-871: Verify service installation is not null and locale is en_CA
	    Given occ api is available
	    When user hits the GET method with locale as en_ca for service installation
	    Then returnred JSON should have service installation
	    

	    @RegressionTest
	    Scenario: TC-1369 HYB:OCCP-871: Verify service installation is not null and locale is fr_CA
	    Given occ api is available
	    When user hits the GET api as fr_ca for service installation
	    Then returnred JSON should have service installation