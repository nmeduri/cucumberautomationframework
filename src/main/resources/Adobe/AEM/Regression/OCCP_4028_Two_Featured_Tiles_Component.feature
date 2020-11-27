Feature: OCCP-4028:Two Featured Tiles component
	Description: To test the ADOBE Test Cases for the story OCCP-4028
	
	@RegressionTest @AEM @TC-3495
	Scenario: TC-3495	OCCP-4028 Two Featured Tiles component- Verify Configuration of the elements within the Two Featured Tiles component
	#Given open browser
	When AEM author with access to configure two featured tile page component  
	And login to AEM using the credential as mentioned in the test data
	And click on Two featured Tile component
	And click on aem configure button
	Then Verify the Component Title field is present in Two Featured Tiles component
	Then Verify the Layout field is present in Two Featured Tiles component
	Then Verify Tile Image field is present in Two Featured Tiles component
	
	@RegressionTest @AEM
	Scenario: TC-4313	OCCP-4028 Two Featured Tiles component- Verify look and feel for the Two Featured tile component with different combination of URL authoring
	Given open browser
	When AEM author with access to configure two featured tile page component  
	And login to AEM using the credential as mentioned in the test data
	And click on Two featured Tile component
	And click on aem configure button
	Then Verify the Component Title field is present in Two Featured Tiles component
	Then Verify the Layout field is present in Two Featured Tiles component
	Then Verify Tile Image field is present in Two Featured Tiles component
	