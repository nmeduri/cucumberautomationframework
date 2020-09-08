package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Privacy_Charter_Page_Locator {
	
	String headerPrivacyCharter = Property.getProperty(Constant.OR_FILE, "headerPrivacyCharter");
	String privacyCharterDowloadLink = Property.getProperty(Constant.OR_FILE, "privacyCharterDowloadLink");
	String privacyCharterDowloadButtonMobile = Property.getProperty(Constant.OR_FILE, "privacyCharterDowloadButtonMobile");
	
	
	public String get_Header_Privacy_Charter() {
		
		return headerPrivacyCharter;
	}
	
	public String get_Privacy_Charter_Download_Link() {
		return privacyCharterDowloadLink;
	}
	
	public String get_Privacy_Charter_Button_Mobile() {
		return privacyCharterDowloadButtonMobile;
	}
}
