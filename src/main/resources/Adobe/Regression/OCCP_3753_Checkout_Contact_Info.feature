Feature: OCCP-3753 Checkout : Contact Info - Guest User & Authenticated User
Description: To test the ADOBE Test Cases for the story OCCP-3753

@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4753 Display of contact info area
	When user navigate to checkout contact info page
	When the checkout contact info page is displayed
	Then in contact information are title - contact information should be displayed
	And email address field should be displayed
	And phone number field should be displayed
	And tooltip icon next to the phone number should be displayed
	And cta button 'next' should be displayed
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4754 Guest user enters the details for contact information
	When user navigate to checkout contact info page
	When the checkout contact info page is displayed
	Then user should fill the contact information details - email address and phone number
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4755 The user clicks on the CTA button 'Next' after filling the details
	When user navigate to checkout contact info page
	And user accepts window alert
	When the checkout contact info page is displayed
	Then user should fill the contact information details - email address and phone number
	And user clicks on the CTA button 'Next' after filling the details
	Then the contact information should move to drawer
	And the user should move to the next section of the checkout page
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4756 Verify display of tooltip message
	When user navigate to checkout contact info page
	And user accepts window alert
	When the checkout contact info page is displayed
	And tooltip icon next to the phone number should be displayed
	And user clicks on the tooltip icon
	Then the tooltip message should be displayed
	