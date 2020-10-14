Feature: OCCP-2735 Gigya Integration with Hybirs

	Description: To test the HYBRIS Test Cases for the story OCCP-2735
       
        @RegressionTest
        Scenario: TC-1667 HYB-OCCP-2733-OCCP-2735: Gigya-Verify creation of UID, UIDSignature, signatureTimestamp from Gigya API tool.
        Given open browser
        When gigya api tool url is available   
        When enter API key
				And enter user key
				And enter secret key
				And enter data center drop down
				And enter data center end point
				And click on add new text input button
				And enter parameter login name
				And enter parameter login value
				And enter parameter password
				And enter value of parameter password
				And click on send request button
				And gigya response
				  
        @RegressionTest
				Scenario: close browser
				Given close Browser