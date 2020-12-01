package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of reward Page
 * 
 */

public class AEM_New_Rewards_Card_Screen_Page_Locator {
	
	String newRewardCardTitleAEM = Property.getProperty(Constant.OR_FILE, "newRewardCardTitleAEM");
	String errorScreenTab = Property.getProperty(Constant.OR_FILE, "errorScreenTab");
	String errorTextField = Property.getProperty(Constant.OR_FILE, "errorTextField");
	String tryAgainCTA = Property.getProperty(Constant.OR_FILE, "tryAgainCTA");
	String cancelCTA = Property.getProperty(Constant.OR_FILE, "cancelCTA");
	String errorImageAOM = Property.getProperty(Constant.OR_FILE, "errorImageAOM");
	String errorImageLabel = Property.getProperty(Constant.OR_FILE, "errorImageLabel");
	String getYear2002 = Property.getProperty(Constant.OR_FILE, "getYear2002");
	String getProvinceOntario = Property.getProperty(Constant.OR_FILE, "getProvinceOntario");
	String ageOfMaturityErrorText = Property.getProperty(Constant.OR_FILE, "ageOfMaturityErrorText");
	String ageOfMaturityErrorImage = Property.getProperty(Constant.OR_FILE, "ageOfMaturityErrorImage");
	
	/**
	 * gets Locator - New Rewards card title
	 * 
	 */
    
	public String get_new_Rewards_Card_Title() {
		return newRewardCardTitleAEM;	
	}
	
	/**
	 * gets Locator - Error Tab
	 * 
	 */
    
	public String get_Error_Screen_Tab() {
		return errorScreenTab;	
	}
	
	/**
	 * gets Locator - Error Text
	 * 
	 */
    
	public String get_Error_Text_Field() {
		return errorTextField;	
	}
	
	/**
	 * gets Locator - Try Again label
	 * 
	 */
    
	public String get_Try_Again_Label() {
		return tryAgainCTA;	
	}
	
	/**
	 * gets Locator - Cancel label
	 * 
	 */
    
	public String get_Cancel_Label() {
		return cancelCTA;	
	}
	
	/**
	 * gets Locator - Error Image
	 * 
	 */
    
	public String get_Error_Image_Field() {
		return errorImageAOM;	
	}
	
	/**
	 * gets Locator - Error Image label
	 * 
	 */
    
	public String get_Error_Image_Label() {
		return errorImageLabel;	
	}

	/**
	 * gets Locator - get year 2002
	 * 
	 */
    
	public String get_Year_2002() {
		return getYear2002;	
	}
	
	/**
	 * gets Locator - get province ontario
	 * 
	 */
    
	public String get_Province_Ontario() {
		return getProvinceOntario;	
	}
	
	/**
	 * gets Locator - Age of maturity error text
	 * 
	 */
    
	public String get_Age_Of_Maturity_Error_Text() {
		return ageOfMaturityErrorText;	
	}
	
	/**
	 * gets Locator - Age of maturity error image
	 * 
	 */
    
	public String get_Age_Of_Maturity_Error_Image() {
		return ageOfMaturityErrorImage;	
	}
}
