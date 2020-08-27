package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Get_Personalized_Offers_Page_Locator {
	
	
	String nextButton = Property.getProperty(Constant.OR_FILE, "nextButton");

	
	public String get_Next_Button() {
		
		return nextButton;
		
	}
}
