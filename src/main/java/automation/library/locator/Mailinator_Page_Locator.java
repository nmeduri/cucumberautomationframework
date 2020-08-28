package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Mailinator_Page_Locator {
	
	
	String enterPublicMailinatorInboxField = Property.getProperty(Constant.OR_FILE, "enterPublicMailinatorInboxField");
	String goButton = Property.getProperty(Constant.OR_FILE, "goButton");
    String verifyYourEmailAddress = Property.getProperty(Constant.OR_FILE, "verifyYourEmailAddress");
    String verifyYourEmailAddressOnMobile = Property.getProperty(Constant.OR_FILE, "verifyYourEmailAddressOnMobile");
	
	public String get_Public_Mailinator_Inbox_Field() {
		return enterPublicMailinatorInboxField;	
	}
	
	public String get_Go_Button() {	
		return goButton;
	}
	
	public String get_Verify_Your_Email_Address() {
		return verifyYourEmailAddress;
	}
	
	public String get_Verify_Your_Email_Address_On_Mobile() {
		return verifyYourEmailAddressOnMobile;
	}
}