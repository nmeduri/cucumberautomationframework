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
	String pageInformation = Property.getProperty(Constant.OR_FILE, "pageInformation");
	String publishPage = Property.getProperty(Constant.OR_FILE, "publishPage");
	String publishButton = Property.getProperty(Constant.OR_FILE, "publishButton");
	String checkboxSelectAll = Property.getProperty(Constant.OR_FILE, "checkboxSelectAll");
	String preview = Property.getProperty(Constant.OR_FILE, "preview");
	String previewButton =  Property.getProperty(Constant.OR_FILE, "previewButton");
	String editButton =  Property.getProperty(Constant.OR_FILE, "editButton");
	String userLoggedIn = Property.getProperty(Constant.OR_FILE, "userLoggedIn");

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
	
	 /**
		 * gets Locator - Arrow Icon Sign In
		 * 
		 */
	    
		public String get_Page_Information() {
			return pageInformation;	
		}
		
		/**
		 * gets Locator - AEM Username
		 * 
		 */
	    
		public String get_Publish_Page() {
			return publishPage;	
		}
		
		/**
		 * gets Locator - AEM Password
		 * 
		 */
	    
		public String get_Publish_Button() {
			return publishButton;	
		}
		
		/**
		 * gets Locator - AEM Sign In Button
		 * 
		 */
	    
		public String get_SelectAll_Checkbox() {
			return checkboxSelectAll;	
		}
		
		/**
		 * gets Locator - close button
		 * 
		 */
	    
		public String get_Preview() {
			return preview;	
		}
		
	/**
	 * get Locator - Preview Button
	 * 
	 */
	public String getPreviewButton() {
		return previewButton;
	}
	
	/**
	 * get Locator - Edit Button
	 * 
	 */
	public String getEditButton() {
		return editButton;
	}
	
	/**
	 * get Locator - User Logged In Icon
	 */
	public String getUserLoggedInIcon() {
		return userLoggedIn;
	}
}
