Feature: OCCP_1955: Home Services PDP

	Description: To test the HYBRIS Test Cases for the story OCCP-1955

	    @RegressionTest
      Scenario: TC-4303 HYB:OCCP-1955-OCCP-5217- Verify Build OCC API to publish Home Service details to PDP - Base product
      Given occ api is available
      When user hits GET method for home services
      Then homeService true should be displayed in the response
      And warranty message should be displayed-4303
      And Badges should not be displayed-4303
      And Specifications are NOT displayed-4303
      And Ratings should be displayed-4303
      And Image Gallary should be dsiplayed
      
      @RegressionTest
      Scenario: TC-4304 HYB:OCCP-1955-OCCP-5217- Verify Build OCC API to publish Home Service details to PDP - variant product
      Given occ api is available
      When user hits GET method for variant product home services
      Then homeService true should be displayed in the response
      And warranty message should be displayed-4303
      And Badges should not be displayed-4303
      And Specifications are NOT displayed-4303
      And Ratings should be displayed-4303
      And Image Gallary should be dsiplayed
      
      @RegressionTest
      Scenario: TC-4305 HYB:OCCP-1955-OCCP-5217- Verify Build OCC API to publish Home Service details to PDP-Product that do not have variant product

      Given occ api is available
      When user hits GET method for base product without variants-home services
      Then homeService true should be displayed in the response
      And warranty message should be displayed-4303
      And Badges should not be displayed-4303
      And Specifications are NOT displayed-4303
      And Ratings should be displayed-4303
      And Image Gallary should be dsiplayed
      
      