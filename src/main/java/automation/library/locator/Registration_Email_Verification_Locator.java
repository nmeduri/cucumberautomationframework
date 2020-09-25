package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * This file contains the locator of Registration Email Verification
 * 
 */

public class Registration_Email_Verification_Locator {
	
	String createYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeader");
	
	/**
	 * gets Locator - Header Create Your Triangle
	 * 
	 */
	
	public String get_Create_Your_Triangle_ID_Header() {
		
		return createYourTriangleHeader;
	}
}
