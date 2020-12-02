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
	String facetsPanel = Property.getProperty(Constant.OR_FILE, "facetsPanel").replace("=", ",");		
	String facetTitleAEM = Property.getProperty(Constant.OR_FILE, "facetTitleAEM");
	String selectedLabelAEM = Property.getProperty(Constant.OR_FILE, "selectedLabelAEM");
	String premiumFiltersTab = Property.getProperty(Constant.OR_FILE, "premiumFiltersTab");
	String offShowInStockAtMyStoreAEM = Property.getProperty(Constant.OR_FILE, "offShowInStockAtMyStoreAEM");
	String onShowInStockAtMyStoreAEM = Property.getProperty(Constant.OR_FILE, "onShowInStockAtMyStoreAEM");
	String offShowSaleItemAEM = Property.getProperty(Constant.OR_FILE, "offShowSaleItemAEM");
	String onShowSaleItemAEM = Property.getProperty(Constant.OR_FILE, "onShowSaleItemAEM");
	String showInStockOptionAEM = Property.getProperty(Constant.OR_FILE, "showInStockOptionAEM");
	String enableRatingReviewsAEM = Property.getProperty(Constant.OR_FILE, "enableRatingReviewsAEM");
	String disableRatingReviewsAEM = Property.getProperty(Constant.OR_FILE, "disableRatingReviewsAEM");
	String nowLabelPriceAEM = Property.getProperty(Constant.OR_FILE, "nowLabelPriceAEM");
	String minPriceLabelAEM = Property.getProperty(Constant.OR_FILE, "minPriceLabelAEM");
	String maxPriceLabelAEM = Property.getProperty(Constant.OR_FILE, "maxPriceLabelAEM");
	String errorMessagePriceFacetAEM = Property.getProperty(Constant.OR_FILE, "errorMessagePriceFacetAEM");

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
	
	/**
	 * get Locator - Facet Panel
	 */
	public String get_Facet_Panel() {
		return facetsPanel;
	}
	
	/**
	 * get Locator - Facet Title
	 */
	public String get_Facet_Title() {
		return facetTitleAEM;
	}
	
	/**
	 * get Locator - Selected Label
	 */
	public String get_Selected_Label() {
		return selectedLabelAEM;
	}
	
	/**
	 * get Locator - Premium Filter
	 */
	public String get_Premium_Filter_Tab() {
		return premiumFiltersTab;
	}
	
	/**
	 * get Locator - Off show in  stock
	 */
	public String get_Off_Show_In_Stock() {
		return offShowInStockAtMyStoreAEM;
	}
	
	/**
	 * get Locator - On Show in stock
	 */
	public String get_On_Show_In_Stock() {
		return onShowInStockAtMyStoreAEM;
	}
	
	/**
	 * get Locator - Off sale item
	 */
	public String get_Off_Sale_Item() {
		return offShowSaleItemAEM;
	}
	
	/**
	 * get Locator - On sale item
	 */
	public String get_On_Sale_Item() {
		return onShowSaleItemAEM;
	}
	
	/**
	 * get Locator - Show in stock option
	 */
	public String getOptionInStock() {
		return showInStockOptionAEM;
	}
	
	/**
	 * get Locator - Enable Rating and Review
	 */
	public String getEnableRatingAndReview() {
		return enableRatingReviewsAEM;
	}
	
	/**
	 * get Locator - Disable Rating and Review
	 */
	public String getDisableRatingAndReview() {
		return disableRatingReviewsAEM;
	}
	
	/**
	 * get Locator - Now (Price Detail)
	 */
	public String getNowLabelPriceDetail() {
		return nowLabelPriceAEM;
	}
	
	/**
	 * gets Locator - Min Price Label
	 */
	public String getMinPriceLabel() {
		return minPriceLabelAEM;
	}
	
	/**
	 * gets Locator - Max Price Label
	 */
	public String getMaxPriceLabel() {
		return maxPriceLabelAEM;
	}
	
	/**
	 * gets Locator - Error Message Price Facet
	 */
	public String getErrorMessagePriceFacet() {
		return errorMessagePriceFacetAEM;
	}
}
