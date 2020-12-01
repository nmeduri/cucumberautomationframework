Feature: OCCP_3933: Category hierarchy in product OCC endpoint

	Description: To test the HYBRIS Test Cases for the story OCCP-3933

	    @RegressionTest
      Scenario: TC-3093 HYB:OCCP-4444-OCCP-3933: Verify Category hierarchy in product OCC endpoint
      Given occ api is available
      When user hits GET method for Category hierarchy
      Then the JSON should return Category hierarchy
      And id should be displayed under ctcCategories container
      And lowStockThreshold should be displayed Under ctcCategories container
      And name should be displayed under ctcCategories container
      Then subcategory should be displayed under ctcCategories container 
      And id should be displayed under subcategory container
      And lowStockThreshold should be displayed Under subcategory container
      And name should be displayed under subcategory container
      Then subcategory should be displayed under subcategory container
      And id should be displayed under super subcategory container
      And lowStockThreshold should be displayed Under super subcategory container
      And name should be displayed under super subcategory container