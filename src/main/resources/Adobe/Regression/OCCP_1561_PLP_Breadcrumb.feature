Feature: OCCP-1561 PLP Breadcrumb

	Description: To test the ADOBE Test Cases for the story OCCP-1561
	
	@RegressionTest @WebView @WideScreen
    Scenario: TC-119 Verify Breadcrumb is displayed on PLP for Desktop/Desktop Wide view
    Given open browser 
    When plp url is available
    When plp is displayed
    And scroll up to page
    Then breadcrumb is displayed
    And breadcrumb is based on category hierarchy in Hybris
    And main root homepage is also displayed in the path

    @RegressionTest @MobileView @TabletView
    Scenario: TC-121 Verify the Breadcrumb display on PLP for mobile view
    When plp url is available
    When plp is displayed
    And scroll up to page
    Then mobile breadcrumb is displayed
    And mobile breadcrumb is based on category hierarchy in Hybris
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-124 Verify the last breadcrumb is non-clickable on Desktop/Desktop wide
    Given plp url is available
    When plp is displayed
    And scroll up to page
    Then breadcrumb is displayed
    And last breadcrumb is not clickable