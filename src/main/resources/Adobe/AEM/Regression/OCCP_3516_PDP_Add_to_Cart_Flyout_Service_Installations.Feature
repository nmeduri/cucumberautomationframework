Feature: OCCP-3516 PDP Add to Cart Flyout: Service Installations
	Description: To test the ADOBE Test Cases for the story OCCP-3516
	
	@RegressionTest @AEM @TC-3525
	Scenario: TC-3525 OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify the configuration of “X Item(s) Added to Cart title on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And update the title of add to cart field
	And user click on done button
	And click on the publish button
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
	Then Add to cart Title is updated on the site
	When AEM PDP product page for FR locale
And click on Cart fly out component
And click on aem configure button
	And update the title of add to cart field
	And user click on done button
	And click on the publish button
	When PDP product page is available
	Then select specefications and click on add to cart
	Then add to cart screen displayed
	Then Add to cart Title is updated on the site
	
	@RegressionTest @AEM @TC-3526
	Scenario: TC-3526 OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify Service Add-On(s) Available” title on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And update the Service Add-on available title of add to cart field
	And user click on done button
	And click on the publish
  #When PDP product page is available
#Then select specefications and click on add to cart
#	Then add to cart screen displayed
#	Then Service Add-on available title is updated on the site

@RegressionTest @AEM @TC-3527
	Scenario: TC-3527 OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify author is able to configure label for "Add Service to Cart" CTA on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And update the Add service to cart CTA field
	And user click on done button
	And click on the publish
	
	@RegressionTest @AEM @TC-3528
	Scenario: TC-3528 OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify author is able to configure Error Message Copy on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And update the Error Message Copy field
	And user click on done button
	And click on the publish
	
	@RegressionTest @AEM @TC-3531
	Scenario: TC-3531 OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify author is able to configure Next Step Description Copy on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And update the next step description copy
	And user click on done button
	And click on the publish
	
	@RegressionTest @AEM @TC-3529
	Scenario: TC-3529	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify author is able to configure the Service Icon
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And user configure the service icon
	And user click on done button
	And click on the publish
	
	@RegressionTest @AEM @TC-3530
	Scenario: TC-3530	OCCP-3516 PDP Add to Cart Flyout: Service Installations- Verify author is able to configure “Service Add-On” title on the screen
	Given open browser
	When AEM author with access to configure PDP Add To Cart on the page
	And login to AEM using the credential as mentioned in the test data
	And click on Cart fly out component
	And click on aem configure button
	And click on service installation tab
	And user configure Service Add-On title
	And user click on done button
	And click on the publish
	
	
	
	