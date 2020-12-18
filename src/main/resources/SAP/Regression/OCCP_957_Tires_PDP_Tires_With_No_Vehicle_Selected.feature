Feature: OCCP_957: Tires PDP - Tires with No Vehicle Selected 

	Description: To test the HYBRIS Test Cases for the story OCCP-957
       
      @RegressionTest
			Scenario: TC-6696 OCCP-957-OCCP-6312 -Build OCC API Outbound API for Tires product-Variant product when IsAutoApplicationProduct=TRUE
	    Given occ api is available 
			When user hits the GET api for Tires variant product
	    Then in the JSON response Fitment Type Code and isVehicleRequired should not be displayed under varinat options
	    
	    @RegressionTest
			Scenario: TC-6697 OCCP-957-OCCP-6312-Build OCC API Outbound API for Tires product-Variant product when IsAutoApplicationProduct= TRUE
	    Given occ api is available 
			When user hits the GET api for Tires variant product with Fitment Type Code is DirectFitment
	    Then in JSON response Fitment Type Code is DirectFitment and isVehicleRequired should not be displayed under varinat options
	    
	    @RegressionTest
			Scenario: TC-6698 OCCP-957-OCCP-6312- Build OCC API Outbound API for Tires product-Variant product when IsAutoApplicationProduct = FALSE
	    Given occ api is available 
			When user hits the GET api for Tires variant product when IsAutoApplicationProduct is FALSE
	    Then in JSON response Fitment Type Code and isVehicleRequired should not be displayed
	    
	    @RegressionTest
			Scenario: TC-6699 OCCP-957-OCCP-6312 - Build OCC API Outbound API for Tires product-base product which does not have variants when IsAutoApplicationProduct = TRUE
	    Given occ api is available 
			When user hits the GET api for Tires base product which does not have variants
	    Then Fitment Type Code and isVehicleRequired should be displayed out side of variant option for base product
	    
	    @RegressionTest
			Scenario: TC-6700 TC-6700 OCCP-957-OCCP-6312 - Build OCC API Outbound API for Tires product-base product which does not have variants when IsAutoApplicationProduct = TRUE
	    Given occ api is available 
			When user hits the GET api for Tires base product which does not have variants Fitment type code is UNIVERSAL
	    Then FitmentType Code is universal and isVehicleRequired should be displayed out side of variant option for base product
	    
	    
	    
	    