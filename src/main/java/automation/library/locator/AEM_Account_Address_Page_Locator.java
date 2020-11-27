package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM broad banner Page
 * 
 */

public class AEM_Account_Address_Page_Locator {
	
	String MyAccountAddressesComponent = Property.getProperty(Constant.OR_FILE, "MyAccountAddresses");
	String addressLabel = Property.getProperty(Constant.OR_FILE, "addressLabel");
	String shippingAddressLabel = Property.getProperty(Constant.OR_FILE, "shippingAddressLabel");
	
	/**
	 * gets Locator - AEM MyAccountAddresses Component
	 * 
	 */
    
	public String get_MyAccountAddresses_Component() {
		return MyAccountAddressesComponent;	
	}
	/**
	 * gets Locator - AEM address Label
	 * 
	 */
    
	public String get_addressLabel_Component() {
		return addressLabel;	
	}
	/**
	 * gets Locator - AEM shipping address Label
	 * 
	 */
    
	public String get_shippingAddress_Label() {
		return shippingAddressLabel;	
	}
}