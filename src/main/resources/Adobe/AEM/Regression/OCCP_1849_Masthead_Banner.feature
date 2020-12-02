Feature: OCCP-1840 Masthead Banner
	Description: To test the ADOBE Test Cases for the story OCCP-1849
	
	#@RegressionTest @AEM @TC-3425
	Scenario: TC-3425 OCCP-1849 BANNER: Masthead(Default) Banner on 'Brand' PLP Template- Verify that author is able to configure Banner elements on AEM Brand specific LP/PLP page
	Given open browser
	When navigate to masthead banner authorable url
	And login to AEM using the credential as mentioned in the test data
	And click on masthead banner panel
	And click on aem configure button
	
	Then Title field is mandatory field
	Then Title tool tip is displayed
	And click on title tool tip
	Then title tool tip info message is displayed
	Then description field is displayed
	Then desceription tool tip is displayed
	And click on description tool tip
	Then description tool tip info message is displayed
	Then background color filed is displayed
	
	
	
	And configue title on the link master card screen
	And user click on done button
	And click on preview button
	And click on the publish button
	And navigate to link master card publish url
	Then the configured title is displayed on the screen
	And quit browser
	And open browser
	When navigate to masthead banner authorable url
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And revert link master card changes
	And user click on done button

	
	
	
	