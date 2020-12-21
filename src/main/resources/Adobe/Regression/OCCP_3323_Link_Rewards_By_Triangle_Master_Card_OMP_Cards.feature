Feature: 	OCCP-3323 Account/Trangle ID-Link Rewards| Link rewards by master card |OMP/OMR cards 

	Description: To test the ADOBE Test Cases for the story OCCP-3323

	@RegressionTest 
	Scenario: TC-2665, TC-2672, TC-2676 Verify User enters in an OMP/OMR Card  on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	#And user click on continue button
	#Then user should be redirected to error screen
	
	
	@RegressionTest @MobileView @2672
	Scenario: TC-2672 Verify User enters in an OMP/OMR Card  on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on ompCard continue button
	Then user should be redirected to error screen
	
	@RegressionTest @MobileView @2673
	Scenario:TC-2673 Verify User Clicks Try Again button on <Error> screen  on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on ompCard continue button
	#Then user should be redirected to error screen
	And verify when user click on try again button
	Then link existing card screen should be displayed
	
	@RegressionTest @MobileView @2674
	Scenario: TC-2674  Verify User Clicks Cancel on <Error> screen on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on ompCard continue button
	Then user should be redirected to error screen
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	@RegressionTest @MobileView @2675
	Scenario: TC-2675  Verify User Clicks Cancel on <Error> screen on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on ompCard continue button
	Then user should be redirected to error screen
	And user click on contact number
	Then call popup should be displayed
	
	@RegressionTest @WideScreen @2677 
	Scenario: TC-2666,TC-2677 Verify User Clicks Try Again button on <Error> screen  on Desktop
	Given open browser
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on continue button
	Then user should be redirected to error screen
	And verify when user click on try again button
	Then link existing card screen should be displayed
	
	
	
	@RegressionTest @WideScreen @2678
	Scenario: TC-2667,TC-2678 Verify User Clicks Cancel on <Error> screen on Desktop
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter OMP card details
	And user click on continue button
	Then user should be redirected to error screen
	And verify when user click on cancel button
	Then link card screen should be displayed
	
	
	