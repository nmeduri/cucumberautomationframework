Feature: OCCP-3149 Link Rewards 

	Description: To test the ADOBE Test Cases for the story OCCP-3149

@Regression @MobileView 
Scenario:
TC-2137,2141 Verify the Field level validations on the Complete Your Profile screen on Mobile 
	Given login url is available 
	When enter email detail 
	And user enter password 
	And user click on sign in button 
	Then user click on Get new triangle reward option 
	#Then verify the error message when the below fields are not filled and tab out
	And do not enter mandatory fields and click on Continue button 
	Then enter invalid details for the input fields and click on continue button 
	
@Regression @MobileView 
Scenario: TC-2138,2142 Verify the T&C and Success screen details on Mobile 
	Given login url is available 
	When enter email detail 
	And user enter password 
	And user click on sign in button 
	Then link card screen should be displayed 
	And verify when user clicks on the get a new triangle rewards card link 
	Then user should redirect to the get a new triangle rewards card screen 
	And verify when user enter valid information on complete your profile screen 
	And verify clicks on continue button 
	Then rewards terms and conditions should be displayed 
	Then register card button is displayed on terms and conditions page 
	
@Regression @WideScreen @WebView 
Scenario:
TC-2140 Verify the details on Complete your profile screen on Widescreen 
	Given login url is available 
	When enter email detail 
	And user enter password 
	And user click on sign in button 
	Then click on Triangle reward card option 
	Then enter pending loyalty card and click continue 
	Then verify the display of details on the Complete your profile screen 
	Then verify user can enter details in the fields 
	And click cancel button 
	And verify clicks on continue button 
    