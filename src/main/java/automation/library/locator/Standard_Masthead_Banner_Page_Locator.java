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
	
	
 }
