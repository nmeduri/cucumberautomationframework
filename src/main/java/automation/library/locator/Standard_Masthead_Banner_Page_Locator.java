package automation.library.locator;

import java.util.List;

import org.openqa.selenium.WebElement;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of Standard Masthead Banner
 * 
 */
public class Standard_Masthead_Banner_Page_Locator {
	
	String mastheadBanner = Property.getProperty(Constant.OR_FILE, "mastheadBanner");
	String mastheadBannerTitle = Property.getProperty(Constant.OR_FILE, "mastheadBannerTitle").replace("=", ",");
	String mastheadBannerDescription = Property.getProperty(Constant.OR_FILE, "mastheadBannerDescription").replace("=", ",");
	String mastheadBannerAEM = Property.getProperty(Constant.OR_FILE, "mastheadBannerAEM");
	String titleFieldAEM = Property.getProperty(Constant.OR_FILE, "titleFieldAEM");
	String titleToolTipIconAEM = Property.getProperty(Constant.OR_FILE, "titleToolTipIconAEM");
	String descriptionToolTipIconAEM = Property.getProperty(Constant.OR_FILE, "descriptionToolTipIconAEM");
	String titleMandatoryFieldAEM = Property.getProperty(Constant.OR_FILE, "titleMandatoryFieldAEM");
	String backgroundManadatroyAEM = Property.getProperty(Constant.OR_FILE, "backgroundManadatroyAEM");
	String backgroundFieldAEM = Property.getProperty(Constant.OR_FILE, "backgroundFieldAEM");
	String toolTipInfoAEM = Property.getProperty(Constant.OR_FILE, "toolTipInfoAEM");
			 
	
	/**
	 * gets Locator - List View
	 * 
	 */
	
	public String get_Masthead_Banner() {
		
		return mastheadBanner;
	}
	
	/**
	 * gets Locator - Banner Title
	 */
	public String get_Banner_Title() {
		return mastheadBannerTitle;
	}
	
	/**
	 * gets Locator - Masthead Banner Description
	 */
	public String get_Masthead_Banner_Description() {
		return mastheadBannerDescription;
	}
	
	/**
	 * gets Locator - Masthead Banner Panel
	 */
	public String get_Masthead_Banner_Panel() {
		return mastheadBannerAEM;
	}
	
	/** 
	 * gets Locator - Title Field
	 */
	public String get_Title_Field() {
		return titleFieldAEM;
	}
	
	/**
	 * gets Locator - Title Tool Tip Icon
	 */
	public String get_Title_Tool_Tip_Icon() {
		return titleToolTipIconAEM;
	}
	
	/**
	 * gets Locator - Description Tool Tip Icon
	 */
	public String get_Description_Tool_Tip_Icon() {
		return descriptionToolTipIconAEM;
	}
	
	/**
	 * gets Locator - Title Mandatory Field
	 */
	public String get_Title_Mandatory_Field() {
		return titleMandatoryFieldAEM;
	}
	
	/**
	 * gets Locator - Background Color Mandatory
	 */
	public String get_Background_Color_Mandatory() {
		return backgroundManadatroyAEM;
	}
	
	/**
	 * gets Locator - Background Color field
	 */
	public String get_Background_Color_Field() {
		return backgroundFieldAEM;
	}
	
	/**
	 * gets Locator - Tool Tip Info
	 */
	public String get_Tool_Tip_Info() {
		return toolTipInfoAEM;
	}
	
	
 }
