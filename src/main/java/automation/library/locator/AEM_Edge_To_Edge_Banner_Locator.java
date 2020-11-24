package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of AEM edge to edge component page
 * 
 */
public class AEM_Edge_To_Edge_Banner_Locator {
	

	 String edgeToEdgeBannerComponent = Property.getProperty(Constant.OR_FILE, "edgeToEdgeBannerComponent");
	 String BannerImageAltText = Property.getProperty(Constant.OR_FILE, "BannerImageAltText");
	 String BoldIcon = Property.getProperty(Constant.OR_FILE, "BoldIcon");
	 String BackGroundColor = Property.getProperty(Constant.OR_FILE, "BackGroundColor");
	 String FontColorField = Property.getProperty(Constant.OR_FILE, "FontColorField");
	 String FontColorBlack = Property.getProperty(Constant.OR_FILE, "FontColorBlack");
	 String BannerTitle = Property.getProperty(Constant.OR_FILE, "BannerTitle");
	 String BannerDescription = Property.getProperty(Constant.OR_FILE, "BannerDescription");
	 String ErrorImage= Property.getProperty(Constant.OR_FILE, "BannerTitleErrorImage");
	 /**
	  * get Locator -edgeToEdgeBannerComponent
	  */
	 public String get_edgeToEdgeBannerComponent() {
		 return edgeToEdgeBannerComponent;
	 }
	 
	 /**
	  * get Locator - BannerImage Alt Text
	  */
	 public String get_BannerImageAltText() {
		 return BannerImageAltText;
	 }
	 
	 /**
	  * get Locator - BoldIcon
	  */
	 public String get_BoldIcon() {
		 return BoldIcon;
	 }
	 
	 /**
	  * get Locator - BackGround Color
	  */
	 public String get_BackGroundColor() {
		 return BackGroundColor;
	 }
	 
	 /**
	  * get Locator - FontColorField
	  */
	 public String get_FontColorField() {
		 return FontColorField;
	 }
	 /**
	  * get Locator - FontColor value
	  */
	 public String get_FontColorValue() {
		 return FontColorBlack;
	 }
	 /**
	  * get Locator - Banner Title
	  */
	 public String get_BannerTitle() {
		 return BannerTitle;
	 }
	 /**
	  * get Locator - Banner Description
	  */
	 public String get_BannerDescription() {
		 return BannerDescription;
	 }
	 /**
	  * get Locator - error image
	  */
	 public String get_ErrorImage() {
		 return ErrorImage;
	 }
	 
}