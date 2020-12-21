Feature: OCCP-3181 PDP : Report A Reviews

	Description: To test the ADOBE Test Cases for the story OCCP-3181
	   
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-3945
    Scenario: TC-3945 OCCP 3181 - Verify user is able to view "Report" to report the review
    When pdp one review product url is available
    When pdp page is displayed for the product
    Then report option is displayed
    Then user is navigate to ratings and reviews section on the pdp
    When fr pdp one review product url is available
    When pdp page is displayed for the product
    Then report option is displayed
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-3946
    Scenario: TC-3946 OCCP 3181 - Verify user is able to click "Report" CTA to report the review
    Given open browser
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

	