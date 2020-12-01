package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM broad banner Page
 * 
 */

public class AEM_Broad_Banner_Page_Locator {
	
	String broadbannerComponent = Property.getProperty(Constant.OR_FILE, "broadbannerComponent");
	String BannerImage = Property.getProperty(Constant.OR_FILE, "BannerImage");
	String ImageAltText = Property.getProperty(Constant.OR_FILE, "ImageAltText");
	String ImageOrientationField = Property.getProperty(Constant.OR_FILE, "ImageOrientationField");
	String BannerTitle = Property.getProperty(Constant.OR_FILE, "BannerTitle");
    String ErrorImage=Property.getProperty(Constant.OR_FILE, "errorImage");
    String RightOrientation=Property.getProperty(Constant.OR_FILE, "RightOrientationValue");
    String BannerType=Property.getProperty(Constant.OR_FILE, "BannerType");
    String RegularBannerBroadValue=Property.getProperty(Constant.OR_FILE, "RegularBannerBroadValue");
    String BackgroundColour=Property.getProperty(Constant.OR_FILE, "BackgroundColour");
    String FontColor=Property.getProperty(Constant.OR_FILE, "FontColor");
    String FontColorWhiteValue=Property.getProperty(Constant.OR_FILE, "FontColorWhiteValue");
    String BannerDescription=Property.getProperty(Constant.OR_FILE, "BannerDescription");
    String BannerImageOnSite=Property.getProperty(Constant.OR_FILE, "BannerImageOnSite");

    

	 	/**
		 * gets Locator - AEM broad Banner Component
		 * 
		 */
	    
		public String get_broad_Banner_Component() {
			return broadbannerComponent;	
		}
		/**
		 * gets Locator - Banner image on site
		 * 
		 */
	    
		public String get_BannerImageOnSite() {
			return BannerImageOnSite;	
		}
		/**
		 * gets Locator - AEM banner image field
		 * 
		 */
	    
		public String get_banner_image_Field() {
			return BannerImage;	
		}
		/**
		 * gets Locator - AEM Image alt text field in bro
		 * 
		 */
	    
		public String get_ImageAltText() {
			return ImageAltText;	
		}
		/**
		 * gets Locator - AEM Image Orientation Field-broad banner
		 * 
		 */
	    
		public String get_ImageOrientationField() {
			return ImageOrientationField;	
		}
		/**
		 * gets Locator - AEM broad Banner Title
		 * 
		 */
	    
		public String get_BannerTitle_BroadBanner() {
			return BannerTitle;	
		}
		/**
		 * gets Locator - AEM BannerType-Broad Banner
		 * 
		 */
	    
		public String get_BannerType_BroadBanner() {
			return BannerType;	
		}
		/**
		 * gets Locator - AEM RegularBannerBroad Value
		 * 
		 */
	    
		public String get_RegularBannerBroadValue() {
			return RegularBannerBroadValue;	
		}
		/**
		 * gets Locator - AEM Background Color
		 * 
		 */
	    
		public String get_BackgroundColour() {
			return BackgroundColour;	
		}
		/**
		 * gets Locator - AEM Font Color
		 * 
		 */
	    
		public String get_FontColor() {
			return FontColor;	
		}
		/**
		 * gets Locator - AEM FontColor Value
		 * 
		 */
	    
		public String get_FontColorWhiteValue() {
			return FontColorWhiteValue;	
		}
		/**
		 * gets Locator - AEM Banner Description
		 * 
		 */
	    
		public String get_BannerDescription() {
			return BannerDescription;	
		}
		/**
		 * gets Locator - AEM Error Image
		 * 
		 */
	    
		public String get_Error_message() {
			return ErrorImage;	
		}
		/**
		 * gets Locator - AEM Image Orientation value
		 * 
		 */
	    
		public String get_RightOrientation() {
			return RightOrientation;	
		}
}