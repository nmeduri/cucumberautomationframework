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
	
