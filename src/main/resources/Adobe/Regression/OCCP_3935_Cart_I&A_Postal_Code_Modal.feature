Feature: OCCP-3935 Cart I&A - Postal Code Modal
Description: To test the ADOBE Test Cases for the story OCCP-3935

@RegressionTest @WebView
	Scenario: TC-3674 Verify that the user is able to view (Trigger Postal Code Modal)
  Given cart url is available
  When cart page is displayed for the product
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
  And close the postal code modal
  And user clicks on change cta within the ship to home fulfillment type section header
  Then Postal Code modal should be displayed
  And close the postal code modal
  
  @RegressionTest @WebView
	Scenario: TC-3675 Verify that the user is able to view (Trigger Postal Code Modal)
  Given cart url is available
  When cart page is displayed for the product
  And scroll up to page
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
 	And in the modal the title 'change postal code' should be displayed
 	And free text box to input new postal code should be displayed along with field title 'postal code'
 	And by default the free text box should display previously defined postal code
 	And change cta should be displayed
 	And cancel cta should be displayed
 	And cross button should be displayed to close the modal
 	
 	@RegressionTest @WebView
	Scenario: TC-3676 Verify that the user is able to view (Trigger Postal Code Modal)
  Given cart url is available
  When cart page is displayed for the product
  And scroll up to page
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
  And user clicks on cancel cta
  Then postal code modal should be closed
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
  And user clicks on 'x' cta
  Then postal code modal should be closed
  And user clicks on change cta within the order summary shipping fee section of the order summary
  And user inputs a valid postal code within delivery range
  And user clicks on change cta 
  And success toast message 'postal code has been updated' should be displayed
  
  @RegressionTest @WebView
	Scenario: TC-3677 Verify that the user is able to view (Trigger Postal Code Modal)
  Given cart url is available
  When cart page is displayed for the product
  And scroll up to page
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
  And user inputs a valid postal code within delivery range
  And user clicks on change cta 
  And success toast message 'postal code has been updated' should be displayed
  And refresh the page
  And user clicks on change cta within the order summary shipping fee section of the order summary
  Then Postal Code modal should be displayed
  And user inputs out of range deliver postal code
  And user clicks on change cta 
  Then out of range for delivery inline error should be displayed
  And close the postal code modal
  And user clicks on change cta within the order summary shipping fee section of the order summary
  And user inputs an invalid postal code
  And user clicks on change cta 
  Then error toast message should be displayed
   