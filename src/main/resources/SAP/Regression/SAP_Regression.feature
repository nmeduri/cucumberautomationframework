Feature: Automated End2End Tests 

	Description: The purpose of this feature is to test End 2 End Integration.

	
	
	Scenario: SAP base url launch
	Given SAP base url is up
	When user launches the base url
	Then SAP Base site is displayed
	