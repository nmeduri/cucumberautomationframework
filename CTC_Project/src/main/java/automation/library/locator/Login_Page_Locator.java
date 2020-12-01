package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * This file contains the locator of Login Page
 * 
 */

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
	String linkRewards = Property.getProperty(Constant.OR_FILE, "linkRewards");
	String clearDataButton = Property.getProperty(Constant.OR_FILE, "clearDataButton");
	String loginPageLogo = Property.getProperty(Constant.OR_FILE, "loginPageLogo");
	String blueBackgroundColor = Property.getProperty(Constant.OR_FILE, "blueBackgroundColor");
	String verifyYourTriangleIdTitle = Property.getProperty(Constant.OR_FILE, "verifyYourTriangleIdTitle");
	String otpInput = Property.getProperty(Constant.OR_FILE, "otpInput");
	String verifyButton = Property.getProperty(Constant.OR_FILE, "verifyButton");
	String otpCode = Property.getProperty(Constant.OR_FILE, "otpCode");
	
	/**
	 * gets Locator - Header Get Welcome To Your Triangle
	 * 
	 */
	
	/**
	 * gets Locator - Header Get Welcome To Your Triangle
	 * 
	 */
	
	
	public String get_Welcome_To_Your_Triangle_Header() {
		
		return welcomeToYourTriangleHeader;
	}
	
	/**
	 * gets Locator - Email Login
	 * 
	 */
	
	public String get_Email_Login_Page() {
		return emailLoginPage;
	}
	
	/**
	 * gets Locator - Sign In Button
	 * 
	 */
	
	public String get_Sign_In_Button() {
		return signInButton;
	}
	
	/**
	 * gets Locator - Header Get Welcome Back Header
	 * 
	 */
	
	public String get_Welecom_Back_Header() {
		return welcomeBackHeader;
	}
	
	/**
	 * gets Locator - Stored Email
	 * 
	 */
	
	public String get_Stored_Email() {
		return storedEmail;
	}
	
	/**
	 * gets Locator - Switch Account Button
	 * 
	 */
	
	public String get_Switch_Account_Button() {
		return switchAccountsButton;
	}
	
	/**
	 * gets Locator - Forgot Password
	 * 
	 */
	
	public String get_Forgot_Password() {
		return forgotPassword;
	}
	
	/**
	 * gets Locator - Inline Error Message (Invalid Credentials)
	 * 
	 */
	
	public String get_Inline_Error_Message_Invalid_Credentials() {
		return inlineErrorMessageInvalidCredentials;
	}
	
	/**
	 * gets Locator - Get Message Field Required
	 * 
	 */
	
	public String get_Message_Field_Required() {
		return messageFieldRequired;
	}
	
	/**
	 * gets Locator - Get Link Rewards
	 * 
	 */
	
	public String get_Link_Rewards() {
		return linkRewards;
	}
	
	public String get_Clear_Data_Button() {
		return clearDataButton;
	}
	/**
	 * gets Locator - Get Login Page Logo
	 * 
	 */
	
	public String get_Login_Page_Logo() {
		return loginPageLogo;
	}
	/**
	 * gets Locator - Get Blue Background of Login page
	 * 
	 */
	
	public String get_Blue_Background() {
		return blueBackgroundColor;
	}
	
	/**
	 * gets Locator - Verify Title
	 * 
	 */
	
	public String get_Verify_Title() {
		return verifyYourTriangleIdTitle;
	}
	
	/**
	 * gets Locator - OTP Input
	 * 
	 */
	
	public String get_OTP_Input() {
		return otpInput;
	}
	
	/**
	 * gets Locator - Verify Button
	 * 
	 */
	
	public String get_Verify_Button() {
		return verifyButton;
	}
	
	/**
	 * gets Locator - get OTP code
	 */
	
	public String get_OTP_Code() {
		return otpCode;
	}
}
