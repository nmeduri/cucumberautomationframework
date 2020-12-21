Feature: OCCP-2286 Link Rewards By Triangle Master Card
	Description: To test the ADOBE Test Cases for the story OCCP-2286
	
	@RegressionTest @AEM @TC-6227
	Scenario: TC-6227 OCCP-3155 - Verify when user Configure Title and Subtitle on <Merge Two Cards> screen
	Given open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge cards tab
	And configure merge rewards card title
	And configure sub title merge rewards cards
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	When login url is available
	When enter link card email detail
	And user enter link acrd email password
	And user click on sign in button
	And user is successfully logged in
	And navigate to merge rewards cards page
	Then configured merge rewards title is displayed
	Then configured sub title merge rewards is displayed
	And quit browser
	And open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge cards tab
	And revert merge rewards card title
	And revert sub title merge rewards cards
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-6228
	Scenario: TC-6228 OCCP-3155 - Verify when user Configure label for 'Input' fields (Last 12 digits...)
	Given open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And configure card input label
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	When login url is available
	When enter email 6228 detail
	And user enter password
	And user click on sign in button
	And user is successfully logged in
	And navigate to merge rewards cards page
	And click on merge card button
	Then configured input card label is displayed on publish page
	And quit browser
	And open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And revert card input label
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM 
	Scenario: TC-6230 OCCP-3155 - Verify when user Configure tool tip text
	Given open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And configure the text for tooltip field
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	When login url is available
	When enter email 6228 detail
	And user enter password
	And user click on sign in button
	And user is successfully logged in
	And navigate to merge rewards cards page
	And click on merge card button
	And click on tool tip merge card
	Then configured tool tip text is dsiplayed on publish page
	And quit browser
	And open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And revert the text for tooltip field
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-6229
	Scenario: TC-6229 OCCP-3155 - Verify when user Configure label for 'tooltip' fields (Not sure what...)
	Given open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And configure the label for tooltip field
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	When login url is available
	When enter email 6228 detail
	And user enter password
	And user click on sign in button
	And user is successfully logged in
	And navigate to merge rewards cards page
	And click on merge card button
	Then configured tool tip label is dsiplayed on publish page
	And quit browser
	And open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge two cards model tab
	And revert the label for tooltip field
	And user click on done button
	And click on preview button
	And click on the publish button
	
	@RegressionTest @AEM @TC-6449
	Scenario: TC-6449 OCCP-3155 - Verify when user Configure Merge Rewards Cards Section (Config 7)
	Given open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge cards tab
	And configure merge card image field
	And configure merge rewards card title
	And configure sub title merge rewards cards
	And user click on check button
	And click on preview button
	And click on the publish button
	And quit browser
	And open browser
	When login url is available
	When enter link card email detail
	And user enter link acrd email password
	And user click on sign in button
	And user is successfully logged in
	And navigate to merge rewards cards page
	Then configured merge rewards title is displayed
	Then configured sub title merge rewards is displayed
	And configured merge image detail is displayed on publish page
	And quit browser
	And open browser
	When login to backend system of merge rewards
	And login to AEM using the credential as mentioned in the test data
	And click on merge rewards panel
	And click on aem configure button
	And click on merge cards tab
	And revert merge card image field
	And revert merge rewards card title
	And revert sub title merge rewards cards
	And user click on done button
	And click on preview button
	And click on the publish button
    
	
	
	
	