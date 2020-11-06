Feature: OCCP-1750 Privacy Charter Display
	Description: To test the ADOBE Test Cases for the story OCCP-1750
	
	#@RegressionTest @AEM @TC-605
	Scenario: TC-605 Verify the ability of a content author to configure header of the privacy charter 
	Given open browser
	When login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	
	
	
	And configue title on the link master card screen
	And user click on done button
	And click on preview button
	And click on the publish
	And navigate to link master card publish url
	Then the configured title is displayed on the screen
	And quit browser
	And open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And revert link master card changes
	And user click on done button
	
	
	
	