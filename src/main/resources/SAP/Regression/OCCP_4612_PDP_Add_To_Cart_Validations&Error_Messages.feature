Feature: OCCP_4612: PDP: Add to Cart Validations & Error Messages

	Description: To test the HYBRIS Test Cases for the story OCCP-4612
       
      @RegressionTest
			Scenario: TC-6556 HYB-OCCP-4612 -OCCP-7295 - Verify Max Qty for a product in get product info API
	    Given occ api is available 
			When user hits the GET api for max qty for a product
	    Then maxOrderQuantity should be displayed in the JSON response
	    
	    @RegressionTest
			Scenario: TC-6557 HYB-OCCP-4612 - OCCP-7295 - Verify Max Qty for a Variant product in get product info API
	    Given occ api is available 
			When user hits the GET api for max qty for variant product
	    Then maxOrderQuantity should be displayed in the JSON response