package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Reset_Your_Password_Page_Locator {
	
	
	String newPassword = Property.getProperty(Constant.OR_FILE, "newPassword");
	String retypeNewPassword = Property.getProperty(Constant.OR_FILE, "retypeNewPassword");
	String resetPasswordButton = Property.getProperty(Constant.OR_FILE, "resetPasswordButton");
	String signInButtonResetPasswordScreen = Property.getProperty(Constant.OR_FILE, "signInButtonResetPasswordScreen");
	String resetPasswordConfirmationScreen = Property.getProperty(Constant.OR_FILE, "resetPasswordConfirmationScreen");
	
	public String get_New_Password() {
		return newPassword;	
	}
	
	public String get_Retype_New_Password() {
		return retypeNewPassword;
	}
	
	public String get_Reset_Password_Button() {
		return resetPasswordButton;
	}
	
	public String get_Sign_In_Button() {
		return signInButtonResetPasswordScreen;
	}
	
	public String get_Reset_Password_Confirmation_Title() {
		return resetPasswordConfirmationScreen;
	}
}
