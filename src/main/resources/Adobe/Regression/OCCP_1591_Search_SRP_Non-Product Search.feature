Feature: OCCP-1591 Search and SRP - Non-Product Search

	Description: To test the ADOBE Test Cases for the story OCCP-1591
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-83 Verify the functionality of non-product related searches
	Given pdp url is available
	Then select a key word related to faq on search bar
	And click on search icon
	Then validate the search result
	