Feature: OCCP_870_PDP_Product_Information_Product_Manual_Product_Returns.feature

	Description: To test the HYBRIS Test Cases for the story OCCP-870
       
		Scenario: TC-1330 HYB:OCCP-870 - Verify display of product brand title	
	    Given occ api for warranty is available 
		When user hits the GET api with Default
	    Then user should able to see the product brand title in the JSON response
	    
	    Scenario: TC-1335 HYB:OCCP-870 : Verify display of User Manual for Product is not available	
	    Given occ api for warranty is available 
		When user hits the GET api with Default
	    Then User Manual link is not displayed
	    