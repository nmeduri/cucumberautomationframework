Feature: OCCP_6237- OCCP_6246: Technical Enabler story

	Description: To test the HYBRIS Test Cases for the story OCCP_6237- OCCP_6246
	
		    @RegressionTest
    		Scenario: TC-4734	HYB-OCCP-6237-OCCP-6246- PLP Images(Display Images for featured list)- Base product
    		Given PLP occ api is available
    		When hits the multiple base products list api	
        Then in the JSON  Medias should be displayed with all the data
        
        @RegressionTest
    		Scenario: TC-4809	HYB-OCCP-6237 - OCCP-6246 - PLP Images(Display Images for featured list)- Variant product
    		Given PLP occ api is available
    		When 4809-hits the multiple variant products list api
        Then in the JSON  Medias should be displayed with all the data