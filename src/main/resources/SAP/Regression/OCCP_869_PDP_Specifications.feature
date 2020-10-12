Feature: OCCP-869  PDP: Specifications

	Description: To test the HYBRIS Test Cases for the story OCCP-869
       

        @RegressionTest
				Scenario: TC-1356 HYB:OCCP-869:Verify Product Specifications are not null 	
	    	Given occ api is available
        When user hits GET api
        Then returned JSON should have specifications section
        And retunred JSON should have feature unit names and value
        
        @RegressionTest
        Scenario: TC-1358 HYB:OCCP-869:Verify Product Specifications are not null and locale is en
        Given occ api is available
        When user hits the GET api with locale en
        Then returned JSON should have specifications section
        And retunred JSON should have feature unit names and value
        
        @RegressionTest
        Scenario: TC-1359 HYB:OCCP-869:Verify Product Specifications are not null and locale is en_CA 
        Given occ api is available
        When user hits the GET api with locale as en_ca
        Then returned JSON should have specifications section
        And retunred JSON should have feature unit names and value
        
        @RegressionTest
        Scenario: TC-1360 HYB:OCCP-869:Verify Product Specifications are not null and locale is fr_CA
        Given occ api is available
        When user hits the GET api with locale as fr_ca
        Then returned JSON should have specifications section
        And retunred response should have feature unit names and value in fr ca
        
        @RegressionTest
				Scenario: TC-1357 HYB:OCCP-869: Verify Product Specifications  are null
	    	Given occ api is available
        When user hits Specifications GET api 
        Then returned JSON should not have specifications section
       
        
        
  