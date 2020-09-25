package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * This file contains the locator of Privacy Charter Page
 * 
 */

public class Privacy_Charter_Page_Locator {
	
	String headerPrivacyCharter = Property.getProperty(Constant.OR_FILE, "headerPrivacyCharter");
	String privacyCharterDowloadLink = Property.getProperty(Constant.OR_FILE, "privacyCharterDowloadLink");
	String privacyCharterDowloadButtonMobile = Property.getProperty(Constant.OR_FILE, "privacyCharterDowloadButtonMobile");
	
	/**
	 * gets Locator - Header Privacy Charter
	 * 
	 */
	
	public String get_Header_Privacy_Charter() {
		
		return headerPrivacyCharter;
	}
	
	/**
	 * gets Locator - Privacy Charter Download Link
	 * 
	 */
	
	public String get_Privacy_Charter_Download_Link() {
		return privacyCharterDowloadLink;
	}
	
	/**
	 * gets Locator - Privacy Charter Button (Mobile)
	 * 
	 */
	
	public String get_Privacy_Charter_Button_Mobile() {
		return privacyCharterDowloadButtonMobile;
	}
}
