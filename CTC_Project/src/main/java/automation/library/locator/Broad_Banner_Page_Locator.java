package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This class contains the locator of Broad Promo Tiles Page Locators
 * 
 */
public class Broad_Banner_Page_Locator {
	String BannerImageOnSite = Property.getProperty(Constant.OR_FILE, "BannerImageOnSite");
	String BroadBannerTitle = Property.getProperty(Constant.OR_FILE, "BroadBannerTitle");
	String BroadBannerDescription = Property.getProperty(Constant.OR_FILE, "BroadBannerDescription");
	String BroadBannerCTALink = Property.getProperty(Constant.OR_FILE, "BroadBannerCTALink");
	/**
	 * gets Locator - broad banner image
	 * 
	 */
	public String get_BroadBanner_Image() {
		return BannerImageOnSite;
	}
	/**
	 * gets Locator - broad banner title
	 * 
	 */
	public String get_BroadBanner_Title() {
		return BroadBannerTitle;
	}
	/**
	 * gets Locator - broad banner description
	 * 
	 */
	public String get_BroadBanner_Description() {
		return BroadBannerDescription;
	}
	/**
	 * gets Locator - broad banner CTA link
	 * 
	 */
	public String get_BroadBanner_CTALink() {
		return BroadBannerCTALink;
	}
	
}