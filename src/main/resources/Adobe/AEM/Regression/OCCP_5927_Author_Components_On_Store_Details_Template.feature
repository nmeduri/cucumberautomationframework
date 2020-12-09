Feature: TC-4865 TC-4866 TC-4970
  Description: To test the ADOBE Test Cases for the stories

  @RegressionTest @AEM
  Scenario: TC-4865	OCCP-1026:Verify Author using components that are pre-configured on the Store Details template to author content
    Given open browser
    When AEM author with access to contact us Page
    And login to AEM using the credential as mentioned in the test data
    And click on contact us component for Canada
    And click on aem configure button
    And enter data in title form
    And user click on done button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4866	OCCP-1026:Verify that Author is able to configure the Form Title
    Given open browser
    When AEM author with access to contact us Page
    And login to AEM using the credential as mentioned in the test data
    And click on contact us component for Canada
    And click on aem configure button
    And enter data in title form
    And user click on done button
    And click on the publish button
    And quit browser
    And open browser
    When AEM author with access to configure intial product result load on the page
    And login to AEM using the credential as mentioned in the test data
    And click on facet panel
    And click on aem configure button
    And revert facet title
    And user click on done button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4970	OCCP-1026:Verify that Author is able to configure the Selected Field
    Given open browser
    When AEM author with access to configure intial product result load on the page
    And login to AEM using the credential as mentioned in the test data
    And click on facet panel
    And click on aem configure button
    And configure facet selected field
    And user click on done button
    And click on the publish button
    And quit browser
    And open browser
    When AEM author with access to configure intial product result load on the page
    And login to AEM using the credential as mentioned in the test data
    And click on facet panel
    And click on aem configure button
    And revert facet title
    And user click on done button
    And quit browser
