Feature: OCCP-1037 : Simple Header  | Checkout Flow | Desktop
	Description: To test the ADOBE Test Cases for the story OCCP-1037
	
	@RegressionTest @AEM
	Scenario: TC-3668	OCCP-1037: Simple Header|Checkout Flow|Desktop- Verify Configuration of Customer Service label and Contact number
	Given open browser
	When AEM author with access to configure simple header checkout component
	And login to AEM using the credential as mentioned in the test data
	And click on simple header checkout component
	And click on aem configure button
	And update the customer service label details
	And update the contact number label details
	And user click on done button
	And click on the preview button
	Then contact number of customer service should be displayed
	