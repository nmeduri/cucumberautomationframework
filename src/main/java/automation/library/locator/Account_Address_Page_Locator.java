package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM broad banner Page
 * 
 */

public class Account_Address_Page_Locator {
	
	String AddressesTitle = Property.getProperty(Constant.OR_FILE, "AddressesTitle");
	String ShippingInfoLabel = Property.getProperty(Constant.OR_FILE, "ShippingInfoLabel");
	String ShippingInfoDetails = Property.getProperty(Constant.OR_FILE, "ShippingInfoDetails");
	String BillingInformationLabel = Property.getProperty(Constant.OR_FILE, "BillingInformationLabel");
	String BillingInformationInfo = Property.getProperty(Constant.OR_FILE, "BillingInformationInfo");

	/**
	 * gets Locator -Addresses Title
	 * 
	 */
    
	public String get_Addresses_Title() {
		return AddressesTitle;	
	}
	/**
	 * gets Locator - Shipping Info Label
	 * 
	 */
    
	public String get_ShippingInfo_Label() {
		return ShippingInfoLabel;	
	}
	/**
	 * gets Locator - Shipping Info Details
	 * 
	 */
    
	public String get_ShippingInfo_Details() {
		return ShippingInfoDetails;	
	}/**
	 * gets Locator - Billing Information Label
	 * 
	 */
    
	public String get_BillingInformation_Label() {
		return BillingInformationLabel;	
	}
	/**
	 * gets Locator - Shipping Info Label
	 * 
	 */
    
	public String get_BillingInformation_Info() {
		return BillingInformationInfo;	
	}
}