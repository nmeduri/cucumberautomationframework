Feature: OCCP-3082 FDP: Featured List View-User swipes left/right in Mobile
  
  Description: To test the ADOBE Test Cases for the story OCCP-3082

  @RegressionTest @WebView @MobileView @TabletView @TC3909
  Scenario: TC-3909 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
    When featured list page url available
    Then verify user swipes left and right
    
    
  @RegressionTest @WebView @MobileView  @TabletView
  Scenario: TC-3910 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
    Given featured list page url available
    Then verify displaying navigation dots

  @RegressionTest @WebView @MobileView  @TabletView
  Scenario: TC-3911 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
    Given featured list page url available
    And select last page and scroll right
    Then verify is user is able to see first page

  @RegressionTest @WebView @MobileView @TabletView
  Scenario: TC-3912 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
    Given featured list page url available
    And select first page and scroll left
    Then verify is user is able to see last page

  