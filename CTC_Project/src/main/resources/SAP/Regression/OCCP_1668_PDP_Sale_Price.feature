Feature: OCCP_1668_PDP: Sale Price

	Description: To test the HYBRIS Test Cases for the story OCCP-1668

				@RegressionTest
        Scenario: TC-1945 HYB:OCCP-1668: Verify Sale price for Product has no variants
        Given occ api is available
				When user hits the GET method for product has no variant section	
				And Sale Price is displayed
				And Regular Price is displayed
				
				@RegressionTest
				Scenario: TC-1946 HYB:OCCP-1668: Verify Sale price for Product has variants with no price difference
				Given occ api is available
				When user hits the GET method for product has variants with no price difference	
				And Sale Price is displayed
				And Regular Price is displayed
				
				@RegressionTest
				Scenario: TC-1947 HYB:OCCP-1668: Verify Sale price for Product has variants with price difference
				Given occ api is available
				When user hits the GET method for product has variants with price difference
				And Sale Price is displayed
				And Regular Price is displayed
				
				@RegressionTest
				Scenario: TC-1948 HYB:OCCP-1668: Verify Sale price for variant product (on Sale)
				Given occ api is available
				When user hits the GET method for variants product on Sale
				And Sale Price is displayed
				And Regular Price is displayed
				
				@RegressionTest
				Scenario: TC-1949 HYB:OCCP-1668: Verify Sale price for variant product (not on Sale)
				Given occ api is available
				When user hits the GET method for variants product not on Sale
				And Regular Price is displayed
				
				
				