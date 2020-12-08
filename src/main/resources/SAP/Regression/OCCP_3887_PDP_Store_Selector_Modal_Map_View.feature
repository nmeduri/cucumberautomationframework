Feature: OCCP_3887: PDP: Store Selector Modal - Map View

	Description: To test the HYBRIS Test Cases for the story OCCP_3887
	
		    @RegressionTest
    		Scenario: TC-5379 HYB-OCCP-3887 - OCCP-3889- verify  isStorOpen field in OCC API when  isStoreOpen = true if CTCStore.status = ACTIVE
    		Given ctr store locator occ api is available
    		When hits the GET api for store locator
    		Then isStoreOpen True should be displayed in the JSON response
    		And openingHours should be displayed with all attributes in the JSON response

