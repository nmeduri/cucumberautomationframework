package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Checkout Page
 * 
 */
public class My_Account_Shopping_Preferences_Locator {

	String shoppingPreferencesPanel=Property.getProperty(Constant.OR_FILE, "shoppingPreferencesPanel").replace("=", ",");
	String shoppingPreferencesTitleAEM = Property.getProperty(Constant.OR_FILE, "shoppingPreferencesTitleAEM");
	String shoppingPreferencesTitle = Property.getProperty(Constant.OR_FILE, "shoppingPreferencesTitle");
	String noShoppingPreferencesMessageAEM = Property.getProperty(Constant.OR_FILE, "noShoppingPreferencesMessageAEM");
	String noShoppingPreferencesMessage = Property.getProperty(Constant.OR_FILE, "noShoppingPreferencesMessage");
	String editButtonLabelAEM = Property.getProperty(Constant.OR_FILE, "editButtonLabelAEM");
	String editButtonLabel = Property.getProperty(Constant.OR_FILE, "editButtonLabel");
	
	/**
	 * gets Locator - Shopping Preferences Panel
	 * 
	 */

	public String get_Shopping_Preferences_Panel() {
		return shoppingPreferencesPanel;	
	}
	
	/**
	 * gets Locator - Shopping Preferences Title
	 */
	public String get_Shopping_Preferences_Title_AEM() {
		return shoppingPreferencesTitleAEM;
	}
	
	/**
	 * gets Locator - Shopping Preferences Title
	 */
	public String get_Shopping_Preferences_Title() {
		return shoppingPreferencesTitle;
	}
	
	/**
	 * gets Locator - No Shopping Preferences Message AEM
	 */
	public String get_No_Shopping_Preferences_Message_AEM() {
		return noShoppingPreferencesMessageAEM;
	}
	
	/**
	 * gets Locator - No Shopping Preferences Message
	 */
	public String get_No_Shopping_Preferences_Message() {
		return noShoppingPreferencesMessage;
	}
	
	/**
	 * gets Locator - Edit Button Label
	 */
	public String get_Edit_Button_Label_AEM() {
		return editButtonLabelAEM;
	}
	
	/**
	 * gets Locator - Edit Button Label
	 */
	public String get_Edit_Button_Label() {
		return editButtonLabel;
	}
	
}

