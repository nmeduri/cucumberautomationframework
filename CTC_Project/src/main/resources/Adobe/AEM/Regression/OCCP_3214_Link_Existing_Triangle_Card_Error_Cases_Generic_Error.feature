Feature: OCCP-3214 OCCP-3214 Account/Triangle ID - Link Rewards | Link Existing Triangle Rewards Card | Failure/Error Cases | Generic Error
Description: To test the ADOBE AEM Test Cases for the story OCCP-3214
	
	@RegressionTest @AEM @2638
	Scenario: TC-2638 Configure Error image on the screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit icon on header 
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab	
	And access the default error image property and upload the image
	And user click on done button
	And click on the publish button
	And close Browser
	And open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	Then link existing card screen should be displayed
	And enter luhn check bad card number
	And user click on continue button
	Then default error image changes should be reflected in ctc
	
	
	@RegressionTest @AEM @2639
	Scenario: TC-2639 Configure Text on Existing card component Error screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	#And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And in error screen user should be able to author error text for active validation
	And access and author the error text for active validation
	And user click on check button
	And click on the publish button	
	Given close Browser
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle rewards card
	And user should be able to enter pending activation loyalty card number
	And user click on continue button
	Then user should be redirected to active ownership validation screen
	And enter postal code
	And enter year of birth
	And user click on continue button
	Then the error text changes should be reflected on ctc site
	
	
	
	
	
	
	
	
			
	@RegressionTest @AEM @2640
	Scenario: TC-2640 Configure label for 'Try Again' CTA
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And access the try again cta property and configure the text 
	And user click on check button
	And click on the preview button
	And enter a loyalty card number which redirects to error screen
	And user click on continue button
	Then the tryagain text changes should be reflected on ctc site
	
	@RegressionTest @AEM @2641
	Scenario: TC-2641 Configure label for 'Cancel' CTA
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And access the cancel cta property and configure the text 
	And user click on check button
	And click on the preview button
	And enter a loyalty card number which redirects to error screen
	And user click on continue button
	Then the cancel text changes should be reflected on ctc site