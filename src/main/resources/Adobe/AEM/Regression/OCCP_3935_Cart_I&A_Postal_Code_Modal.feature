Feature: OCCP-3935 Cart I&A - Postal Code Modal
Description: To test the AEM Test Cases for the story OCCP-3935


@Regression @AEM
	Scenario: TC-3678 Verify That the user is able to Configure (Toast Message - Author ability)
	When AEM author with access to configure Cart page
	#And login to AEM using the credential as mentioned in the test data
	And click on cart items component
	And click on aem configure button
	And click on the postal tab
	And configure the success toast message
	And configure the error toast message
	And user click on done button
	And click on the publish button
	Given cart url is available
  When cart page is displayed for the product
	And user clicks on change cta within the order summary shipping fee section of the order summary
  And user inputs a valid postal code within delivery range
  And user clicks on change cta 
  Then success toast message changes should be reflected in the ctc
	And user clicks on change cta within the order summary shipping fee section of the order summary
   And user inputs an invalid postal code
  And user clicks on change cta  
  Then error toast message changes should be reflected in the ctc