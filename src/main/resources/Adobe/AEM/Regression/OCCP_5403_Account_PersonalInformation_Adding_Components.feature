Feature: TC-4394 TC-4395 TC-4396
  Description: To test the ADOBE Test Cases for the stories

  @RegressionTest @AEM
  Scenario: TC-4394	OCCP-5403: Verify author using components that are pre-configured on the Account-Personal Information template to author content
    Given open browser
    When AEM author with access to configure Account Personal Information my account profile page
    And login to AEM using the credential as mentioned in the test data
    And click on myaccount profile component
    And click on aem configure button
    And verify user is able to access my profile template
    And user clicks on close button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4395	OCCP-5304: Verify the details when Cart templates pre-configured components is authored via AEM
    Given open browser
    When AEM author with access to configure Cart Template page
    And login to AEM using the credential as mentioned in the test data
    And verify drag components here parsy display
    And verify order summary component display
    And verify recommendation component display
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4396	OCCP-5304: Verify the details when Cart templates pre-configured components is authored via AEM
    Given open browser
    When AEM author with access to configure Cart Template page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And user selects banners component to configure
    And click on drag components
    And click on insert component
    And user selects two featured tiles to configure
    And click on the publish button
    And quit browser
    And quit browser
