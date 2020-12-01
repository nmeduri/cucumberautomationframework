package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * gets Locator - This file contains the Locator of Reset Your Password
 * 
 */

public class Reset_Your_Password_Page_Locator {
	
	
	String newPassword = Property.getProperty(Constant.OR_FILE, "newPassword");
	String retypeNewPassword = Property.getProperty(Constant.OR_FILE, "retypeNewPassword");
	String resetPasswordButton = Property.getProperty(Constant.OR_FILE, "resetPasswordButton");
	String signInButtonResetPasswordScreen = Property.getProperty(Constant.OR_FILE, "signInButtonResetPasswordScreen");
	String resetPasswordConfirmationScreen = Property.getProperty(Constant.OR_FILE, "resetPasswordConfirmationScreen");
	
	/**
	 * gets Locator - New Password
	 * 
	 */
	
	public String get_New_Password() {
		return newPassword;	
	}
	
	/**
	 * gets Locator - Re-Type New Password
	 * 
	 */
	
	public String get_Retype_New_Password() {
		return retypeNewPassword;
	}
	
	/**
	 * gets Locator - Reset Passsword Button
	 * 
	 */
	
	public String get_Reset_Password_Button() {
		return resetPasswordButton;
	}
	
	/**
	 * gets Locator - Sign In Button
	 * 
	 */
	
	public String get_Sign_In_Button() {
		return signInButtonResetPasswordScreen;
	}
	
	/**
	 * gets Locator - Reset Password Confirmation Title
	 * 
	 */
	
	public String get_Reset_Password_Confirmation_Title() {
		return resetPasswordConfirmationScreen;
	}
}
