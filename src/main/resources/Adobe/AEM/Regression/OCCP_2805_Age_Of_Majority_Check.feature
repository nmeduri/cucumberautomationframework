Feature: OCCP-2805 Account/Triangle ID - Link Rewards | Age of Majority Check
	Description: To test the ADOBE Test Cases for the story OCCP-2805
	
	#@RegressionTest @AEM
	Scenario: TC-2599 Configure Error Text on the error page
	Given open browser
	When aem author with access navigates to new rewards card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on aem new reward card title
	And click on aem configure button
	And click on error tab in new reward card screen 
	And user should be able to author error text
	And user updates the error text
	And user click on check button
	And click on preview button
	Then error text changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2600 Configure Try Again CTA label on the error page
	When aem author with access navigates to new rewards card screen
	And click on aem new reward card title
	And click on aem configure button
	And click on error tab in new reward card screen 
	And user should be able to author try again cta label
	And user updates the try again cta label
	And user click on check button
	And click on preview button
	Then try again cta label changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2601 Configure Cancel CTA label on the error page
	When aem author with access navigates to new rewards card screen
	And click on aem new reward card title
	And click on aem configure button
	And click on error tab in new reward card screen 
	And user should be able to author cancel cta label
	And user updates the cancel cta label
	And user click on check button
	And click on preview button
	Then cancel cta changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2598 Configure Error Image on the error screen
	When aem author with access navigates to new rewards card screen
	And click on aem new reward card title
	And click on aem configure button
	And click on error tab in new reward card screen 
	And user should be able to author error image
	And user updates the error image
	And user click on check button
	And click on preview button
	Then error image changes are reflected on ctc site