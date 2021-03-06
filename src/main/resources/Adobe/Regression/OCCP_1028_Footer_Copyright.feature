Feature: OCCP-1028 Footer : Footer Copyright
	Description: To test the ADOBE Test Cases for the story OCCP-1028
	
	@RegressionTest @WebView @WideScreen @TC-2787
	Scenario: TC-2787, TC-2786 Verification of clicking of View More - Desktop Wide And Desktop
	Given quit browser
	When open browser
	When pdp url is available
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
	
	@RegressionTest @MobileView @TabletView @TC-2785
	Scenario: TC-2785, TC-2788 Verification of clicking of View More - Mobile 
	When pdp url is available
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
	Scenario: TC-2781, TC-2784 Verification of display of Legal Disclaimer Text - Mobile 
	Given pdp url is available
	When pdp page is displayed for the product
	Then first 3 lines of the authored legal disclaimer text should be displayed in mobile
	Then view more is displayed
	
	@RegressionTest @WideScreen @WebView @MobileView @TabletView @TC-2779
	Scenario: TC-2779, TC-2778, TC-2777, TC-2780 Verification of display of Footer - Desktop Wide
	Given footer url is available
	When footer page is displayed
	Then copy right text is displayed
	And canadian tire logo should be displayed
	Then copy right label should be displayed
	Then editable clickable text view more is displayed
	
	@RegressionTest @WideScreen @WebView @MobileView @TabletView
	Scenario: TC-2774, TC-2775, TC-2773, TC-2776  User views the Footer
	Given pdp url is available
	When pdp page is displayed for the product
	Then footer is displayed
	Then copy right information should be displayed on the footer
	
	@RegressionTest @WebView @WideScreen @TC-2795
	Scenario: TC-2795, TC-2857 Verification of hover over a link - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	And in footer hover on any link on footer
	
	#@RegressionTest @MobileView @TabletView
	Scenario: TC-2839 Verification of hover over a link - Desktop 
	Given pdp url is available
	When pdp page is displayed for the product
	And user clicks on legal 'plus' section
	And in footerhover on any link on footer
	
	
	
	

	