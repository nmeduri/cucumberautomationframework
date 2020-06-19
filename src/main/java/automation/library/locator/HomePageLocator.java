package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class HomePageLocator {
	
	String sAutomative = Property.getProperty(Constant.OR_FILE, "automative");
	
	
	public String getAutomativeLocator() {
		
		return sAutomative;
	}

}
