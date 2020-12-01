package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Banners Page
 * 
 */
public class Banners_Locator {
	
	String edgeToEdgeBanner = Property.getProperty(Constant.OR_FILE, "edgeToEdgeBanner");
	String edgeToEdgeBannerTitle = Property.getProperty(Constant.OR_FILE, "edgeToEdgeBannerTitle");
	String edgeToEdgeBannerDescription = Property.getProperty(Constant.OR_FILE, "edgeToEdgeBannerDescription");
	String edgeToEdgeBannerImage = Property.getProperty(Constant.OR_FILE, "edgeToEdgeBannerImage");
	
	/**
	 * gets Locator - Edge To Edge Banner
	 * 
	 */
	public String get_EdgeToEdge_Banner() {
		return edgeToEdgeBanner;
	}
	/**
	 * gets Locator - Edge To Edge Banner Title
	 * 
	 */	
	public String get_EdgeToEdge_Banner_Title() {
		return edgeToEdgeBannerTitle;
	}
	/**
	 * gets Locator - Edge To Edge Banner Description
	 * 
	 */	
	public String get_EdgeToEdge_Banner_Description() {
		return edgeToEdgeBannerDescription;
	}
	/**
	 * gets Locator - Edge To Edge Banner Image
	 * 
	 */	
	public String get_EdgeToEdge_Banner_Image() {
		return edgeToEdgeBannerImage;
	}
}
