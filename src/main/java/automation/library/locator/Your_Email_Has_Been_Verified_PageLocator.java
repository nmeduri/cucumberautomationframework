package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class Your_Email_Has_Been_Verified_PageLocator {
	
	String yourEmailHasBeenVerified = Property.getProperty(Constant.OR_FILE, "yourEmailHasBeenVerified");
	
	
	public String get_Your_Email_Has_Been_Verified() {
		
		return yourEmailHasBeenVerified;
	}
	
}
