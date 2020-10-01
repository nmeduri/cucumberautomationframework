Feature: OCCP-1028 Footer : Footer Copyright
	Description: To test the ADOBE Test Cases for the story OCCP-1028
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2787, TC-2786 Verification of clicking of View More - Desktop Wide And Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	Then view more should not be displayed
	And click on view less
	Then first three lines of the authored legal disclaimer text should be displayed
	And complete disclaimer text should not be displayed
	Then editable clickable text view more is displayed
	Then view less should not be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2785 Verification of clicking of View More - Mobile 
	Given pdp url is available
	When pdp page is displayed for the product
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	Then view more should not be displayed
	And click on view less
	Then first 3 lines of the authored legal disclaimer text should be displayed in mobile
	And complete disclaimer text should not be displayed
	Then view more is displayed
	Then view less should not be displayed
	
	@RegressionTest @WideScreen @WebView
	Scenario: TC-2783, TC-2782 Verification of display of Legal Disclaimer Text - Desktop Wide AND Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then ligal disclaimer is displayed
	Then first three lines of the authored legal disclaimer text should be displayed
	Then view more is displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2781 Verification of display of Legal Disclaimer Text - Mobile 
	Given pdp url is available
	When pdp page is displayed for the product
	Then first 3 lines of the authored legal disclaimer text should be displayed in mobile
	Then view more is displayed
	
	@RegressionTest @WideScreen @WebView @MobileView @TabletView
	Scenario: TC-2779, TC-2778, TC-2777 Verification of display of Footer - Desktop Wide 
	Given pdp url is available
	When pdp page is displayed for the product
	Then copy right text is displayed
	And canadian tire logo should be displayed
	Then copy right label should be displayed
	Then editable clickable text view more is displayed
	
	@RegressionTest @WideScreen @WebView @MobileView @TabletView
	Scenario: TC-2775, TC-2774 Verification of display of Footer - Desktop Wide
	Given pdp url is available
	When pdp page is displayed for the product
	Then footer is displayed
	Then copy right information should be displayed on the footer
	
	
	

	