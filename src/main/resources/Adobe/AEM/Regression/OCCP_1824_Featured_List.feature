Feature: OCCP-1824 Featured List: Informational Featured Lists with Icons (Authorable)
	Description: To test the ADOBE Test Cases for the story OCCP-1824
	
	@RegressionTest @AEM
	Scenario: TC-1800 Verify feaured list component is configurable on an authored page
	Given open browser
	When AEM author with access to configure informational feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the feature list component on the authored page
	And user click on done button
	And click on preview button
	Then verify the configured informational feature list component
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And reverse the feature list component changes
	And user click on done button
	
	@RegressionTeset @AEM @TC-1801
	Scenario: TC-1801 Verify the display of error message when mandatory fields are not added while authoring the content 
	Given open browser
	When AEM author with access to configure informational feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And do not fill the mandotary fields
	And user click on check button
	Then user should see authoring error message as  the mandatory fields are not entered
	And reverse the image one changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1802
	Scenario: TC-1802 Verify the display of error message when min. threshold for the tile are not met when authroing the Informational featured list component while authoring the content 
	Given open browser
	When AEM author with access to configure informational feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And fill minimum thershold value with less than min
	And user click on check button
	Then user should see error authoring message as the mininum thershold
	
	@RegressionTest @1811
	Scenario: TC-1811 Verify the entire FL card is clickable when only URL is authored without Learn More on WideScreen
	Given open browser
	Given navigate to feature list page
	When click on learn more link
	Then user should be redirected to defined destination on same tab
	
	@RegressionTest @AEM @TC-3756
	Scenario: TC-3756 Verfiy the display of details on the Informational featured list page- when few of the fields on the card are not authored
	Given open browser
	When AEM author with access to configure informational feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	Then verify title on the card when field is not authored in AEM
	Then verify description on the card when field is not authored in AEM
	Then verify learn more CTA on the card when field is not authored in AEM
	And user click on check button
	And click on the preview button
	And verify title on the card is not displayed when field is not authored
	And verify description on the card is not displayed when field is not authored
	And verify learn more CTA Text on the card is not displayed when field is not authored
	
	@RegressionTest @AEM @TC-3760
	Scenario: TC-3760 Verfiy the display of details on the Informational featured list page- when few of the fields on the card are not authored
	Given open browser
	When AEM author with access to configure informational feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	Then verify title on the card when field is authored in AEM
	Then verify description on the card when field is not authored in AEM
	Then verify learn more CTA on the card when field is not authored in AEM
	And user click on check button
	And click on the preview button
	#And verify title on the card is displayed when field is authored
	And verify description on the card is not displayed when field is not authored
	And verify learn more CTA Text on the card is not displayed when field is not authored
	
	
	@RegressionTest @AEM 
	Scenario: TC-1830 Verify the display of text instead of "Learn More" link on the FL card
	Given open browser
	When navigate to test feature list page to check learn more link
	And click on learnmore FL
	Then user should not be redirected to any new page and Learnmore is not clickable 

	
	
	
	
	
	
	