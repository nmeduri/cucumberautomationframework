Feature: OCCP-1750 Account Registration Privacy Charter Display

	Description: To test the ADOBE Test Cases for the story OCCP-1750
		
	@RegressionTest @WebView @MobileView @WideScreen
	Scenario: TC-603 Verify the ability of a user to read the privacy charter content on screen
	Given sign up url is available
	Then sign up page is displayed
	And select the privacy charter option
	Then user is taken to canadian tire privacy charter screen
	Then user is able to scroll and read throught the privacy charter condition
	And the header of the overlay is sticky and remain visible
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-604 Verify the ability of a user to download the privacy charter in PDF format 
	Given sign up url is available
	Then sign up page is displayed
	And select the privacy charter option
	Then user is taken to canadian tire privacy charter screen
	Then verfiy the download privacy charter document in pdf format
	
	@RegressionTest @MobileView
	Scenario: TC-604 Verify the ability of a user to download the privacy charter in PDF format 
	Given sign up url is available
	Then sign up page is displayed
	And select the privacy charter option
	Then user is taken to canadian tire privacy charter screen
	Then verfiy the download privacy charter document in pdf format