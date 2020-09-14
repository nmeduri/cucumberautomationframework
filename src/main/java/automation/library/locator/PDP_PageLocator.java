package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class PDP_PageLocator {
	
	String addToCartButton = Property.getProperty(Constant.OR_FILE, "addToCartButton");
	String warrantyUnderResource = Property.getProperty(Constant.OR_FILE, "warrantyUnderResource");
	String warrantyValue = Property.getProperty(Constant.OR_FILE, "warrantyValue");
	String specificationsSection = Property.getProperty(Constant.OR_FILE, "specificationsSection");
	String specificationsTitle = Property.getProperty(Constant.OR_FILE, "specificationsTitle");
	String specificationsInTabularFormat = Property.getProperty(Constant.OR_FILE, "specificationsInTabularFormat");
	String productTitleOnPDP = Property.getProperty(Constant.OR_FILE, "productTitleOnPDP");
	String returnPolicyUnderResource = Property.getProperty(Constant.OR_FILE, "returnPolicyUnderResource");
	String returnPolicyDescription = Property.getProperty(Constant.OR_FILE, "returnPolicyDescription");
	String returnPolicyLink = Property.getProperty(Constant.OR_FILE, "returnPolicyLink");
	String productCode = Property.getProperty(Constant.OR_FILE,  "productCode");
	String incrementQunatity = Property.getProperty(Constant.OR_FILE, "incrementQunatity");
	String decrementQuantity = Property.getProperty(Constant.OR_FILE, "decrementQuantity");
	String quantityBox = Property.getProperty(Constant.OR_FILE, "quantityBox");
	String decrementButtonDisabled = Property.getProperty(Constant.OR_FILE, "decrementButtonDisabled");
	String wishListButton = Property.getProperty(Constant.OR_FILE, "wishListButton");
	String errorMessageWishlist = Property.getProperty(Constant.OR_FILE, "errorMessageWishlist");
	String badgeInStoreClearnce = Property.getProperty(Constant.OR_FILE, "badgeInStoreClearnce");
	String badgeSelectStyleSize = Property.getProperty(Constant.OR_FILE, "badgeSelectStyleSize");
	String variantProduct = Property.getProperty(Constant.OR_FILE, "variantProduct");
	String disableSize = Property.getProperty(Constant.OR_FILE, "disableSize");
	String stickyAddToCart = Property.getProperty(Constant.OR_FILE, "stickyAddToCart");
	String featuresSection = Property.getProperty(Constant.OR_FILE, "featuresSection");
	String featuresBulletIcon = Property.getProperty(Constant.OR_FILE, "featuresBulletIcon");
	
	
	
	public String get_Add_To_Cart_Button() {
		
		return addToCartButton;
	}
	
	public String get_Warranty_Under_Resource() {
		
		return warrantyUnderResource;
	}
	
	public String get_Warranty_Value() {
		
		return warrantyValue;
		
	}
	
	public String get_Specifications_Section() {
		
		return specificationsSection;
		
	}
	
	public String get_Specifications_Title() {
		return specificationsTitle;
	}
	
	public String get_Specifications_In_Tabular_Format() {
		return specificationsInTabularFormat;
	}
	
	public String get_Product_Title() {
		return productTitleOnPDP;
	}
	
	public String get_Return_Policty_Under_Resource() {
		return returnPolicyUnderResource;
	}
	
	public String get_Return_Policy_Description() {
		return returnPolicyDescription;
	}
	
	public String get_Return_Policy_Link() {
		return returnPolicyLink;
	}
	
	public String get_Product_Code() {
		return productCode;
	}
	
	public String get_Select_Increment_Quantity() {
		return incrementQunatity;
	}
	
	public String get_Decrement_Quantity() {
		return decrementQuantity;
	}
	
	public String get_Quantity_Box() {
		return quantityBox;
	}
	
	public String get_Quantity_Decrement_Disabled() {
		return decrementButtonDisabled;
	}
	
	public String get_Wishlist_Button() {
		return wishListButton;
	}
	
	public String get_Error_Message_Wishlist() {
		return errorMessageWishlist;
	}
	
	public String get_Badge_In_Store_Clearnce() {
		return badgeInStoreClearnce;
	}
	
	public String get_Badge_Select_Style_Size() {
		return badgeSelectStyleSize;
	}
	
	public String get_Product_Variant() {
		return variantProduct;
	}
	
	public String get_Disable_Size() {
		return disableSize;
	}
	
	public String get_Sticky_Add_To_Cart() {
		return stickyAddToCart;
	}
	
	public String get_Features_Section() {
		return featuresSection;
	}
	
	public String get_Features_In_Bullet_List() {
		return featuresBulletIcon;
	}
	
 }
