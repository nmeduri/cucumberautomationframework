Feature: OCCP-2722 Account/Triangle ID - Link Rewards | Successful linking
Description: To test the AEM Test Cases for the story OCCP-2722

@RegressionTest @AEM
  Scenario: TC-2216 Configure Image on the Screen
	Given open browser
	When AEM author with access to configure link master card page load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on edit icon on header
	And click on link card Pannel
	And click on aem configure button
	And click on success screen tab
	And upload the success image
	And user click on done button
	And click on the publish button
	And close Browser
	And open browser
	Given sign up url is available
	Then sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	And user click on verification email
	And user click on here to verify email link
	Then page your email has been verified displayed
	And user clicks on continue button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	And clicks on register card button
	Then user should taken to success screen
	Then success image changes should be reflected in ctc
	And switch on parent frame
	
	@RegressionTest @AEM
  Scenario: TC-2217 Configure label for Continue CTA on the screen
	When AEM author with access to configure link master card page load on the page
	And login to AEM using the credential as mentioned in the test data
	And click on edit icon on header
	And click on link card Pannel
	And click on aem configure button
	And click on success screen tab
	And author the success screen continue cta
	And user click on done button
	And click on the publish button
	And close Browser
	And open browser
	Given sign up url is available
	Then sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	And user click on next button
	And email verification sent confirmation screen is displayed
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	And user click on verification email
	And user click on here to verify email link
	Then page your email has been verified displayed
	And user clicks on continue button
	Then link card screen should be displayed
	And verify when user clicks on the get a new triangle rewards card link
	Then user should redirect to the get a new triangle rewards card screen
	And verify when user enter valid information on complete your profile screen
	And verify clicks on continue button
	And clicks on register card button
	Then user should taken to success screen
	Then success screen continue changes should be reflected in ctc
	And switch on parent frame