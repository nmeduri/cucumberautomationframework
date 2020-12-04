Feature: OCCP-1840 Masthead Banner
	Description: To test the ADOBE Test Cases for the story OCCP-1849
	
	@RegressionTest @AEM @TC-3425
	Scenario: TC-3425 OCCP-1849 BANNER: Masthead(Default) Banner on 'Brand' PLP Template- Verify that author is able to configure Banner elements on AEM Brand specific LP/PLP page
	Given open browser
	When masthead banner authorable url is available
	And login to AEM using the credential as mentioned in the test data
	And click on masthead banner panel
	And click on aem configure button
	Then Title field is mandatory field
	Then Title tool tip is displayed
	And click on title tool tip
	Then title tool tip info message is displayed
	Then description field is displayed
	Then descerption tool tip is displayed
	And click on description tool tip
	Then description tool tip info message is displayed
	Then background color field is displayed
	Then background color field is mandatory field
	And configure the title description background color details
	And user click on done button
	And click on preview button
	And click on the publish button
	And navigate on publish masthead url
	Then the configured details are displayed on the publish page
	Then breadcumb would be appear inside the banner
	And quit browser
	And open browser
	When masthead banner authorable url is available
	And login to AEM using the credential as mentioned in the test data
	And click on masthead banner panel
	And click on aem configure button
	And revert the title description background color details
	And user click on done button

	
	
	
	