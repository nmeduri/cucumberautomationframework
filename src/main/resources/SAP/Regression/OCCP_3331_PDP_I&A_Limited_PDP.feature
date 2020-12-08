Feature: OCCP_3331: PDP I&A - Limited PDP

	Description: To test the HYBRIS Test Cases for the story OCCP_3331
	
		    @RegressionTest
    		Scenario: TC-5670 HYB:OCCP-3331-OCCP-5444: Build OCC outbound api for Limited PDP - Verify JSON for isLimitedPDP
    		Given occ api is available
        When 5670-user hits GET api for pdp
        Then Response JSON should have isLimitedPDP and its value
        
        @RegressionTest
    		Scenario: TC-5671 HYB:OCCP-3331-OCCP-5444: Build OCC outbound api for Limited PDP - Verify JSON for image section when isLimitedPDP is true
    		Given occ api is available
        When 5670-user hits GET api for pdp
        Then isLimitedPDP is true should displayed in JSON response
        And image section should not displayed in JSON response
        
        @RegressionTest
    		Scenario: TC-5672 HYB:OCCP-3331-OCCP-5444:  HYB:DEV:Build OCC outbound api for Limited PDP - Verify JSON for image section when isLimitedPDP is false
    		Given occ api is available
        When 5672-user hits GET api for pdp
        Then isLimitedPDP is false should displayed in JSON response
        And empty image section and with or without values and sub sections in JSON response