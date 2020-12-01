Feature: OCCP-2286 Link Rewards By Triangle Master Card
	Description: To test the ADOBE Test Cases for the story OCCP-2286
	
	@RegressionTest @AEM @TC-1591
	Scenario: TC-1591 Verify the ability of a content author to configure Title for screen
	Given open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
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
	
	@RegressionTest @AEM @TC-1592
	Scenario: TC-1592 Verify the ability of a content author to configure label for 'Input' fields (like Last name, Year of Birth etc..) on screen 
	Given open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And configure the label for the input fields
	And user click on done button
	And click on the publish
	And navigate to link master card publish url
	Then the configured label last name is displayed on the screen
	And quit browser
	And open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And revert last name label master card changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1593
	Scenario: TC-1593 Verify the ability of a content author to configure label for 'Continue' CTA on screen
	Given open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And configure the label for continue button on master card
	And user click on done button
	And click on the publish
	And navigate to link master card publish url
	Then the configured label continue is displayed on the screen
	And quit browser
	And open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And revert continue button label master card changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1594
	Scenario: TC-1594 Verify the ability of a content author to configure label for 'Skip' CTA on screen
	Given open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And configure the lable for cancel button on master card
	And user click on done button
	And click on the publish
	And navigate to link master card publish url
	Then the configured label cancel is displayed on the screen
	And quit browser
	And open browser
	When login to the backend system of link reward master card with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on link card Pannel
	And click on aem configure button
	And revert cancel button label master card changes
	And user click on done button

	
	
	
	