Feature: OCCP-3082 : Featured List |Product List|Authorable

	Description: To test the ADOBE Test Cases for the story OCCP-3082

	@RegressionTest @WebView @WideScreen
	Scenario: TC-3919 OCCP-3082 Featured List |Product List| Authorable- Verify Destination URL for product cards
	Given open browser
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	When click on Product Card
	Then the product title is displayed on the product
	And The destination URL is auto populated based on the product code entered by user
	
	@RegressionTest @MobileView
	Scenario: TC-3919 OCCP-3082 Featured List |Product List| Authorable- Verify Destination URL for product cards
	Given open browser
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	When click on the Product Card mobile
	Then the product title is displayed on the product
	And The destination URL is auto populated based on the product code entered by user
	
	@RegressionTest @MobileView @WideScreen @WebView @TC-3898
	Scenario: TC-3898	OCCP-3082 Featured List |Product List| Authorable- Verify when User views the Product Featured List in Desktop /Desktop Wide/Mobile
	Given open browser
  When navigate to featured list page

