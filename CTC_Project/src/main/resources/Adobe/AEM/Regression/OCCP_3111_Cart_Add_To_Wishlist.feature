Feature: OCCP-3111 Cart - Add to Wishlist 
Description: To test the ADOBE AEM Test Cases for the story OCCP-3111
	
	@RegressionTest @AEM
	Scenario: TC-2990 Configure the text label "Item has been added to Wishlist"
	Given open browser
	When aem author with access navigates to add to wishlist cart page
	And login to AEM using the right credentials as mentioned in the test data
	And user should be able to author text label item has been added to wishlist
	And access the label text property and author the text
	And click on save and publish wishlist changes
	Given close Browser
	Given open browser
	Given cart url is available
	Then access the product item and click on respective wishlist icon
	Then item has been added to wishlist message should be displayed
	And verify wishlist item added label text changes are reflected on ctc site	
	
	@RegressionTest @AEM
	Scenario: TC-2991 Configure the text label "View Wishlist"
	When aem author with access navigates to add to wishlist cart page
	And login to AEM using the right credentials as mentioned in the test data
	And user should be able to author text label view wishlist
	And access the view wishlist label text property and author the text
	And click on save and publish wishlist changes
	Given close Browser
	Given open browser
	Given cart url is available
	Then access the product item and click on respective wishlist icon
	And a link should be displayed to view wishlist
	And verify view wishlist text changes are reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2994 Configure the text label "Close"
	When aem author with access navigates to add to wishlist cart page
	And login to AEM using the right credentials as mentioned in the test data
	And user should be able to author text label close
	And access the close label text property and author the text
	And click on save and publish wishlist changes
	Given close Browser
	Given open browser
	Given cart url is available
	And click on add to wishlist when user reached maximum no of items permitted in wishlist 
	Then error message should be displayed you have reached the limit of 2 items added to wishlist
	And verify close text changes are reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2993 Configure the text label "You have reached the limit of 100 items added to your Wishlist"
	When aem author with access navigates to add to wishlist cart page
	And login to AEM using the right credentials as mentioned in the test data
	And user should be able to author wishlist max limit message
	And access the wishlist max limit label text property and author the text
	And click on save and publish wishlist changes
	Given close Browser
	Given open browser
	Given cart url is available
	And click on add to wishlist when user reached maximum no of items permitted in wishlist 
	Then error message should be displayed you have reached the limit of 2 items added to wishlist
	And verify wishlist max limit text changes are reflected on ctc site