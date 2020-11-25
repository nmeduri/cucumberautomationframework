Feature: OCCP-3167 PDP : Report an Answer on PDP 
	Description: To test the ADOBE Test Cases for the story OCCP-3167
	
	
	@RegressionTest @WebView @WideScreen @TC-3957
	Scenario:  TC-3957 OCCP-3167 - Verify user is able to view report CTA on Questions & Answers section 
	When pdp url is available
	When pdp page is displayed for the product
	Then report option is displayed
	When pdp url is available
	When pdp page is displayed for the product
	Then report option is displayed
	
	@RegressionTest @WebView @WideScreen @TC-3958
	Scenario:   TC-3958 OCCP-3167 - Verify user is able to use report CTA on Questions & Answers section  
	When pdp url is available
	When pdp page is displayed for the product
	Then report option is displayed
	And click on report option
	Then button title should be changed to reported from report
	Then user should not be able to click on reported label
	When pdp fr locale url with Q&A section is available
	When pdp page is displayed for the product
	Then report option is displayed
	And click on report option
	Then button title should be changed to reported from report
	Then user should not be able to click on reported label
