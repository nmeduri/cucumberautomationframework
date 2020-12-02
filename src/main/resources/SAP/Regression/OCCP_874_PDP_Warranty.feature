Feature: OCCP_874_PDP_Warranty.feature

	Description: To test the HYBRIS Test Cases for the story OCCP-874
       
      #@RegressionTest
			Scenario: TC-1415 HYB:OCCP-874: Verify additional warranty message is not null and locale is en_CA	
	    Given occ api is available 
			When user hits the GET api with locale as en_ca
	    Then returned JSON should have warranty section in en_CA locale
	    
	    
	    #@RegressionTest
	    Scenario: TC-1349 HYB:OCCP-874: Verify Warranty message is not null and locale is en_CA	 
      Given occ api is available 
			When user hits the GET api with locale as en_ca
	    Then returned JSON should have warranty section in en_CA locale
	    
	    
	    #@RegressionTest
	    Scenario: TC-1416 HYB:OCCP-874: Verify additional warranty message is not null and locale is fr_CA
	    Given occ api is available 
			When user hits the GET api with locale as fr_ca
			Then returned JSON should have warranty section in fr_ca locale
	    
	    
	    #@RegressionTest
	    Scenario: TC-1350 HYB:OCCP-874: Verify Warranty message is not null and locale is fr_CA	
      Given occ api is available 
			When user hits the GET api with locale as fr_ca
			Then returned JSON should have warranty section in fr_ca locale
	    
    
      #@RegressionTest
      Scenario: TC-1411 HYB:OCCP-874: Verify Warranty - Warranty type is not null 
      Given occ api is available
      When user hits the GET api without locale
      Then returned JSON should have warranty section without locale
      And returned JSON should have warranty type name and value
       
        
      #@RegressionTest
      Scenario: TC-1414 HYB:OCCP-874: Verify Additional Warranty Message is not null and locale is en
	    Given occ api is available
			When user hits the GET api with locale en
	    Then returned JSON should have warranty section in en locale
	   
	    
	    #@RegressionTest
	    Scenario: TC-1410 HYB:OCCP-874: Verify Warranty - Additional Warranty Message is not null 
      Given occ api is available
      When user hits the GET api without locale
      Then returned JSON should have warranty section without locale
      And returned JSON should have additional warranty message name and value
        

      #@RegressionTest
      Scenario: TC-1413 HYB:OCCP-874: Verify Warranty - Additional Warranty Message is null
      Given occ api is available
      When user hit GET warranty type api without locale
      Then returned JSON should have warranty section without additional Warranty Message name and value
       
      #@RegressionTest
      Scenario: TC-1347 HYB:OCCP-874: Verify Warranty is null
      Given occ api is available
      When user hit GET warranty type api without locale
      Then returned JSON should not have warranty section without names and values
       
      #@RegressionTest
      Scenario: TC-1348 HYB:OCCP-874: Verify Warranty Message is not null and locale is en
      Given occ api is available
	    When user hits the GET api with locale en
	    Then returned JSON should have warranty section in en locale
	    
	    @RegressionTest
	    Scenario: TC-1412 HYB:OCCP-874: Verify Warranty - Warranty type is null
	    Given occ api is available
      When user hits the GET api without locale
      Then returned JSON should have warranty section without type and value
      
 			@RegressionTest
	    Scenario: TC-1346 HYB:OCCP-874: Verify Warranty - WarrantyMessage is not null
	    Given occ api is available
      When user hits the GET api without locale
      Then returned JSON should have warranty section in en locale
	