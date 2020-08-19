Feature: OCCP-983 PDP Features

	Description: To test the HYBRIS Test Cases for the story OCCP-983
       
        @RegressionTest
		Scenario: TC-1351 HYB:OCCP-983: Verify features are not null	
	    Given occ api is available
        When user hits the GET api without locale
        Then returned JSON should display feature Bullets section
        And returned JSON should display feature description
        
        @RegressionTest
        Scenario: TC-1353 HYB:OCCP-983: Verify features are not null and locale is en
        Given occ api is available
        When user hits the GET api with locale en
        Then returned JSON should display feature Bullets section
        And returned JSON should display feature description
        
        @RegressionTest
        Scenario: TC-1354 HYB:OCCP-983: Verify features are not null and locale is en_CA
        Given occ api is available
        When user hits the GET api with locale as en_ca
        Then returned JSON should display feature Bullets section
        And returned JSON should display feature description
        
        @RegressionTest
        Scenario: TC-1355 HYB:OCCP-983: Verify features are not null and locale is fr_CA
        Given occ api is available
        When user hits the GET api with locale as fr_ca
        Then returned JSON should display feature Bullets section
        And returned JSON should display feature description
	