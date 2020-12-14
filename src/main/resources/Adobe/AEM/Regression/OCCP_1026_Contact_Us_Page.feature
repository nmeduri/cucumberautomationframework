Feature: OCCP-1026 Contact Us Page Part One
	Description: To test the ADOBE Test Cases for the story OCCP-1026
	
	@RegressionTest @AEM @TC-4869
	Scenario: TC-4869 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Contact us via email form - Verify that  Author is able to configure the max character count for the 'Additional comments' field (Config 26)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And author configures the max character count for additional comment field
	And user click on done button
	And click on the publish button
	And contact us url is available
	Then configured max character is visible to the user on the contact us form
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And revert the additonal max count changes
	And user click on done button
	And click on the publish button
	
	
	@RegressionTest @AEM @TC-4867
	Scenario: TC-4867 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Contact us via email form - Verify that Author is able to configure the Message Section Title (Config 9)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And configure the new section title
	And user click on done button
	And click on the publish button
	And contact us url is available
	Then configured section title is displayed on publish page
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And revert the new section title
	And user click on done button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4870
	Scenario: TC-4870 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Contact us via email form - Verify that  Author is able to configure the Note text (Config 13)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And configure the note field
	And user click on done button
	And click on the publish button
	And contact us url is available
	Then configured add note text is displayed on publish page
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And revert the note field
	And user click on done button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4871
	Scenario: TC-4871 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Contact us via email form - Verify that Author is able to configure the CTA title (Config 14)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And author configure cta title
	And user click on done button
	And click on the publish button
	And contact us url is available
	Then configured cta label is displayed on publish page
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And revert cta label
	And user click on done button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4877
	Scenario: TC-4877 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Success and Error screens - Verify that Author is able to configure the CTA title and Target URL (Config 24- Success screen)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And click on contact us success screen tab
	And configure success cta label
	Then verify configure success cta label is mandatory
	And configure target url
	Then verify configure target url is manadatory
	Then default config to open in same-different tab is applicable
	And user click on done button
	And click on the publish button
	And contact us url is available
	And enter first name detail
	And enter Last Name Detail
	And user is able to enter valid email address
	And user clicks on please select drop down field
	And select please select drop down value
	And enter additional information
	And click on send message button
	Then confirmation screen is displayed
	Then configued success cta label is displayed on publish page
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And click on contact us success screen tab
	And configure success cta label
	And configure target url
	And user click on done button
	And click on the publish button
	
	@RegressionTest @AEM @TC-4868
	Scenario: TC-4877 OCCP-1026View Contact Us page - part 1 (Contact Us Form) -Author is able to configure the Success and Error screens - Verify that Author is able to configure the CTA title and Target URL (Config 24- Success screen)
	Given open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And click on configuration tab
	And click on add button
	And configure add please select drop down
	And user click on done button
	And click on the publish button
	And contact us url is available
	And user clicks on please select drop down field
	Then verify please select drop down option is added
	And quit browser
	And open browser
	When aem author is able to access configue contact us page
	And login to AEM using the credential as mentioned in the test data
	And click on contact us panel
	And click on aem configure button
	And click on configuration tab
	And click on remove drop down option button
	And user click on done button
	And click on the publish button
	And contact us url is available
	And user clicks on please select drop down field
	Then verify drop down  option is removed
	
	
	
	
	
	
	
	
	
	