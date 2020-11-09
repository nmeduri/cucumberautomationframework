package automation.library.locator;


import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_Search_And_SRP_Page_Locator {
	
	
	String searchTitleAEM = Property.getProperty(Constant.OR_FILE, "searchTitleAEM").replace("=", ",");
	String autoCorrectiveSearchMessageField = Property.getProperty(Constant.OR_FILE, "autoCorrectiveSearchMessageField");
	String searchTitleField = Property.getProperty(Constant.OR_FILE, "searchTitleField");
	String resultLabelField = Property.getProperty(Constant.OR_FILE, "resultLabelField");
	String noResultTitleField = Property.getProperty(Constant.OR_FILE, "noResultTitleField");
	String similarResultTitleField = Property.getProperty(Constant.OR_FILE, "similarResultTitleField");
	String suggestiveMessage = Property.getProperty(Constant.OR_FILE, "suggestiveMessage");
	String searchResultThreshold = Property.getProperty(Constant.OR_FILE, "searchResultThreshold");
	String checkButton = Property.getProperty(Constant.OR_FILE, "checkButton");
	String searchBarField = Property.getProperty(Constant.OR_FILE, "searchBarField").replace("=", ",");
	String desktopPlaceHolderLabel = Property.getProperty(Constant.OR_FILE, "desktopPlaceHolderLabel");
	String searchLabelAEM = Property.getProperty(Constant.OR_FILE, "searchLabelAEM");
	String maxNumberSuggestionKeywords = Property.getProperty(Constant.OR_FILE, "maxNumberSuggestionKeywords");
	String maxNumberCategorySuggestion = Property.getProperty(Constant.OR_FILE, "maxNumberCategorySuggestion");
	String maxNumberProductSuggestion = Property.getProperty(Constant.OR_FILE, "maxNumberProductSuggestion");
	String suggestionsLabelAEM = Property.getProperty(Constant.OR_FILE, "suggestionsLabelAEM");
	String categoryLabelAEM = Property.getProperty(Constant.OR_FILE, "categoryLabelAEM");
	String productLabelAEM = Property.getProperty(Constant.OR_FILE, "productLabelAEM");
	String autoCompleteOnAEM = Property.getProperty(Constant.OR_FILE, "autoCompleteOnAEM");
	String autoCompleteOffAEM = Property.getProperty(Constant.OR_FILE, "autoCompleteOffAEM");

    /**
	 * gets Locator - Search Title
	 * 
	 */
    
	public String getSearchTitle() {
		return searchTitleAEM;	
	}
	
	/**
	 * gets Locator - Auto Corrective Search Message Field
	 */
	public String getAutoCorrectiveSearchMessage() {
		return autoCorrectiveSearchMessageField;
	}
	
	/**
	 * gets Locator - Search Title Field
	 */
	public String getSearchTitleField() {
		return searchTitleField;
	}
	
	/**
	 * gets Locator - Result Label Field
	 * 
	 */
	public String getResultLabelField() {
		return resultLabelField;
	}
	
	/**
	 * gets Locator - No Result Title Field
	 * 
	 */
	
	public String getNoResultTitleField() {
		return noResultTitleField;
	}
	
	/**
	 * gets Locator - Similar Result Title
	 * 
	 */
	public String getSimilarResultTitle() {
		return similarResultTitleField;
	}
	
	/**
	 * gets Locator - Suggestive Message
	 * 
	 */
	public String getSuggestiveMessage() {
		return suggestiveMessage;
	}
	
	/**
	 * gets Locator - Search Result Threshold
	 * 
	 */
	public String getSearchResultThreshold() {
		return searchResultThreshold;
	}
	
	/**
	 * gets Locator - Check Button
	 */
	public String getCheckButton() {
		return checkButton;
	}
	

	/**
	 * gets Locator - Search Bar
	 */
	public String getSearchBar() {
		return searchBarField;
	}
	
	/**
	 * get Locator - Desktop Place Holder
	 */
	public String getDesktopPlaceHolder() {
		return desktopPlaceHolderLabel;
	}
	
	/**
	 * get Locator - Search Label
	 * 
	 */
	public String getSearchLabel() {
		return searchLabelAEM;
	}
	
	/**
	 * get Locator - Suggestion keyword
	 */
	public String getSuggestionKeyword() {
		return maxNumberSuggestionKeywords;
	}
	
	/**
	 * get Locator - Category Keyword
	 */
	public String getCategoryKeyword() {
		return maxNumberCategorySuggestion;
	}
	
	/**
	 * get Locator - Product Suggestion Keyword
	 */
	public String getProductSuggestionKeyword() {
		return maxNumberProductSuggestion;
	}
	
	/**
	 * get Locator - Suggestion label
	 */
	public String getSuggestionLabel() {
		return suggestionsLabelAEM;
	}
	
	/**
	 * get Locator - Category Label
	 */
	public String getCategoryLabel() {
		return categoryLabelAEM;
	}
	
	/**
	 * get Locator - Product Label
	 */
	public String getProductLabel() {
		return productLabelAEM;
	}
	
	/**
	 * get Locator - Auto Complete ON
	 */
	public String getAutoCompleteON() {
		return autoCompleteOnAEM;
	}
	
	/**
	 * get Locator - Auto Complete OFF
	 */
	public String getAutoCompleteOff() {
		return autoCompleteOffAEM;
	}
}
