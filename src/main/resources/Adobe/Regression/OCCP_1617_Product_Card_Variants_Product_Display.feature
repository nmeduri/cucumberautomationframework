Feature: OCCP-1617 Product Card - Variant Products Display on the Card

	Description: To test the ADOBE Test Cases for the story OCCP-1617
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-1374 Verify the thumbnail truncation when more than 4 variants are available
	Given quit browser
	When open browser
	When plp url is available
    When plp is displayed
    And scroll up to page
    And secondary image and more appears over primary image
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-1372 Verify the selection of Product Variant from the Product Card
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And hovers primary image area A
    Then secondary image is displayed
    And click on the variant thumbnails on the product card
    Then user is visually indicated that the thumbnail is selected
    Then primary product image is updated to selected variant image
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-1371 Verify display of number of colour variants on Product Card
    Given plp url is available
    When plp is displayed
    And scroll up to page
    And hovers primary image area A
    Then verify the display of number of colours option on the product card
    Then verify number colours is dislayed  where number of color variants availabe for the product
    
    @RegressionTest @WebView @WideScreen
    Scenario: TC-1370 Verify display of Brand Name on Product Card
    Given plp url is available
    When plp is displayed
    Then the product card is displayed for the product
    And the product card name  on the product card is displayed
    And product brand is not clickable
    
    @RegresionTest @WebView @WideScreen @TC-1373
    Scenario: TC-1373 Verify the behaviour on hovering on Product Card when no Variants available
    Given plp url is available
    When plp is displayed
    And scroll up to page
    Then secondary image appears on hover and product card does not display any number of color
	