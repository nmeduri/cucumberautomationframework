Feature: 	OCCP-3665 Account- Profile and Preference | Update Personal Information
	Description: To test the ADOBE Test Cases for the story OCCP-3665
	
	
	@RegressionTest @WebView @WideScreen @TC-3587
	Scenario: TC-3587 OCCP-3665 Account- Profile and Preference | Update Personal Information - Verify That the user is able to Edit Personal Information- Profile: Mobile, Desktop, Desktop wide
	Given open browser
	When Account-profile url is available
	When click on account from the header
	And verify and click on signin link
  When enter email detail
	And user enter password
  And user click on sign in button 
	Then link card screen should be displayed
	Then navigate to Account-profile url
	Then click on Edit button on profile info page
	Then Edit the details on profile info page
	Then save the changes on profile info page

	@RegressionTest @WebView @WideScreen @MobileView @TC-3588
	Scenario: TC-3588 OCCP-3665 Account- Profile and Preference | Update Personal Information - Verify That the user is able to  Edit Personal Information- Security: Mobile,  Desktop, Desktop wide	Given open browser
		Given open browser
	When Account-profile url is available
	When click on account from the header
	And verify and click on signin link
  When enter email detail
	And user enter password
  And user click on sign in button 
	Then link card screen should be displayed
	Then navigate to Account-profile url
	Then click on Edit button on password section of profile info page
	Then Enter the details on password edit page profile info page
	#Then cancel the changes on profile info page
	#Then click on Edit button on password section of profile info page
	#Then Enter the details on password edit page profile info page
	Then save the password changes on profile info page
	#Then click on Edit button on password section of profile info page
	#Then Revert the changed done in password
	
	@RegressionTest @WebView @WideScreen @TC-3589
	Scenario:TC-3589 OCCP-3665Account- Profile and Preference | Update Personal Information -  Verify That the user is able to view  Model Popup for confirmation 
	Given open browser
	When Account-profile url is available
	When click on account from the header
	And verify and click on signin link
  When enter email detail
	And user enter password
  And user click on sign in button 
	Then link card screen should be displayed
	Then navigate to Account-profile url
	Then click on Edit button on password section of profile info page
	Then Enter the details on password and click edit profile info page
	Then verify the Modal popup is displayed
	
		@RegressionTest @WebView @WideScreen @TC-3590
	Scenario:TC-3590 OCCP-3665 Account- Profile and Preference | Update Personal Information -  Verify That the user is able to view Invalid credentials- Not in the correct format or in the Char Limit| Mobile/Desktop/Desktop wide
	Given open browser
	When Account-profile url is available
	When click on account from the header
	And verify and click on signin link
  When enter email detail
	And user enter password
  And user click on sign in button 
	Then link card screen should be displayed
	Then navigate to Account-profile url
	Then click on Edit button on password section of profile info page
	Then save the password changes on profile info page
	Then validate the inline error message when mandatory field are not given
	
	@RegressionTest @WebView @WideScreen @TC-5012
	Scenario:TC-5012 OCCP-3665 Account- Profile and Preference | Update Personal Information- Verify That the user is able to view  Model Popup for confirmation(Custom) 	Given open browser
		Given open browser
	When Account-profile url is available
	When click on account from the header
	And verify and click on signin link
  When enter email detail
	And user enter password
  And user click on sign in button 
	Then link card screen should be displayed
	Then navigate to Account-profile url
	Then click on Edit button on password section of profile info page
	Then Enter the details on password and click edit profile info page
	Then verify the Modal popup is displayed
	Then click close on the modal pop up