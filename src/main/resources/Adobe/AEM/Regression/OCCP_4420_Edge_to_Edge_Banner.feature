Feature: OCCP-4420 Edge to Edge Banner
	Description: To test the ADOBE Test Cases for the story OCCP-4420
	
	@RegressionTest @AEM @TC-3574
	Scenario: TC-3574 OCCP-4420 Edge to Edge Banner- Verify Display of Authoring Error (errors for the authors) for Mandatory fields
	Given open browser
	When aem author with access navigates to edge to edge banner screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edge to edge banner panel
	And click on aem configure button
	Then configure all the mandatory edge to edge banner field
  And user click on done button
  And click on edit button
  #Then validate the Edge to Edge Banner changes are updated on site
	And click on edge to edge banner panel
	And click on aem configure button
	Then verify Error when mandatory field are not entered
	
	