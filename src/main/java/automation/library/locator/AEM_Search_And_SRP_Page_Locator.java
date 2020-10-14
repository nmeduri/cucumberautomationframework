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
	
}
