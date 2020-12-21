package automation.library.locator;


import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_PDP_Page_Locator {
	
	
	String specificationsSection = Property.getProperty(Constant.OR_FILE, "specificationsSectionAuthor").replace("=", ",");
	String specificationsTitle = Property.getProperty(Constant.OR_FILE, "specificationsTitleAEM");
	String setNumberOfSpecifications = Property.getProperty(Constant.OR_FILE, "setNumberOfSpecifications");
	String viewMoreSpecificationsLabel = Property.getProperty(Constant.OR_FILE, "viewMoreSpecificationsLabel");
	String viewLessSpecificationsLabel = Property.getProperty(Constant.OR_FILE, "viewLessSpecificationsLabel");
	String showMoreTab = Property.getProperty(Constant.OR_FILE, "showMoreTab");
	
	String getItInstalledLabelAEM = Property.getProperty(Constant.OR_FILE, "getItInstalledLabelAEM");
	String toolTipTitleAEM = Property.getProperty(Constant.OR_FILE, "toolTipTitleAEM");
	String avaialbeAtCheckoutLabelAEM = Property.getProperty(Constant.OR_FILE, "avaialbeAtCheckoutLabelAEM");
	String toolTipIconAEM = Property.getProperty(Constant.OR_FILE, "toolTipIconAEM");
	String toolsIconOptionToolTipAEM = Property.getProperty(Constant.OR_FILE, "toolsIconOptionToolTipAEM");
	String informationOptionToolTipIconAEM = Property.getProperty(Constant.OR_FILE, "informationOptionToolTipIconAEM");
	String toolsOptionGetItInstalledIcon = Property.getProperty(Constant.OR_FILE, "toolsOptionGetItInstalledIcon");
	String informationOptionGetItInstalledIcon = Property.getProperty(Constant.OR_FILE, "informationOptionGetItInstalledIcon");
	String getItInstalledIconAEM = Property.getProperty(Constant.OR_FILE, "getItInstalledIconAEM");
	String buyBoxSectionAuthor = Property.getProperty(Constant.OR_FILE, "buyBoxSectionAuthor").replace("=", ",");
	String getItInstalledPreview = Property.getProperty(Constant.OR_FILE, "getItInstalledPreview");
	String getAvailableAtCheckoutPreview = Property.getProperty(Constant.OR_FILE, "getAvailableAtCheckoutPreview");
	String toolTipMessagePreview = Property.getProperty(Constant.OR_FILE, "toolTipMessagePreview");
	
	String overviewSectionAuthor = Property.getProperty(Constant.OR_FILE, "overviewSectionAuthor").replace("=", ",");
	String overviewLabelAEM = Property.getProperty(Constant.OR_FILE, "overviewLabelAEM");
	String resourceSectionAuthor = Property.getProperty(Constant.OR_FILE, "resourceSectionAuthor").replace("=", ",");
	String productMerchandiseTab = Property.getProperty(Constant.OR_FILE, "productMerchandiseTab");
	String userManualLabelAEM = Property.getProperty(Constant.OR_FILE, "userManualLabelAEM");
	String userManualDescriptionAEM = Property.getProperty(Constant.OR_FILE, "userManualDescriptionAEM");
	String userManualDownlaodLinkAEM = Property.getProperty(Constant.OR_FILE, "userManualDownlaodLinkAEM");
	String userManaualLabelPreview = Property.getProperty(Constant.OR_FILE, "userManaualLabelPreview");
	String userManualDescriptionPreview = Property.getProperty(Constant.OR_FILE, "userManualDescriptionPreview");
	String downloadUserManualPreview = Property.getProperty(Constant.OR_FILE, "downloadUserManualPreview");
	String stickyTOCAEM = Property.getProperty(Constant.OR_FILE, "stickyTOCAEM").replace("=", ",");

	String colorVariantPDPAEM = Property.getProperty(Constant.OR_FILE, "colorVariantPDPAEM");
	String sizeVariantPDPAEM = Property.getProperty(Constant.OR_FILE, "sizeVariantPDPAEM");
	
	String moreSectionsStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "moreSectionsStickyTOCAEM");
	String overviewStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "overviewStickyTOCAEM");
	String specificationsStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "specificationsStickyTOCAEM");
	String resourcesStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "resourcesStickyTOCAEM");
	String videosStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "videosStickyTOCAEM");
	String availiablityStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "availiablityStickyTOCAEM");
	String ratingReviewsStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "ratingReviewsStickyTOCAEM");
	String questionAnswersStickyTOCAEM = Property.getProperty(Constant.OR_FILE, "questionAnswersStickyTOCAEM");
	
	String addToCartStickyDesktopAEM = Property.getProperty(Constant.OR_FILE, "addToCartStickyDesktopAEM");
	String addToCartStickyMobileAEM = Property.getProperty(Constant.OR_FILE, "addToCartStickyMobileAEM");
	String stickyBuyBoxAEM = Property.getProperty(Constant.OR_FILE, "stickyBuyBoxAEM").replace("=", ",");

	String resourcesHeadingField = Property.getProperty(Constant.OR_FILE, "resourcesHeadingField");
	String returnsTitleField = Property.getProperty(Constant.OR_FILE, "returnsTitleField");
	String returnPolicyDescriptionField = Property.getProperty(Constant.OR_FILE, "returnPolicyDescriptionField");
	String returnPolicyLinkLabelField = Property.getProperty(Constant.OR_FILE, "returnPolicyLinkLabelField");
	String linkOpenInField = Property.getProperty(Constant.OR_FILE, "linkOpenInField");
	String getNewTab = Property.getProperty(Constant.OR_FILE, "getNewTab");
	String returnPolicyLinkPath = Property.getProperty(Constant.OR_FILE, "returnPolicyLinkPath");
	String aemResourcePreview = Property.getProperty(Constant.OR_FILE, "aemResourcePreview");
	String availableByLabelAEM = Property.getProperty(Constant.OR_FILE, "availableByLabelAEM");
	String fulfillmentOptionsTab = Property.getProperty(Constant.OR_FILE, "fulfillmentOptionsTab");
	String curbSidePickUpLabelAEM = Property.getProperty(Constant.OR_FILE, "curbSidePickUpLabelAEM");
	String shipToHomeLabelAEM = Property.getProperty(Constant.OR_FILE, "shipToHomeLabelAEM");
	String checkNearByLabelAEM = Property.getProperty(Constant.OR_FILE, "checkNearByLabelAEM");
	String chagneLabelAEM = Property.getProperty(Constant.OR_FILE, "chagneLabelAEM");
	
	String fulfillmentOption = Property.getProperty(Constant.OR_FILE, "fullfillmentOption");
	String getitInStorelabel = Property.getProperty(Constant.OR_FILE, "getitInStorelabel");
	String inStockLabel = Property.getProperty(Constant.OR_FILE, "inStockLabel");
	String freePickUpInStoreLabel = Property.getProperty(Constant.OR_FILE, "freePickUpInStoreLabel");
	String getinstoreUpdated = Property.getProperty(Constant.OR_FILE, "getinstoreUpdated");
	String InstockUpdated = Property.getProperty(Constant.OR_FILE, "InstockUpdated");
	String freePickUpLabelupdated = Property.getProperty(Constant.OR_FILE, "freePickUpLabelupdated");

	
    /**
	 * gets Locator - Specifications
	 * 
	 */
    
	public String getSpecificationsSection() {
		return specificationsSection;	
	}
	
	/**
	 * gets Locator - Specifications Title
	 * 
	 */
    
	public String getSpecificationsTitle() {
		return specificationsTitle;	
	}
	
	/**
	 * gets Locator - Set Number of Specifications
	 * 
	 */
    
	public String getSetNumberOfSpecifications() {
		return setNumberOfSpecifications;	
	}
	
	/**
	 * gets Locator - View More Specifications
	 * 
	 */
    
	public String getViewMoreSpecifications() {
		return viewMoreSpecificationsLabel;	
	}
	
	/**
	 * gets Locator - View Less Specifications
	 * 
	 */
    
	public String getViewLessSpecifications() {
		return viewLessSpecificationsLabel;	
	}
	
	/**
	 * 
	 * gets Locator - Show More Tab
	 * 
	 */
	public String getShowMoreTab() {
		return showMoreTab;
	}
	
	/**
	 *gets Locator - Get It Installed
	 */
	public String get_Get_It_Installed_Label() {
		return getItInstalledLabelAEM;
	}
	
	/**
	 * 
	 * gets Locator - Tools Tip Title
	 */
	public String get_Tools_Tip_Title() {
		return toolTipTitleAEM;
	}
	
	/**
	 * 
	 * gets Locator - Available At Checkout Label
	 */
	public String get_Available_At_Checkout_Label() {
		return avaialbeAtCheckoutLabelAEM;
	}
	
	/**
	 * 
	 * gets Locator - Tools Tip Icon
	 */
	public String get_Tools_Tip_Icon() {
		return toolTipIconAEM;
	}
	
	/**
	 * 
	 * get Locator - Tool Tip Icon option - Tools
	 */
	
	public String get_Tools_Tool_Tip_Icon_Option() {
		return toolsIconOptionToolTipAEM;
	}
	
	/**
	 * get Locator - Tool Tip Icon Option - Information
	 */
	public String get_Information_Tool_Tip_Icon_Option() {
		return informationOptionToolTipIconAEM;
	}
	
	/**
	 * get Locator - Get It Installaed Icon Option - Tools
	 */
	public String get_Tools_Get_It_Installed_Icon_Option() {
		return toolsOptionGetItInstalledIcon;
	}
	
	/**
	 * get Locator - Get It Installed Icon Option - Information
	 */
	public String get_Information_Get_It_Installed_Icon_Option() {
		return informationOptionGetItInstalledIcon;
	}
	
	/**
	 * get Locator - Get It Installed Icon
	 */
	public String get_Get_It_Installed_Icon() {
		return getItInstalledIconAEM;
	}
	
	/**
	 * get Locator - Buy Box Section
	 */
	public String get_Buy_Box_Section() {
		return buyBoxSectionAuthor;
	}
	
	/**
	 * get Locator - Get It Installed Preview
	 */
	public String get_Get_It_Installed_Preview() {
	return getItInstalledPreview;
	}
	
	/**
	 * get Locator - Available At Checkout Preview
	 */
	public String get_Available_At_Checkout_Preview() {
		return getAvailableAtCheckoutPreview;
	}
	
	/**
	 * get Locator - Tool Tip Message Preview
	 */
	public String get_Tool_Tip_Message() {
		return toolTipMessagePreview;
	}
	
	/**
	 * get Locator - Overview Section
	 */
	public String get_Overview_Section_Author() {
		return overviewSectionAuthor;
	}
	
	/**
	 * get Locator - Overview Label
	 */
	public String get_Overview_Label() {
		return overviewLabelAEM;
	}
	
	/**
	 * get Locator - Resource Section
	 */
	public String get_Resource_Section() {
		return resourceSectionAuthor;
	}
	
	/**
	 * get Locator - Product Merchandise Tab
	 */
	public String get_Product_Merchandise_Tab() {
		return productMerchandiseTab;
	}
	
	/**
	 * get Locator - User Manual Label
	 */
	public String get_User_Manual_Label() {
		return userManualLabelAEM;
	}
	
	/**
	 * get Locator - User Manual Description
	 */
	public String get_User_Manual_Description() {
		return userManualDescriptionAEM;
	}
	
	/**
	 * get Locator - User Manual Download Link
	 */
	public String get_User_Manual_Download_Link() {
		return userManualDownlaodLinkAEM;
	}
	
	/**
	 * get Locator - User Manual Label Preview
	 */
	public String get_User_Manual_Label_Preview() {
		return userManaualLabelPreview;
	}
	
	/**
	 * get Locator - User Manual Description Preview
	 */
	public String get_User_Manual_Description_Preivew() {
		return userManualDescriptionPreview;
	}
	
	/**
	 * get Locator - Download User Manual Link
	 */
	public String get_User_Manual_Download_Link_Preview() {
		return downloadUserManualPreview;
	}
	
	/**
	 * get Locator - Sticky TOC
	 */
	public String get_Sticky_TOC() {
		return stickyTOCAEM;
	}
	
	/**
	 * get Locator - Color variant
	 */
	public String getColorVariant() {
		return colorVariantPDPAEM;
	}
	
	/**
	 * get Locator  - Size variant
	 */
	public String getSizeVariant() {
		return sizeVariantPDPAEM;
	}
	
	/**
	 * get Locator - More Sections Sticky TOC
	 */
	public String getMoreSectionsStickyTOC() {
		return moreSectionsStickyTOCAEM;
	}
	
	/**
	 * get Locator - Overview Sticky TOC
	 */
	public String getOverViewStickyTOC() {
		return overviewStickyTOCAEM;
	}
	
	/**
	 * get Locator - Specifications Sticky TOC
	 */
	public String getSpecificationsStickyTOC() {
		return specificationsStickyTOCAEM;
	}
	
	/**
	 * get Locator - Resources Sticky TOC
	 */
	public String getResourcesStickyTOC() {
		return resourcesStickyTOCAEM;
	}
	
	/**
	 * get Locator - Videos Sticky TOC
	 */
	public String getVideosStickyTOC() {
		return videosStickyTOCAEM;
	}
	
	/**
	 * get Locator - Availability Sticky TOC
	 */
	public String getAvailabilityStickyTOC() {
		return availiablityStickyTOCAEM;
	}
	
	/**
	 * get Locator - Rating Reviews Sticky TOC
	 */
	public String getRatingReviewsStickyTOC() {
		return ratingReviewsStickyTOCAEM;
	}
	
	/**
	 * get Locator - Questions and Answer
	 */
	public String getQuestionsAnswer() {
		return questionAnswersStickyTOCAEM;
	}
	
	/**
	 * get Locator - Add To Cart Button (Sticky Desktop)
	 */
	public String getAddToCartButtonStickyDesktop() {
		return addToCartStickyDesktopAEM;
	}
	
	/**
	 * get Locator - Add To Cart Button (Sticky Mobile)
	 */
	public String getAddToCartButtonStickyMobile() {
		return addToCartStickyMobileAEM;
	}
	
	/**
	 * get Locator - Sticky box panel
	 */
	public String getStickyBoxPanel() {
		return stickyBuyBoxAEM;
	}
	
	/**
	 * get Locator - Resources Heading Field
	 */
	public String get_Resources_Heading_Field() {
		return resourcesHeadingField;
	}
	
	/**
	 * get Locator - Returns Title Field
	 */
	public String get_Returns_Title_Field() {
		return returnsTitleField;
	}
	
	/**
	 * get Locator  - Return Policy Description Field
	 */
	public String get_Return_Policy_Description_Field() {
		return returnPolicyDescriptionField;
	}
	
	/**
	 * get Locator - Return Policy Link Field
	 */
	public String get_Return_Policy_Link_Label_Field() {
		return returnPolicyLinkLabelField;
	}
	
	/**
	 * get Locator - Link Open In 
	 */
	public String get_link_Open_In() {
		return linkOpenInField;
	}
	
	/**
	 * get Locator - get New Tab
	 */
	public String get_New_Tab() {
		return getNewTab;
	}
	
	/**
	 * get Locator - get Return Policy Link Path
	 */
	public String get_Return_Policy_Link_Path() {
		return returnPolicyLinkPath;
	}
	
	/**
	 * get Locator - get AEM Resource Preview
	 */
	public String get_AEM_Resource_Preview() {
		return aemResourcePreview;
	}
	
	/**
	 * get Locator - Available By
	 */
	public String get_Available_By_Label() {
		return availableByLabelAEM;
	}
	
	/**
	 * gets Locator - Fulfillment Option
	 */
	public String get_Fulfillment_Option() {
		return fulfillmentOptionsTab;
	}
	
	/**
	 * gets Locator - Curb Side Pick Up Available
	 */
	public String get_Curb_Side_Pick_Up_Available() {
		return curbSidePickUpLabelAEM;
	}

	/**
	 * gets Locator - Ship To Home
	 * */
	public String get_Ship_To_Home() {
		return shipToHomeLabelAEM;
		}
	
	/**
	 * gets Locator - Check NearBy Stores
	 */
	public String get_Check_NearBy_Stores() {
		return checkNearByLabelAEM;
	}
	
	/**
	 * gets Locator - Change Label
	 */
	public String get_Change_Label() {
		return chagneLabelAEM;
	}
	
	/**
	 * get Locator - fulfillment Option
	 */
	public String get_fulfillmentOption() {
		return fulfillmentOption;
	}
	
	/**
	 * get Locator - get get it In Store label
	 */
	public String get_getitInStore_label() {
		return getitInStorelabel;
	}
	
	/**
	 * get Locator - get inStock Label
	 */
	public String get_inStock_Label() {
		return inStockLabel;
	}
	
	/**
	 * get Locator - get freePickUpInStore Label
	 */
	public String get_freePickUpInStore_Label() {
		return freePickUpInStoreLabel;
	}
	/**
	 * get Locator - get get it In Store  updated
	 */
	public String get_getitInStore_updated() {
		return getinstoreUpdated;
	}
	
	/**
	 * get Locator - get inStock updated
	 */
	public String get_inStock_updated() {
		return InstockUpdated;
	}
	
	/**
	 * get Locator - get freePickUpInStore updated
	 */
	public String get_freePickUpInStore_updated() {
		return freePickUpLabelupdated;
	}
}
