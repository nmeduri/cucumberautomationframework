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
	String bannerLogo = Property.getProperty(Constant.OR_FILE, "bannerLogo").replace("=", ",");
	String storeLocator=Property.getProperty(Constant.OR_FILE, "storeLocator");
	String searchBar = Property.getProperty(Constant.OR_FILE, "searchBar");
	String searchIcon = Property.getProperty(Constant.OR_FILE, "searchIcon");
	String wishlistIcon = Property.getProperty(Constant.OR_FILE, "wishlistIcon");
	String cartIcon = Property.getProperty(Constant.OR_FILE, "cartIcon");
	String storeName = Property.getProperty(Constant.OR_FILE, "storeName");
	String storeStatus = Property.getProperty(Constant.OR_FILE, "storeStatus");
	String closingHours = Property.getProperty(Constant.OR_FILE, "closingHours");
	String chervon = Property.getProperty(Constant.OR_FILE, "chervon");
	String addedItemWishlist = Property.getProperty(Constant.OR_FILE, "addedItemWishlist");
	String primaryNavigation = Property.getProperty(Constant.OR_FILE, "primaryNavigation");
	String hamburgerMenu = Property.getProperty(Constant.OR_FILE, "hamburgerMenu");
	String storeLocatorMobile = Property.getProperty(Constant.OR_FILE, "storeLocatorMobile");
	String sideMenuCross = Property.getProperty(Constant.OR_FILE, "sideMenuCross");
	String storeLocatorFlyOut = Property.getProperty(Constant.OR_FILE, "storeLocatorFlyOut");
	String flyOutCross = Property.getProperty(Constant.OR_FILE, "flyOutCross");
	String searchTakeOverPage = Property.getProperty(Constant.OR_FILE, "searchTakeOverPage");
	String bannerLogoMobile = Property.getProperty(Constant.OR_FILE, "bannerLogoMobile");
	String pencilBanner = Property.getProperty(Constant.OR_FILE, "pencilBanner");
	String closeSearchPage = Property.getProperty(Constant.OR_FILE, "closeSearchPage");
	String InformationBannerText = Property.getProperty(Constant.OR_FILE, "InformationBannerText").replace("=", ",");
	String InformationBannerLink = Property.getProperty(Constant.OR_FILE, "InformationBannerLink");
	String SearchResult=Property.getProperty(Constant.OR_FILE, "SearchResult");
	String InformationBanner=Property.getProperty(Constant.OR_FILE, "InformationBanner");
	String standardHeader=Property.getProperty(Constant.OR_FILE, "standardHeader");
	String secondaryNavigation=Property.getProperty(Constant.OR_FILE, "secondaryNavigation");
	String accountsMenuDropdown = Property.getProperty(Constant.OR_FILE, "accountsMenuDropdown");
	String registerInfo = Property.getProperty(Constant.OR_FILE, "registerInfo");
	String orderHistory = Property.getProperty(Constant.OR_FILE, "orderHistory");
	String paymentInformation = Property.getProperty(Constant.OR_FILE, "paymentInformation");
	String addresses = Property.getProperty(Constant.OR_FILE, "addresses");
	String hiOnHeader = Property.getProperty(Constant.OR_FILE, "hiOnHeader");
	String signOut = Property.getProperty(Constant.OR_FILE, "signOut");
	String brandValuePropsImage=Property.getProperty(Constant.OR_FILE, "brandValuePropsImage");
	String brandValuePropsText=Property.getProperty(Constant.OR_FILE, "brandValuePropsText");
	String courtesyLinkCreditOffered=Property.getProperty(Constant.OR_FILE, "courtesyLinkCreditOffered");
	String courtesyLinkLearnMoreCTA = Property.getProperty(Constant.OR_FILE, "courtesyLinkLearnMoreCTA");
	
	
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
	
	/**
	 * gets Locator - addedItemWishlist
	 */
	public String getAddedItemWishlist() {
		return addedItemWishlist;
	}
	 /** 
	 * gets Locator - Primary Navigation
	 * 
	 */
	public String get_Primary_Navigation() {
		return primaryNavigation;
	}

	
	/**
	 * gets Locator - Hamburger Menu
	 * 
	 */
	public String get_Hamburger_Menu() {
		return hamburgerMenu;
	}

	
	/**
	 * gets Locator - Store Locator Mobile
	 * 
	 */
	public String get_Store_Locator_Mobile() {
		return storeLocatorMobile;
	}

	
	/**
	 * gets Locator - Side Menu Cross
	 * 
	 */
	public String get_Side_Menu_Cross() {
		return sideMenuCross;
	}
	
	/**
	 * gets Locator - Store locator fly out title
	 * 
	 */
	public String get_Fly_Out_Title() {
		return storeLocatorFlyOut;
	}
	
	/**
	 * gets Locator - Store locator fly out title
	 * 
	 */
	public String get_Search_Icon() {
		return searchIcon;
	}
	
	/**
	 * gets Locator - Store locator fly out title
	 * 
	 */
	public String get_Fly_Out_Cross() {
		return flyOutCross;
	}
	
	/**
	 * gets Locator - Search page
	 * 
	 */
	public String get_Search_Page() {
		return searchTakeOverPage;
	}
	
	/**
	 * gets Locator - banner logo 
	 * 
	 */
	public String get_Banner_Logo_Mobile() {
		return bannerLogoMobile;
	}
	
	/**
	 * gets Locator - pencil banner
	 * 
	 */
	public String get_Pencil_Banner() {
		return pencilBanner;
	}
	
	/**
	 * gets Locator - Close search page
	 * 
	 */
	public String get_Close_Search_Page() {
		return closeSearchPage;
	}

	/**
	 * gets Locator - information Banner
	 * 
	 */
	public String get_informationBanner() {
		return InformationBanner;
	}
	
	/**
	 * gets Locator - information Banner Text
	 * 
	 */
	public String get_informationBannerText() {
		return InformationBannerText;
	}
	
	/**
	 * gets Locator - information Banner Link
	 * 
	 */
	public String get_informationBannerLink() {
		return InformationBannerLink;
	}
	
	/**
	 * gets Locator - Search result
	 * 
	 */
	public String get_search_result() {
		return SearchResult;
	}
	
	/**
	 * gets Locator - Standard Header
	 * 
	 */
	public String get_Standard_Header() {
		return standardHeader;
	}
	
	/**
	 * gets Locator - Secondary Navigation
	 * 
	 */
	public String get_Secondary_Navigation() {
		return secondaryNavigation;
	}
	
	/**
	 * gets Locator - Accounts Menu dropdown
	 * 
	 */
	public String get_Accounts_Menu_Dropdown() {
		return accountsMenuDropdown;
	}
	
	/**
	 * gets Locator - Register info
	 * 
	 */
	public String get_Register_Info() {
		return registerInfo;
	}
	
	/**
	 * gets Locator - Order History
	 * 
	 */
	public String get_Order_History() {
		return orderHistory;
	}
	
	/**
	 * gets Locator - Payment Information
	 * 
	 */
	public String get_Payment_Information() {
		return paymentInformation;
	}
	
	/**
	 * gets Locator - Addresses
	 * 
	 */
	public String get_Addresses() {
		return addresses;
	}
	
	/**
	 * gets Locator - Hi
	 * 
	 */
	public String get_Hi() {
		return hiOnHeader;
	}
	
	/**
	 * gets Locator - Sign Out
	 * 
	 */
	public String get_Sign_Out() {
		return signOut;
	}
	
	 /** 
		 * gets Locator - brand value props image
		 * 
		 */
		public String get_Brand_Value_Props_Image() {
			return brandValuePropsImage;
		}

		
		/**
		 * gets Locator - brand value props text
		 * 
		 */
		public String get_Brand_Value_Props_Text() {
			return brandValuePropsText;
		}

		
		/**
		 * gets Locator - credit offered
		 * 
		 */
		public String get_Courtesy_Link_Credit_Offered() {
			return courtesyLinkCreditOffered;
		}

		
		/**
		 * gets Locator - learn more cta
		 * 
		 */
		public String get_Courtesy_Link_Learn_More_CTA() {
			return courtesyLinkLearnMoreCTA;
		}
	
}
