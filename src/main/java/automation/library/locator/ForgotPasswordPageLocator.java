package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class ForgotPasswordPageLocator {
	
	String headerForgotPasswordPage = Property.getProperty(Constant.OR_FILE, "headerForgotPasswordPage");
	String backToSignIn = Property.getProperty(Constant.OR_FILE, "backToSignIn");
	String emailForgotPassword = Property.getProperty(Constant.OR_FILE, "emailForgotPassword");
	String sendButton = Property.getProperty(Constant.OR_FILE, "sendButton");
	String invalidForgotPasswordEmailMessage = Property.getProperty(Constant.OR_FILE, "invalidForgotPasswordEmailMessage");
	
	public String get_Header_Forgot_Password_Page() {
		
		return headerForgotPasswordPage;
		
	}
	
	public String get_Back_To_Sign_In() {
		return backToSignIn;
	}
	
	public String get_Email_Forgot_Password() {
		return emailForgotPassword;
	}
	
	public String get_Send_Button() {
		return  sendButton;
	}
	
	public String get_Invalid_Forgot_Password_Email_Message() {
		return invalidForgotPasswordEmailMessage;
	}

}
