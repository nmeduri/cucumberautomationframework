Feature: OCCP-1649 PDP: Product Badges (Limited Stock)

	Description: To test the HYBRIS Test Cases for the story OCCP-1649
       
       
        @RegressionTest
        Scenario: TC-1944 HYB:OCCP-1649-OCCP-2554: Varify Limited Stock badge build -Verify OCC API is returning lowStockThreshold
        Given Limited Stock badge product occ api is available
        When user hits the GET api for limited stock
     		Then user should be able to see lowStockThreshold under Categories container
        And lowStockThreshold is displayed under Sub Categories container