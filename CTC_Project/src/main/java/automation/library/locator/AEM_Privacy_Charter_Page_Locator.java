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
	String headerPrivacyCharterAEM = Property.getProperty(Constant.OR_FILE, "headerPrivacyCharterAEM").replace("=", ",");
    String privacyCharterLabelDesktop = Property.getProperty(Constant.OR_FILE, "privacyCharterLabelDesktop");
	
	

    /**
	 * gets Locator - Privacy Charter Panel
	 * 
	 */
    
	public String getPrivacyCharterPanel() {
		return privacyCharterPannel;	
	}
	
	/**
	 * gets Locator - Header Privacy Charter
	 */
	public String getHeaderPrivacyCharter() {
		return headerPrivacyCharterAEM;
	}
	
	/**
	 * gets Locator - Privacy Charter Label Desktop
	 */
	public String get_Label_Privacy_Charter_Desktop() {
		return privacyCharterLabelDesktop;
	}
	
}
