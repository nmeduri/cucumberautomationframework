Feature: TC-4386 TC-4389 TC-4390 TC-4391 TC-4392 TC-4393
  Description: To test the ADOBE Test Cases for the stories

  @RegressionTest @AEM 
  Scenario: TC-4386	OCCP-5244:  Verify author able to add components onto the Account-Order History template to create additional content
    Given open browser
    When AEM author with access to configure orderhistory Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And verify all components are featured and banner related in the list
    And user selects component to configure
    And verify user selects components from order history
    And click on aem configure button
    And user clicks on close button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4389	OCCP-5388: Verify author using components that are pre-configured on the Account-Payment Information template to author content
    Given open browser
    When AEM author with access to configure Account Payment Information Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And user selects component to configure
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4390	OCCP-5388: Verify author using components that are pre-configured on the Account-Order History template to author content
    Given open browser
    When AEM author with access to configure Account Payment Information Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And verify all components are featured and banner related in the list
    And user selects component to configure
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4391	OCCP-5394: Verify author using components that are pre-configured on the Account-Preferences template to author content
    Given open browser
    When AEM author with access to configure Account Payment Information Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And user selects Account Payment Options component to configure
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4392	OCCP-5394: Verify author able to add components onto the Account-Preferences template to create additional content
    Given open browser
    When AEM author with access to configure Account Preferences Template Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And user selects Account Preferences component to configure
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4393	OCCP-5403: Verify author using components that are pre-configured on the Account-Personal Information template to author content
    Given open browser
    When AEM author with access to configure Account Personal Information my account profile page
    And login to AEM using the credential as mentioned in the test data
    And click on myaccount profile component
    And click on aem configure button
    And verify user is able to access my profile template
    And user clicks on close button
    And click on the publish button
    And quit browser
