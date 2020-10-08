Feature: OCCP-1751 Account/Triangle ID - Registration - Resend Email Verification/Maximum Email Sent Confirmation/Verification Expired

	Description: To test the ADOBE Test Cases for the story OCCP-1751
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-1428 Verify the ability of a user to resend verification email if required for account registration of Triangle ID 
	Given open browser
	When sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And user click on next button
	Then email verification sent confirmation screen is displayed
	And select Resend email verification
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then the user has received the verification email
	Then verification email is resent to the user
	And user click on previous mail
	And user is able to see click on here to verify email link
	
	@RegressionTest  @MobileView @TabletView
	Scenario: TC-1428 Verify the ability of a user to resend verification email if required for account registration of Triangle ID 
	Given open browser
	When sign up url is available
	When sign up page is displayed
	And user enter email
	And user enter password
	And user enter retype password
	And user click on create button
	Then get personalized offers page is displayed
	And user click on next button
	Then email verification sent confirmation screen is displayed
	And select Resend email verification
	When mailinator url is available
	Then user enter detail in mailinator inbox
	And user click on go button
	Then user has received the verification email on mobile
	Then verificationemail is resent to the user
	#And user click on previous mail
	#And user is able to see click on here to verify email link
	
	@WebView @WideScreen @MobileView @TabletView
	Scenario: close browser
	Given Close Browser
	
	
