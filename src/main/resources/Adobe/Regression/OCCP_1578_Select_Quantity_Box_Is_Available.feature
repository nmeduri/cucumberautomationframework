Feature: OCCP-1578 PDP: Select Quantity (Quantity Box is Available) 

	Description: To test the ADOBE Test Cases for the story OCCP-1578
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-1436 Verify the ability of a user to update the quantity of a product on PDP
	Given pdp url is available
    When pdp page is displayed for the product
    And user print the quantity of the quantity box
    And click the increment sign of the quantity box
    Then the updated quantity must be incremented by One
    And click the decrement sign of the quantity box
    Then updated quantity must be decremented by One
    Then verify sign decrement is disabled when the quantity is One
	And enter an integer number in the quantity box that is greate than Zero and is equal to or less than maximum quantity for product
	Then updated quantity is displayed in the quantity box
	And user enter number in the quantity box that is greater than maximum quantity
	Then greater than maximum quantity is not updated in the quantity box
	And enter number in quantity box that is not integer
	Then user do not allowed  to enter the number that is not integer value
	And enter decimal number in quantity box
	Then user is not able to enter decimal value in quantity box
	And enter number Zero in the quantity box
	Then user is not allowed to enter zero number
	
	@RegressionTest @WebView @MobileView @WideScreen @TabletView
	Scenario: TC-87 Verify the functionality of the quantity box when all variants are selected 
	Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    And select product variant
    And user print the quantity of the quantity box
    And click the increment sign of the quantity box
    Then the updated quantity must be incremented by One
    And click the decrement sign of the quantity box
    Then updated quantity must be decremented by One
    Then verify sign decrement is disabled when the quantity is One
    And enter an integer number in the quantity box that is greate than Zero and is equal to or less than maximum quantity for product
	Then updated quantity is displayed in the quantity box
	And user enter number in the quantity box that is greater than maximum quantity
	Then greater than maximum quantity is not updated in the quantity box
	And enter number in quantity box that is not integer
	Then user do not allowed  to enter the number that is not integer value
	And enter decimal number in quantity box
	Then user is not able to enter decimal value in quantity box
	And enter number Zero in the quantity box
	Then user is not allowed to enter zero number
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-86 Verify an error is dislpayed when user has not selected a variant before adding to cart 
	Given pdp url is available
    When pdp page is displayed for the product
    And scroll up to page
    And select some variants but keep some unselected size
    And user clicks on add to cart button
    Then an error message is displayed prompting user to select all variant first
    
    @RegressionTest @WebView @WideScreen @SmokeTest
    Scenario: TC-85 Verify quantity box is displayed for products on PDP page
    Given pdp url is available
    When pdp page is displayed for the product
    Then the quantity box is visible
    And user print the quantity of the quantity box
    And the quantity value is defaulted to one
    And click the increment sign of the quantity box
    Then the updated quantity must be incremented by One
    And click the decrement sign of the quantity box
    Then updated quantity must be decremented by One
    Then verify sign decrement is disabled when the quantity is One
    Then quantity selector box is visible and user is able to click plus and minus
    
    