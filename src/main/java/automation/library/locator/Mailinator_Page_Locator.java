package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class Mailinator_Page_Locator {
	
	
	String enterPublicMailinatorInboxField = Property.getProperty(Constant.OR_FILE, "enterPublicMailinatorInboxField");
	String goButton = Property.getProperty(Constant.OR_FILE, "goButton");
    String verifyYourEmailAddress = Property.getProperty(Constant.OR_FILE, "verifyYourEmailAddress");
    String verifyYourEmailAddressOnMobile = Property.getProperty(Constant.OR_FILE, "verifyYourEmailAddressOnMobile");
    String clickHereToVerifyEmail = Property.getProperty(Constant.OR_FILE, "clickHereToVerifyEmail");
    String gotItButton = Property.getProperty(Constant.OR_FILE, "gotItButton");
    String clickHere = Property.getProperty(Constant.OR_FILE, "clickHere");
    String clickHereMobile = Property.getProperty(Constant.OR_FILE, "clickHereMobile")  + Property.getProperty(Constant.OR_FILE, "clickHereMobileTwo");
	
    /**
	 * gets Locator - Public Mailinator Inbox Field
	 * 
	 */
    
	public String get_Public_Mailinator_Inbox_Field() {
		return enterPublicMailinatorInboxField;	
	}
	
	/**
	 * gets Locator - Go Button
	 * 
	 */
	
	public String get_Go_Button() {	
		return goButton;
	}
	
	/**
	 * gets Locator - Verify Your Email Addresss
	 * 
	 */
	
	public String get_Verify_Your_Email_Address() {
		return verifyYourEmailAddress;
	}
	
	/**
	 * gets Locator - Verify Your Email Address (Mobile)
	 * 
	 */
	
	public String get_Verify_Your_Email_Address_On_Mobile() {
		return verifyYourEmailAddressOnMobile;
	}
	
	/**
	 * gets Locator - Click Here to verify email
	 * 
	 */
	
	public String get_Click_Here_To_Verify_Email() {
		return clickHereToVerifyEmail;
	}
	
	/**
	 * gets Locator - Got Button
	 * 
	 */
	
	public String get_Got_Button() {
		return gotItButton;
	}
	
	/**
	 * gets Locator - Click Here
	 * 
	 */
	
	public String get_Click_Here() {
		return clickHere;
	}
	
	/**
	 * gets Locator - Click Here (Mobile)
	 * 
	 */
	
	public String get_Click_Here_Mobile() {
		return clickHereMobile;
	}
}
