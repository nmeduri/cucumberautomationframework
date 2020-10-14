package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_Common_Page_Locator {
	
	
	String arrowIconSign = Property.getProperty(Constant.OR_FILE, "arrowIconSign");
	String aemUserName = Property.getProperty(Constant.OR_FILE, "aemUserName");
	String aemPassword = Property.getProperty(Constant.OR_FILE, "aemPassword");
	String aemSignIn = Property.getProperty(Constant.OR_FILE, "aemSignIn");
	String closeButton = Property.getProperty(Constant.OR_FILE, "closeButton");
	String thumbnailSRP = Property.getProperty(Constant.OR_FILE, "thumbnailSRP");
	String editHeader = Property.getProperty(Constant.OR_FILE, "editHeader");
	String configureButton = Property.getProperty(Constant.OR_FILE, "configureButton").replace("=", ",");

    /**
	 * gets Locator - Arrow Icon Sign In
	 * 
	 */
    
	public String getArrowSignIn() {
		return arrowIconSign;	
	}
	
	/**
	 * gets Locator - AEM Username
	 * 
	 */
    
	public String getAEMUserName() {
		return aemUserName;	
	}
	
	/**
	 * gets Locator - AEM Password
	 * 
	 */
    
	public String getAEMPassword() {
		return aemPassword;	
	}
	
	/**
	 * gets Locator - AEM Sign In Button
	 * 
	 */
    
	public String getAEMSignInButton() {
		return aemSignIn;	
	}
	
	/**
	 * gets Locator - close button
	 * 
	 */
    
	public String getCloseButton() {
		return closeButton;	
	}
	
	/**
	 * gets Locator - thumbnailSRP
	 * 
	 */
	public String getThumbnailSRP() {
		return thumbnailSRP;
	}
	
	/**
	 * gets Locator - Edit Icon (Header)
	 */
	
	public String getEditIconHeader() {
		return editHeader;
	}
	
	/**
	 * get Locator - Configure Button
	 */
	public String getConfigureButton() {
		return configureButton;
	}
}
