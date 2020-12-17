Feature: OCCP-1027 Footer : Footer Links
	Description: To test the ADOBE Test Cases for the story OCCP-1027
	
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2096, TC-2112 User views the links displayed on Footer-desktop/desktop wide
	When pdp url is available
	When pdp page is displayed for the product
	And customer support section is displayed
	And services and solutions section is displayed
	And about us section is displayed
	And legal section is displayed
	
	@RegressionTest @MobileView @TabletView @TC-2119
	Scenario: TC-2119 User views the links displayed on Footer on Mobile
	When pdp url is available
	When pdp page is displayed for the product
	Then scroll down to mobile footer
	Then collapsed headers are displayed with 'plus' sign
	And customer support section is displayed
	And services and solutions section is displayed
	And about us section is displayed
	And legal section is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2097, TC-2113 User views the "Customer Support " Section
	Given pdp url is available
	When pdp page is displayed for the product
	And customer support section is displayed
	And clickable text link for order status is displayed
	And clickable text link for pickup & delivery is displayed
	And clickable text link for returns & exchanges is displayed
	And clickable text link for help & faqs is displayed
	And clickable text link for contact us is displayed
	And clickable text link for store locator is displayed
	And clickable text link for product recalls is displayed
	And clickable text link for safety data sheets is displayed
	
	@RegressionTest @WebView @WideScreen 
	Scenario: TC-2098, Tc-2114 User views the "Services & Solutions" Section
	Given pdp url is available
	When pdp page is displayed for the product
	And services and solutions section is displayed
	And clickable text link for canadian tires financial services is displayed
	And clickable text link for installation & assembling is displayed
	And clickable text link for auto service centre is displayed
	And clickable text link for loan-a-tool is displayed
	And clickable text link for roadside assistance is displayed
	And clickable text link for gift cards is displayed
	And clickable text link for tested for life is displayed
	And clickable text link for gift registry is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2099, Tc-2115 User views the "About Us" Section
	Given pdp url is available
	When pdp page is displayed for the product
	And about us section is displayed
	And clickable text link for about canadian tire is displayed
	And clickable text link for careers is displayed
	And clickable text link for about triangle id is displayed
	And clickable text link for recycling information is displayed
	And clickable text link for our brands is displayed
	And clickable text link for flyer sign up is displayed
	And clickable text link for sustainability is displayed
		
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2100, Tc-2116 User views the "Legal" Section
	Given pdp url is available
	When pdp page is displayed for the product
	And legal section is displayed
	And clickable text link for privacy policy is displayed
	And clickable text link for terms & conditions is displayed
	And clickable text link for site map is displayed
	And clickable text link for accessibility is displayed
	And clickable text link for pricing policy is displayed

	@RegressionTest @MobileView @TabletView
	Scenario: TC-2120, User views the "Customer Support " Section-Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to mobile footer
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
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2122, User views the "Services & Solutions" Section-mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to mobile footer
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
	

	@RegressionTest @MobileView @TabletView
	Scenario: TC-2124, User views the "About Us" section-Mobile	
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to mobile footer
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
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2126, User views the "Legal" section- Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then scroll down to mobile footer
	And legal section is displayed
	And user clicks on legal 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And clickable text link for privacy policy is displayed
	And clickable text link for terms & conditions is displayed
	And clickable text link for site map is displayed
	And clickable text link for accessibility is displayed
	And clickable text link for pricing policy is displayed
	
	@RegressionTest @WebView @WideScreen
		Scenario: TC-2102, TC-2118 User view the section headers
		Given pdp url is available
		When pdp page is displayed for the product
		Then scroll down to footer
		And user clicks on the section headers name Customer Support
		And user clicks on the section headers name Services & Solutions
		And user clicks on the section header name About Us
		And user clicks on the section header name Legal
	
		@RegressionTest @WebView @WideScreen
		Scenario: TC-2101, TC-2117 User clicks on the links listed under four sections (Customer Support, Services & Solutions, About Us, Legal)
		Given pdp url is available
		When pdp page is displayed for the product
		And customer support section is displayed
		Then scroll down to footer
		And in footer links under custom support section access and click on order status
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on pickup & delivery
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on returns & exchanges
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on help & faqs
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on contact us
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on store locator
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on product recalls
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under custom support section access and click on safety data sheets
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And services and solutions section is displayed
		And in footer links under services and solutions section access and click on canadian tires financial services
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on installation & assembling
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on auto service center
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on loan-a-tool
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on roadside assistance
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on gift cards
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on tested for life
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under services and solutions section access and click on gift registry
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And about us section is displayed
		And in footer links under about us section access and click on about canadian tire
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on careers
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on about triangle id
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on recycling information
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on our brands
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on flyer sign up
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under about us section access and click on sustainability
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And legal section is displayed
		And in footer links under legal section access and click on privacy policy
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under legal section access and click on terms & conditions
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under legal section access and click on site map
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under legal section access and click on accessibility
		Then user should be navigate to defined associated page
		And user navigates back to to previous page
		And in footer links under legal section access and click on pricing policy
		Then user should be navigate to defined associated page
		And user navigates back to to previous page

	@RegressionTest @MobileView @TabletView  @TC-2121
	Scenario: TC-2121, User clicks on "-" on Customer Support section -Mobile
	Given quit browser
	When open browser
	Given pdp url is available
	When pdp page is displayed for the product
	And customer support section is displayed
	And user clicks on Custom Support 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And user click on minus section
	Then the sub section should be collapsed to the original view and expanded sub-section links should not be displayed
	And the 'plus' sign should be displayed instead of 'minus' sign
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2123, User clicks on "-" on "Services & Solutions" Section-mobile
	Given pdp url is available
	When pdp page is displayed for the product
	And services and solutions section is displayed
	And user clicks on services and solutions 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And user click on minus section
	Then the sub section should be collapsed to the original view and expanded sub-section links should not be displayed
	And the 'plus' sign should be displayed instead of 'minus' sign
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2125, User clicks on "-" on "About Us" section-Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	And about us section is displayed
	And user clicks on about us 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And user click on minus section
	Then the sub section should be collapsed to the original view and expanded sub-section links should not be displayed
	And the 'plus' sign should be displayed instead of 'minus' sign
	
	@RegressionTest @TabletView @MobileView 
	Scenario: TC-2127, User clicks on "-" on "Legal" section-Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	And legal section is displayed
	And user clicks on legal 'plus' section
	Then sub section should expand to display below links
	Then the 'plus' sign is replaced by 'minus' sign
	And user click on minus section
	Then the sub section should be collapsed to the original view and expanded sub-section links should not be displayed
	And the 'plus' sign should be displayed instead of 'minus' sign
