Feature: OCCP-1654 PDP : Product Badges (New Arrival)

	Description: To test the ADOBE Test Cases for the story OCCP-1654
	   
    @RegressionTest @WebView @TC-69
    Scenario: TC-69 Verify the New Arrival Badge is displayed when applicable 
    Given open browser
    When pdp new arrival badge product url is available
    When pdp page is displayed for the product
    Then new arrival badge is displayed under availability category
    Then new arrival badge is displayed in yellow color
    
        
 
	