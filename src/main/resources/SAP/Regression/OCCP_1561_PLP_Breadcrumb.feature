Feature: OCCP-1561 PLP-Breadcrumb

	Description: To test the HYBRIS Test Cases for the story OCCP-1561
       
        @SmokeTest
        Scenario: TC-1633 HYB-OCCP-2499-OCCP-1561: Design outbound API for Categories for locale en
        Given occ api is available
        When user hits design outbound api
        Then user should be to see category id
        And user should be to see category name
        And user should be to see category url
        
        @RegressionTest
        Scenario: TC-1634 HYB-OCCP-2499-OCCP-1561: Design outbound API for Categories for locale fr_CA 
        Given occ api is available
        When user hits api design outbound for fr ca
        Then user able to see category id for fr ca in response
        And user able to see category name in JSON response for fr ca
        And user able to see category url for fr ca in response
  