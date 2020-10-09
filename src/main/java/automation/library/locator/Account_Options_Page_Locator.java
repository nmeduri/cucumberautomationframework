package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;


/**
 * This file contains the locator of Account Options
 * 
 */

public class Account_Options_Page_Locator {
	
	String SignIn=Property.getProperty(Constant.OR_FILE, "SignIn");
	String Registration=Property.getProperty(Constant.OR_FILE, "Registration");
	String SignOut=Property.getProperty(Constant.OR_FILE, "SignOut");
	String PreferencesOption= Property.getProperty(Constant.OR_FILE, "Preferences");
	String WishListOption=Property.getProperty(Constant.OR_FILE, "WishListOption");
	String PersonalInfoOption=Property.getProperty(Constant.OR_FILE, "PencilBanner");
	String OrderHistory=Property.getProperty(Constant.OR_FILE, "OrderHistory");
	String PaymentInfo=Property.getProperty(Constant.OR_FILE, "PaymentInfo");
	String Address=Property.getProperty(Constant.OR_FILE, "Address");
	String Reward=Property.getProperty(Constant.OR_FILE, "Reward");
	String Preference=Property.getProperty(Constant.OR_FILE, "Preference");			
	
	
	/**
	 * gets Locator - Preferences Option (Account Option)
	 * 
	 */
	public String get_PreferencesOption() {
		return PreferencesOption;
	}
	/**
	 * gets Locator - WishList Option (Account Option)
	 * 
	 */
	public String get_WishlistOption() {
		return WishListOption;
	}
	/**
	 * gets Locator - Personal Info Option (Account Option)
	 * 
	 */
	public String get_PersonalInfoOption() {
		return PersonalInfoOption;
	}
	/**
	 * gets Locator - Order History Option (Account Option)
	 * 
	 */
	public String get_OrderHistory() {
		return OrderHistory;
	}
	/**
	 * gets Locator - Payment Info Option (Account Option)
	 * 
	 */
	public String get_PaymentInfo() {
		return PaymentInfo;
	}
	/**
	 * gets Locator - Reward Option (Account Option)
	 * 
	 */
	public String get_Reward() {
		return Reward;
	}
	/**
	 * gets Locator - Address Option (Account Option)
	 * 
	 */
	public String get_Address() {
		return Address;
	}
	/**
	 * gets Locator - Preference Option (Account Option)
	 * 
	 */
	public String get_Preference() {
		return Preference;
	}
	/**
	 * gets Locator - SignIn Option (Account Option)
	 * 
	 */
	public String get_SignInOption() {
		return SignIn;
	}
	/**
	 * gets Locator - Registration Option (Account Option)
	 * 
	 */
	public String get_RegistrationOption() {
		return Registration;
	}
	
	/**
	 * gets Locator - SignOut Option (Account Option)
	 * 
	 */
	public String get_SignOutOption() {
		return SignOut;
	}	
	
 }



