Feature: OCCP-2847  Header and Main Navigation | Pencil Banner
	Description: To test the ADOBE Test Cases for the story OCCP-2847
	
	@AEM
	Scenario: TC-2886 Verfiy Brand Value Prop (I.e.-  CANADIAN  TIRE. Made for Life in Canada) is Configurable via AEM
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on pencil banner component
	And click on aem configure button
	Then configure Brand Value Props
	And user click on done button
	And click on preview button
	And Value of Brand Value Props is updated on the site
	And click on edit button
	And click on pencil banner component
	And click on aem configure button
	Then Verify the brandvalue prop field is mandatory

	@AEM
	Scenario: TC-2887 Verfiy courtesy text and link is Configurable via AEM
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on pencil banner component
	And click on aem configure button
	Then configure Courtesy Text and Link
	And user click on done button
	And click on preview button
	And Value of Courtesy Text and Link is updated on the site
	
	@AEM
	Scenario: TC-2888 Verfiy Configure Text and associated hyperlinks for the Options available on the pencil banner via AEM
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on pencil banner component
	And click on aem configure button
	Then configure Cutomer Service text and link
	Then configure language text and link
	And user click on done button
	And click on preview button
	And Value of Cutomer Service and Languange text and link is updated on the site
	
	@AEM
	Scenario: TC-2889 Verfiy Text for the Options available on the dropdown is Configurable via AEM
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Account menu component
	And click on aem configure button
	Then configure Account options
	And user click on done button
	And click on preview button
	And account option is updated on the site
	And click on preview button
	Then click on account option after author
	And validate the account options are updated on the site
	
	@AEM
	Scenario: TC-2890 Verfiy Configure Link for the configured options available on the dropdown via AEM
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Account menu component
	And click on aem configure button
	Then configure Account options
	And user click on done button
	And click on preview button
	And account option is updated on the site
	And click on preview button
	Then click on account option after author
	And validate the account options are updated on the site
  Then validate the account options URL link are updated on the site
  
 	@AEM
	Scenario: TC-2895 Verfiy the Account options available on the Pencil banner for Unauthenticated User on Wide Desktop view view
	Given open browser
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Account menu component
	And click on aem configure button
	Then configure Account options
	And user click on done button
	And click on preview button
	And account option is updated on the site
	And click on preview button
	Then click on account option after author
	And validate the account options are available for Unauthenticated User
	
	@Regression @AEM 
	Scenario: TC-2891 Configure Text for the Sign out on the dropdown
	When AEM author with access to configure header on the page
	And login to AEM using the credential as mentioned in the test data
	And click on edit button
	And click on Account menu component
	And click on aem configure button
	Then user should be able to access and configure signout option
	And user click on done button
	And click on the publish button
	And close Browser
	And open browser
	Given login url is available
	When enter email detail
	And user enter password
	And user click on sign in button
	Then pencil banner should be displayed
 	And verify clicking on hi option
	Then verify signout changes reflected in ctc site