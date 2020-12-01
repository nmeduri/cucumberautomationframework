Feature: OCCP-3132 Cart - Core Chrges 
Description: To test the ADOBE AEM Test Cases for the story OCCP-3132
	
	@RegressionTest @AEM @TC-3840
	Scenario: TC-3840	OCCP-3132 Cart - Core Charges- Verify buiseness user able to configure text label "Incl"
	Given open browser
	When aem author with access navigates to content fragment page
	And login to AEM using the right credentials as mentioned in the test data
  Then configure the incl text label
	And click on save and publish content fragment changes
  Given cart url is available
  When cart page is displayed for the product
  Then a message should be shown to the user indicating that core fees is included in the total
  
  @RegressionTest @AEM @TC-3841
	Scenario: TC-3841	OCCP-3132 Cart - Core Charges- Verify buiseness user able to configure text label "Core Charge"
	Given open browser
	When aem author with access navigates to content fragment page
	And login to AEM using the right credentials as mentioned in the test data
  Then configure the CoreCharge text label
	And click on save and publish content fragment changes
  Given cart url is available
  When cart page is displayed for the product
  Then click on the tool tip displayed beside the core charges fee
  And validate the core charge title displayed  

  @RegressionTest @AEM @TC-3842
	Scenario: TC-3842	OCCP-3132 Cart - Core Charges- Verify buiseness user able to configure tool tip message
	Given open browser
	When aem author with access navigates to content fragment page
	And login to AEM using the right credentials as mentioned in the test data
  Then configure the CoreCharge text label
	And click on save and publish content fragment changes
  Given cart url is available
  When cart page is displayed for the product
  Then click on the tool tip displayed beside the core charges fee
  And validate the tool tip message displayed
  