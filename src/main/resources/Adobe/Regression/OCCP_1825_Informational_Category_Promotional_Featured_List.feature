Feature: OCCP-1825 Featured List : Informational Category Promotional Featured List
	Description: To test the ADOBE Test Cases for the story OCCP-1825
	
	
	@RegressionTest @WebView @WideScreen @TC-1812
	Scenario: TC-1812 Verfiy the display of default list of products in the carousel view on the Featured list page on Widescreen
	Given open browser
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	
	
	
