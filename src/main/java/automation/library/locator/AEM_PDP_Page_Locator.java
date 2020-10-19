package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_PDP_Page_Locator {
	
	
	String specificationsSection = Property.getProperty(Constant.OR_FILE, "specificationsSectionAuthor").replace("=", ",");
	String specificationsTitle = Property.getProperty(Constant.OR_FILE, "specificationsTitleAEM");
	String setNumberOfSpecifications = Property.getProperty(Constant.OR_FILE, "setNumberOfSpecifications");
	String viewMoreSpecificationsLabel = Property.getProperty(Constant.OR_FILE, "viewMoreSpecificationsLabel");
	String viewLessSpecificationsLabel = Property.getProperty(Constant.OR_FILE, "viewLessSpecificationsLabel");

    /**
	 * gets Locator - Specifications
	 * 
	 */
    
	public String getSpecificationsSection() {
		return specificationsSection;	
	}
	
	/**
	 * gets Locator - Specifications Title
	 * 
	 */
    
	public String getSpecificationsTitle() {
		return specificationsTitle;	
	}
	
	/**
	 * gets Locator - Set Number of Specifications
	 * 
	 */
    
	public String getSetNumberOfSpecifications() {
		return setNumberOfSpecifications;	
	}
	
	/**
	 * gets Locator - View More Specifications
	 * 
	 */
    
	public String getViewMoreSpecifications() {
		return viewMoreSpecificationsLabel;	
	}
	
	/**
	 * gets Locator - View Less Specifications
	 * 
	 */
    
	public String getViewLessSpecifications() {
		return viewLessSpecificationsLabel;	
	}
	
}
