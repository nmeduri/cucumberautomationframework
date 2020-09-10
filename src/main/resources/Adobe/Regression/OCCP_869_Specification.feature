Feature: OCCP-874 PDP Specifications

	Description: To test the ADOBE Test Cases for the story OCCP-869
       
    @RegressionTest @WebView @WideScreen
    Scenario: TC-101 Verify product specifications are displayed on PDP for desktop (less than 8 specifications) 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    And the specifications are displayed in tabular format
    And the specifications are displayed with title and values for each specification as individual rows
    And the specifications are less than 8 on the Desktop
      

	