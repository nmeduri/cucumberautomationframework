Feature: OCCP-884 Search and SRP Display Similar Products Results

	Description: To test the ADOBE Test Cases for the story OCCP-884
	
    @RegressionTest @WebView 
	Scenario: Verify AEM content author is able to edit the search title label for the scenario where similar matching product results are displayed 
	When pdp product url is available
	And pdp page is displayed for the product
	Then feature section is not available in overview section
	Then resource section is displayed
	