Feature: OCCP-3881 Customer Service - Informational Copy (Authorable)

	Description: To test the ADOBE Test Cases for the story OCCP-3881
	
	
	@RegressionTest @WebView
	Scenario: TC-3419	OCCP-3881: Customer Service-Informational Copy(Authorable)-Verify that the customer is able to view Customer views Section Separators on the Page
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And title of customer service should be displayed
	And description should be displayed
	And accordions should be displayed
	And multiple topics should be displayed on the page
	And section Separators should be displayed between topics to divide information
	
	@RegressionTest @MobileView
	Scenario: TC-3418	OCCP-3881 :Customer Service-Informational Copy(Authorable)-Verify that the customer is able to view Customer views Link List – Mobile
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And title of customer service should be displayed
	And stacked link list is displayed on mobile
	And links description should be displayed
	And clickable title should be displayed
	Then when clicks on the title,customer should be redirected to the subpage
	
	@RegressionTest @WebView  @TC-3415
	Scenario: TC-3415	OCCP-3881: Customer Service-Informational Copy(Authorable)-Verify that the customer is able to view Customer views Section Separators on the Page
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And title of customer service should be displayed
	And description should be displayed
	And accordions should be displayed

	@RegressionTest @WebView  @TC-3416
	Scenario: TC-3416	OCCP-3881:Customer Service - Informational Copy (Authorable) -Verify that the customer is able to view Accordion-Customer views Accordion Sub Title
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And accordions should be displayed
	And accordions subtitle should be displayed
	
	@RegressionTest @WebView  @TC-3417
	Scenario: TC-3417	OCCP-3881:Customer Service - Informational Copy (Authorable) -Verify that the customer is able to view Customer views Link List – Desktop/Widescreen
	When customerservice informational copy url is available
	Then customerservice page is displayed
	And accordions should be displayed
	And accordions subtitle should be displayed
	Then click accordion subtitle
	And validate the subpage of customerservice page is displayed
	