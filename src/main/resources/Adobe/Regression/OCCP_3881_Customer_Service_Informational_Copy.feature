Feature: OCCP-3881 Customer Service - Informational Copy (Authorable)

	Description: To test the ADOBE Test Cases for the story OCCP-3881
	
	
	@RegressionTest @WebView
	Scenario: TC-3419	OCCP-3881: Customer Service-Informational Copy(Authorable)-Verify that the customer is able to view Customer views Section Separators on the Page
	Given open browser
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And title of customer service should be displayed
	And description should be displayed
	And accordions should be displayed
	And multiple topics should be displayed on the page
	And section Separators should be displayed between topics to divide information
	
	@RegressionTest @MobileView
	Scenario: TC-3418	OCCP-3881 :Customer Service-Informational Copy(Authorable)-Verify that the customer is able to view Customer views Link List – Mobile
	Given open browser
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And title of customer service should be displayed
	And stacked link list is displayed on mobile
	And links description should be displayed
	And clickable title should be displayed
	Then when clicks on the title,customer should be redirected to the subpage
	
	
	

	
	
	
	
	