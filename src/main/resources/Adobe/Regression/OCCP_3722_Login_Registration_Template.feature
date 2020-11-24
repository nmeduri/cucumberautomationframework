Feature: OCCP-3722 : Login/Registration Template

	Description: To test the ADOBE Test Cases for the story OCCP-3722
	
	@RegressionTest @WebView @WideScreen @TC-3601
	Scenario: TC-3601	OCCP-3722: Login/Registration Template-Verify User is able to view both static and configured elements on newly created and published login page
	Given open browser
	And login url is available
	And login page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background should be displayed
	When fr locale login url is available
	And login page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background should be displayed
	
	@RegressionTest @MobileView
	Scenario: TC-3601	OCCP-3722: Login/Registration Template-Verify User is able to view both static and configured elements on newly created and published login page
	Given open browser
	And login url is available
	And login page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background is displayed in mobile view
	When fr locale login url is available
	And login page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background is displayed in mobile view
	
	@RegressionTest @WebView @WideScreen @TC-4004
	Scenario: TC-4004	OCCP-3722: Login/Registration Template-Verify User is able to view both static and configured elements on newly created and published registration page
	When sign up url is available
	Then sign up page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background should be displayed
	When fr locale sign up url is available
	Then fr locale sign up page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background should be displayed
	
	@RegressionTest @MobileView
	Scenario: TC-4004	OCCP-3722: Login/Registration Template-Verify User is able to view both static and configured elements on newly created and published registration page
	When sign up url is available
	Then sign up page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background is displayed in mobile view
	When fr locale sign up url is available
	Then fr locale sign up page is displayed
	Then standard Header should be displayed
	And standard footer is displayed
	And logo should be displayed
	And blue background is displayed in mobile view
	