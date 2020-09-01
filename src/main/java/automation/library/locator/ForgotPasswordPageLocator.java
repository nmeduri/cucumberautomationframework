package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class ForgotPasswordPageLocator {
	
	String headerForgotPasswordPage = Property.getProperty(Constant.OR_FILE, "headerForgotPasswordPage");
	
	public String get_Header_Forgot_Password_Page() {
		
		return headerForgotPasswordPage;
		
	}

}
