Feature: OCCP-1622 PDP : No Reviews

	Description: To test the ADOBE Test Cases for the story OCCP-1622
	   
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-1286
    Scenario: TC-1286 Verify User clicks on rating area of the product which has atleast one review
    When pdp one review product url is available
    When pdp page is displayed for the product
    And click on reviews section on buybox
    Then user is navigate to ratings and reviews section on the pdp
    When fr pdp one review product url is available
    When pdp page is displayed for the product
    And click on reviews section on buybox
    Then user is navigate to ratings and reviews section on the pdp
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-1289
    Scenario: TC-1289 Verify PDP when the product has no reviews
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    Then write a reviews is not displayed
    Then the numeral zero is displayed in parentheses
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    Then write a reviews is not displayed
    Then the numeral zero is displayed in parentheses

	