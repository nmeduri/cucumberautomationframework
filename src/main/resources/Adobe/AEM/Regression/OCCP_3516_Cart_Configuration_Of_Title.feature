Feature: TC-4075 TC-4118 TC-4313 TC-4356 TC-4385 TC-4075
  Description: To test the ADOBE Test Cases for the stories

  @RegressionTest @AEM
  Scenario: TC-4075	OCCP-3516: Verify the configuration of X Item(s) Added to Cart title on the screen
    Given open browser
    When AEM author with access to configure PDP Add To Cart on the page
    And login to AEM using the credential as mentioned in the test data
    And click on Cart fly out component
    And click on aem configure button
    And update the title of add to cart field
    And user click on done button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4118	OCCP-3759: Verify Author is able to configure the Email Section Title, the Form Hyperlink and Icon
    Given open browser
    When AEM author with access to configure PDP Contact Us
    And login to AEM using the credential as mentioned in the test data
    And click on Contact Us component
    And click on aem configure button
    And verify author is able to configure email title
    And verify author is able to configure email label
    And user click on done button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM 
  Scenario: TC-4313	OCCP-4028: Verify look and feel for the Two Featured tile component with different combination of URL authoring
    Given open browser
    When AEM author with access to configure PDP TwoFeatured
    And login to AEM using the credential as mentioned in the test data
    And click on Two Featured Tiles
    And click on aem configure button
    And user clicks on close button
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4356	OCCP-5396: Verify Author using components that are pre-configured on the Account-Rewards template to author content
    Given open browser
    When AEM author with access to configure Account Rewards Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And user selects component to configure
    And click on the publish button
    And quit browser

  @RegressionTest @AEM
  Scenario: TC-4385	OCCP-5244: Verify author using components that are pre-configured on the Account-Order History template to author content
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
  Scenario: TC-4355	OCCP-5392: Verify Author adding components onto the Account-Addresses template to create additional content
    Given open browser
    When AEM author with access to configure Account Addresses Page
    And login to AEM using the credential as mentioned in the test data
    And click on drag components
    And click on insert component
    And verify all components are featured and banner related in the list
    And click on the publish button
    And quit browser
