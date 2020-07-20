package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class HomePageLocator {
	
	String sAutomative = Property.getProperty(Constant.OR_FILE, "automative");
	
	String sArrow = Property.getProperty(Constant.OR_FILE, "arrow");
	
	String sMenuIcon = Property.getProperty(Constant.OR_FILE, "menuIcon");
	
	
	public String getAutomativeLocator() {
		
		return sAutomative;
	}
	
	public String getArrow() {
		
		return sArrow;
		
	}
	
	public String getMenuIcon() {
		return sMenuIcon;
	}

}
