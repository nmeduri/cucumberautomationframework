package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the Locator of PDP_Add to cart Page
 * 
 */
public class PDP_AddToCart_Page_Locator {
	
	String ColorVariant = Property.getProperty(Constant.OR_FILE, "ColorVariant");
	String Size8 = Property.getProperty(Constant.OR_FILE, "Size8");
	String AssembledLength = Property.getProperty(Constant.OR_FILE, "AssembledLength");
	String QuantityPlus = Property.getProperty(Constant.OR_FILE, "Quantity+");
	String QuantityMinus = Property.getProperty(Constant.OR_FILE, "Quantity-");
	String CarryOn = Property.getProperty(Constant.OR_FILE, "CarryOn");
	String serviceAddOnAvailableBox = Property.getProperty(Constant.OR_FILE, "serviceAddOnAvailableBox");
	String serviceDescription = Property.getProperty(Constant.OR_FILE, "serviceDescription");
	String AddServiceToCart_CTA = Property.getProperty(Constant.OR_FILE, "AddServiceToCart_CTA");
	String ServicePrice = Property.getProperty(Constant.OR_FILE, "ServicePrice");
	String AddToCartFlyOut = Property.getProperty(Constant.OR_FILE, "AddToCartFlyOut");
	String errorMsg_AddToService = Property.getProperty(Constant.OR_FILE, "errorMsg_AddToService");
	String ServiceExpandSign=Property.getProperty(Constant.OR_FILE, "SeviceExpandSign");
	String ServiceCollapseSign=Property.getProperty(Constant.OR_FILE, "SeviceCollapseSign");
	String ServiceAddOnMessage=Property.getProperty(Constant.OR_FILE, "ServiceAddOnMessage");
	String ServiceAddonOptions=Property.getProperty(Constant.OR_FILE, "ServiceAddonOption");
	String ContinuetoCartCTA=Property.getProperty(Constant.OR_FILE, "ContinuetoCartCTA");
	String AddToCartTitle=Property.getProperty(Constant.OR_FILE, "AddToCartTitle");
	String nextStepText=Property.getProperty(Constant.OR_FILE, "nextStepText");
	String CartQuantity=Property.getProperty(Constant.OR_FILE, "CartQuantity");

	/**
	 * gets Locator - Service Expand Sign
	 * 
	 */
	
	public String get_ServiceExpandSign() {
		
		return ServiceExpandSign;
	}
	/**
	 * gets Locator - CartQuantity
	 * 
	 */
	
	public String get_CartQuantity() {
		
		return CartQuantity;
	}
	/**
	 * gets Locator - Success text
	 * 
	 */
	
	public String get_nextStepText() {
		
		return nextStepText;
	}
	/**
	 * gets Locator - AddToCart Title
	 * 
	 */
	
	public String get_AddToCartTitle() {
		
		return AddToCartTitle;
	}
	/**
	 * gets Locator - Continue to Cart CTA
	 * 
	 */
	
	public String get_ContinuetoCartCTA() {
		
		return ContinuetoCartCTA;
	}
	/**
	 * gets Locator - Service Collapse Sign
	 * 
	 */
	
	public String get_ServiceCollapseSign() {
		
		return ServiceCollapseSign;
	}
	/**
	 * gets Locator - Color Variant
	 * 
	 */
	
	public String get_ColorVariant() {
		
		return ColorVariant;
	}
	/**
	 * gets Locator - Size 8
	 * 
	 */
	
	public String get_Size() {
		
		return Size8;
	}
	/**
	 * gets Locator - Assembled Length
	 * 
	 */
	
	public String get_AssembledLength() {
		
		return AssembledLength;
	}
	/**
	 * gets Locator - Quantity Plus sign
	 * 
	 */
	
	public String get_QuantityPlus() {
		
		return QuantityPlus;
	}
	/**
	 * gets Locator - Quantity minus sign
	 * 
	 */
	
	public String get_QuantityMinus() {
		
		return QuantityMinus;
	}
	/**
	 * gets Locator - CarryOn
	 * 
	 */
	
	public String get_CarryOn_btn() {
		
		return CarryOn;
	}
	/**
	 * gets Locator - serviceAddOn Available Box
	 * 
	 */
	
	public String get_serviceAddOnAvailableBox() {
		
		return serviceAddOnAvailableBox;
	}
	/**
	 * gets Locator - service Description
	 * 
	 */
	
	public String get_serviceDescription() {
		
		return serviceDescription;
	}
	/**
	 * gets Locator - AddServiceToCart link
	 * 
	 */
	
	public String get_AddServiceToCart_CTA() {
		
		return AddServiceToCart_CTA;
	}
	/**
	 * gets Locator - Service Price
	 * 
	 */
	
	public String get_ServicePrice() {
		
		return ServicePrice;
	}
	/**
	 * gets Locator - AddtoCart Page
	 * 
	 */
	
	public String get_ATCPage() {
		
		return AddToCartFlyOut;
	}
	/**
	 * gets Locator - AddtoService Error
	 * 
	 */
	
	public String get_Error_AddToService() {
		
		return errorMsg_AddToService;
	}
	/**
	 * gets Locator - Service Add-on message
	 * 
	 */
	
	public String get_ServiceAddOnMessage() {
		
		return ServiceAddOnMessage;
	}
	/**
	 * gets Locator - Service Add-on Options
	 * 
	 */
	
	public String get_ServiceAddonOptions() {
		
		return ServiceAddonOptions;
	}
	
}