Feature: OCCP-1182 Account | Merge Rewards | Active Ownership Validation
	Description: To test the ADOBE Test Cases for the story OCCP-1182
	
	@RegressionTest @AEM @TC-6430
	Scenario: TC-6430 OCCP-1182 Account | Merge Rewards | Active Ownership Validation- Configure text on <Error> modal
	Given open browser
	When aem author with access navigates to merge reward screen
	And login to AEM using the right credentials as mentioned in the test data 
	And click on my acount merge reward component
	And click on aem configure button
	Then click on merge reward page error screen tab
	Then configure the error message in merger reward screen
  And user click on check button
	And click on the publish button
	
	@RegressionTest @AEM
	Scenario: TC-6431 OCCP-1182 Account | Merge Rewards | Active Ownership Validation- Configure label for “Try Again” CTA on <Error> modal	
	Given open browser
	When aem author with access navigates to cart fragment screen
	And login to AEM using the right credentials as mentioned in the test data 
	Then configure tryAgainCTA label in merge reward screen
  And click on save and publish content fragment changes
  
  @RegressionTest @AEM
	Scenario: TC-6432 OCCP-1182 Account | Merge Rewards | Active Ownership Validation- Configure label for “Cancel” CTA on <Error> modal	
	Given open browser
	When aem author with access navigates to cart fragment screen
	And login to AEM using the right credentials as mentioned in the test data 
	Then configure cancel label in merge reward screen
  And click on save and publish content fragment changes