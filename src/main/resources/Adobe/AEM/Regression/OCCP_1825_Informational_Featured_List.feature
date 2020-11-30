Feature: OCCP-1825 Featured List: Informational Featured Lists with Icons (Authorable)
	Description: To test the ADOBE Test Cases for the story OCCP-1825
	
	@RegressionTest @AEM @TC-1837
	Scenario: TC-1837 Verify feaured list component is configurable on an authored page
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the feature list component on the authored page
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then configured component is displayed on page
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And revert configured component on fl
	And user click on done button
	
	
	
	
	@RegressionTeset @AEM
	Scenario: TC-1838 Verify the display of error message when mandatory fields are not added while authoring the content
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And do not fill the mandotary fields
	And user click on check button
	Then user should see authoring error message as  the mandatory fields are not entered
	And reverse the image one changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1839
	Scenario: TC-1839 Verify the display of error message when min. threshold for the tile are not met when authroing the featured list component while authoring the content  
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And fill minimum thershold value with less than min
	And user click on check button
	Then user should see error authoring message as the mininum thershold
	
	@RegressionTest @AEM @TC-1836
	Scenario: TC-1836 Verify destination url is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the destination url of learn more on featured list
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then verify the configured image feature list component
	
	@RegressionTest @AEM @TC-1835
	Scenario: TC-1835 Verify Learn more label is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the learn more label
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then learn more label should be updated on the page
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And reverse the learn more label changes
	And user click on done button
	
	@RegressionTest @AEM @TC-1832
	Scenario: TC-1832 Verify the image of the featured list is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configue the image of feature list
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then configured image displayed on the fetaured list
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And reverse the image of feature list
	And user click on done button
	
	@RegressionTest @TC-1840
	Scenario: TC-1840 Verify the URL for a title is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure the url for tile
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then verify the configured image feature list component
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And revert the url for tile
	And user click on done button
	
	@RegressionTest @TC-1834
	Scenario: TC-1834 Verify the descriptive message on the FL is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure descripitve message field on fl
	Then user should be able to see descriptive message tool tip message
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then user should be able to see the updated configured descriptive message on fl
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And revert descriptive message detail
	And user click on done button
	
	@RegressionTest @TC-1833
	Scenario: TC-1833 Verify the title for the description on the FL is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And configure descriptive title field on fl
	Then user should be able to see descriptive title tool tip message
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then configured descriptive title is displayed on page
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And revert descriptive title field on fl
	And user click on done button
	
	@AEM @TC-1831
	Scenario: TC-1831 Verify the Title of the featured list is configurable via AEM
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And verify the title field on fl components is configurable
	And configure descriptive title field on fl
	Then user should be able to see title tool tip message
	And user click on done button
	And click on the publish
	And navigate to feature list page
	Then configured title is displayed on page
	And quit browser
	And open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on feature list panel
	And click on aem configure button
	And revert fl title detail
	And user click on done button
	
	@AEM @TC1841
	Scenario: TC-1841 Business User configures that on clicking FL -user is navigated to new tab/same page
	Given open browser
	When AEM author with access to configure feature list authorable page
	And login to AEM using the credential as mentioned in the test data
	And click on edit icon on header
	And click on feature list panel
	And click on aem configure button
	And verify user can configure whether clicking on card or cta will open a new tab or same tab
	And user click on check button
	And click on the publish button
	And navigate to feature list page
	Then verify if fl card opens in new tab or same tab as authored
	And switch on parent frame
	Then verify if fl cta opens in new tab or same tab as authored
	And switch on parent frame

	
	
	
	
	
	
	