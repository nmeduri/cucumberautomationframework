Feature: OCCP-1578 PDP: Select Quantity (Quantity Box is Available) 

	Description: To test the ADOBE Test Cases for the story OCCP-1578
	
	@RegressionTest @WebView @MobileView @WideScreen
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