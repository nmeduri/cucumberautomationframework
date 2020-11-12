package automation.library.locator;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM Two Featured Tiles Component Page Locator
 * 
 */
public class AEM_Two_Featured_Tiles_Component_Page_Locator {

	String TwoFeaturedTileComponentAEM = Property.getProperty(Constant.OR_FILE, "TwoFeturedTileComponentAEM");
	String componentTitleAEM = Property.getProperty(Constant.OR_FILE, "componentTitleAEM");
	String promotionImage = Property.getProperty(Constant.OR_FILE, "promotionImage");
	String LayOutAEM = Property.getProperty(Constant.OR_FILE, "LayOutAEM");
    String Tile1=Property.getProperty(Constant.OR_FILE, "Tile1");
	
    /**
	 * gets Locator - AEM Two Featured Tile Component Component
	 * 
	 */
    
	public String get_TwoFeaturedTile_Component_AEM() {
		return TwoFeaturedTileComponentAEM;	
	}
	/**
	 * gets Locator - AEM component Title-TwoFeaturedTile
	 * 
	 */
    
	public String get_TwoFeaturedTile_ComponentTitle_AEM() {
		return componentTitleAEM;	
	}
	/**
	 * gets Locator - AEM PromotionImage-TwoFeaturedTile
	 * 
	 */
    
	public String get_TwoFeaturedTile_promotionImage_AEM() {
		return promotionImage;	
	}
	/**
	 * gets Locator - AEM Layout-TwoFeaturedTile
	 * 
	 */
    
	public String get_TwoFeaturedTile_LayOut_AEM() {
		return LayOutAEM;	
	}
	/**
	 * gets Locator - AEM Tile1 Tab Component
	 * 
	 */
    
	public String get_Tile1_Tab_Component_AEM() {
		return Tile1;	
	}
}