Feature: OCCP-3139 PDP : No Reviews

	Description: To test the ADOBE Test Cases for the story OCCP-3139
	   
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-3947
    Scenario: TC-3947 OCCP 3179 - Verify user is not able to view "Ratings & Reviews section" on the PDP with no reviews
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    Then write a reviews is not displayed
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    Then write a reviews is not displayed
    
    @RegressionTest @WebView @MobileView @WideScreen @TabletView @TC-3948
    Scenario: TC-3948 OCCP 3179 - Verify user is able to navigate to "Ratings & Reviews section" on the PDP with no reviews
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    
    @RegressionTest @WebView @WideScreen @TC-3949
    Scenario: TC-3949 OCCP 3179 - Verify user is able to view details on "Ratings & Reviews section" with no reviews
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    Then title of section as reviews
    Then unfilled stars are displayed for scrollable section
    Then clickable link 'be the first to write this review'
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    Then fr title of section as reviews
    Then unfilled stars are displayed for scrollable section
    Then clickable link 'be the first to write this review'
    
    @RegressionTest @MobileView @TabletView @TC-3949M
    Scenario: TC-3949 OCCP 3179 - Verify user is able to view details on "Ratings & Reviews section" with no reviews (Mobile)
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    Then title of section as reviews
    Then unfilled stars are displayed for scrollable section
    Then mobile - clickable link 'be the first to write this review'
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    Then fr title of section as reviews
    Then unfilled stars are displayed for scrollable section
    Then mobile - clickable link 'be the first to write this review'
    
    @RegressionTest @WebView @WideScreen @TC-3950
    Scenario: TC-3950 OCCP 3179 - Verify user is able to write review on "Ratings & Reviews" section with no reviews
    When pdp no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then user is navigate to ratings and reviews section on the pdp
    Then title of section as reviews
    Then clickable link 'be the first to write this review'
    Then review model appears
    And user is prompted to fill it
    When pdp fr no review product url is available
    When pdp page is displayed for the product
    Then five unfilled stars is displayed
    And click on unfilled stars in buybox
    Then fr title of section as reviews
    Then user is navigate to ratings and reviews section on the pdp
    Then clickable link 'be the first to write this review'
    Then review model appears
    And user is prompted to fill it

	