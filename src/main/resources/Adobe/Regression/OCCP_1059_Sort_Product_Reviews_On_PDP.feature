Feature: OCCP-1059 :Sort Product Reviews on PDP
Description: To test the ADOBE Test Cases for the story OCCP-1059
	
@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-3173 :Verify when the user views the Reviews Section
	Given open browser
	When pdp sort product reviews url is available
	Then in reviews section option to sort reviews should be available
	And the default sorting option with label sort by-most recent should be displayed
	And most recent should be the default sorting option
	And the chevron should be displayed next to the sort option
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-3174 :Verify when the user hovers over/clicks on the Sorting Option
	When pdp sort product reviews url is available
	Then in reviews section option to sort reviews should be available
	Then click on sorting option in reviews section
	And a dropdown list containing all sorting options should be displayed
	
	@RegressionTest @WebView @WideScreen @MobileView
	Scenario: TC-3175 :Verify when the user selects the sorting options
	When pdp sort product reviews url is available
	Then in reviews section option to sort reviews should be available
	Then click on sorting option in reviews section
	And click on most helpful option from the dropdown
	Then selected option most helpful should be displayed next to sortby label
	
	
	