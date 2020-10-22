Feature: OCCP_4444- OCCP_4416: Tech Enablers

	Description: To test the HYBRIS Test Cases for the story OCCP-4444- OCCP-4416
	
			@RegressionTest
    		Scenario: TC-3110 HYB:OCCP-4444-OCCP-4416:Verify display of default colour in product details OCC API based on the display name
    		Given occ api is available
    		When user hits product details get method api
    		Then user should to see variantValueCategory under variantMatrix container
    		And colors are displayed under variantValueCategory container
    		
    		@RegressionTest
    		Scenario: TC-3111 HYB:OCCP-4444-OCCP-4416:Verify display of default size in product details OCC API based on the display name
    		Given occ api is available
    		When user hits product details get method api
    		Then user should to see sizes variantValueCategory under variantMatrix container
    		And Sizes are displayed under variantValueCategory container
    		
    		@RegressionTest
    		Scenario: TC-3112 HYB:OCCP-4444-OCCP-4416:Verify display of same colour and different size in product details OCC API based on the display name
    		Given occ api is available
    		When user hits get method api for product details same colour and different size
    		Then user should to see variantValueCategory under variantMatrix container
    		Then user should to see sizes variantValueCategory under variantMatrix container
    		And Sizes are displayed under variantValueCategory container
    		