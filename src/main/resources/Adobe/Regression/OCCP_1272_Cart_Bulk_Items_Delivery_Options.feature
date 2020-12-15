Feature: OCCP-1272 Cart Bulk Items - Delivery Options
Description: To test the ADOBE Test Cases for the story OCCP-1272

	@RegressionTest @WebView 
	Scenario: TC-4651 OCCP-1272 Cart Bulk Items - Delivery Options- Verify Default View
	
	Given cart url is available
  When cart page is displayed for the product
  Then a dialog box for selecting the delivery options is displayed
  Then available delivery options are displayed along with a tooltip icon
  Then validate radio buttons are displayed to change the delivery options
 
  @RegressionTest @WebView 
	Scenario: TC-4653 OCCP-1272 Cart Bulk Items - Delivery Options- Verify Tooltip Display

	Given cart url is available
  When cart page is displayed for the product
  Then available delivery options are displayed along with a tooltip icon
  Then click on the standard delivery option tooltip
  Then verify the standard delivery tooltip information is displayed
  Then click on tooltip close button
  Then click on the in-home delivery option tooltip
  Then verify the in-home delivery tooltip information is displayed
  Then click on tooltip close button
  Then click on the in-home and unpack delivery option tooltip
  Then verify the in-home and unpack delivery tooltip information is displayed
  Then click on tooltip close button
  
   @RegressionTest @WebView 
   	Scenario: TC-4654 OCCP-1272 Cart Bulk Items - Delivery Options- Verify when user clicks on close icon "x"
	
	Given cart url is available
  When cart page is displayed for the product
  Then available delivery options are displayed along with a tooltip icon
  Then click on the standard delivery option tooltip
  Then verify the standard delivery tooltip information is displayed
  Then click on tooltip close button
  Then verify the tool tip information is not displayed
  Then click on the in-home delivery option tooltip
  Then verify the in-home delivery tooltip information is displayed
  Then click on tooltip close button
  Then verify the tool tip information is not displayed
  Then click on the in-home and unpack delivery option tooltip
  Then verify the in-home and unpack delivery tooltip information is displayed
  Then click on tooltip close button
  Then verify the tool tip information is not displayed