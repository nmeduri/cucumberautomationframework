Feature: OCCP-2850 Condensed Navigation | Desktop
Description: To test the ADOBE Test Cases for the story OCCP-2850

	@Regression @WebView
  Scenario: TC-2897 Condensed View on Desktop
  Given pdp url is available
  When pdp page is displayed for the product
  And scroll down the page to not display pencil banner and secondary navigation
  Then pencil banner and secondary navigation should be collapsed 
  
  @Regression @WebView
  Scenario: TC-2898 Dissolving Condensed view when user scrolls up
  Given pdp url is available
  When pdp page is displayed for the product
  And user scrolls down the page
  And scroll up to display secondary navigation
  Then secondary navigation should be displayed
  And scroll up to page
  Then pencil banner should be displayed