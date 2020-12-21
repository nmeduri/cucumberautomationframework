Feature: OCCP-3632 Cart Page : View Cart Empty

	Description: To test the ADOBE Test Cases for the story OCCP-3632
	
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-2965
	Scenario: TC-2965 Verfiy user is an authenticated, when cart is empty and "Continue Shopping" link redirection on Mobile view	
	Given open browser
	When authenticated cart page is available
	Then shopping cart - 0 items should be displayed at the top
	Then message indicating the cart is empty should displayed
	Then user should prompted to Sign In to their account
	Then a link to Continue Shopping should displayed
	Then user click on continue shopping cart page
	Then user should redirect to main landing page
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView @TC-2964
	Scenario: TC-2964 Verfiy user is an authenticated, when cart is empty and "View Wishlist" button redirection on Mobile view	
	When authenticated cart page is available
	And click on cart sign in button
	When enter email detail
	And user enter password
	And user click on sign in button
	Then link card screen should be displayed
	And navigate on back page
	And navigate on back page
	Then shopping cart - 0 items should be displayed at the top
	Then message indicating the cart is empty should displayed
	Then button view wish list is displayed
	Then a link to Continue Shopping should displayed
	Then user click on continue shopping cart page
	Then user should redirect to main landing page
	
	@RegressionTest @WebView @TC-2954
	Scenario: TC-2954 Verfiy user is an authenticated, when cart is empty on Desktop
	Given open browser
	When authenticated cart page is available
	Then shopping cart - 0 items should be displayed at the top
	Then message indicating the cart is empty should displayed
	Then user should prompted to Sign In to their account
	Then a link to Continue Shopping should displayed
	Then user click on continue shopping cart page
	Then user should redirect to main landing page
	
	
	@RegressionTest @WebView @TC-2953
	Scenario: TC2953 Verify user is an unauthenticated, when cart is empty and "Continue Shopping" link redirection on Desktop View
	Given open browser
	When authenticated cart page is available
	Then shopping cart - 0 items should be displayed at the top
	Then message indicating the cart is empty should displayed
	Then user should prompted to Sign In to their account
	Then a link to Continue Shopping should displayed
	Then user click on continue shopping cart page
	Then user should redirect to main landing page
	