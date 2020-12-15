Feature: OCCP-1272 Cart Bulk Items - Delivery Options
Description: To test the ADOBE Test Cases for the story OCCP-1272

 @RegressionTest @WebView
	Scenario: TC-4657 OCCP-1272 Cart Bulk Items - Delivery Options- Configure tooltip text
  Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on bulk items tab
	And configure tooltip text
	And user click on check button
	And click on the preview button
	Given cart url is available
  When cart page is displayed for the product
  Then available delivery options are displayed along with a tooltip icon
  Then click on the standard delivery option tooltip
  Then verify the standard delivery tooltip information is displayed
  
	@RegressionTest @WebView
	Scenario: TC-5639 OCCP-1272 Cart Bulk Items - Delivery Options- Configure text label for "You have bulk items in your cart... bulk item(s)"
  Given open browser
	When AEM author with access to configure Cart page
	And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on bulk items tab
	And configure bulk message text
	And user click on check button
	And click on the preview button
	Given cart url is available
  When cart page is displayed for the product
  Then available delivery options are displayed along with a tooltip icon
  Then click on the standard delivery option tooltip
  Then verify the bulk message is updated
  
	@RegressionTest @AEM
	Scenario: TC-4655 Cart Bulk Items - Delivery Options- Configure delivery options text label
  When AEM author with access to configure Cart page
	#And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on bulk items tab
	And access all the delivery options label properties and configure the label text
	And user click on done button
	And click on the publish button
	Given cart url is available
	When cart page is displayed for the product
	Then verify delivery options label changes are reflected on the ctc site
	
	
	