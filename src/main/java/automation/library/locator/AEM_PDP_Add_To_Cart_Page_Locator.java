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
	
	/**
	 * gets Locator - Cart Fly out
	 * 
	 */
    
	public String get_CartFlyOut() {
		return CartFlyOut;	
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
	
	
}