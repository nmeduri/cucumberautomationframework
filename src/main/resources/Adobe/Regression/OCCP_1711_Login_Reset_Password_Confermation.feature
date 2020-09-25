Feature: OCCP-1711 Login Forgot Password

	Description: To test the ADOBE Test Cases for the story OCCP-1711

    @RegressionTest @WebView
	Scenario: TC-635, TC-630 Verify the ability of a user to create a new account from 
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user one fill emaildetails for forgot password
	And user click on send button
	When mailinator url is available
	Then user one enter reset password email detail in mailinator inbox
	And user click on go button
	And user click on verification email
	And user click on click here on reset your password
	And user enter new password
	And user enter re-type password
	And user click on reset password button
	Then user is navigated to password reset confirmation screen
	Then user tap on sign in button
	And user click on join now
	Then sign up page is displayed
	And switch on parent frame
	
	@RegressionTest @MobileView
	Scenario: TC-635 TC-630 Verify the ability of a user to create a new account from 
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user two fill emaildetails for forgot password
	And user click on send button
	When mailinator url is available
	Then user two enter reset password email detail in mailinator inbox
	And user click on go button
	And user tap on verification email on mobile
	And user click on click here on reset your password
	And user enter new password
	And user enter re-type password
	And user click on reset password button
	Then user tap on sign in button
	When enter email detail
	And user enter new credenatials
	And user click on sign in button
	Then user is navigated to password reset confirmation screen
	And user click on join now
	Then sign up page is displayed
	
	@RegressionTest @WebView
	Scenario:  TC-636 Verify an inline error is displayed when email ID is not entered in the correct format 
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user enter incorrect email
	And user click on send button
	Then user friendly inline error is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-631 Verify the ability of a user to get a confirmation for the password reset performed
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user three fill emaildetails for forgot password
	And user click on send button
	When mailinator url is available
	Then user three enter reset password email detail in mailinator inbox
	And user click on go button
	And user click on verification email
	And user click on click here on reset your password
	And user enter new password
	And user enter re-type password
	And user click on reset password button
	Then user tap on sign in button
	When enter reset email detail
	And user enter new credenatials
    And user click on sign in button
	Then sucessfully logged in with new password
	And switch on parent frame
	
	@RegressionTest @MobileView
	Scenario: TC-631, TC-687 Verify the ability of a user to get a confirmation for the password reset performed
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And user four fill emaildetails for forgot password
	And user click on send button
	When mailinator url is available
	Then user four enter reset password email detail in mailinator inbox
	And user click on go button
	And user tap on verification email on mobile
	And user click on click here on reset your password
	And user enter new password
	And user enter re-type password
	And user click on reset password button
	Then user tap on sign in button
	When enter email detail
	And user enter new credenatials
	And user click on sign in button
	Then sucessfully logged in with new password
	
	Scenario: TC-634 Verify the ability of a user to initiate a password reset process again from
	Given login url is available
	When login page is displayed
	And user click on forgot password
	And forgot password page is displayed
	
	