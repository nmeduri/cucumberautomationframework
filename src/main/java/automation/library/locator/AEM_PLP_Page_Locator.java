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
	String showMoreCountField = Property.getProperty(Constant.OR_FILE, "showMoreCountField");
	String searchResponseCount = Property.getProperty(Constant.OR_FILE, "searchResponseCount");
	String paginationResultMessage = Property.getProperty(Constant.OR_FILE, "paginationResultMessage");
			
			

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
	
	/**
	 * 
	 * gets Locator - Show More Count Field
	 * 
	 */
	
	public String getShowMoreCountField() {
		return showMoreCountField;
	}
	
	/**
	 * 
	 * 
	 * get Locator - Search Response Count
	 */
	
	public String getSearchResponseCount() {
		return searchResponseCount;
	}
	
	/**
	 * 
	 * get Locator - Pagination Result Message
	 * 
	 */
	
	public String getPaginationResultMessage() {
		return paginationResultMessage;
	}
	
}
