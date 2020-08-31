package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Email_Sent_Confirmation_Page_Locator {
	
	
	String messageVerificationEmailSent = Property.getProperty(Constant.OR_FILE, "messageVerificationEmailSent");
	String resendVerificationEmail = Property.getProperty(Constant.OR_FILE, "resendVerificationEmail");
	String resendVerificationEmailSentMessage = Property.getProperty(Constant.OR_FILE, "resendVerificationEmailSentMessage");

	
	public String get_Message_Verification_Email_Sent() {
		
		return messageVerificationEmailSent;
		
	}
	
	public String get_Resend_EMail_Verification() {
		return resendVerificationEmail;
	}
	
	public String get_Resend_Verification_Email_Sent_Message() {
		return resendVerificationEmailSentMessage;
	}
}
