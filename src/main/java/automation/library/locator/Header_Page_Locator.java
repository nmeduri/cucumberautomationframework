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
	String AccountLink= Property.getProperty(Constant.OR_FILE, "Account");
	String PencilBanner=Property.getProperty(Constant.OR_FILE, "PencilBanner");
	String MadeForLife=Property.getProperty(Constant.OR_FILE, "MadeForLife");
	String CreditOffered=Property.getProperty(Constant.OR_FILE, "CreditOffered");
	String CustomerService=Property.getProperty(Constant.OR_FILE, "CustomerService");
	String Language=Property.getProperty(Constant.OR_FILE, "Language");
	String CustomerServicePage=Property.getProperty(Constant.OR_FILE, "CustomerServicePage");
	String HiLink=Property.getProperty(Constant.OR_FILE, "HiLink");
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
	 * gets Locator - PencilBanner (Header)
	 * 
	 */
	public String get_PencilBanner() {
		return PencilBanner;
	}
	/**
	 * gets Locator - Account (Header)
	 * 
	 */
	public String get_Account_link() {
		return AccountLink;
	}
	/**
	 * gets Locator - MadeForLife (Header)
	 * 
	 */
	public String get_MadeForLifeText() {
		return MadeForLife;
	}
	/**
	 * gets Locator - Customer Service (Header)
	 * 
	 */
	public String get_CustomerService() {
		return CustomerService;
	}
	/**
	 * gets Locator - Language (Header)
	 * 
	 */
	public String get_Language() {
		return Language;
	}
	/**
	 * gets Locator - Credit Offered Text (Header)
	 * 
	 */
	public String get_CreditOfferedText() {
		return CreditOffered;
	}
	/**
	 * gets Locator - Customer Service Page(Header)
	 * 
	 */
	public String get_CustomerService_Page() {
		return CustomerServicePage;
	}
	/**
	 * gets Locator - HiLink (Header)
	 * 
	 */
	public String get_HiLink() {
		return HiLink;
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
