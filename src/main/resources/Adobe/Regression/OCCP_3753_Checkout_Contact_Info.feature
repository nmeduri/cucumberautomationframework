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
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-4757 The user clicks on the close icon [X]
	When user navigate to checkout contact info page
	And user accepts window alert
	When the checkout contact info page is displayed
	And tooltip icon next to the phone number should be displayed
	And user clicks on the tooltip icon
	Then the tooltip message should be displayed
	And user clicks on close icon x
	Then the tooltip message should be closed
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-4758 The user clicks outside the tooltip container
	When user navigate to checkout contact info page
	And user accepts window alert
	When the checkout contact info page is displayed
	And tooltip icon next to the phone number should be displayed
	And user clicks on the tooltip icon
	Then the tooltip message should be displayed
	And user clicks outside the tooltip container
	Then the tooltip message should be closed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-4759 Contact info section is auto-populated with both Email & Phone number for the authenticated user.
	When user navigate to checkout contact info page
	And user accepts window alert
	When the checkout contact info page is displayed
 	And verify clicking on accounts option
 	And verify and click on signin link
 	And user accepts window alert
 	And for checkout page enter email detail
	And for checkout page user enter password
	And user click on sign in button
	When user navigate to checkout contact info page
	Then the contact information should move to drawer
	And email address should be auto populated
	And phone number should be auto populated
	And edit button should be displayed to make changes to the saved details 
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-4760 Edit option is displayed to update the saved details
	When user navigate to checkout contact info page
	When the checkout contact info page is displayed
 	And verify clicking on accounts option
 	And verify and click on signin link
 	And user accepts window alert
 	And for checkout page enter email detail
	And for checkout page user enter password
	And user click on sign in button
	When user navigate to checkout contact info page
	Then the contact information should move to drawer
	And email address should be auto populated
	And phone number should be auto populated
	And edit button should be displayed to make changes to the saved details
	And user should click on edit button
	Then card would open to reveal the initial expanded state with all fields prefilled
	And user should be able to make changes to existing details
	And user would be able to save changes by clicking on the cta button next
	Then the contact information should move to drawer
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-4761 Contact info section is auto-populated with only email address for the authenticated user
	When user navigate to checkout contact info page
	When the checkout contact info page is displayed
 	And verify clicking on accounts option
 	And verify and click on signin link
 	And user accepts window alert
 	And for checkout page enter email detail for which phone number is not saved
	And enter password data
	And user click on sign in button
	When user navigate to checkout contact info page
	And email address should be prefilled
	And user clicks on the CTA button 'Next' after filling the details
	Then user should not be able to proceed to the next step without entering the phone number
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-4762 Contact info section is expanded for the user to enter the phone number
	When user navigate to checkout contact info page
	When the checkout contact info page is displayed
 	And verify clicking on accounts option
 	And verify and click on signin link
 	And user accepts window alert
 	And for checkout page enter email detail for which user enters phone number
 	And enter password data
	And user click on sign in button
	When user navigate to checkout contact info page
	And user enters the phone number
	And user clicks on the CTA button 'Next' after filling the details
	Then phone number should be saved only for current transaction
	And the user should move to the next section of the checkout page
	
	@RegressionTest @MobileView
	Scenario: TC-4759 Contact info section is auto-populated with both Email & Phone number for the authenticated user.
	When login url is available
	And user accepts window alert
 	And for checkout page enter email detail
	And for checkout page user enter password
	And user click on sign in button
	When user navigate to checkout contact info page
	Then the contact information should move to drawer
	And email address should be auto populated
	And phone number should be auto populated
	And edit button should be displayed to make changes to the saved details 
	
	@RegressionTest @MobileView
	Scenario: TC-4760 Edit option is displayed to update the saved details
	When login url is available
 	And for checkout page enter email detail
	And for checkout page user enter password
	And user click on sign in button
	When user navigate to checkout contact info page
	Then the contact information should move to drawer
	And email address should be auto populated
	And phone number should be auto populated
	And edit button should be displayed to make changes to the saved details
	And user should click on edit button
	Then card would open to reveal the initial expanded state with all fields prefilled
	And user should be able to make changes to existing details
	And user would be able to save changes by clicking on the cta button next
	Then the contact information should move to drawer
	
	@RegressionTest @MobileView
	Scenario: TC-4761 Contact info section is auto-populated with only email address for the authenticated user
	When login url is available
 	And for checkout page enter email detail for which phone number is not saved
	And enter password data
	And user click on sign in button
	When user navigate to checkout contact info page
	And in mobile email address should be prefilled
	And user clicks on the CTA button 'Next' after filling the details
	Then user should not be able to proceed to the next step without entering the phone number
	
	@RegressionTest @MobileView
	Scenario: TC-4762 Contact info section is expanded for the user to enter the phone number
	When login url is available
 	And for checkout page enter email detail for which user enters phone number
 	And enter password data
	And user click on sign in button
	When user navigate to checkout contact info page
	And in mobile user enters the phone number
	And user clicks on the CTA button 'Next' after filling the details
	Then phone number should be saved only for current transaction
	And the user should move to the next section of the checkout page
	