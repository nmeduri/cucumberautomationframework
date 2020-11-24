Feature: OCCP_3657_Add new enum codes to CTCMediaTypeEnum

Description: To test the HYBRIS Test Cases for the story OCCP-3657


	    @RegressionTest
      Scenario: TC-3035 HYB:OCCP-3773-OCCP-3657- Verify LIFESTYLE_IMAGE - CTCMediaTypeEnum - Update Product OCC API 
      Given occ api is available
			When hits GET method for product api-3035
	    Then mediaType is available in JSON response-3035


