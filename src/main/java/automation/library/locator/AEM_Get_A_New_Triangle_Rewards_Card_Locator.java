package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of AEM Get A New Triangle Rewards Card
 * 
 */

public class AEM_Get_A_New_Triangle_Rewards_Card_Locator {
	
	String successImageField = Property.getProperty(Constant.OR_FILE, "successImageField");
	String linkrewardsDam = Property.getProperty(Constant.OR_FILE, "linkrewardsDam");
	String successImageThumbnail = Property.getProperty(Constant.OR_FILE, "successImageThumbnail");
	String successImagePreview = Property.getProperty(Constant.OR_FILE, "successImagePreview");
	String successScreenContinue = Property.getProperty(Constant.OR_FILE, "successScreenContinue");
	
	/**
	 * gets Locator - Success Image field AEM
	 * 
	 */
	
	public String get_Success_Image_Field_AEM() throws Exception {
		return successImageField;
	}
	
	/**
	 * gets Locator - Link Rewards DAM
	 * 
	 */
	
	public String get_Link_Rewards_Dam() throws Exception {
		return linkrewardsDam;
	}
	
	/**
	 * gets Locator - success Image Thumbnail
	 * 
	 */
	
	public String get_Success_Image_Thumbnail() throws Exception {
		return successImageThumbnail;
	}
	
	/**
	 * gets Locator - success Image preview
	 * 
	 */
	
	public String get_Success_Image_Preview() throws Exception {
		return successImagePreview;
	}
	
	/**
	 * gets Locator - Continue CTA
	 * 
	 */
	
	public String get_Success_Screen_Continue() throws Exception {
		return successScreenContinue;
	}


}
