package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Registration_Email_Verification_Locator {
	
	String createYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeader");
	
	
	public String get_Create_Your_Triangle_ID_Header() {
		
		return createYourTriangleHeader;
	}
}
