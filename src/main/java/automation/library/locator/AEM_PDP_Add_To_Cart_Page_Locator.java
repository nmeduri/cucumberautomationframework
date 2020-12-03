package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of AEM PDP Page
 * 
 */

public class AEM_PDP_Add_To_Cart_Page_Locator {
	
	String CartFlyOut = Property.getProperty(Constant.OR_FILE, "CartFlyOut");
	String AddtoCartTitleSingular = Property.getProperty(Constant.OR_FILE, "AddtoCartTitleSingular");
	String AddtoCartTitlePlural = Property.getProperty(Constant.OR_FILE, "AddtoCartTitlePlural");
	String ContinueToCart = Property.getProperty(Constant.OR_FILE, "ContinueToCart");
	String CartLink = Property.getProperty(Constant.OR_FILE, "CartLink");
	String ContinueShoppingCTA = Property.getProperty(Constant.OR_FILE, "ContinueShoppingCTA");
	String serviceAddOnLabel = Property.getProperty(Constant.OR_FILE, "serviceAddOnLabel");
	String serviceAddOnAvailableLabel = Property.getProperty(Constant.OR_FILE, "serviceAddOnAvailableLabel");
	String serviceAddOnMultipleAvailableLabel = Property.getProperty(Constant.OR_FILE, "serviceAddOnMultipleAvailableLabel");
	String addServiceToCartLabel = Property.getProperty(Constant.OR_FILE, "addServiceToCartLabel");
	String serviceAddOnNextSteps = Property.getProperty(Constant.OR_FILE, "serviceAddOnNextSteps");
	String serviceAddOnErrorMessage = Property.getProperty(Constant.OR_FILE, "serviceAddOnErrorMessage");
	String serviceAddOnIcon = Property.getProperty(Constant.OR_FILE, "serviceAddOnIcon");
	String serviceAddOnIconTool = Property.getProperty(Constant.OR_FILE, "serviceAddOnIconTool");
	String SeviceInstallationTab= Property.getProperty(Constant.OR_FILE, "SeviceInstallationTab");
	String ErrorMessage= Property.getProperty(Constant.OR_FILE, "ErrorMessage");
	String PostalTab= Property.getProperty(Constant.OR_FILE, "PostalTab");
	String contactus= Property.getProperty(Constant.OR_FILE, "contactus");
	String emailtitle= Property.getProperty(Constant.OR_FILE, "emailtitle");
	String emaillabel= Property.getProperty(Constant.OR_FILE, "emaillabel");
	String closecomp= Property.getProperty(Constant.OR_FILE, "closecomp");
	String twofeatured= Property.getProperty(Constant.OR_FILE, "twofeatured");
	
	
	/**
	 * gets Locator - Cart Fly out
	 * 
	 */
    
	public String get_CartFlyOut() {
		return CartFlyOut;	
	}
	/**
	 * gets Locator - Contact Us
	 * 
	 */
    
	public String get_ContactUs() {
		return contactus;	
	}
	
	/**
	 * gets Locator - Two Featured
	 * 
	 */
    
	public String get_TwoFeatured() {
		return twofeatured;	
	}
	
	/**
	 * gets Locator - Close
	 * 
	 */
    
	public String get_Close() {
		return closecomp;	
	}
	/**
	 * gets Locator - emailTitle
	 * 
	 */
	public String get_emailTitle() {
		return emailtitle;	
	}
	
	/**
	 * gets Locator - emailLabel
	 * 
	 */
	public String get_emailLabel() {
		return emaillabel;	
	}
	/**
	 * gets Locator -SeviceInstallationTab
	 * 
	 */
    
	public String get_SeviceInstallationTab() {
		return SeviceInstallationTab;	
	}
	/**
	 * gets Locator - AddtoCart Title Singular
	 * 
	 */
    
	public String get_AddtoCartTitle_Singular() {
		return AddtoCartTitleSingular;	
	}
	/**
	 * gets Locator - AddtoCart Title Plural
	 * 
	 */
    
	public String get_AddtoCartTitle_Plural() {
		return AddtoCartTitlePlural;	
	}
	/**
	 * gets Locator - Continue To Cart
	 * 
	 */
    
	public String get_ContinueToCart() {
		return ContinueToCart;	
	}
	/**
	 * gets Locator - Cart Link
	 * 
	 */
    
	public String get_CartLink() {
		return CartLink;	
	}
	/**
	 * gets Locator - Continue Shopping CTA
	 * 
	 */
    
	public String get_ContinueShopping_CTA() {
		return ContinueShoppingCTA;	
	}
	/**
	 * gets Locator - service AddOn Label
	 * 
	 */
    
	public String get_serviceAddOnLabel() {
		return serviceAddOnLabel;	
	}
	/**
	 * gets Locator - service AddOn Available Label
	 * 
	 */
    
	public String get_serviceAddOnAvailableLabel() {
		return serviceAddOnAvailableLabel;	
	}
	/**
	 * gets Locator - service AddOn Multiple Available Label
	 * 
	 */
    
	public String get_serviceAddOnMultipleAvailableLabel() {
		return serviceAddOnMultipleAvailableLabel;	
	}
	/**
	 * gets Locator - addServiceToCart Label
	 * 
	 */
    
	public String get_addServiceToCart_Label() {
		return addServiceToCartLabel;	
	}
	/**
	 * gets Locator - service AddOn Next Steps
	 * 
	 */
    
	public String get_serviceAddOnNextSteps() {
		return serviceAddOnNextSteps;	
	}
	/**
	 * gets Locator - serviceAddOn Error Message
	 * 
	 */
    
	public String get_serviceAddOnErrorMessage() {
		return serviceAddOnErrorMessage;	
	}
	/**
	 * gets Locator - service AddOn Icon
	 * 
	 */
    
	public String get_serviceAddOnIcon() {
		return serviceAddOnIcon;	
	}
	/**
	 * gets Locator - serviceAddOn Icon Tool
	 * 
	 */
    
	public String get_serviceAddOnIconTool() {
		return serviceAddOnIconTool;	
	}
	/**
	 * gets Locator - Error Message- cart page
	 * 
	 */
    
	public String get_Errormsg_cartpage() {
		return ErrorMessage;	
	}
	/**
	 * gets Locator -postal tab-cart page
	 * 
	 */
    
	public String get_postalTab() {
		return PostalTab;	
	}
	
}