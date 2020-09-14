package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Login_Page_Locator {
	
	String welcomeToYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "welcomeToYourTriangleHeader");
	String emailLoginPage = Property.getProperty(Constant.OR_FILE, "emailLoginPage");
	String signInButton = Property.getProperty(Constant.OR_FILE, "signInButton");
	String welcomeBackHeader = Property.getProperty(Constant.OR_FILE, "welcomeBackHeader");
	String storedEmail =  Property.getProperty(Constant.OR_FILE, "storedEmail");
	String switchAccountsButton = Property.getProperty(Constant.OR_FILE, "switchAccountsButton");
	String forgotPassword = Property.getProperty(Constant.OR_FILE, "forgotPassword");
	String inlineErrorMessageInvalidCredentials = Property.getProperty(Constant.OR_FILE, "inlineErrorMessageInvalidCredentials");
	String messageFieldRequired = Property.getProperty(Constant.OR_FILE, "messageFieldRequired");
	
	public String get_Welcome_To_Your_Triangle_Header() {
		
		return welcomeToYourTriangleHeader;
	}
	
	public String get_Email_Login_Page() {
		return emailLoginPage;
	}
	
	public String get_Sign_In_Button() {
		return signInButton;
	}
	
	public String get_Welecom_Back_Header() {
		return welcomeBackHeader;
	}
	
	public String get_Stored_Email() {
		return storedEmail;
	}
	
	public String get_Switch_Account_Button() {
		return switchAccountsButton;
	}
	
	public String get_Forgot_Password() {
		return forgotPassword;
	}
	
	public String get_Inline_Error_Message_Invalid_Credentials() {
		return inlineErrorMessageInvalidCredentials;
	}
	
	public String get_Message_Field_Required() {
		return messageFieldRequired;
	}
}
