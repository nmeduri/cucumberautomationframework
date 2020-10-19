package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_PLP_Page_Locator {
	
	
	String plpPannel = Property.getProperty(Constant.OR_FILE, "plpPannel").replace("=", ",");
	String initialNumberOfProductCount = Property.getProperty(Constant.OR_FILE, "initialNumberOfProductCount");
	String showMoreProduct = Property.getProperty(Constant.OR_FILE, "showMoreProduct");
			

    /**
	 * gets Locator - Specifications
	 * 
	 */
    
	public String getPLPPannel() {
		return plpPannel;	
	}
	
	/**
	 * 
	 * gets Locator - Initial Number of Products
	 * 
	 */
	public String getInitialNumberOfProducts() {
		return initialNumberOfProductCount;
	}
	
	/**
	 * 
	 * gets Locator - Show More
	 */
	public String getShowMore() {
		return showMoreProduct;
	}
	
}
