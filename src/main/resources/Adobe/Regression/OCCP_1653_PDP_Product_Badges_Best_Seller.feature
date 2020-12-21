Feature: OCCP-1653 PDP : Product Badges (Best Seller)

	Description: To test the ADOBE Test Cases for the story OCCP-1653
	   
    @RegressionTest @WebView @TC-70
    Scenario: TC-70 Verify the Best Seller Badge is displayed when applicable 
    Given open browser
    When pdp best seller badge product url is available
    When pdp page is displayed for the product
    Then best seller badge is displayed in blue color
    Then verify the best seller badge is displayed for all variants
    
        
 
	