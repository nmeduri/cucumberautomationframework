package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM Simple Header Checkout component page Locators
 * 
 */
public class AEM_Simple_Header_Checkout_Flow_Page_Locator {

	String simpleHeaderCheckoutComponentAEM = Property.getProperty(Constant.OR_FILE, "simpleHeaderCheckoutComponentAEM");
	String customerServiceLabelAEM = Property.getProperty(Constant.OR_FILE, "customerServiceLabelAEM");
	String customerServiceContactNumberAEM = Property.getProperty(Constant.OR_FILE, "customerServiceContactNumberAEM");
	
	
    /**
	 * gets Locator - AEM Simple Header Checkout Component
	 * 
	 */
    
	public String getSimpleHeaderCheckoutComponentAEM() {
		return simpleHeaderCheckoutComponentAEM;	
	}
	/**
	 * gets Locator - AEM Customer Service Label
	 * 
	 */
    
	public String getCustomerServiceLabelAEM() {
		return customerServiceLabelAEM;	
	}
	/**
	 * gets Locator - AEM Customer Service Contact Number
	 * 
	 */
    
	public String getCustomerServiceContactNumberAEM() {
		return customerServiceContactNumberAEM;	
	}
	
	
	
}
