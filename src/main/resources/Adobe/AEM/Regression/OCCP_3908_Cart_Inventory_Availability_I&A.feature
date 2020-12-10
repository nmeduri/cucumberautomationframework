Feature: OCCP-3908 Cart - Inventory & Availability (I&A)
	Description: To test the ADOBE Test Cases for the story OCCP-3908
	
	@RegressionTest @AEM 
	Scenario: TC-3698 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify user is able to configure (Toast Message - Author ability)
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on Inventory and Availability tab
	Then configure the toast message
	And user click on check button
	And click on the preview button
  Given cart url is available
  Then increase the quantity after reaching the maximum limit
  Then click on checkout CTA button
  Then Please resolve the issues in your cart before checking out along with a Close CTA toast message should be display  
	
	@RegressionTest @AEM 
	Scenario: TC-3699 OCCP-3908Cart - Inventory & Availability (I&A) - Verify user is able to configure (BOPIS Availability Message - Author ability)
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on Inventory and Availability tab
  Then configure the BOPIS Availability message
	And user click on check button
	And click on the preview button
	Given cart url is available
  Then within the product card, pickup time and day that product will be available is displayed
 
 @RegressionTest @AEM 
	Scenario: TC-3700 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify user is able to configure (STH Availability Message - Author ability)
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on Inventory and Availability tab
  Then configure the STH Availability message
	And user click on check button
	And click on the preview button
	Given cart url is available
  Then within the product card, approximate ship by date is displayed
 
 @RegressionTest @AEM 
	Scenario: TC-3701 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify user is able to configure (STH Availability Message - Author ability)
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on Quantity Selector tab
  Then configure the Quantity Selector error messages
	And user click on check button
	And click on the preview button
	Given cart url is available
  Then increase the quantity after reaching the maximum limit
  Then informational message You have reached the limit of global banner max value is displayed
  
	@RegressionTest @AEM 
	Scenario: TC-3701 OCCP-3908 Cart - Inventory & Availability (I&A) - Verify user is able to configure (STH Availability Message - Author ability)
	Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on Inventory and Availability tab
  Then configure the line item error message
	And user click on check button
	And click on the preview button
	
 
	
