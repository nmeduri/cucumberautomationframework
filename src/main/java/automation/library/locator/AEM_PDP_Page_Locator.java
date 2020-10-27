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
	
}
