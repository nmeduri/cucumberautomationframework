package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Cart Page
 * 
 */

public class Cart_Page_Locator {
	
	String wishListIcon4 = Property.getProperty(Constant.OR_FILE, "wishListIcon4");
	String wishListIcon5 = Property.getProperty(Constant.OR_FILE, "wishListIcon5");
	String wishListIcon3 = Property.getProperty(Constant.OR_FILE, "wishListIcon3");
	String errorMessageWishlistLimit = Property.getProperty(Constant.OR_FILE, "errorMessageWishlistLimit");
	String toastMessage = Property.getProperty(Constant.OR_FILE, "toastMessage");
	String viewWishList = Property.getProperty(Constant.OR_FILE, "viewWishList");
	String closeToastMessage = Property.getProperty(Constant.OR_FILE, "closeToastMessage");
	String wishListIcon1 = Property.getProperty(Constant.OR_FILE, "wishListIcon1");
	String wishListBadge = Property.getProperty(Constant.OR_FILE, "wishListBadge");
	String productBrandTitle = Property.getProperty(Constant.OR_FILE, "productBrandTitle");
	String itemAddedToWishlistMessage = Property.getProperty(Constant.OR_FILE, "itemAddedToWishlistMessage");
	//String wishlistMaxLimitText = Property.getProperty(Constant.OR_FILE, "wishlistMaxLimitText").replace("=", ",");
	
	/**
	 * gets Locator - Wishlist icon 4
	 * 
	 */
	public String get_Wishlist_Icon4() {
		return wishListIcon4;
	}
	/**
	 * gets Locator - Wishlist icon 5
	 * 
	 */	
	public String get_Wishlist_Icon5() {
		return wishListIcon5;
	}
	
	/**
	 * gets Locator - Wishlist icon 3
	 * 
	 */	
	public String get_Wishlist_Icon3() {
		return wishListIcon3;
	}
	/**
	 * gets Locator - Error Message container
	 * 
	 */	
	public String get_Error_Message_Wishlist_Limit() {
		return errorMessageWishlistLimit;
	}
	
	/**
	 * gets Locator - Toast Message
	 * 
	 */	
	public String get_Toast_Message() {
		return toastMessage;
	}
	
	/**
	 * gets Locator - View Wishlist
	 * 
	 */	
	public String get_View_Wishlist() {
		return viewWishList;
	}
	
	/**
	 * gets Locator - View Wishlist
	 * 
	 */	
	public String get_Close_Toast_Message() {
		return closeToastMessage;
	}
	
	/**
	 * gets Locator - Wishlist icon 3
	 * 
	 */	
	public String get_Wishlist_Icon1() {
		return wishListIcon1;
	}

	/**
	 * gets Locator - Wishlist badge
	 * 
	 */	
	public String get_Wishlist_Badge() {
		return wishListBadge;
	}

	/**
	 * gets Locator - Product Brand Title
	 * 
	 */	
	public String get_Product_Brand_Title() {
		return productBrandTitle;
	}
	
	/**
	 * gets Locator - Item added to wishlist
	 * 
	 */	
	public String get_Item_Added_To_Wishlist_Message() {
		return itemAddedToWishlistMessage;
	}
	
	/**
	 * gets Locator - wishlist max limit text
	 * 
	 */	
	/*public String get_Wishlist_Max_Limit_Text() {
		return wishlistMaxLimitText;
	}*/
}
