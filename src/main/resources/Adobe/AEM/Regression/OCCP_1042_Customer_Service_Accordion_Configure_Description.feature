Feature: OCCP-1042 Customer Service - Accordion (Authorable)
  
  Description: To test the ADOBE Test Cases for the story OCCP-1042

  @RegressionTest @AEM @TC-3269
  Scenario: TC-3269	OCCP-1042: Customer Service - Accordion (Authorable) -Verify that the author is able to Configure Accordion Description
    Given open browser
    When AEM author with access to configure customer service page component
    And login to AEM using the credential as mentioned in the test data
    And click on Accordion component
    And click on aem configure button
    And update description of customer service
    And user click on done button
    And click on the publish button
    And customerservice informational copy url is available
    Then the configured description is displayed on the screen
    And quit browser
    And open browser
    When AEM author with access to configure customer service page component
    And login to AEM using the credential as mentioned in the test data
    And click on Accordion component
    And click on aem configure button
    And revert description of customer service
    And user click on done button
