Feature: OCCP-3213 Link Existing Triangle Rewards Card | Failure/Error Cases | Rewards Linked to Triangle MasterCard
Description: To test the ADOBE AEM Test Cases for the story OCCP-3213
	
@RegressionTest @Mobile
	Scenario: TC-2179  Сard is not Taken Check
	Given login url is available
	When enter email id
	And enter password data
	And user click on sign in button
	Then link card screen should be displayed
	And user cick on triangle master card
	Then link master card screen should be displayed
	And enter already linked triangle master card details
	And scroll to continue button
	And click on mastercard continue button
	Then user should be redirected to error screen informing that card is already enrolled
	And verify when user click on try again button
	Then user should be redirected to link master card screen
	And master card page should be displayed without prepoulating previously entered details
	And verify when user click on cancel button
	Then link card screen should be displayed