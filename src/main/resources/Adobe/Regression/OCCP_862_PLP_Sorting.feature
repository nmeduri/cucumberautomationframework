Feature: OCCP-862 PLP Sorting

	Description: To test the ADOBE Test Cases for the story OCCP-862
	
	@RegressionTest @WebView
	Scenario: TC-40 Verify the sticky navigation feature of filter menu
	Given plp url is available
    When plp is displayed
    And scroll down the window below the view point
    Then the sorting option remains displayed at the top of the page in the sticky nav