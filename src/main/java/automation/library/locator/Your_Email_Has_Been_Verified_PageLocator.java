package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Email Has Been verified Page
 * 
 */

public class Your_Email_Has_Been_Verified_PageLocator {
	
	String yourEmailHasBeenVerified = Property.getProperty(Constant.OR_FILE, "yourEmailHasBeenVerified");
	String ClickContinueButtonEmailVerificationPage = Property.getProperty(Constant.OR_FILE, "ClickContinueButtonEmailVerificationPage");
	
	/**
	 * gets Locator - Your Email Has Been Verified
	 * 
	 */
	
	public String get_Your_Email_Has_Been_Verified() {
		
		return yourEmailHasBeenVerified;
	}

	/**
	 * gets Locator - Your Email Has Been Verified
	 * 
	 */
	public String get_Continue_Button_Email_Verification_Page() {
		
		return ClickContinueButtonEmailVerificationPage;
	}
}
