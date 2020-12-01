Feature: OCCP-2803 Link Existing Active Loyalty card to the account- Active Ownership Validation
Description: To test the ADOBE Test Cases for the story OCCP-2803
	
	@RegressionTest @AEM @2512
	Scenario: TC-2512 Configure Title and Subtitle on Ownership Validation screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on active ownership validation tab
	And user should be able to author active rewards card title
	And access the active rewards card title property and author the title
	And user should be able to author active rewards card sub title
	And access the active rewards card sub title property and author the title
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
	Then the active rewards card title and sub title changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2513 Configure label for 'Input' fields (like Postal Code, Year of Birth...)
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on active ownership validation tab
	And user should be able to author yob
	And access and author the yob property
	And user should be able to author postal code
	And access and author the postal code property
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
	Then the yob and postal code changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2514 Configure label for 'Continue' CTA on Ownership Validation screen
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on active ownership validation tab
	And user should be able to author continue cta
	And access and author the continue cta property
	And user click on check button
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
	Then the continue label changes should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2515 Configure label for 'Cancel' CTA on Ownership Validation screen
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on active ownership validation tab
	And user should be able to author cancel cta
	And access and author the cancel cta property
	And user click on check button
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
	Then the cancel label changes should be reflected on ctc site
	
	@RegressionTest @AEM @SmokeTest 
	Scenario: TC-2516 Configure Image on the Error screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And in error screen user should be able to author error image for active validation
	And access and author the error image for active validation
	And user click on check button
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
	Then the error image changes should be reflected on ctc site
	
	@RegressionTest @AEM @2518
	Scenario: TC-2518 Configure Text on Existing card component Error screen
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
	
	@RegressionTest @AEM @2519
	Scenario: TC-2519 Configure label for TryAgain on the screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And in error screen user should be able to author tryagain cta
	And access and author the error tryagain cta
	And user click on check button
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
	Then the trygain cta changes should be reflected on ctc site
	
	@RegressionTest @AEM @2520
	Scenario: TC-2520 Configure label for Cancel CTA on the screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And in error screen user should be able to author cancel cta
	And access and author the error cancel cta
	And user click on check button
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
	Then the cancel cta changes should be reflected on ctc site
	
	
	
	
	@RegressionTest @AEM @SmokeTest @2516
	Scenario: TC-2516 Configure Image on the Error screen
	Given open browser
	When aem author with access navigates to link existing card screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	And click on aem link existing card title
	And click on aem configure button
	And click on link existing card error tab
	And in error screen user should be able to author error image for active validation
	And access and author the error image for active validation
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
	Then the error image changes should be reflected on ctc site
	