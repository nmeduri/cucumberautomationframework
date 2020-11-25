Feature: 	OCCP-3082 Featured List |Product List|Authorable
	Description: To test the ADOBE Test Cases for the story OCCP-3082
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3914
	Scenario: TC-3914	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of pcode for the Product |Mobile/Desktop/Desktop wide 
	Given open browser
	When AEM author with access to configure featured product list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And configure the product code component on the authored page
	And user click on done button

	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3915
	Scenario: TC-3915	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Override default product image |Mobile/Desktop/Desktop Wide 
	Given open browser
	When AEM author with access to configure featured product list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And configure the product image component on the authored page
	And user click on done button
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3916
	Scenario: TC-3916	OCCP-3082 Featured List |Product List| Authorable- Verify Authoring Error for min threshold for tiles to be displayed
	Given open browser
	When AEM author with access to configure featured product list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And fill minimum thershold value in product feature list with less than min
	And user click on check button
	Then user should see error authoring message as the mininum thershold
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3917
	Scenario: TC-3917	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Featured list on desired Page
	Given open browser
	When AEM author with access to configure featured product list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And do not fill the mandatory field in feature product list page
	And user click on check button
	Then user should see error message as  mandatory field not entered
	