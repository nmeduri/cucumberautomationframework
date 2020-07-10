Feature: Automated End2End Tests 

	Description: The purpose of this feature is to test End 2 End Integration.

	Scenario: Adobe author url launch
	Given Adobe author url is up
	When user launches the author url
	Then Adobe author signin page is displayed