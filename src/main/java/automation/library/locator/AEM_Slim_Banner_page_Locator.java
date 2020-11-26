package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM Simple Header Checkout component page Locators
 * 
 */
public class AEM_Slim_Banner_page_Locator {

	String SlimBannerComponent = Property.getProperty(Constant.OR_FILE, "SlimBannerComponent");
	String BannerTypeField = Property.getProperty(Constant.OR_FILE, "BannerTypeField");
	String BannerTypeFieldValue = Property.getProperty(Constant.OR_FILE, "BannerTypeFieldValue");
	String BannerTitle = Property.getProperty(Constant.OR_FILE, "BannerTitle");
	String BannerDescription = Property.getProperty(Constant.OR_FILE, "BannerDescription");
	String ErrorMessageSlimBanner = Property.getProperty(Constant.OR_FILE, "ErrorMessageSlimBanner");
	String BannerTitleonsite=Property.getProperty(Constant.OR_FILE, "BannerTitleonsite");
	
    /**
	 * gets Locator - AEM slim banner component
	 * 
	 */
    
	public String getSlimBannerComponentAEM() {
		return SlimBannerComponent;	
	}
	/**
	 * gets Locator - AEM slim banner Title on site
	 * 
	 */
    
	public String getSlimBannerTitleonsite() {
		return BannerTitleonsite;	
	}
	/**
	 *  gets Locator - AEM ErrorMessage in SlimBanner
	 * 
	 */
    
	public String getErrorMessageSlimBannerAEM() {
		return ErrorMessageSlimBanner;	
	}
	/**
	 * gets Locator - AEM BannerType Field
	 * 
	 */
   
	public String getBannerTypeFieldAEM() {
		return BannerTypeField;	
	}
	/**
	 * gets Locator - AEM Banner Type Field Value
	 * 
	 */
   
	public String getBannerTypeFieldValueAEM() {
		return BannerTypeFieldValue;	
	}
	/**
	 * gets Locator - AEM Banner Title Value
	 * 
	 */
   
	public String getBannerTitleAEM() {
		return BannerTitle;	
	}
	/**
	 * gets Locator - AEM Banner Description
	 * 
	 */
   
	public String getBannerDescriptionAEM() {
		return BannerDescription;	
	}
}