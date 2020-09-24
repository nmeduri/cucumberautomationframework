Feature: OCCP_1670_PDP: Special Buy Price

	Description: To test the HYBRIS Test Cases for the story OCCP-1670

				@RegressionTest
        Scenario: TC-1953 HYB:OCCP-1670: Verify Special Buy-Price badge for base product
        Given occ api is available
				When user hits the GET method for base product
				Then user should to see Special Buy badge under badges container
				
				
				@RegressionTest
        Scenario: TC-1954 HYB:OCCP-1670: Verify Special buy price when Product has no variants
        Given occ api is available
				When user hits the GET method for baseproduct has no variants
				Then user should to see Special Buy badge under badges container
				And Regular Price is displayed
				
				@RegressionTest
        Scenario: TC-1955 HYB:OCCP-1670: Verify Special buy price when Product has variants and price is same for all variants
        Given occ api is available
				When user hits the GET method for baseproduct has variants and price is same for all variants
				Then user should to see Special Buy badge under badges container
				And Regular Price is displayed
				
				@RegressionTest
        Scenario: TC-1956 HYB:OCCP-1670: Verify Special buy price when Product has variants and price is different for the variants
        Given occ api is available
				When user hits the GET method for baseproduct has variants and price is different for all variants
				Then user should to see Special Buy badge under badges container
				And Regular Price is displayed

				@RegressionTest
        Scenario: TC-1957 HYB:OCCP-1670: Verify Special buy price when User selects a variant product(use variant product)
        Given occ api is available
				When user hits the GET method for variant product
				Then user should to see Special Buy badge under badges container
				And Regular Price is displayed
				
				@RegressionTest
        Scenario: TC-1959 HYB:OCCP-1670: Verify Special buy price when  Default Variant is pre-selected -Only Color Variant Present(use variant product)
        Given occ api is available
				When user hits the GET method for Color variant product
				Then user should to see Special Buy badge under badges container
				And Regular Price is displayed
				And Color variant is displayed
				