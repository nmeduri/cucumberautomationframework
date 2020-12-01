Feature: OCCP_4444_OCCP_4520: Tech_Enablers

	Description: To test the HYBRIS Test Cases for the story OCCP-4444- OCCP-4520

	    @RegressionTest
      Scenario: TC-3074 HYB:OCCP-3773-OCCP-4520: Change Loyalty Badges approach - inbound/outbound - verify badge in OCC API
      Given occ api is available
      When user hits GET method for Loyalty badge
      Then Response should display Loyalty badge with value
