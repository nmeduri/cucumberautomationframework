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
	String bannerLogo = Property.getProperty(Constant.OR_FILE, "bannerLogo");
	String storeLocator=Property.getProperty(Constant.OR_FILE, "storeLocator");
	String searchBar = Property.getProperty(Constant.OR_FILE, "searchBar");
	String wishlistIcon = Property.getProperty(Constant.OR_FILE, "wishlistIcon");
	String cartIcon = Property.getProperty(Constant.OR_FILE, "cartIcon");
	String storeName = Property.getProperty(Constant.OR_FILE, "storeName");
	String storeStatus = Property.getProperty(Constant.OR_FILE, "storeStatus");
	String closingHours = Property.getProperty(Constant.OR_FILE, "closingHours");
	String chervon = Property.getProperty(Constant.OR_FILE, "chervon");
	
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
	
	/**
	 * gets Locator - Banner Logo
	 * 
	 */
	public String get_Banner_Logo() {
		return bannerLogo;
	}
	
	/**
	 * gets Locator - Search Bar
	 * 
	 */
	public String get_Search_Bar() {
		return searchBar;
	}
	
	/**
	 * gets Locator - Store Locator
	 * 
	 */
	public String get_Store_Locator() {
		return storeLocator;
	}
	
	/**
	 * gets Locator - Wishlist Icon
	 * 
	 */
	public String get_Wishlist_Icon() {
		return wishlistIcon;
	}
	
	/**
	 * gets Locator - Cart Icon
	 * 
	 */
	public String get_Cart_Icon() {
		return cartIcon;
	}
	
	/**
	 * gets Locator - Store Name
	 * 
	 */
	public String get_Store_Name() {
		return storeName;
	}
	
	/**
	 * gets Locator - Store Status
	 * 
	 */
	public String get_Store_Status() {
		return storeStatus;
	}
	
	/**
	 * gets Locator - Closing Hours
	 * 
	 */
	public String get_Closing_Hours() {
		return closingHours;
	}
	
	/**
	 * gets Locator - Chervon
	 * 
	 */
	public String get_Chervon() {
		return chervon;
	}
}
