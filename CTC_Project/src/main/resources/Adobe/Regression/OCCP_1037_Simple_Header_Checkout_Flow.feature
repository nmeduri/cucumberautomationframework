Feature: OCCP-1037 :Simple Header   Checkout Flow  Desktop 

	Description: To test the ADOBE Test Cases for the story OCCP-1037
	
	
	@RegressionTest @WebView @WideScreen @TC-3667
	Scenario: TC-3667 OCCP-1037 :Simple Header|Checkout Flow|Desktop-Verify Options available on the Simple header in Checkout flow|Desktop, Desktop Wide
	When checkout url is available
	When checkout page is displayed
	Then brand logo should be displayed
	And contact number of customer service should be displayed
	And site language selector should be displayed
	When click on brand logo
	#Then user should be taken to the home page
	