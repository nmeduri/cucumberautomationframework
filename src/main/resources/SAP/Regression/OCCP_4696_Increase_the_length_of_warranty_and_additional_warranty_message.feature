Feature: OCCP_4696: Increase the length of warranty and additional warranty message

	Description: To test the HYBRIS Test Cases for the story OCCP-4696
	
			@RegressionTest
    		Scenario: TC-3061 HYB:OCCP-4444-OCCP-4696:Increase the length of warranty and additional warranty message- Verify warranty message in product API	
    		Given occ api is available
    		When user hits the GET method for warranty message product
    		Then returned JSON should display additionalWarrantyMessage
    		Then returned JSON should display warrantyMessage
    		
    		@RegressionTest
    		Scenario: TC-3062 HYB:OCCP-4444-OCCP-4696:Increase the length of warranty and additional warranty message- Verify warranty message for Variant product API
    		Given occ api is available
    		When Variant product -user hits the GET method for warranty message
    		Then returned JSON should display additionalWarrantyMessage
    		Then returned JSON should display warrantyMessage