package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.managers.FileReaderManager;


/**
 * This class contains the locator of Customer Service Page
 * 
 */
public class Customer_Service_Page_Locator {

	String titleOfCustomerServicePage = Property.getProperty(Constant.OR_FILE, "titleOfCustomerServicePage");
	String descriptionOfCustomerServicePage = Property.getProperty(Constant.OR_FILE, "descriptionOfCustomerServicePage");
	String accordionsOfCustomerServicePage = Property.getProperty(Constant.OR_FILE, "accordionsOfCustomerServicePage");
	String multipleTopicsOfCustomerServicePage = Property.getProperty(Constant.OR_FILE, "multipleTopicsOfCustomerServicePage");
	String sectionSeparators = Property.getProperty(Constant.OR_FILE, "sectionSeparators");
	String linksDescription = Property.getProperty(Constant.OR_FILE, "linksDescription");
	String linksTitle = Property.getProperty(Constant.OR_FILE, "linksTitle");
	String accordionPlusIcon=Property.getProperty(Constant.OR_FILE, "accordionPlusIcon");
	String accordionMinusIcon=Property.getProperty(Constant.OR_FILE, "accordionMinusIcon");
	String accordionSubtitle1=Property.getProperty(Constant.OR_FILE, "accordionSubtitle1");
	String accordionSubtitle2=Property.getProperty(Constant.OR_FILE, "accordionSubtitle2");
	String accordionDescription=Property.getProperty(Constant.OR_FILE, "accordionDescription");
	String clickwrench=Property.getProperty(Constant.OR_FILE, "configuredescription");
	String updateDescription=Property.getProperty(Constant.OR_FILE, "updateDescription");
	String assertDescriptionPublish=Property.getProperty(Constant.OR_FILE, "assertDescriptionPublish");
	
	/**
	 * gets Locator - Title Of Customer Service Page
	 * 
	 */
	
	public String get_Title_Customer_Service_Page() {
		return titleOfCustomerServicePage;
	}
	/**
	 * gets Locator - Sub Title1 Of accordion -Customer Service Page
	 * 
	 */
	
	public String get_Accordion_subtitleTitle1_Customer_Service_Page() {
		return accordionSubtitle1;
	}
	
	/**
	 * gets Locator - Description Of Customer Service Page
	 * 
	 */
	
	public String get_Description_Customer_Service_Page() {
		return descriptionOfCustomerServicePage;
	}
	/**
	 * gets Locator - Accordions Of Customer Service Page
	 * 
	 */
	
	public String get_Accordions_Customer_Service_Page() {
		return accordionsOfCustomerServicePage;
	}
	/**
	 * gets Locator - Multiple Topics Of Customer Service Page
	 * 
	 */
	
	public String get_Multiple_Topics_Customer_Service_Page() {
		return multipleTopicsOfCustomerServicePage;
	}
	
	/**
	 * gets Locator - Section Separators Of Customer Service Page
	 * 
	 */
	
	public String get_Section_Separators_Customer_Service_Page() {
		return sectionSeparators;
	}
	
	/**
	 * gets Locator - Links Description Of Customer Service Page
	 * 
	 */
	
	public String get_Links_Description() {
		return linksDescription;
	}
	
	/**
	 * gets Locator - Links Description Of Customer Service Page
	 * 
	 */
	
	public String get_Links_Title() {
		return linksTitle;
	}
	/**
	 * gets Locator - accordion plus icon
	 * 
	 */
	
	public String get_accordion_plus_icon() {
		return accordionPlusIcon;
	}
	/**
	 * gets Locator - accordion minus icon
	 * 
	 */
	
	public String get_accordion_minus_icon() {
		return accordionMinusIcon;
	}
	/**
	 * gets Locator - accordion description Of Customer Service Page
	 * 
	 */
	
	public String get_accordionDescription() {
		return accordionDescription;
	}
	
	/**
	 * gets Locator - click on edit configuraton
	 * 
	 */
	public String get_clickWrenchIcon() {
		return clickwrench;
	}
	
	/**
	 * gets Locator - click on edit Description
	 * 
	 */
	public String get_updateDescription() {
		return updateDescription;
	}
	
	/**
	 * gets Locator - assertDes
	 * 
	 */
	public String get_assertDescription() {
		return assertDescriptionPublish;
	}
}
