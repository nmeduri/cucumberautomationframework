Feature: OCCP-1666 PLP / SRP - Filters & Facets - Availability Facet
Description: To test the ADOBE Test Cases for the story OCCP-1666

	@RegressionTest @WebView @WideScreen
  Scenario: TC-4714 Display Availability Facet within Facet Panel modal: Desktop, Desktop wide
  When plp url is available
  Then the availability facet cta should be displayed in facet bar panel
  And click on the availability facet cta
  Then user is able to see prepopulated facet values with results
  And online only should be displayed as a value
  And instore only should be displayed as another value
  
  @RegressionTest @WebView @WideScreen
  Scenario: TC-4715 display of Availability Facet CTA within within the horizontal facet bar that appears above the results grid -Desktop/Desktop wide
  When plp url is available
  And verify horizontal facet bar is displayed above the results grid
  Then the availability facet cta should be displayed in facet bar panel
  
  @RegressionTest @MobileView
  Scenario: TC-4716 Display of Availability Facet within Facet Panel modal-Mobile
  When plp url is available
  And click on sort and filters
  Then availability facet accordion should be displayed in facet panel modal
  And click on the availability accordion to expand
  Then user is able to see prepopulated facet values with results
  And online only should be displayed as a value
  And instore only should be displayed as another value
  
  @RegressionTest @WebView @WideScreen
  Scenario: TC-4717 User selects a single Availability facet value
  When plp url is available
   Then the availability facet cta should be displayed in facet bar panel
  And click on the availability facet cta
  Then user is able to see prepopulated facet values with results
  And online only should be displayed as a value
  And instore only should be displayed as another value
  And checkmark the online only facet value
  And click on facet modal view button
  Then product list should be updated according to the selected online only facet value
  And pill with online only facet value should get added on pill bar
  
  @RegressionTest @WebView @WideScreen
  Scenario: TC-4718 user selects more than one Availability facet value
  When plp url is available
  Then the availability facet cta should be displayed in facet bar panel
  And click on the availability facet cta
  Then user is able to see prepopulated facet values with results
  And online only should be displayed as a value
  And instore only should be displayed as another value
  And checkmark both the online only and instore only facet values
  And click on facet modal view button
   Then product list should be updated according to the selected online only and instore facet values
  And pill with online only and instore only facet values should get added on pill bar
  
  @RegressionTest @WebView @WideScreen
  Scenario: TC-4718 user selects more than one Availability facet value
  When plp url is available
  Then the availability facet cta should be displayed in facet bar panel
  And click on the availability facet cta
  Then user is able to see prepopulated facet values with results
  And online only should be displayed as a value
  And instore only should be displayed as another value
  And checkmark both the online only and instore only facet values
  And click on facet modal view button
  Then product list should be updated according to the selected online only and instore facet values
  And pill with online only and instore only facet values should get added on pill bar
  And click on the availability facet cta
  And uncheck the instore only facet value
  And click on facet modal view button
  Then product list should be updated according to the selected online only facet value
  And pill with instore only facet value should get removed from the pill bar
  
  