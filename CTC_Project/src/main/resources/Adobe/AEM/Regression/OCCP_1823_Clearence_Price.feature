Feature: OCCP-1823 Clearence Price
	Description: To test the ADOBE Test Cases for the story OCCP-1823
	
	@RegressionTest @AEM @TC-1569
	Scenario: TC-1569 Verify the ability of a business user to configure text label "NOW" 
	Given open browser
	When AEM author with access to configure price deatil PLP authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on price detail tab
	And configure the text label now
	And user click on done button
	And click on the publish
	When price detail plp url is available
	Then applied changes are reflect on page
	And quit browser
	Given open browser
	When AEM author with access to configure price deatil PLP authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on PLP Pannel
	And click on aem configure button
	And click on price detail tab
	And revert the text label now
	And user click on done button
	
	
	
	

	
	
	
	
	
	
	