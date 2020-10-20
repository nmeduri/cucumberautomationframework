Feature: OCCP_4520_HYB: DEV: Change Loyalty Badges approach - inbound/outbound

	Description: To test the HYBRIS Test Cases for the story OCCP-4520

	    @RegressionTest
      Scenario: TC-3074 HYB:OCCP-3773-OCCP-4520: Change Loyalty Badges approach - inbound/outbound - verify badge in OCC API
      Given occ api is available
      When user hits GET method for Loyalty badge
      Then Response should display Loyalty badge with value
