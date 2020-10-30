
package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * This class contains the locator of Create Your Triangle ID Page
 * 
 */

public class Create_Your_Triangle_ID_Page_Locator {
	
	String createYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeader");
	String emailField = Property.getProperty(Constant.OR_FILE, "emailField");
	String passwordField = Property.getProperty(Constant.OR_FILE, "passwordField");
	String retypePasswordField = Property.getProperty(Constant.OR_FILE, "retypePasswordField");
	String inlineErrorMessagePasswordDoNotMatch = Property.getProperty(Constant.OR_FILE, "inlineErrorMessagePasswordDoNotMatch");
	String createButton = Property.getProperty(Constant.OR_FILE, "createButton");
	String nextButton = Property.getProperty(Constant.OR_FILE, "nextButton");
	String errorMessageInvalidEmail = Property.getProperty(Constant.OR_FILE, "errorMessageInvalidEmail");
	String thisFieldIsRequired = Property.getProperty(Constant.OR_FILE, "thisFieldIsRequired");
	String signInOption = Property.getProperty(Constant.OR_FILE, "signInOption");
	String messagePasswordDoNotMatch = Property.getProperty(Constant.OR_FILE, "messagePasswordDoNotMatch");
	String privacyCharter = Property.getProperty(Constant.OR_FILE, "privacyCharter");
	String resendEmailCreateUser = Property.getProperty(Constant.OR_FILE, "resendEmailCreateUser");
	String joinNow = Property.getProperty(Constant.OR_FILE, "joinNow");
	String invalidLoginPassword = Property.getProperty(Constant.OR_FILE, "invalidLoginPassword");
	String createYourTriangleHeaderFr = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeaderFr");
	
	/**
	 * gets Locator - Create Your Triangle ID Header
	 * 
	 */
	public String get_Create_Your_Triangle_ID_Header() {
		
		return createYourTriangleHeader;
	}
	
	/**
	 * gets Locator - Email Field
	 * 
	 */
	
	public String get_Email_Field() {
		
		return emailField;
		
	}
	
	/**
	 * gets Locator - Password Field
	 * 
	 */
	
	public String get_Password_Field() {
	
		return passwordField;
		
	}
	
	/**
	 * gets Locator - Re-Type Password Field
	 * 
	 */
	
	public String get_Retype_Password_Field() {
		
		return retypePasswordField;
		
	}
	
	/**
	 * gets Locator -In Error Message (Password not matched)
	 * 
	 */
	
	public String get_Inline_Error_Message_Password_Do_Not_Match() {
		
		return inlineErrorMessagePasswordDoNotMatch;
	}
	
	/**
	 * gets Locator - Create Button
	 * 
	 */
	
	public String get_Create_Button() {
		
		return createButton;
		
	}
	
	/**
	 * gets Locator - Next Button
	 * 
	 */
	
	public String get_Next_Button() {
		
		return nextButton;
		
	}
	
	/**
	 * gets Locator - Error Message (Invalid Email)
	 * 
	 */
	
	public String get_Error_Message_Invalid_Email() {
		
		return errorMessageInvalidEmail;
		
	}
	
	/**
	 * gets Locator - In line error message (This Field is Required)
	 * 
	 */
	
	public String get_This_Field_Is_Required() {
		
		return thisFieldIsRequired;
		
	}
	
	/**
	 * gets Locator - Sign In Option
	 * 
	 */
	
	public String get_Sign_In_Option() {
		
		return signInOption;
		
	}
	
	/**
	 * gets Locator - Mesaage Password Do Not Match
	 * 
	 */
	
	public String get_Message_Password_Do_Not_Match() {
		
		return messagePasswordDoNotMatch;
		
	}
	
	/**
	 * gets Locator - Privacy Charter
	 * 
	 */
	
	public String get_Privacy_Charter() {
		return privacyCharter;
	}
	
	/**
	 * gets Locator - Resend Email Verification
	 * 
	 */
	
	public String get_Resend_Email_Verification() throws Exception {
		return resendEmailCreateUser;
	}
	
	/**
	 * gets Locator - Join Now
	 * 
	 */
	
	public String get_Join_Now() throws Exception {
		return joinNow;
	}
	
	/**
	 * gets Locator - Invalid Login Password
	 * 
	 */
	
	public String get_Invalid_Login_Password() throws Exception {
		return invalidLoginPassword;
	}
	
	/**
	 * gets Locator - Create Your Triangle header for Fr locale
	 * 
	 */
	
	public String get_Create_Your_Triangle_Header_Fr() throws Exception {
		return createYourTriangleHeaderFr;
	}
}
