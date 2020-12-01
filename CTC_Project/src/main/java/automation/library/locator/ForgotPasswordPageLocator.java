
package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the lcoator of Forgot Password Page
 * 
 */
public class ForgotPasswordPageLocator {
	
	String headerForgotPasswordPage = Property.getProperty(Constant.OR_FILE, "headerForgotPasswordPage");
	String backToSignIn = Property.getProperty(Constant.OR_FILE, "backToSignIn");
	String emailForgotPassword = Property.getProperty(Constant.OR_FILE, "emailForgotPassword");
	String sendButton = Property.getProperty(Constant.OR_FILE, "sendButton");
	String invalidForgotPasswordEmailMessage = Property.getProperty(Constant.OR_FILE, "invalidForgotPasswordEmailMessage");
	String resendPasswordLink = Property.getProperty(Constant.OR_FILE, "resendPasswordLink");
	String resetPasswordEmailSent = Property.getProperty(Constant.OR_FILE, "resetPasswordEmailSent");
	String verificationEmailSent = Property.getProperty(Constant.OR_FILE, "verificationEmailSent");
	
	/**
	 * gets Locator - Header Forgot Password Page
	 * 
	 */
	
	public String get_Header_Forgot_Password_Page() {
		
		return headerForgotPasswordPage;
		
	}
	
	/**
	 * gets Locator - Back To Sign In
	 * 
	 */
	
	public String get_Back_To_Sign_In() {
		return backToSignIn;
	}
	
	/**
	 * gets Locator - Email Forgot Password
	 * 
	 */
	
	public String get_Email_Forgot_Password() {
		return emailForgotPassword;
	}
	
	/**
	 * gets Locator - Send Button
	 * 
	 */
	
	public String get_Send_Button() {
		return  sendButton;
	}
	
	/**
	 * gets Locator - Invalid Forgot Password Message
	 * 
	 */
	
	public String get_Invalid_Forgot_Password_Email_Message() {
		return invalidForgotPasswordEmailMessage;
	}
	
	/**
	 * gets Locator - Resend Password Link
	 * 
	 */
	
	public String get_Resend_Password_Link() throws Exception {
		return resendPasswordLink;
	}
	
	/**
	 * gets Locator - Reset Password Email
	 * 
	 */
	
	public String get_Reset_Password_Email_Sent() throws Exception {
		return resetPasswordEmailSent;
	}
	/**
	 * gets Locator - Verification Email Sent
	 * 
	 */
	public String get_Verification_Password_Link() throws Exception {
		return verificationEmailSent;
	}

}
