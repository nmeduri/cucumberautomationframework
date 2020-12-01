Feature: OCCP-1028 FOOTER: Footer Copyright
	Description: To test the ADOBE Test Cases for the story OCCP-1028
	
	@RegressionTest @AEM
	Scenario: TC-2789 AEM user configures logo for Canadian Tire
	Given open browser
	When aem author with access navigates to footer page
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button
	Then scroll down to copyright footer component
	And click on aem new copyright footer title
	And click on aem configure button
	And user should be able to author logo for canadatire
	And logo should be uploaded successfully
	And authoring name should be ct logo
	And user click on check button
	And click on preview button
	Then the uploaded logo should be reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2790 AEM user configures text for Canadian Tire Text
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to copyright footer component
	And click on aem new copyright footer title
	And click on aem configure button
	And user should be able to author canadatire image alternative text
	And access the text property and author the text
	And user click on check button
	And click on preview button
	Then image alternative text changes are reflected on ctc site
	
	#@RegressionTest @AEM
	Scenario: TC-2792 AEM user configures text for Legal Disclaimer
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to copyright footer component
	And click on aem new copyright footer title
	And click on aem configure button
	And user should be able to author Legal Disclaimer
	And access the Legal Disclaimer property and author the text
	And user click on check button
	And click on preview button
	Then legal disclaimer changes are reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2793 AEM user configures text for View More/View Less
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to copyright footer component
	And click on aem new copyright footer title
	And click on aem configure button
	And user should be able to author view more text
	And access the view more property and author the text
	And user should be able to author view less text
	And access the view less property and author the text
	And user click on check button
	And click on preview button
	Then view more and view less label text changes are reflected on ctc site
	
	#@RegressionTest @AEM 
	Scenario: TC-2791 AEM user configures text for Copyright Label
	Given open browser
	When aem author with access navigates to footer page
	And login to AEM using the right credentials as mentioned in the test data 
	And click on edit button 
	Then scroll down to copyright footer component
	And click on aem new copyright footer title
	And click on aem configure button
	And user should be able to author copyright label property
	And access the copyright label and author the text
	And user click on done button
	And click on preview button
	Then copyright label changes are reflected on ctc site
	
	@RegressionTest @AEM
	Scenario: TC-2794 AEM user configures to open up the Footer links on same page/new tab
	When aem author with access navigates to footer page
	And click on edit button
	Then scroll down to simple footer component
	And click on aem new simple footer title
	And click on aem configure button
	And user should be able to author links open in new tab or same tab
	And access the property and author new tab or same tab
	And user click on check button
	And click on preview button
	Then verify if page opens in new tab or same tab as authored