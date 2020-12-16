package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Checkout Page
 * 
 */
public class Checkout_Page_Locator {

	String brandLogo=Property.getProperty(Constant.OR_FILE, "brandLogo");
	String customerServiceContactNumber=Property.getProperty(Constant.OR_FILE, "customerServiceContactNumber");
	String siteLanguageSelector=Property.getProperty(Constant.OR_FILE, "siteLanguageSelector");
	String checkoutContactInfoPanel = Property.getProperty(Constant.OR_FILE, "checkoutContactInfoPanel").replace("=", ",");
	String contactInformationTab = Property.getProperty(Constant.OR_FILE, "contactInformationTab");
	String contactInformationTitleAEM = Property.getProperty(Constant.OR_FILE, "contactInformationTitleAEM");
	String contactInformationTitle = Property.getProperty(Constant.OR_FILE, "contactInformationTitle");
	String emailAddressFieldTitleAEM = Property.getProperty(Constant.OR_FILE, "emailAddressFieldTitleAEM");
	String phoneNumberFieldTitleAEM = Property.getProperty(Constant.OR_FILE, "phoneNumberFieldTitleAEM");
	String emailFieldCheckout = Property.getProperty(Constant.OR_FILE, "emailFieldCheckout");
    String phoneFieldCheckout = Property.getProperty(Constant.OR_FILE, "phoneFieldCheckout");
    String nextCTAButtonCheckoutAEM = Property.getProperty(Constant.OR_FILE, "nextCTAButtonCheckoutAEM");
    String nextButtonCheckout = Property.getProperty(Constant.OR_FILE, "nextButtonCheckout");
    String toolTipMessageCheckoutAEM = Property.getProperty(Constant.OR_FILE, "toolTipMessageCheckoutAEM");
    String toolTipButtonCheckout = Property.getProperty(Constant.OR_FILE, "toolTipButtonCheckout");
    String toolTipMessageCheckout = Property.getProperty(Constant.OR_FILE, "toolTipMessageCheckout");
	
	/**
	 * gets Locator - Brand Logo
	 * 
	 */

	public String get_Brand_Logo() {
		return brandLogo;	
	}
	/**
	 * gets Locator - Customer Service Contact Number
	 * 
	 */

	public String get_Customer_Service_Contact_Number() {
		return customerServiceContactNumber;	
	}
	/**
	 * gets Locator - Site Language Selector
	 * 
	 */

	public String get_Site_Language_Selector() {
		return siteLanguageSelector;	
	}
	
	/**
	 * gets Locator - Checkout contact info Panel
	 */

	public String get_Checkout_Contact_Info_Panel() {
		return checkoutContactInfoPanel;
	}
	
	/**
	 * gets Locator - Contact Information Tab
	 */
	public String get_Contact_Information_Tab() {
		return contactInformationTab;
	}
	
	/**
	 * gets Locator - Contact Information Title (AEM)
	 */
	public String get_Contact_Information_Title_AEM() {
		return contactInformationTitleAEM;
	}
	
	/**
	 * gets Locator - Contact Information Title
	 */
	public String get_Contact_Information_Title() {
		return contactInformationTitle;
	}
	
	/**
	 * gets Locator - Email Field Title 
	 * 
	 */
	public String get_Email_Field_Title_AEM() {
		return emailAddressFieldTitleAEM;
	}
	
	/**
	 * gets Locator - Phone Number Field Title
	 */
	public String get_Phone_Number_Field_Title_AEM() {
		return phoneNumberFieldTitleAEM;
	}
	
	/**
	 * gets Locator - Email Field
	 */
	public String get_Email_Field() {
		return emailFieldCheckout;
	}
	
	/** gets Locator - Phone Number Field */
	public String get_Phone_Number_Field() {
		return phoneFieldCheckout;
	}
	
	/**
	 * gets Locator - Next Button (AEM)
	 */
	public String get_Next_Button_AEM() {
		return nextCTAButtonCheckoutAEM;
	}
	
	/**
	 * gets Locator - Next Button
	 */
	
	public String get_Next_Button() {
		return nextButtonCheckout;
	}
	
	/**
	 * gets Locator - Tool Tip Message Field
	 */
	public String get_Tool_Tip_Message_AEM() {
		return toolTipMessageCheckoutAEM;
	}
	
	/**
	 * gets Locator - Tool Tip Button
	 */
	public String get_Tool_Tip_Button() {
		return toolTipButtonCheckout;
	}
	
	/**
	 * gets Locator - Tool Tip Message
	 */
	public String get_Tool_Tip_Message() {
		return toolTipMessageCheckout;
	}
	
}

