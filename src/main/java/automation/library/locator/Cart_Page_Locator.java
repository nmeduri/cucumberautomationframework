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

	String wishlistMaxLimitText = Property.getProperty(Constant.OR_FILE, "wishlistMaxLimitText").replace("=", ",");
	String shoppingCartPageTitle = Property.getProperty(Constant.OR_FILE, "shoppingCartPageTitle");
	String quantitySelectorBox = Property.getProperty(Constant.OR_FILE, "quantitySelectorBox");
	String errorMessageOfExceededQuantity = Property.getProperty(Constant.OR_FILE, "errorMessageOfExceededQuantity").replace("=", ",");
	String quantityBoxInCartPage = Property.getProperty(Constant.OR_FILE, "quantityBoxInCartPage");
	String highlightedQuantitySelectorBox = Property.getProperty(Constant.OR_FILE, "highlightedQuantitySelectorBox");

	String coreChargeLabel = Property.getProperty(Constant.OR_FILE, "coreChargeLabel");
	String cartProductQuantity=Property.getProperty(Constant.OR_FILE, "cartQuantity");
	String ToolTipCoreCharges=Property.getProperty(Constant.OR_FILE, "ToolTipCoreCharges");
	String ToolTipMessage=Property.getProperty(Constant.OR_FILE, "ToolTipMessage");
	String ToolTipCloseIcon=Property.getProperty(Constant.OR_FILE, "ToolTipCloseIcon");
	String ToolTipMessageText=Property.getProperty(Constant.OR_FILE, "ToolTipMessageText");


	//String wishlistMaxLimitText = Property.getProperty(Constant.OR_FILE, "wishlistMaxLimitText").replace("=", ",");
	
	/**
	 * gets Locator - Wishlist icon 4
	 * 
	 */
	public String get_Wishlist_Icon4() {
		return wishListIcon4;
	}
	/**
	 * gets Locator - ToolTip Close Icon
	 * 
	 */
	public String get_ToolTipClose_Icon() {
		return ToolTipCloseIcon;
	}
	
	/**
	 * gets Locator - ToolTip_CoreCharges
	 * 
	 */
	public String get_ToolTip_CoreCharges() {
		return ToolTipCoreCharges;
	} 
	/**
	 * gets Locator - cart Product Quantity
	 * 
	 */
	public String get_Cart_product_quantity() {
		return cartProductQuantity;
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
	/*
	 * public String get_Wishlist_Max_Limit_Text() { return wishlistMaxLimitText; }
	 */ 
	/**
		 * gets Locator - core charge label message
		 * 
		 */
	public String get_CoreChargemessage() {
		return coreChargeLabel;
	}
	/**
	 * gets Locator - Product Brand Title
	 * 
	 */	
	public String get_Shopping_Cart_Page_Title() {
		return shoppingCartPageTitle;
	}
	/**
	 * gets Locator - quantity selector box
	 * 
	 */	
	public String get_Quantity_Selector_Box() {
		return quantitySelectorBox;
	}
	/**
	 * gets Locator - Error message for exceeded quantity
	 * 
	 */	
	public String get_Error_Message_Exceeded_Quantity() {
		return errorMessageOfExceededQuantity;
	}
	/**
	 * gets Locator - Quantity Box of cart page
	 * 
	 */
	public String get_Quantity_Box_Cart_Page() {
		return quantityBoxInCartPage;
	}
	/**
	 * gets Locator - Highlighted Quantity Selector Box
	 * 
	 */
	public String get_Highlighted_Quantity_Selector_Box() {
		return highlightedQuantitySelectorBox;
	}
	/**
	 * gets Locator - ToolTip message
	 * 
	 */
	public String get_ToolTip_Message() {
		return ToolTipMessage;
	}
	/**
	 * gets Locator - ToolTipMessage Text
	 * 
	 */
	public String get_ToolTipMessageText() {
		return ToolTipMessageText;
	}
	
}
