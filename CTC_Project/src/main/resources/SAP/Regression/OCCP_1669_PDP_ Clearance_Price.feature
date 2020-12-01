Feature: OCCP_1669_PDP: Clearance Price

	Description: To test the HYBRIS Test Cases for the story OCCP-1669

				@RegressionTest
        Scenario: TC-1941 HYB:OCCP-1669: Verify base product has no varinats clearance price
        Given occ api is available
				When user hits the GET method for clearance product has no variant section
				Then user should to see badges displayed under badges container
				And clearance Price is displayed
				And Regular Price is displayed
				
				@RegressionTest
        Scenario: TC-1942 HYB:OCCP-1669: Verify Product has variants  prices are same -clearance price
        Given occ api is available
				When user hits the GET method for product has variant with same clearance prices
				Then user should to see badges displayed under badges container
				And clearance Price is displayed
				And Regular Price is displayed
				
				
				@RegressionTest
        Scenario: TC-1943 HYB:OCCP-1669: Verify Product has variants prices are different -clearance price
        Given occ api is available
				When user hits the GET method for product has variant with different clearance prices
				And clearance Price is displayed
				And Regular Price is displayed