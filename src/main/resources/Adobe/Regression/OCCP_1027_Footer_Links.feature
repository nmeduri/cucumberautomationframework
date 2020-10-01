Feature: OCCP-1027 Footer : Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-1027
	
	@RegressionTest @WebView @WideView 
	Scenario: TC-2096, TC-2112 User views the links displayed on Footer-desktop/desktop wide
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And customer support section is displayed
	And services and solutions section is displayed
	And about us section is displayed
	And legal section is displayed
	
	@RegressionTest @MobileView 
	Scenario: TC-2096 User views the links displayed on Footer-desktop/desktop wide
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	Then collapsed headers are displayed with 'plus' sign
	And customer support section is displayed
	And services and solutions section is displayed
	And about us section is displayed
	And legal section is displayed
	
	@RegressionTest @WebView @WideView 
	Scenario: TC-2097, TC-2113 User views the "Customer Support " Section
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And customer support section is displayed
	And clickable text link for order status is displayed
	And clickable text link for pickup & delivery is displayed
	And clickable text link for returns & exchanges is displayed
	And clickable text link for help & faqs is displayed
	And clickable text link for contact us is displayed
	And clickable text link for store locator is displayed
	And clickable text link for product recalls is displayed
	And clickable text link for safety data sheets is displayed
	
	@RegressionTest @WebView @WideView 
	Scenario: TC-2098, Tc-2114 User views the "Services & Solutions" Section
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And services and solutions section is displayed
	And clickable text link for canadian tires financial services is displayed
	And clickable text link for installation & assembling is displayed
	And clickable text link for auto service centre is displayed
	And clickable text link for loan-a-tool is displayed
	And clickable text link for roadside assistance is displayed
	And clickable text link for gift cards is displayed
	And clickable text link for tested for life is displayed
	And clickable text link for gift registry is displayed
	
	@RegressionTest @WebView @WideView
	Scenario: TC-2099, Tc-2115 User views the "About Us" Section
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And about us section is displayed
	And clickable text link for about canadian tire is displayed
	And clickable text link for careers is displayed
	And clickable text link for about triangle id is displayed
	And clickable text link for recycling information is displayed
	And clickable text link for our brands is displayed
	And clickable text link for flyer sign up is displayed
	And clickable text link for sustainability is displayed
		
	@RegressionTest @WebView @WideView @SmokeTest
	Scenario: TC-2100, Tc-2116 User views the "Legal" Section
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And legal section is displayed
	And clickable text link for privacy policy is displayed
	And clickable text link for terms & conditions is displayed
	And clickable text link for site map is displayed
	And clickable text link for accessibility is displayed
	And clickable text link for pricing policy is displayed
	
	@RegressionTest @MobileView
	Scenario: TC-2120, User views the "Customer Support " Section-Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And customer support section is displayed
	And user clicks on Custom Support 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And clickable text link for order status is displayed
	And clickable text link for pickup & delivery is displayed
	And clickable text link for returns & exchanges is displayed
	And clickable text link for help & faqs is displayed
	And clickable text link for contact us is displayed
	And clickable text link for store locator is displayed
	And clickable text link for product recalls is displayed
	And clickable text link for safety data sheets is displayed
	
	@RegressionTest @MobileView
	Scenario: TC-2122, User views the "Services & Solutions" Section-mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And services and solutions section is displayed
	And user clicks on services and solutions 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And clickable text link for canadian tires financial services is displayed
	And clickable text link for installation & assembling is displayed
	And clickable text link for auto service centre is displayed
	And clickable text link for loan-a-tool is displayed
	And clickable text link for roadside assistance is displayed
	And clickable text link for gift cards is displayed
	And clickable text link for tested for life is displayed
	And clickable text link for gift registry is displayed
	
	
	@RegressionTest @MobileView
	Scenario: TC-2124, User views the "About Us" section-Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And about us section is displayed
	And user clicks on about us 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And clickable text link for about canadian tire is displayed
	And clickable text link for careers is displayed
	And clickable text link for about triangle id is displayed
	And clickable text link for recycling information is displayed
	And clickable text link for our brands is displayed
	And clickable text link for flyer sign up is displayed
	And clickable text link for sustainability is displayed
	
	
	@RegressionTest @MobileView
	Scenario: TC-2126, User views the "Legal" section- Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to footer
	And legal section is displayed
	And user clicks on legal 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And clickable text link for privacy policy is displayed
	And clickable text link for terms & conditions is displayed
	And clickable text link for site map is displayed
	And clickable text link for accessibility is displayed
	And clickable text link for pricing policy is displayed