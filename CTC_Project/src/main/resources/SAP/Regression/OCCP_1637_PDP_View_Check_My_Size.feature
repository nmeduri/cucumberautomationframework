Feature: OCCP_1637: PDP: View Check My Size

	Description: To test the HYBRIS Test Cases for the story OCCP-1637
	  					
				@RegressionTest
        Scenario: TC-2381 HYB:OCCP-1637: Verify View My Size Guide - Update Product OCC API to display size guide when it is not null
    		Given occ api is available
    		When user generate token
    		Then user get the token
    		When User hits product api for size guide is not null
    		Then response JSON should have sizeGuide
    		Then response JSON should have SIZECHART under sizeGuide container
    		
    		@RegressionTest
        Scenario: TC-2382 HYB:OCCP-1637: Verify View My Size Guide - Update Product OCC API to display size guide when it is null
    		Given occ api is available
    		When user generate token
    		Then user get the token
    		When User hits product api for size guide is null
    		Then response JSON is diplayed sizeGuide with null
    		
