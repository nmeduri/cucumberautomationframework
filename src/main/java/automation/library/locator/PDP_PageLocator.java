package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class PDP_PageLocator {
	
	String addToCartButton = Property.getProperty(Constant.OR_FILE, "addToCartButton");
	
	
	public String get_Add_To_Cart_Button() {
		
		return addToCartButton;
	}

}
