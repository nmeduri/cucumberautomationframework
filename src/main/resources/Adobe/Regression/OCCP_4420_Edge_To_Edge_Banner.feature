Feature: OCCP-4420 : Edge to Edge Banner
	Description: To test the ADOBE Test Cases for the story OCCP-4420
	
	
	@RegressionTest @WebView @WideScreen @TabletView @TC-3576
	Scenario: TC-3576 OCCP-4420 Edge to Edge Banner- Verify when User is able to view the banner(with image)for EN/FR locale| Desktop/desktop wide/Tablet
	When edge to edge banner url is available for EN
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And edge banner image is displayed
	And breadcrumb is displayed
	When edge to edge banner for FR locale url is available
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And edge banner image is displayed
	And breadcrumb is displayed
	
	@RegressionTest @WebView @WideScreen @TabletView
	Scenario: TC-4007 OCCP-4420 Edge to Edge Banner- Verify when User is able to view the banner(without image) for EN/FR locale| Desktop/desktop wide/Tablet
	When without image edge to edge banner url is available for EN
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And image should not displayed to the right side of the page
	And breadcrumb is displayed
	When without image edge to edge banner FR locale url is available
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And image should not displayed to the right side of the page
	And breadcrumb is displayed
	
	@RegressionTest @MobileView
	Scenario: TC-3575 OCCP-4420 Edge to Edge Banner- Verify when User is able to view the banner(with image) for EN/FR locale-Stacking in Mobile
	When edge to edge banner url is available for EN
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And edge banner image is displayed
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And scroll down the window below the view point
	And scroll up to page
	And mobile breadcrumb is displayed
	When edge to edge banner for FR locale url is available
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And edge banner image is displayed
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And scroll down the window below the view point
	And scroll up to page
	And mobile breadcrumb is displayed
	
	@RegressionTest @MobileView
	Scenario: TC-4006 OCCP-4420 Edge to Edge Banner- Verify when User is able to view the banner(without image) for EN/FR locale-Stacking in Mobile
	When without image edge to edge banner url is available for EN
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And image should not displayed to the right side of the page
	And scroll down the window below the view point
	And scroll up to page
	And mobile breadcrumb is displayed
	When without image edge to edge banner FR locale url is available
	When edge banner page is displayed for the product
	Then user should be able to view the edge banner
	And title is displayed to the left side of the page
	And description is displayed to the left side of the page
	And image should not displayed to the right side of the page
	And scroll down the window below the view point
	And scroll up to page
	And mobile breadcrumb is displayed
	