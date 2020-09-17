Feature: OCCP-1617 Product Card - Variant Products Display on the Card

	Description: To test the ADOBE Test Cases for the story OCCP-1617
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-1374 Verify the thumbnail truncation when more than 4 variants are available
	Given plp url is available
    When plp is displayed
    And scroll up to page
    And secondary image and more appears over primary image
    
    @RegresionTest @WebView @WideScreen
    Scenario: TC-1373 Verify the behaviour on hovering on Product Card when no Variants available
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And click on sort by option 
    And Select sort option price high to low
    And scroll up to page
    Then secondary image appears on hover and product card does not display any number of color
	