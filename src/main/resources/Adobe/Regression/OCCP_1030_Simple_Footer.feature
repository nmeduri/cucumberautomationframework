Feature: OCCP-1030 Footer : Simple Footer
	Description: To test the ADOBE Test Cases for the story OCCP-1030
	
	@RegressionTest @WideScreen
	Scenario: TC-2856 Verification of clicking of text "View More" - Desktop Wide 
	Given pdp url is available
	When pdp page is displayed for the product
	Then ligal disclaimer is displayed
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	
	@RegressionTest @WebView
	Scenario: TC-2846 Verification of Legal Disclaimer property - Desktop 
	Given pdp url is available
	When pdp page is displayed for the product
	Then first three lines of the authored legal disclaimer text should be displayed
	
	
	@RegressionTest @WebView
	Scenario: TC-2847 Verification of clicking of text "View More" - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then ligal disclaimer is displayed
	And click on view more
	Then legal disclaimer should be expanded and the rest of the text should be displayed
	Then view less is displayed
	
	@RegressionTest @WebView
	Scenario: TC-2840 Verification of options present in Simple Footer - Desktop
	Given pdp url is available
	When pdp page is displayed for the product
	Then editable clickable text legal is displayed
	Then editable clickable text Terms and conditions is displayed
	Then editable clickable text privacy and policy is displayed
	Then editable clickable text site map is displayed
	Then editable clickable text accessbility is displayed
	Then editable clickable text view more is displayed
	Then ligal disclaimer is displayed
	And click on view more
	Then editable clickable text view less is displayed
	Then copy right text is displayed
	

	