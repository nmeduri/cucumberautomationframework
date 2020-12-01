Feature: OCCP-1750 Privacy Charter Display
	Description: To test the ADOBE Test Cases for the story OCCP-1750
	
	@RegressionTest @AEM @TC-605
	Scenario: TC-605 Verify the ability of a content author to configure header of the privacy charter 
	Given open browser
	When login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And configue the header of privacy charter
	And user click on check button
	And click on the publish
	And navigate on privacy charter page
	Then verify privacy charter header changes update on site
    And quit browser
	And open browser
	And login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And revert privacy charter details
	And user click on done button
	
	@RegressionTest @AEM @TC-606
	Scenario: TC-606 Verify the ability of a content author to configure body content of the privacy charter 
	Given open browser
	When login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And configue the content of privacy charter
	And user click on check button
	And click on the publish
	And navigate on privacy charter page
	Then verify privacy charter content changes update on site
    And quit browser
	And open browser
	And login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And revert privacy charter header
	And user click on done button
	
	@RegressionTest @AEM @TC-607
	Scenario: TC-607 Verify the ability of a content author to configure CTA label of the privacy charter overlay
	Given open browser
	When login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And update label of privacy charter desktop
	And user click on check button
	And click on the publish
	And navigate on privacy charter page
	Then verify privacy charter label changes update on site
    And quit browser
	And open browser
	And login to the backen system of privacy charter page with the credentials mentioned in the test data
	And login to AEM using the credential as mentioned in the test data
	And click on privacy charter panel
	And click on aem configure button
	And revert label of privacy charter desktop
	And user click on done button
	
	
	
	