Feature: OCCP-1647 Product Badges Clearnce

	Description: To test the ADOBE Test Cases for the story OCCP-1647
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-1296 Verify additional editable disclaimer Only Select Styles/Sizes is displayed when only select variants are on clearance at a store
	Given pdp url is available
    When pdp page is displayed for the product
    Then the editable badge label displays in store clearnce
    And an additional editable disclaimer displays only select style size badge