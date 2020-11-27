Feature: OCCP-3082 : Featured List Product ListAuthorable

	Description: To test the ADOBE Test Cases for the story OCCP-3082

	@RegressionTest @WebView @WideScreen
	Scenario: TC-3919 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	When click on Product Card
	Then the product title is displayed on the product
	And The destination URL is auto populated based on the product code entered by user
	
	@RegressionTest @MobileView
	Scenario: TC-3919 OCCP-3082 Featured List Product List Authorable- Verify Destination URL for product cards
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	When click on the Product Card mobile
	Then the product title is displayed on the product
	And The destination URL is auto populated based on the product code entered by user
	
	@RegressionTest @MobileView @WideScreen @WebView @TC-3898
	Scenario: TC-3898	OCCP-3082 Featured List Product List Authorable- Verify when User views the Product Featured List in Desktop /Desktop Wide/Mobile
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	And user is displayed with product Title
	And user is displayed with product card
	And user is displayed with product image
	
    @RegressionTest @MobileView @WideScreen @WebView @TC-3899
	Scenario: TC-3899	OCCP-3082 Featured List Product List Authorable- Verify Featured list view in Desktop/desktop wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	Then validate the number of cards should be displayed
	
    @RegressionTest @MobileView @WideScreen @WebView @TC-3900
	Scenario: TC-3900	OCCP-3082 Featured List Product List Authorable- Verify Featured list - Carousel Display in Desktop/desktop wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	And user should be able to see four products in the carousel view by default
	
    @RegressionTest @MobileView @WideScreen @WebView @TC-3901
	Scenario: TC-3901	OCCP-3082 Featured List Product List Authorable- Verify Featured List View-User clicks on chevron in Desktop/desktop wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	And verify the display of chevron when there are more than 4 product on left and right side
	
	@RegressionTest @MobileView @WideScreen @WebView @TC-3903
	Scenario: TC-3903	OCCP-3082 Featured List Product List Authorable- Verify Featured List - User clicks on Pagination Dots in Desktop/Desktop Wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
  And click on right chevron
	Then validate the number of cards should be displayed
	Then valiadte pagination second dots displayed in product list page
	
	@RegressionTest @MobileView @WideScreen @WebView @TC-3902
	Scenario: TC-3902	OCCP-3082 Featured List Product List Authorable- Verify Featured list - Pagination in Desktop/desktop wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
 	Then user should be able to see associated pagination dots
 
	@RegressionTest @WebView @WideScreen @TC-3904
	Scenario: TC-3904	OCCP-3082 Featured List Product List Authorable- Verify Featured list - No Pagination in Desktop/desktop wide
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see four products in the carousel view by default
	Then user should not be able to see pagination dots when there are only four tiles available
	Then user should not be able to see chevron when there are only four tiles available
	
	@RegressionTest @WebView @WideScreen @TC-3906
	Scenario: TC-3906	OCCP-3082 Featured List Product List Authorable- Verify when User is on last page of FL-Carousel
	When product featured list page url is available
	Then product featured list page is displayed
	And click on right chevron
	Then display last pagination dot on the carousel is highlighted
	
	@RegressionTest @WebView @WideScreen @TC-3905
	Scenario: TC-3905 OCCP-3082 Featured List Product List Authorable- Verify when User is on first page of FL-Carousel
	When product featured list page url is available
	Then product featured list page is displayed
	And click on left chevron
	Then display first pagination dot on the carousel is highlighted
	
	@RegressionTest @MobileView @TC-3907
	Scenario: TC-3907	OCCP-3082 Featured List Product List Authorable- Verify Featured list view in Mobile
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	Then validate the number of cards should be displayed
	
	@RegressionTest @MobileView @TC-3908
	Scenario: TC-3908	OCCP-3082 Featured List Product List Authorable- Verify Featured list - Carousel Display in Mobile
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
	And user should be able to see four products in the carousel view by default
	
	@RegressionTest @MobileView @TC-3910
	Scenario: TC-3910	OCCP-3082 Featured List Product List Authorable- Verify Featured list - Pagination in Mobile
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
 	Then user should be able to see associated pagination dots
 
 @RegressionTest @MobileView @TC-3913
	Scenario: TC-3913	OCCP-3082 Featured List Product List Authorable- Verify when User clicks on Product Cards in Desktop/Desktop Wide/Mobile
	When product featured list page url is available
	Then product featured list page is displayed
	And user should be able to see product featured list component on the page
    When click on Product Card
	Then the product title is displayed on the product
