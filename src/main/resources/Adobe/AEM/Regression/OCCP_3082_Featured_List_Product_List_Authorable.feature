Feature: OCCP-3082 : Featured List |Product List|Authorable
	Description: To test the ADOBE Test Cases for the story OCCP-3082
	
	@RegressionTest @AEM
	Scenario: TC-3920  OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Title for the Product FL |Mobile/Desktop/Desktop wide 
	Given open browser
	When AEM author with access to configure feature list product list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then configure the FL Title on featured list component
	And user click on done button
	And click on preview button
	Then verify the configured featured product title is displayed
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then configure the FL Title on featured list component
	And user click on done button
	And click on preview button
	Then verify the configured featured product title is displayed
	
	@RegressionTest @AEM
	Scenario: TC-3921	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of on clicking FL -user is navigated to new tab/same page 
	When AEM author with access to configure feature list product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then configure whether clicking on card will open a new tab or open on same page
	And user click on done button
	And click on preview button
	Then verify the configured redirection when click on product card
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then configure whether clicking on card will open a new tab or open on same page
	And user click on done button
	And click on preview button
	Then verify the configured redirection when click on product card
	
	@RegressionTest @AEM
	Scenario: TC-3922	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of display/hiding badge  on Product Card |Mobile/Desktop/Desktop wide 
	When AEM author with access to configure feature list product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product badges on product card
	And user click on done button
	And click on preview button
	Then verify the configured enable or disable display of product badges on product card
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product badges on product card
	And user click on done button
	And click on preview button
	Then verify the configured enable or disable display of product badges on product card
	
	@RegressionTest @AEM
	Scenario: TC-3923	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of display/hiding save story  on Product Card |Mobile/Desktop/Desktop
	When AEM author with access to configure feature list product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product save story on product card
	And user click on done button
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product save story on product card
	And user click on done button
	
	
	@RegressionTest @AEM
	Scenario: TC-3924	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of display/hiding Product Name /description  on Product Card |Mobile/Desktop/Desktop wide
	When AEM author with access to configure feature list product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product description on product card
	And user click on done button
	And click on preview button
	Then verify the configured enable or disable display of product description on product card
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then user can enable or disable display of product description on product card
	And user click on done button
	And click on preview button
	Then verify the configured enable or disable display of product description on product card
	
	@RegressionTest @AEM
	Scenario: TC-3918	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Authoring Error for Mandatory fields
	When AEM author with access to configure feature list product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then author configures the component and mandatory sections are not authored
	And click on the done button
	Then authoring error alert should be displayed
	And author configures the component and mandatory sections are authored
	And user click on done button
	And click on preview button
	Then verify the configured mandatory sections on product card
	When AEM author with access to configure fr locale feature list product list authorable page
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	Then author configures the component and mandatory sections are not authored
	And click on the done button
	Then authoring error alert should be displayed
	And author configures the component and mandatory sections are authored
	And user click on done button
	And click on preview button
	Then verify the configured mandatory sections on product card
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3914
	Scenario: TC-3914	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of pcode for the Product |Mobile/Desktop/Desktop wide 
	When AEM author with access to configure featured product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And configure the product code component on the authored page
	And user click on done button

	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3915
	Scenario: TC-3915	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Override default product image |Mobile/Desktop/Desktop Wide 
	When AEM author with access to configure featured product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And configure the product image component on the authored page
	And user click on done button
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3916
	Scenario: TC-3916	OCCP-3082 Featured List |Product List| Authorable- Verify Authoring Error for min threshold for tiles to be displayed
	When AEM author with access to configure featured product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And fill minimum thershold value in product feature list with less than min
	And user click on check button
	Then user should see error authoring message as the mininum thershold
	
	@RegressionTest @MobileView @Desktop @WideScreen @AEM @TC-3917
	Scenario: TC-3917	OCCP-3082 Featured List |Product List| Authorable- Verify configuration of Featured list on desired Page
	When AEM author with access to configure featured product list authorable page
	#And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on featured product list panel
	And click on aem configure button
	And do not fill the mandatory field in feature product list page
	And user click on check button
	Then user should see error message as  mandatory field not entered
	
