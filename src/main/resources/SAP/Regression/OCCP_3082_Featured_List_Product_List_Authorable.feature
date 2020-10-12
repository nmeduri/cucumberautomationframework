Feature: OCCP-3082  Featured List |Product List|Authorable

	Description: To test the HYBRIS Test Cases for the story OCCP-3082    

        @RegressionTest
				Scenario: TC-3961 HYB:OCCP-3082-OCCP-5212- Verify Adding a new property "productBrand" to Product List API-with single Base product
	    	Given PLP occ api is available
        When user hits PLP GET api
        Then user should able to see the product brand value in the JSON response
        
        @RegressionTest
				Scenario: TC-3962 HYB:OCCP-3082-OCCP-5212- Verify Adding a new property "productBrand" to Product List API-with single variant product
	    	Given PLP occ api is available
        When user hits PLP single variant product GET api
        Then user should able to see the product brand value in the JSON response
        
        @RegressionTest
				Scenario: TC-3963 HYB:OCCP-3082-OCCP-5212- Verify Adding a new property "productBrand" to Product List API-with multiple Base product
	    	Given PLP occ api is available
        When user hits PLP multiple base products GET api
        Then user should able to see the multiple base products brand value in the JSON response
        
        @RegressionTest
				Scenario: TC-3964 HYB:OCCP-3082-OCCP-5212- Verify Adding a new property "productBrand" to Product List API-with multiple variant product
	    	Given PLP occ api is available
        When user hits PLP multiple variant products GET api
        Then user should able to see the multiple variant products brand value in the JSON response
        