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

	String inclCoreCharges = Property.getProperty(Constant.OR_FILE, "inclCoreCharges");
	String plusCoreCharges = Property.getProperty(Constant.OR_FILE, "plusCoreCharges");
	String coreChargesText = Property.getProperty(Constant.OR_FILE, "coreChargesText");
	String coreChargesToolTipmessage = Property.getProperty(Constant.OR_FILE, "coreChargesToolTipmessage");
	String IandATab=Property.getProperty(Constant.OR_FILE, "I&ATab");
	String changeInCartMsg=Property.getProperty(Constant.OR_FILE, "changeInCartMsg");
	String shoppingStoreChangeMsg=Property.getProperty(Constant.OR_FILE, "shoppingStoreChangeMsg");
	String shippingStoreChangeMsg=Property.getProperty(Constant.OR_FILE, "shippingStoreChangeMsg");
	String resolveIssueMsg=Property.getProperty(Constant.OR_FILE, "resolveIssueMsg");
	String outOfStockInStorePickUpMsg=Property.getProperty(Constant.OR_FILE, "outOfStockInStorePickUpMsg");
	String outOfStockInStoreShipFromMsg=Property.getProperty(Constant.OR_FILE, "outOfStockInStoreShipFromMsg");
	String tempOutOfStockPickUpMsg=Property.getProperty(Constant.OR_FILE, "tempOutOfStockPickUpMsg");
	String tempOutOfStockShipFromMsg=Property.getProperty(Constant.OR_FILE, "tempOutOfStockShipFromMsg");
	String onlySomeInStockMsg=Property.getProperty(Constant.OR_FILE, "onlySomeInStockMsg");
	String QuantitySelectorTab=Property.getProperty(Constant.OR_FILE, "QuantitySelectorTab");
	String ExceededMessageToastMsg=Property.getProperty(Constant.OR_FILE, "ExceededMessageToastMsg");
	String exceededTotalAvailableMsg=Property.getProperty(Constant.OR_FILE, "exceededTotalAvailableMsg");
	String dragcomponent_cartpage = Property.getProperty(Constant.OR_FILE, "dragcomponent_cartpage");
	String ordersummary_cartpage = Property.getProperty(Constant.OR_FILE, "ordersummary_cartpage");
	String recommendation_cartpage = Property.getProperty(Constant.OR_FILE, "recommendation_cartpage");
	String selectbroadbanner = Property.getProperty(Constant.OR_FILE, "selectbroadbanner");
	String twofeatured = Property.getProperty(Constant.OR_FILE, "selectbroadbanner");
	String cartItemsComponent = Property.getProperty(Constant.OR_FILE, "cartItemsComponent");
	String ToolTipTitle = Property.getProperty(Constant.OR_FILE, "ToolTipTitle");
	String ToolTipDesc = Property.getProperty(Constant.OR_FILE, "ToolTipDesc");
	String bulkMessage = Property.getProperty(Constant.OR_FILE, "bulkMessage");
	String bulkItemsTab = Property.getProperty(Constant.OR_FILE, "bulkItemsTab");
	String getPostalTab = Property.getProperty(Constant.OR_FILE, "getPostalTab");
	String successToastMessageAEM = Property.getProperty(Constant.OR_FILE, "successToastMessageAEM");
	String errorToastMessageAEM = Property.getProperty(Constant.OR_FILE, "errorToastMessageAEM");
	String serviceTabAEM = Property.getProperty(Constant.OR_FILE, "serviceTabAEM");
    String addOnTitleAEM = Property.getProperty(Constant.OR_FILE, "addOnTitleAEM");
    String serviceAvailableMessageAEM = Property.getProperty(Constant.OR_FILE, "serviceAvailableMessageAEM");
	String standardDeliveryFieldAEM = Property.getProperty(Constant.OR_FILE, "standardDeliveryFieldAEM");
	String inHomeDeliveryFieldAEM = Property.getProperty(Constant.OR_FILE, "inHomeDeliveryFieldAEM");
	String inHomeDeliveryAndUnpack = Property.getProperty(Constant.OR_FILE, "inHomeDeliveryAndUnpack");
	
	/**
	 * gets Locator - AEM Item Added To wishlist label field
	 * 
	 */

	public String get_Item_Added_To_Wishlist_Field() {
		return wishlistItemAddedMessageField;
	}

		/**
		 * gets Locator - I and A tab
		 * 
		 */
		public String get_IandATab() {
			return IandATab;
		}
		/**
		 * gets Locator - change In Cart Msg
		 * 
		 */
		public String get_changeInCartMsg() {
			return changeInCartMsg;
		}
		/**
		 * gets Locator - shopping Store Change Msg
		 * 
		 */
		public String get_shoppingStoreChangeMsg() {
			return shoppingStoreChangeMsg;
		}
		/**
		 * gets Locator - shipping Store Change Msg
		 * 
		 */
		public String get_shippingStoreChangeMsg() {
			return shippingStoreChangeMsg;
		}
		/**
		 * gets Locator - resolve Issue Msg
		 * 
		 */
		public String get_resolveIssueMsg() {
			return resolveIssueMsg;
		}
		/**
		 * gets Locator - outOfStockInStorePickUp Msg
		 * 
		 */
		public String get_outOfStockInStorePickUpMsg() {
			return outOfStockInStorePickUpMsg;
		}
		/**
		 * gets Locator - outOfStockInStoreShipFromMsg
		 * 
		 */
		public String get_outOfStockInStoreShipFromMsg() {
			return outOfStockInStoreShipFromMsg;
		}
		/**
		 * gets Locator - tempOutOfStockPickUp Msg
		 * 
		 */
		public String get_tempOutOfStockPickUpMsg() {
			return tempOutOfStockPickUpMsg;
		}
		/**
		 * gets Locator - tempOutOfStockShipFromMsg
		 * 
		 */
		public String get_tempOutOfStockShipFromMsg() {
			return tempOutOfStockShipFromMsg;
		}
		/**
		 * gets Locator - onlySomeInStockMsg
		 * 
		 */
		public String get_onlySomeInStockMsg() {
			return onlySomeInStockMsg;
		}
		/**
		 * gets Locator - AEM Quantity Selector Tab
		 * 
		 */
	    
		public String get_QuantitySelectorTab() {
			return QuantitySelectorTab;	
		}
		
		/**
		 * gets Locator - AEM Exceeded Message Toast Msg
		 * 
		 */
	    
		public String get_ExceededMessageToastMsg() {
			return ExceededMessageToastMsg;	
		}
		
		/**
		 * gets Locator - AEM exceeded Total Available Msg
		 * 
		 */
	    
		public String get_exceededTotalAvailableMsg() {
			return exceededTotalAvailableMsg;	
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

	/**
	 * gets Locator - incl Core Charges(content Fragment)
	 * 
	 */

	public String get_inclCoreCharges() {
		return inclCoreCharges;
	}

	/**
	 * gets Locator - plus Core Charges(content Fragment)
	 * 
	 */

	public String get_plusCoreCharges() {
		return plusCoreCharges;
	}

	/**
	 * gets Locator - core Charges Text(content Fragment)
	 * 
	 */

	public String get_coreChargesText() {
		return coreChargesText;
	}

	/**
	 * gets Locator - core Charges ToolTip message(content Fragment)
	 * 
	 */

	public String get_coreCharges_ToolTipmessage() {
		return coreChargesToolTipmessage;
	}

	/**
	 * gets Locator - drag component here
	 * 
	 */

	public String get_drag_component_Here() {
		return dragcomponent_cartpage;
	}

	/**
	 * gets Locator - order summary component here
	 * 
	 */

	public String get_OrderSummary_Component() {
		return ordersummary_cartpage;
	}

	/**
	 * gets Locator - Recommendation component here
	 * 
	 */

	public String get_Recommendation_Component() {
		return recommendation_cartpage;
	}

	/**
	 * gets Locator - Recommendation component here
	 * 
	 */

	public String get_BroadBanner() {
		return selectbroadbanner;
	}

	/**
	 * gets Locator - TwoFeatured
	 * 
	 */

	public String get_TwoFeatured() {
		return twofeatured;
	}

	/**
	 * gets Locator - cart component
	 * 
	 */

	public String get_cartcomponent() {
		return cartItemsComponent;
	}

	/**
	 * gets Locator - ToolTip Title
	 * 
	 */

	public String get_ToolTipTitle() {
		return ToolTipTitle;
	}

	/**
	 * gets Locator - ToolTip Description
	 * 
	 */

	public String get_ToolTipDesc() {
		return ToolTipDesc;
	}

	/**
	 * gets Locator - bulk Message label
	 * 
	 */

	public String get_bulkMessage_Text() {
		return bulkMessage;
	}

	/**
	 * gets Locator - bulk items tab
	 * 
	 */

	public String get_bulkItemsTab() {
		return bulkItemsTab;
	}
	
	/**
	 * gets Locator - Postal Tab
	 * 
	 */

	public String get_Postal_Tab_AEM() {
		return getPostalTab;
	}

	/**
	 * gets Locator - Success Toast Message Field
	 * 
	 */

	public String get_Success_Toast_Message_AEM() {
		return successToastMessageAEM;
	}

	/**
	 * gets Locator - Error Toast Message Field
	 * 
	 */

	public String get_Error_Toast_Message_AEM() {
		return errorToastMessageAEM;
	}
	
	/**
	 * gets Locator - Service Tab
	 */
	public String get_Service_Tab() {
		return serviceTabAEM;
	}
	
	/**
	 * gets Locator - Adds on Title
	 */
	public String get_Adds_On_Title() {
		return addOnTitleAEM;
	}
	
	/**
	 * gets Locator - Service Available Message
	 */
	public String get_Service_Available_Message() {
		return serviceAvailableMessageAEM;
	}

	/**
	 * gets Locator - Standard Delivery Field AEM
	 * 
	 */

	public String get_Standard_Delivery_Field_AEM() {
		return standardDeliveryFieldAEM;
	}
	
	/**
	 * gets Locator - InHome Delivery Field AEM
	 * 
	 */

	public String get_InHome_Delivery_Field_AEM() {
		return inHomeDeliveryFieldAEM;
	}

	/**
	 * gets Locator - In Home Delivery And Unpack
	 * 
	 */

	public String get_InHome_Delivery_And_Unpack() {
		return inHomeDeliveryAndUnpack;
	}

}
