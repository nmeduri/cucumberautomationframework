Feature: OCCP-1849 BANNER: Standard Masthead Banner
	Description: To test the ADOBE Test Cases for the story OCCP-1849
	
	@RegressionTest @WebView @WideScreen @TC-3426 @Test
	Scenario: TC-3426 OCCP-1849 BANNER: Masthead(Default) Banner on 'Brand' PLP Template- Verify that User is able to view the banner  Desktop/widescreen/Tablet
	When masthead banner url is available
	Then user should be able to view banner
	Then user should be able to view background color
	Then user should be able to view title
	Then user able to view description
	When masthead banner fr url is available
	Then user should be able to view banner
	Then user should be able to view background color
	Then user should be able to view title
	Then user able to view description

	@RegressionTest @WebView @WideScreen @TC-3427 @Test
	Scenario: TC-3427 OCCP-3759 View Contact Us page - part 4 (page elements other than form)- Verify configuration of the Email Section Title, Description and Icon
	When masthead banner url is available
	Then user should be able to view banner
	Then user should be able to view background color
	Then user should be able to view title
	Then title is on left aligned
	Then title could be up to 60 characters in length
	Then description could be up to 140 characters in length