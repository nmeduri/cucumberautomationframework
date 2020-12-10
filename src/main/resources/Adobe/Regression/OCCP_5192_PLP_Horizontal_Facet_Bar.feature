Feature: OCCP-5192 PLP Horizontal Facet Bar

	Description: To test the ADOBE Test Cases for the story OCCP-5192
	
	@RegressionTest @WebView @WideScreen @TC-4646
	Scenario: TC-4646 OCCP-5192 PLP / SRP - Horizontal Facet Bar- User views horizontal facet bar on PLP/SRP on Desktop/Desktop Wide
	When plp url is available
    When plp is displayed
    Then horizontal panel bar is displayed
    Then category drop down is displayed
    Then top five facet specific buttons are displayed include sort facet by default as first button
    Then more filters button is displayed at very end
    
    @RegressionTest @WebView @WideScreen @TC-4647
	Scenario: TC-4647 OCCP-5192 PLP / SRP - Horizontal Facet Bar- User click on facet button within horizontal facet bar on Desktop/Desktop Wide
	When plp url is available
    When plp is displayed
    Then horizontal panel bar is displayed
    And user click on a facet button with in the horizontal facet panel
    Then open the facet model panel
    Then expend the facet correspoding to the button the user clicked on with in the horizontal facet bar
    
    @RegressionTest @MobileView @TabletView @TC-4648
	Scenario: TC-4648 OCCP-5192 PLP / SRP - Horizontal Facet Bar-  User views Sort & Filters button on PLP/SRP on Mobile
	When plp url is available
    When plp is displayed
    Then display the sort and filters button above the product results grid
    
    @RegressionTest @MobileView @TabletView @TC-4649
	Scenario: TC-4649 OCCP-5192 PLP / SRP - Horizontal Facet Bar-  User clicks Sort & Filter button on PLP/SRP on Mobile
	When plp url is available
    When plp is displayed
    Then display the sort and filters button above the product results grid
    And click on sort and filters
    Then open the facet model panel
    