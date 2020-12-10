package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of AEM payment information Page
 * 
 */

public class AEM_Account_Payment_Infromation_Page_Locator {

	String myAccountpaymentInfoComponent = Property.getProperty(Constant.OR_FILE, "myAccountpaymentInfoComponent");
	String pageTitle = Property.getProperty(Constant.OR_FILE, "pageTitle");
	String cardLabel = Property.getProperty(Constant.OR_FILE, "cardLabel");
	String noPaymentInfoTitle = Property.getProperty(Constant.OR_FILE, "noPaymentInfoTitle");
	String noPaymentInfoMessage = Property.getProperty(Constant.OR_FILE, "noPaymentInfoMessage");
	String toastBannerSuccessMessage = Property.getProperty(Constant.OR_FILE, "toastBannerSuccessMessage");
	String toastBannerErrorMessage = Property.getProperty(Constant.OR_FILE, "toastBannerErrorMessage");
	String continueShoppingCTA = Property.getProperty(Constant.OR_FILE, "continueShoppingCTA");
	String continueShoppingCTALink = Property.getProperty(Constant.OR_FILE, "continueShoppingCTALink");

	/**
	 * gets Locator - AEM myAccountpaymentInfoComponent
	 * 
	 */

	public String get_myAccountpaymentInfoComponent() {
		return myAccountpaymentInfoComponent;
	}
	/**
	 * gets Locator - AEM pageTitle
	 * 
	 */

	public String get_pageTitle() {
		return pageTitle;
	}
	/**
	 * gets Locator - AEM cardLabel
	 * 
	 */

	public String get_cardLabel() {
		return cardLabel;
	}
	/**
	 * gets Locator - AEM noPaymentInfoTitle
	 * 
	 */

	public String get_noPaymentInfoTitle() {
		return noPaymentInfoTitle;
	}
	/**
	 * gets Locator - AEM noPaymentInfoMessage
	 * 
	 */

	public String get_noPaymentInfoMessage() {
		return noPaymentInfoMessage;
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
	 * gets Locator - AEM continueShoppingCTA
	 * 
	 */

	public String get_continueShoppingCTA() {
		return continueShoppingCTA;
	}
	/**
	 * gets Locator - AEM continueShoppingCTALink
	 * 
	 */

	public String get_continueShoppingCTALink() {
		return continueShoppingCTALink;
	}
}
	

	