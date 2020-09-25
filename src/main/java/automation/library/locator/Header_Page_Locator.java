package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;


/**
 * This file contains the locator of Header
 * 
 */

public class Header_Page_Locator {
	
	
	String accountOnHeader = Property.getProperty(Constant.OR_FILE, "accountOnHeader");
	String signInHeader = Property.getProperty(Constant.OR_FILE, "signInHeader");
	String registrationHeader = Property.getProperty(Constant.OR_FILE, "registrationHeader");
	
	/**
	 * gets Locator - Account
	 * 
	 */

	public String get_Account() {
		return accountOnHeader;	
	}
	
	/**
	 * gets Locator - Sign In (Header)
	 * 
	 */

	public String get_Sign_In_Header() {
		return signInHeader;
	}
	
	/**
	 * gets Locator - Registration (Header)
	 * 
	 */

	public String get_Registration_Header() {
		return registrationHeader;
	}
}
