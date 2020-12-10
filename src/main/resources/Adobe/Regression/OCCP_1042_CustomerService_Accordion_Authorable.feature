Feature: OCCP-1042-Customer Service - Accordion (Authorable)

	Description: To test the ADOBE Test Cases for the story OCCP-1042
	
	
	@RegressionTest @WebView @WideScreen @TC-3265
	Scenario: TC-3265 OCCP-1042 -Customer Service - Accordion (Authorable) -Verify that the customer is able to collapse Accordion
	Given open browser
	When customerservice informational copy url is available
	Then customerservice page is displayed	
	And accordions should be displayed
	Then validate the accordion plus icon is displayed
	Then click on accordion plus icon
	Then validate the accordion Minus icon is displayed
	Then click on accordion minus icon
	Then validate the accordion plus icon is displayed
	When customerservice informational url for FR locale is available
	And accordions should be displayed
	Then validate the accordion plus icon is displayed
	Then click on accordion plus icon
	Then validate the accordion Minus icon is displayed
	Then click on accordion minus icon
	Then validate the accordion plus icon is displayed
	
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-3264 Verify that the customer is able to expand Accordion
	When customerservice informational copy url is available
	Then customerservice page is displayed	
	And accordions should be displayed
	Then validate the accordion plus icon is displayed
	Then click on accordion plus icon
	Then validate the accordion Minus icon is displayed
	When customerservice informational url for FR locale is available
	And accordions should be displayed
	Then validate the accordion plus icon is displayed
	Then click on accordion plus icon
	Then validate the accordion Minus icon is displayed
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-3263 Verify that the customer is able to view Accordion Header
	When customerservice informational copy url is available
	Then customerservice page is displayed	
	And accordions should be displayed
	When customerservice informational url for FR locale is available
	And accordions should be displayed
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-3266
	Scenario: TC-3266 OCCP-1042 - Customer Service - Accordion (Authorable) -Verify that the customer is able to view Accordion Description
	When customerservice informational copy url is available
	Then customerservice page is displayed	
	And accordions should be displayed
	Then click on accordion plus icon
	Then validate description is displayed containing text