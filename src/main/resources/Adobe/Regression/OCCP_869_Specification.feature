Feature: OCCP-869 PDP Specifications

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
    
    @RegressionTest @MobileView
    Scenario: TC-102 Verify product specifications are displayed on PDP for mobile (less than 8 specifications)
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    And the specifications are displayed in tabular format
    And the specifications are displayed with title and values for each specification as individual rows
    And the specifications are less than 8 on the Desktop  
    
    @RegressionTest @WidwView
    Scenario: TC-1383 Verify product specifications are displayed on PDP for Widescreen (less than 8 specifications) 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    And the specifications are displayed in tabular format
    And the specifications are displayed with title and values for each specification as individual rows
    And the specifications are less than 8 on the Desktop 
    
    
    @RegressionTest @MobieView @WideScreen @SmokeTest
    Scenario: TC-103, TC-104 Verify product specifications are displayed on PDP for desktop (more than 8 specifications) 
    Given pdp url is available
    When pdp page is displayed for the product
    Then the specifications section is displayed
    And the section title specifications is displayed
    Then verify the first 8 specifications are displayed on the PDP
    Then verify the view more specifications hyperlink is displayed
    And click on view more specifications hyperlink
    Then verify the remaining list of the specifications displays on the pdp
    #Then view more specifications is not displayed any more
    Then view less specifications is displayed
    And click on view less specifications hyperlink
    Then verify the first 8 specifications are displayed on the PDP
    Then verify the view more specifications hyperlink is displayed
    And view less specifications is not displayed

	