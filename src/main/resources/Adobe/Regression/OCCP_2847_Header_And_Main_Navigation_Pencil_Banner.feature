Feature: OCCP-2847  	OCCP-2847 Header and Main Navigation | Pencil Banner | Desktop
Description: To test the ADOBE Test Cases for the story OCCP-2847

	@Regression @WebView @WideView
  Scenario: TC-2885, TC-2896 Account options available on the Pencil banner | Authenticated User on Desktop
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then pencil banner should be displayed
	And as user is unauthenticated hi should be displayed instead of account in pencil banner
 	And verify hovering on hi option
 	Then on hover hi should have an underline
 	And verify clicking on hi option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on register now in triangle rewards value prop
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on hi option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on option order history in account management links
 	Then user should be navigate to defined associated page
  And user navigates back to to previous page
  And verify clicking on hi option
 	Then on clicking the dropdown will open up and below option
  And verify and click on option payment information in account management links
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on hi option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on option addresses in account management links
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on hi option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on sign out button
 	Then user should be sign out and account should be displayed instead of hi
	
	@Regression @WebView @WideView
  Scenario: TC-2884, TC-2895 Account options available on the Pencil banner | Unauthenticated User on Desktop
 	Given login url is available
 	Then pencil banner should be displayed
 	And accounts option is displayed in pencil banner
 	And verify hovering on accounts option
 	Then on hover accounts should have an underline
 	And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on signin link
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on register link in triangle rewards value prop
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on register now in triangle rewards value prop
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on option order history in account management links
 	Then user should be navigate to defined associated page
  And user navigates back to to previous page
  And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
  And verify and click on option payment information in account management links
 	Then user should be navigate to defined associated page
 	And user navigates back to to previous page
 	And verify clicking on accounts option
 	Then on clicking the dropdown will open up and below option
 	And verify and click on option addresses in account management links
 	Then user should be navigate to defined associated page
  