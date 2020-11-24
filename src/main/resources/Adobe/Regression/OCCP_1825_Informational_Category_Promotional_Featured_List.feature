Feature: OCCP-1825 Featured List : Informational Category Promotional Featured List
	Description: To test the ADOBE Test Cases for the story OCCP-1825
	
	
	@RegressionTest @WideScreen @TC-1812
	Scenario: TC-1812 Verfiy the display of default list of products in the carousel view on the Featured list page on Widescreen
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	
	@RegressionTest @WebView @WideScreen @TC-1813
	Scenario: TC-1813 Verify the chevron and carousel when the featured list has more than 4 tiles on Widescreen
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And verify the display of chevron when there are more than 4 product on left and right side
	
	@RegressionTest @WebView @WideScreen @TC-1814
	Scenario: TC-1814 Verify the featured list view when user clicks on chevron on Widescreen
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on right chevron
	Then user should be displayed the next set of cards
	Then user is be able to see associated pagination second dots
	And click on left chevron
	Then user should be displayed previous set of cards
	Then user should be able to see associated pagination dots
	Then verify the max number of dots on the component
	Then user should still be able to see the last page with four cards
	
	#@RegressionTest @WebView @WideScreen @TC-1815
	Scenario: TC-1815 Verify the pagination on the featured list component on Widescreen
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on right chevron
	Then user should be displayed the next set of cards
	Then user is be able to see associated pagination second dots
	And click on left chevron
	Then user should be displayed previous set of cards
	Then user should be able to see associated pagination dots
	Then verify the max number of dots on the component
	Then user should still be able to see the last page with four cards
	
	@RegressionTest @WebView @WideScreen @TC-1816
	Scenario: TC-1816 Verify the details when user clicks on pagination dots on FL component on Widescreen
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on one of the dot on the carousel
	Then verify the dot is highlighted upon click
	
	@RegressionTest @WebView @WideScreen @TC-1817
	Scenario: TC-1817 Verify the details when there is no pagination when there are only 4 tiles on FL component on Widescreen
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	Then user should not be able to see pagination dots when there are only four tiles available
	Then user should not be able to see chevron when there are only four tiles available
	
	@RegressionTest @WebView @WideScreen @TC-1819
	Scenario: TC-1819 Verfiy the display of details on the Featured list page
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	Then verify the display of featured list title
	Then verify the display of card and related image
	Then verify the display of title on the card
	Then verify the display of description on the card
	Then verify the display of learn more on product card
	
	@RegressionTest @WebView @TC-1820
	Scenario: TC-1820 Verfiy the display of default list of products in the carousel view on the Featured list page
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	Then user should be able to see four products in the carousel view by default
	
	@RegressionTest @WideScreen @TC-1821
	Scenario: TC-1821 Verify the chevron and carousel when the featured list has more than 4 tiles
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	
	@RegressionTest @WebView @WideScreen @TC-1822
	Scenario: TC-1822 Verify the featured list view when user clicks on chevron 
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on right chevron
	Then user should be displayed the next set of cards
	Then user is be able to see associated pagination second dots
	And click on left chevron
	Then user should be displayed previous set of cards
	Then user should be able to see associated pagination dots
	Then verify the max number of dots on the component
	Then user should still be able to see the last page with four cards
	
	@RegressionTest @WebView
	Scenario: TC-4840 Verfiy the display of key line color on the Promotional image featured list page
	Given open browser
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And verify the display of card and related image
	And user should able to see the key line for all the images displayed on the Image featured list

	@RegressionTest @WebView @WideScreen @TC-1824
	Scenario: TC-1824 Verify the details when user clicks on pagination dots on FL component on Desktop
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on one of the dot on the carousel
	Then verify the dot is highlighted upon click

	@RegressionTest @WideScreen @TC-1825
	Scenario: TC-1825 Verify the details when there is no pagination when there are only 4 tiles on FL component
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	Then user should not be able to see pagination dots when there are only four tiles available
	Then user should not be able to see chevron when there are only four tiles available
	
	@RegressionTest @WebView @WideScreen @TC-1827
	Scenario: TC-1827 Verify the details when user is on first page and there are more than 4 tiles on FL component 
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And save data anaytics details of last page
	And click on left chevron
	And user should be navigated to the last page of fl carousel
	Then user should be able to see the last pagination dot on the carousel is highlighted
	
	@RegressionTest @WebView @WideScreen @TC-1828
	Scenario: TC-1828 Verify the details when user is on last page and there are more than 4 tiles on FL component 
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And save data anaytics details of first page
	And click on right chevron
	And user should be navigated to the first page of fl carousel
	Then user should be able to see the last pagination dot on the carousel is highlighted
	
	@RegressionTest @TC-1829
	Scenario: TC-1829 Verfiy the display when user clicks on "Learn more" CTA
	When navigate to feature list page
	When click on learn more link
	Then user should be redirected to defined destination on same tab
	
	@RegressionTest @WebView @WideScreen @TC-1815
	Scenario: TC-1823, TC-1815 Verify the pagination on the featured list component
	Given open browser
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on right chevron
	Then user should be displayed the next set of cards
	Then user is be able to see associated pagination second dots
	And click on left chevron
	Then user should be displayed previous set of cards
	Then user should be able to see associated pagination dots
	Then verify the pagination dots indicate the number of fl pages
	
	@RegressionTest @WebView @WideScreen @TC-1817
	Scenario: TC-1817 Verify the details when there is no pagination when there are only 4 tiles on FL component on Widescreen
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	Then user should not be able to see pagination dots when there are only four tiles available
	Then user should not be able to see chevron when there are only four tiles available
	
	@RegressionTest @WebView @WideScreen @TC-1819
	Scenario: TC-1819 Verfiy the display of details on the Featured list page
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	Then verify the display of featured list title
	Then verify the display of card and related image
	Then verify the display of title on the card
	Then verify the display of description on the card
	Then verify the display of learn more on product card
	
	@RegressionTest @WebView @TC-1820
	Scenario: TC-1820 Verfiy the display of default list of products in the carousel view on the Featured list page
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	Then user should be able to see four products in the carousel view by default
	
	@RegressionTest @WideScreen @TC-1821
	Scenario: TC-1821 Verify the chevron and carousel when the featured list has more than 4 tiles
	When navigate to featured list page
	Then user should be able to see featured list component on the page
	And user should be able to see four products in the carousel view by default
	
	@RegressionTest @WebView @WideScreen @TC-1822
	Scenario: TC-1822 Verify the featured list view when user clicks on chevron 
	When fl page  is available for more than four products
	Then user should be able to see featured list component on the page
	And click on right chevron
	Then user should be displayed the next set of cards
	Then user is be able to see associated pagination second dots
	And click on left chevron
	Then user should be displayed previous set of cards
	Then user should be able to see associated pagination dots
	Then verify the max number of dots on the component
	Then user should still be able to see the last page with four cards
	


	