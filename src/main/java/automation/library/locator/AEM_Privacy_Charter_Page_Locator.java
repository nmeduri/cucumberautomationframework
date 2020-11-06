package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_Privacy_Charter_Page_Locator {
	
	
	String privacyCharterPannel = Property.getProperty(Constant.OR_FILE, "privacyCharterPannel").replace("=", ",");

	
	

    /**
	 * gets Locator - Privacy Charter Panel
	 * 
	 */
    
	public String getPrivacyCharterPanel() {
		return privacyCharterPannel;	
	}
	
}
