package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Header_Page_Locator {
	
	
	String accountOnHeader = Property.getProperty(Constant.OR_FILE, "accountOnHeader");
	String signInHeader = Property.getProperty(Constant.OR_FILE, "signInHeader");
	String registrationHeader = Property.getProperty(Constant.OR_FILE, "registrationHeader");
	
	public String get_Account() {
		return accountOnHeader;	
	}
	
	public String get_Sign_In_Header() {
		return signInHeader;
	}
	
	public String get_Registration_Header() {
		return registrationHeader;
	}
}
