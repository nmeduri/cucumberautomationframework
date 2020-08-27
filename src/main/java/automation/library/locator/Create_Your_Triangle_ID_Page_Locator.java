package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Create_Your_Triangle_ID_Page_Locator {
	
	String createYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeader");
	String emailField = Property.getProperty(Constant.OR_FILE, "emailField");
	String passwordField = Property.getProperty(Constant.OR_FILE, "passwordField");
	String retypePasswordField = Property.getProperty(Constant.OR_FILE, "retypePasswordField");
	String inlineErrorMessagePasswordDoNotMatch = Property.getProperty(Constant.OR_FILE, "inlineErrorMessagePasswordDoNotMatch");
	String createButton = Property.getProperty(Constant.OR_FILE, "createButton");
	String nextButton = Property.getProperty(Constant.OR_FILE, "nextButton");
	
	
	public String get_Create_Your_Triangle_ID_Header() {
		
		return createYourTriangleHeader;
	}
	
	public String get_Email_Field() {
		
		return emailField;
		
	}
	
	public String get_Password_Field() {
	
		return passwordField;
		
	}
	
	public String get_Retype_Password_Field() {
		
		return retypePasswordField;
		
	}
	
	public String get_Inline_Error_Message_Password_Do_Not_Match() {
		
		return inlineErrorMessagePasswordDoNotMatch;
	}
	
	public String get_Create_Button() {
		
		return createButton;
		
	}
	
	public String get_Next_Button() {
		
		return nextButton;
		
	}
}
