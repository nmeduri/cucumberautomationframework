package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of two feature tile Page
 * 
 */
public class Two_Featured_Tile_Component_Page_Locator {
	
	
	String ShopByCategoryImg1 = Property.getProperty(Constant.OR_FILE, "ShopByCategoryImg1");
	String ShopByCategoryImg2 = Property.getProperty(Constant.OR_FILE, "ShopByCategoryImg2");
	String ShopByCollectionImg = Property.getProperty(Constant.OR_FILE, "ShopByCollectionImg3");
	String PromotionTitle1 = Property.getProperty(Constant.OR_FILE, "TwoFeaturetilesTitle1");
	String PromotionTitle2 = Property.getProperty(Constant.OR_FILE, "PromotionTitle2");
	String PromotionSubTitle = Property.getProperty(Constant.OR_FILE, "PromotionSubTitle");
	String CTABtn = Property.getProperty(Constant.OR_FILE, "CTABtn");
	
	/**
	 * gets Locator - ShopByCategory image1
	 * 
	 */
    
	public String get_ShopByCategoryImg1() {
		return ShopByCategoryImg1;	
	}
	/**
	 * gets Locator - ShopByCategory image2
	 * 
	 */
    
	public String get_ShopByCategoryImg2() {
		return ShopByCategoryImg2;	
	}
	/**
	 * gets Locator - ShopByCollection image
	 * 
	 */
    
	public String get_ShopByCollectionImg() {
		return ShopByCollectionImg;	
	}
	
	/**
	 * gets Locator - Promotion Title1
	 * 
	 */
    
	public String get_PromotionTitle1() {
		return PromotionTitle1;	
	}
	/**
	 * gets Locator - Promotion Title2
	 * 
	 */
    
	public String get_PromotionTitle2() {
		return PromotionTitle2;	
	}
	/**
	 * gets Locator - PromotionSubTitle
	 * 
	 */
    
	public String get_PromotionSubTitle() {
		return PromotionSubTitle;	
	}
	/**
	 * gets Locator - CTABtn
	 * 
	 */
    
	public String get_CTABtn() {
		return CTABtn;	
	}
}