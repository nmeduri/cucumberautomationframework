package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of AEM payment information Page
 * 
 */

public class AEM_Account_Profile_Page_Locator {

	String MyAccountProfilecomponent = Property.getProperty(Constant.OR_FILE, "MyAccountProfilecomponent");
	String firstnamelabel = Property.getProperty(Constant.OR_FILE, "firstnamelabel");
	String lastNameLabel = Property.getProperty(Constant.OR_FILE, "accntlastNameLabel");
	String emailLabel = Property.getProperty(Constant.OR_FILE, "accntemailLabel");
	String yearOfBirthLabel = Property.getProperty(Constant.OR_FILE, "accntyearOfBirthLabel");
	String monthLabel = Property.getProperty(Constant.OR_FILE, "accntmonthLabel");
	String dateLabel = Property.getProperty(Constant.OR_FILE, "accntdateLabel");
	String phoneLabel = Property.getProperty(Constant.OR_FILE, "accntphoneLabel");
	String securityHintText = Property.getProperty(Constant.OR_FILE, "accntsecurityHintText");
	String passwordLabel = Property.getProperty(Constant.OR_FILE, "accntpasswordLabel");
	String toastBannerSuccessMessage = Property.getProperty(Constant.OR_FILE, "accnttoastBannerSuccessMessage");
	String toastBannerErrorMessage = Property.getProperty(Constant.OR_FILE, "accnttoastBannerErrorMessage");
	
	String modalsaveChangesTitle = Property.getProperty(Constant.OR_FILE, "modalsaveChangesTitle");
	String modalsaveChangesDesc = Property.getProperty(Constant.OR_FILE, "modalsaveChangesDesc");
	String yesCTA = Property.getProperty(Constant.OR_FILE, "yesCTA");
	String noCTA = Property.getProperty(Constant.OR_FILE, "noCTA");
	
	/**
	 * gets Locator - AEM MyAccountProfilecomponent
	 * 
	 */

	public String get_MyAccountProfilecomponent() {
		return MyAccountProfilecomponent;
	}
	/**
	 * gets Locator - AEM firstnamelabel
	 * 
	 */

	public String get_firstnamelabel() {
		return firstnamelabel;
	}
	/**
	 * gets Locator - AEM lastNameLabel
	 * 
	 */

	public String get_lastNameLabel() {
		return lastNameLabel;
	}
	/**
	 * gets Locator - AEM emailLabel
	 * 
	 */

	public String get_emailLabel() {
		return emailLabel;
	}
	/**
	 * gets Locator - AEM yearOfBirthLabel
	 * 
	 */

	public String get_yearOfBirthLabel() {
		return yearOfBirthLabel;
	}
	/**
	 * gets Locator - AEM monthLabel
	 * 
	 */

	public String get_monthLabel() {
		return monthLabel;
	}
	/**
	 * gets Locator - AEM dateLabel
	 * 
	 */

	public String get_dateLabel() {
		return dateLabel;
	}
	/**
	 * gets Locator - AEM phoneLabel
	 * 
	 */

	public String get_phoneLabel() {
		return phoneLabel;
	}
	/**
	 * gets Locator - AEM securityHintText
	 * 
	 */

	public String get_securityHintText() {
		return securityHintText;
	}
	/**
	 * gets Locator - AEM passwordLabel
	 * 
	 */

	public String get_passwordLabel() {
		return passwordLabel;
	}
	/**
	 * gets Locator - AEM toastBannerSuccessMessage
	 * 
	 */

	public String get_toastBannerSuccessMessage() {
		return toastBannerSuccessMessage;
	}
	/**
	 * gets Locator - AEM toastBannerErrorMessage
	 * 
	 */

	public String get_toastBannerErrorMessage() {
		return toastBannerErrorMessage;
	}
	/**
	 * gets Locator - AEM modal saveChangesTitle
	 * 
	 */

	public String get_modalsaveChangesTitle() {
		return modalsaveChangesTitle;
	}
	/**
	 * gets Locator - AEM modal saveChangesDesc
	 * 
	 */

	public String get_modalsaveChangesDesc() {
		return modalsaveChangesDesc;
	}
	/**
	 * gets Locator - AEM yesCTA modal
	 * 
	 */

	public String get_yesCTA() {
		return yesCTA;
	}
	/**
	 * gets Locator - AEM noCTA modal
	 * 
	 */

	public String get_noCTA() {
		return noCTA;
	}
	
}
	