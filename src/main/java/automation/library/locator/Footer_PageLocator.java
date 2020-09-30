package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains locator of Footer
 * 
 */

public class Footer_PageLocator {
	
	String legalDisclaimer = Property.getProperty(Constant.OR_FILE, "legalDisclaimer");
	String viewMorelegalDisclaimer = Property.getProperty(Constant.OR_FILE, "viewMorelegalDisclaimer");
	String viewLesslegalDisclaimer = Property.getProperty(Constant.OR_FILE, "viewLesslegalDisclaimer");
	String legalDisclaimerRow = Property.getProperty(Constant.OR_FILE, "legalDisclaimerRow");
	String legal = Property.getProperty(Constant.OR_FILE, "legal");
	String termsAndConditions = Property.getProperty(Constant.OR_FILE, "termsAndConditions");
	String privacyPolicy = Property.getProperty(Constant.OR_FILE, "privacyPolicy");
	String siteMap = Property.getProperty(Constant.OR_FILE, "siteMap");
	String accessibility = Property.getProperty(Constant.OR_FILE, "accessibility");
	String candianTireLogoFooter = Property.getProperty(Constant.OR_FILE, "candianTireLogoFooter");
	String copyRightText = Property.getProperty(Constant.OR_FILE, "copyRightText");
	String termsAndConditionsFooter = Property.getProperty(Constant.OR_FILE, "termsAndConditionsFooter");
	String viewMore = Property.getProperty(Constant.OR_FILE, "viewMore");
	String viewLessNotDisplay = Property.getProperty(Constant.OR_FILE, "viewLessNotDisplay");
	String viewMoreNotDisplay = Property.getProperty(Constant.OR_FILE, "viewMoreNotDisplay");
	String footerLink = Property.getProperty(Constant.OR_FILE, "footerLink");
	String copyRightInformation = Property.getProperty(Constant.OR_FILE, "copyRightInformation");
	
	/**
	 * gets Locator - Legal Disclaimer
	 * 
	 */
	
	public String get_Legal_Disclaimer() {
		return legalDisclaimer;
	}
	
	/**
	 * gets Locator - View More
	 * 
	 */

	public String get_View_More() {
		return viewMorelegalDisclaimer;
	}
	
	/**
	 * gets Locator - View Less
	 * 
	 */

	public String get_View_Less() {
		return viewLesslegalDisclaimer;
	}
	
	/**
	 * gets Locator - Legal Disclaimer Row
	 * 
	 */

	public String get_Legal_Disclaimer_Row() {
		return legalDisclaimerRow;
	}
	
	/**
	 * gets Locator - Accessibility
	 * 
	 */

	public String get_Accessibility() {
		return accessibility;
	}
	
	/**
	 * gets Locator - Legal
	 * 
	 */

	public String get_Legal() {
		return legal;
	}
	
	/**
	 * gets Locator - Create Your Triangle ID Header
	 * 
	 */

	public String get_Terms_And_Conditions() {
		return termsAndConditions;
	}
	
	/**
	 * gets Locator - Privacy Policy
	 * 
	 */

	public String get_Privacy_Policy() {
		return privacyPolicy;
	}
	
	/**
	 * gets Locator - Site Map
	 * 
	 */

	public String get_Site_Map() {
		return siteMap;
	}
	
	/**
	 * gets Locator - Canadian Tire Logo
	 * 
	 */

	public String get_Canadian_Tire_Logo() {
		return candianTireLogoFooter;
	}
	
	/**
	 * gets Locator - Copy Right Text
	 * 
	 */

	public String get_Copy_Right_Text() {
		return copyRightText;
	}
	
	/**
	 * gets Locator - Terms And Conditions (Footer)
	 * 
	 */
	
	public String get_Terms_And_Conditions_Footer() {
		return termsAndConditionsFooter;
	}
	
	/**
	 * gets Locator - view less (Not Display)
	 * 
	 */
	
	public String get_Not_Dispay_View_Less() {
		return viewLessNotDisplay;
	}
	
	/**
	 * gets Locator - view more (Not Display)
	 * 
	 */
	public String get_Not_Display_View_More() {
		return viewMoreNotDisplay;
	}
	
	/**
	 * gets Locator - Footer
	 * 
	 */
	public String get_Footer_Link() {
		return footerLink;
	}
	
	/**
	 * gets Locator - Copy Right Information
	 * 
	 */
	public String get_Copy_Right_Information() {
		return copyRightInformation;
	}
 }

