package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains locator of Footer
 * 
 */

public class Primary_Navigation_Page_Locator {
	
	String primaryNavigation = Property.getProperty(Constant.OR_FILE, "primaryNavigation").replace("=", ",");
	String primaryNavigationAfterPencilBanner = Property.getProperty(Constant.OR_FILE, "primaryNavigationAfterPencilBanner");
	
	/**
	 * gets Locator - Primary Navigation
	 * 
	 */
	
	public String get_Primary_Navigation() {
		return primaryNavigation;
	}
	
	/**
	 * gets Locator - Primary Navigation After Pencil Banner
	 * 
	 */
	public String get_Primar_Navigation_After_Pencil_Banner() {
		return primaryNavigationAfterPencilBanner;
	}
 }

