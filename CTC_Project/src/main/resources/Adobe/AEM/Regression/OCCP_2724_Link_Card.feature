Feature: OCCP-2724 Link Card
	Description: To test the ADOBE Test Cases for the story OCCP-2724
	
	@AEM
	Scenario: TC-2039 Verify the Error image on the Error screen is configurable via AEM 
	Given open browser
	When AEM author with access to configure link master card page load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And click on error screen tab
	And update the image field
	And user click on done button
	And click on preview button
	And user enter account detail
	And verify clicks on continue button
	Then error images are reflect on site
	And click on edit button
	And click on link card Pannel
	And click on aem configure button
	And click on error screen tab
	And reverse the error image changes
	And user click on done button
	
	@AEM
	Scenario: TC-2040 Verify the Error text on the Error screen is configurable via AEM 
	Given open browser
	When AEM author with access to configure link master card page load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And click on error screen tab
	And update the image text field
	And user click on done button
	And click on preview button
	And user enter account detail
	And verify clicks on continue button
	Then error images text are reflect on site
	And click on edit button
	And click on link card Pannel
	And click on aem configure button
	And click on error screen tab
	And reverse the error image text changes
	And user click on done button