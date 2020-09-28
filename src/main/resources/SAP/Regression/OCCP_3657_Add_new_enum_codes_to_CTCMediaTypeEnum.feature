Feature: OCCP_3657_Add new enum codes to CTCMediaTypeEnum

	Description: To test the HYBRIS Test Cases for the story OCCP-3657

				@RegressionTest
        Scenario: TC-3035 HYB:OCCP-3773-OCCP-3657- Verify LIFESTYLE_IMAGE - CTCMediaTypeEnum - Update Product OCC API 
        Given Product api is available
				When User user hits the GET method for product api
				Then response JSON should have mediaType