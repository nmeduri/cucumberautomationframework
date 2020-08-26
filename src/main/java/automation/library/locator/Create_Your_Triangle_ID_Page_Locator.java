package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class Create_Your_Triangle_ID_Page_Locator {
	
	String createYourTriangleHeader = Property.getProperty(Constant.OR_FILE, "createYourTriangleHeader");
	
	
	public String get_Create_Your_Triangle_ID_Header() {
		
		return createYourTriangleHeader;
	}
}
