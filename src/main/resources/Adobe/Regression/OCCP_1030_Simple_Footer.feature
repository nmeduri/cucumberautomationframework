Feature: OCCP-1030 Footer : Simple Footer
	Description: To test the ADOBE Test Cases for the story OCCP-1030
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2846, TC-2855 Verification of Legal Disclaimer property - Desktop
	When pdp url is available
	When pdp page is displayed for the product
	Then first three lines of the authored legal disclaimer text should be displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2865, TC-2838 Verification of clicking of text "View More" - Desktop Wide
	When pdp url is available
	When pdp page is displayed for the product
	Then ligal disclaimer is displayed
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2837, TC-2864 Verification of Legal Disclaimer property - Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	Then first 3 lines of the authored legal disclaimer text should be displayed in mobile
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2847, TC-TC-2856 Verification of clicking of text "View More" - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then ligal disclaimer is displayed
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2840, TC-2849 Verification of options present in Simple Footer - Desktop
	Given the footer page url is available
	When footer page is displayed
	Then editable clickable text Terms and conditions is displayed
	Then editable clickable text privacy and policy is displayed
	Then editable clickable text site map is displayed
	Then editable clickable text accessibility is displayed
	Then editable clickable text view more is displayed
	Then ligal disclaimer is displayed
	And click on view more
	Then editable clickable text view less is displayed
	Then copy right text is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2842, TC-2851 Verification of clicking of text "Terms & Conditions" - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	And in footer access and click on text and conditions
	Then user navigate to the page where detailed terms and conditions information is displayed
	
	@RegressionTest @WebView @WideScreen
	Scenario: TC-2848, TC-2857 Verification of hovering over a link - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then link terms and conditions should be underlined
	Then link privacy and policy should be underlined
	Then link site map should be underlined
	Then link accessibility should be underlined
	
	#@RegressionTest @MobileView @TabletView @SmokeTest
	Scenario: TC-2839, TC-2866 Verification of hovering over a link - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then clickable text Terms and conditions is displayed
	Then clickable text privacy and policy is displayed
	Then clickable text site map is displayed
	Then clickable text accessibility is displayed
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-2841, TC-2832 TC-2850, TC-2859 Verification of clicking of text Legal 
	Given footer url is available
	When footer page is displayed
	And in simple footer access and click on legal text
	Then user should be navigate on legal information
	
	@RegressionTest @WebView @WideScreen
	Scenario:  TC-2843, TC-2852 Verification of clicking of text "Privacy Policy" - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then editable clickable text privacy and policy is displayed
	And click on privacy policy
	Then user navigate on privacy policy page where detailed privacy policy information is displayed
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-2844, TC-2853, TC-2835, TC-2862 User clicks on text "Site Map" is displayed
	Given footer url is available
	When footer page is displayed
	And in simple footer and click on site map
	Then user is navigate on site map page where detailed site map information is displayed
	And switch on parent frame
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2834, TC-2861 Verification of clicking of text "Privacy Policy" - Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	And user clicks on legal 'plus' section
	And click on privacy policy
	Then user navigate on privacy policy page where detailed privacy policy information is displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2833, TC-2860 Verification of clicking of text "Terms & Conditions"
	Given pdp url is available
	When pdp page is displayed for the product
	And user clicks on legal 'plus' section
	And in footer access and click on text and conditions
	Then user navigate to the page where detailed terms and conditions information is displayed
	
	@RegressionTest @MobileView @TabletView
	Scenario: TC-2831, TC-2858 Verification of options present in Simple Footer - Mobile
	Given pdp url is available
	When pdp page is displayed for the product
	And user clicks on legal 'plus' section
	Then clickable text Terms and conditions is displayed
	Then clickable text privacy and policy is displayed
	Then clickable text site map is displayed
	Then clickable text accessibility is displayed
	Then clickable text view more is displayed
	Then ligal disclaimer is displayed
	And click on view more
	Then editable clickable text view less is displayed
	Then copy right text is displayed
	
	@RegressionTest @WebView @WideScreen @MobileView @TabletView
	Scenario: TC-2845,TC-2854, TC-2836, TC-2863 User clicks on text "Accessibility" is displayed
	Given footer url is available
	When footer page is displayed
	And in simple footer access and click on accessibility
	Then user should be navigated to the page where detailed accessibility information is displayed
	And switch on parent frame
	
	

	