package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Checkout Page
 * 
 */
public class Checkout_Page_Locator {

	String brandLogo=Property.getProperty(Constant.OR_FILE, "brandLogo");
	String customerServiceContactNumber=Property.getProperty(Constant.OR_FILE, "customerServiceContactNumber");
	String siteLanguageSelector=Property.getProperty(Constant.OR_FILE, "siteLanguageSelector");

	/**
	 * gets Locator - Brand Logo
	 * 
	 */

	public String get_Brand_Logo() {
		return brandLogo;	
	}
	/**
	 * gets Locator - Customer Service Contact Number
	 * 
	 */

	public String get_Customer_Service_Contact_Number() {
		return customerServiceContactNumber;	
	}
	/**
	 * gets Locator - Site Language Selector
	 * 
	 */

	public String get_Site_Language_Selector() {
		return siteLanguageSelector;	
	}

}
