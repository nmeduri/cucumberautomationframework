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
	String showMoreButtonAEM = Property.getProperty(Constant.OR_FILE, "showMoreButtonAEM");
	String endOfPaginationMessage = Property.getProperty(Constant.OR_FILE, "endOfPaginationMessage");
	String backToTopButtonLabelAEM = Property.getProperty(Constant.OR_FILE, "backToTopButtonLabelAEM");
	String hideOptionAEM = Property.getProperty(Constant.OR_FILE, "hideOptionAEM");
	String unhideOptionAEM = Property.getProperty(Constant.OR_FILE, "unhideOptionAEM");
	String sortingTab = Property.getProperty(Constant.OR_FILE, "sortingTab");	
	String productListViewOff = Property.getProperty(Constant.OR_FILE, "productListViewOff");
	String productListViewOn = Property.getProperty(Constant.OR_FILE, "productListViewOn");
	String featureHeaderLabelAEM = Property.getProperty(Constant.OR_FILE, "featureHeaderLabelAEM");
	String featureHeaderLabelPreview = Property.getProperty(Constant.OR_FILE, "featureHeaderLabelPreview");
			

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
	
	/**
	 * 
	 * get Locator - Show More Button
	 * 
	 */
	public String get_Show_More_Button() {
		return showMoreButtonAEM;
	}
	
	/**
	 * 
	 * get Locator - End of Pagination Message
	 * 
	 */
	public String getEndOfPaginationMessage() {
		return endOfPaginationMessage;
	}
	
	/**
	 * 
	 * get Locator - Back To Top Button
	 * 
	 */
	public String getBackToTopButton() {
		return backToTopButtonLabelAEM;
	}
	
	/**
	 * 
	 * get Locator - Hide Option (Sort By)
	 * 
	 */
	public String getHideOption() {
		return hideOptionAEM;
	}
	
	/**
	 * 
	 * get Locator - Unhide option (Sort By)
	 */
	public String getUnhideOption() {
		return unhideOptionAEM;
	}
	
	/**
	 * 
	 * get Locator - Sorting Tab
	 */
	public String getSortingTab() {
		return sortingTab;
	}
	
	/**
	 * get Locator - Product List View Off
	 */
	public String get_Product_List_View_Off() {
		return productListViewOff;
	}
	
	/**
	 * get Locator - Product List View On
	 */
	public String get_Product_List_View_On() {
		return productListViewOn;
	}
	
	/**
	 * get Locator - Feature Header Label
	 */
	public String get_Feature_Header_Label() {
		return featureHeaderLabelAEM;
	}
	
	/**
	 * get Locator - Feature Header Preview
	 */
	public String get_Feature_Header_Preview() {
		return featureHeaderLabelPreview;
	}
}
