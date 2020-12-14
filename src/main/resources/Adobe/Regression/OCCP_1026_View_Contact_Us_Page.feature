Feature: OCCP-3878 Contact Us Page : Error Scenario

	Description: To test the ADOBE Test Cases for the story OCCP-3878
	
	
	@RegressionTest @WebView @WideScreen @TC-4852
	Scenario: TC-4852 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that  User is able to enter their first and last name	
	When contact us url is available
	And user is able to enter valid details for first name and last name
	When contact us fr url is available
	And user is able to enter valid details for first name and last name
	
	@RegressionTest @WebView @WideScreen @TC-4851
	Scenario: TC-4851 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - Verify that User is able to view the Contact us Form on the Contact us Page	
	When contact us url is available
	And user must be able to view the contact us form on the contact us page
	When contact us fr url is available
	And user must be able to view the contact us form on the contact us page
	
	@RegressionTest @WebView @WideScreen @TC-4854
	Scenario: TC-4854 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to select a subject from the dropdown field	
	When contact us url is available
	And user clicks on please select drop down field
	Then user is able to view a drop down and select the appropriate subject
	When contact us fr url is available
	And user clicks on please select drop down field
	Then user is able to view a drop down and select the appropriate subject
	
	@RegressionTest @WebView @WideScreen @TC-4853
	Scenario: TC-4853 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to enter a valid email address	
	When contact us url is available
	And user clicks on email field
	Then user is able to enter valid email address
	When contact us fr url is available
	And user clicks on email field
	Then user is able to enter valid email address
	
	@RegressionTest @WebView @WideScreen @TC-4856
	Scenario: TC-4856 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to add additional information	
	When contact us url is available
	And user clicks on email field
	Then user is able to enter the requested information of characters
	Then user is able to view number of character entered by the user as well as total number
	Then user will not able to type more than maximum number of characters shown on the form
	When contact us fr url is available
	Then user is able to enter the requested information of characters
	Then user is able to view number of character entered by the user as well as total number
	Then user will not able to type more than maximum number of characters shown on the form
	
	@RegressionTest @WebView @WideScreen @TC-4855
	Scenario: TC-4855 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to enter an Order Number	
	Given open browser
	When contact us url is available
	And user clicks on order number field
	Then user able to enter order number information
	When contact us fr url is available
	And user clicks on order number field
	Then user able to enter order number information
	
	@RegressionTest @WebView @WideScreen @TC-4858
	Scenario: TC-4858 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to see the label-in-grey 'shift back to it's original state' 	
	When contact us url is available
	And user click on first name field
	Then user is able to view the label in gray shift up from original space
	And user click on last name field
	Then user is able to view the label in gray shift back to its original space
	
	@RegressionTest @WebView @WideScreen @TC-4857
	Scenario: TC-4857 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - User is able to fill out the Contact us via email form - Verify that User is able to see the label-in-grey 'shift back to it's original state' 	
	When contact us url is available
	And enter first name detail
	Then user is able to view the label in gray shift up from original space
	
	@RegressionTest @WebView @WideScreen @TC-4859
	Scenario: TC-4859 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - Verify that User is able to submit the form	
	When contact us url is available
	And enter first name detail
	And enter Last Name Detail
	And user is able to enter valid email address
	And user clicks on please select drop down field
	And user is able to view a drop down and select the appropriate subject
	And enter additional information
	And click on send message button
	Then confirmation screen is displayed
	
	@RegressionTest @WebView @WideScreen @TC-4862
	Scenario: TC-4862 OCCP-1026View Contact Us page - part 1 (Contact Us Form) - Verify that User is able to click the CTA on the success screen	
	Given open browser
	When contact us url is available
	And enter first name detail
	And enter Last Name Detail
	And user is able to enter valid email address
	And user clicks on please select drop down field
	And user is able to view a drop down and select the appropriate subject
	And enter additional information
	And click on send message button
	Then confirmation screen is displayed
	And click on continue shopping button
	#Then user is redirect on canadian tire home page on same tab
   