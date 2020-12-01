package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Home Page
 * 
 */

public class HomePageLocator {
	
	String sAutomative = Property.getProperty(Constant.OR_FILE, "automative");
	
	String sArrow = Property.getProperty(Constant.OR_FILE, "arrow");
	
	String sMenuIcon = Property.getProperty(Constant.OR_FILE, "menuIcon");
	
	/**
	 * gets Locator - Automatice Locator
	 * 
	 */
	
	public String getAutomativeLocator() {
		
		return sAutomative;
	}
	
	/**
	 * gets Locator - Arrow
	 * 
	 */
	
	public String getArrow() {
		
		return sArrow;
		
	}
	
	/**
	 * gets Locator - Menu Icon
	 * 
	 */
	
	public String getMenuIcon() {
		return sMenuIcon;
	}

}
