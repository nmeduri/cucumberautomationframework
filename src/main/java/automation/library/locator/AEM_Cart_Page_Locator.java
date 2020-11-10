package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM Cart Page
 * 
 */

public class AEM_Cart_Page_Locator {
	
	String wishlistItemAddedMessageField = Property.getProperty(Constant.OR_FILE, "wishlistItemAddedMessageField");
	String viewWishlistLabelField = Property.getProperty(Constant.OR_FILE, "viewWishlistLabelField");
	String wishlistMaxLimitMessageField = Property.getProperty(Constant.OR_FILE, "wishlistMaxLimitMessageField");
	String closeLabelField = Property.getProperty(Constant.OR_FILE, "closeLabelField");
	String saveButton = Property.getProperty(Constant.OR_FILE, "saveButton");
	String wishlistCard = Property.getProperty(Constant.OR_FILE, "wishlistCard");
	String selectButton = Property.getProperty(Constant.OR_FILE, "selectButton");
	String moreButton = Property.getProperty(Constant.OR_FILE, "moreButton");
	String quickPublish = Property.getProperty(Constant.OR_FILE, "quickPublish");
	String commonContentThumbnail = Property.getProperty(Constant.OR_FILE, "commonContentThumbnail");
	String publishAlertMessage = Property.getProperty(Constant.OR_FILE, "publishAlertMessage");
	String services = Property.getProperty(Constant.OR_FILE, "services");
	String selectAll = Property.getProperty(Constant.OR_FILE, "selectAll");
	
	
	 	/**
		 * gets Locator - AEM Item Added To wishlist label field
		 * 
		 */
	    
		public String get_Item_Added_To_Wishlist_Field() {
			return wishlistItemAddedMessageField;	
		}
		
		/**
		 * gets Locator - AEM View wishlist field
		 * 
		 */
	    
		public String get_View_Wishlist_Field() {
			return viewWishlistLabelField;	
		}
		
		/**
		 * gets Locator - AEM Wishlist max limit
		 * 
		 */
	    
		public String get_Wishlist_Max_Limit_Message_Field() {
			return wishlistMaxLimitMessageField;	
		}
		
		/**
		 * gets Locator - AEM Close
		 * 
		 */
	    
		public String get_Close_Label() {
			return closeLabelField;	
		}
		
		/**
		 * gets Locator - AEM Save
		 * 
		 */
	    
		public String get_Save_Button() {
			return saveButton;	
		}
		
		/**
		 * gets Locator - AEM WishList Card
		 * 
		 */
	    
		public String get_Wishlist_Card() {
			return wishlistCard;	
		}
		
		/**
		 * gets Locator - AEM Select
		 * 
		 */
	    
		public String get_Select_Button() {
			return selectButton;	
		}
		
		/**
		 * gets Locator - AEM More
		 * 
		 */
	    
		public String get_More() {
			return moreButton;	
		}
		
		/**
		 * gets Locator - AEM Save
		 * 
		 */
	    
		public String get_Quick_Publish() {
			return quickPublish;	
		}
		
		/**
		 * gets Locator - AEM common Content Thumbnail
		 * 
		 */
	    
		public String get_Common_Content_Thumbnail() {
			return commonContentThumbnail;	
		}
		
		/**
		 * gets Locator - AEM Save
		 * 
		 */
	    
		public String get_Publish_Alert() {
			return publishAlertMessage;	
		}
		
		/**
		 * gets Locator - services
		 * 
		 */
	    
		public String get_Services() {
			return services;	
		}
		
		/**
		 * gets Locator - Select all
		 * 
		 */
	    
		public String get_Select_All() {
			return selectAll;	
		}

}
