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
	String getItInstalled = Property.getProperty(Constant.OR_FILE, "getItInstalled");
	String messageAvailableAtCheck = Property.getProperty(Constant.OR_FILE, "messageAvailableAtCheck");
	String installationIcon = Property.getProperty(Constant.OR_FILE, "installationIcon");
	String toolTipIconInstallation = Property.getProperty(Constant.OR_FILE, "toolTipIconInstallation");
	String toolTipMessageInstallationPDP = Property.getProperty(Constant.OR_FILE, "toolTipMessageInstallationPDP");
	String closeButtonToolTipInstallationPDP = Property.getProperty(Constant.OR_FILE, "closeButtonToolTipInstallationPDP");
	String romanceCopySection = Property.getProperty(Constant.OR_FILE, "romanceCopySection");
	String romanceCopySectionTitle = Property.getProperty(Constant.OR_FILE, "romanceCopySectionTitle");
	String romanceCopyContent = Property.getProperty(Constant.OR_FILE, "romanceCopyContent");
	String productManualTitle = Property.getProperty(Constant.OR_FILE, "productManualTitle");
	String productManualDescription = Property.getProperty(Constant.OR_FILE, "productManualDescription");
	String productManualLink = Property.getProperty(Constant.OR_FILE, "productManualLink");
	String stickyAddToCart = Property.getProperty(Constant.OR_FILE, "stickyAddToCart");
	String featuresSection = Property.getProperty(Constant.OR_FILE, "featuresSection");
	String featuresBulletIcon = Property.getProperty(Constant.OR_FILE, "featuresBulletIcon");
	String viewMoreSpecificationsButton = Property.getProperty(Constant.OR_FILE, "viewMoreSpecificationsButton");
	String viewLessSpecificationButton = Property.getProperty(Constant.OR_FILE, "viewLessSpecificationButton");
	String prductUnitPrice = Property.getProperty(Constant.OR_FILE, "prductUnitPrice");
	String swatchWithSize = Property.getProperty(Constant.OR_FILE, "swatchWithSize");
	String sizeLabel = Property.getProperty(Constant.OR_FILE, "sizeLabel");
	String unavailableSize = Property.getProperty(Constant.OR_FILE, "unavailableSize");
	String availabeSize = Property.getProperty(Constant.OR_FILE, "availabeSize");
	String selectedSize = Property.getProperty(Constant.OR_FILE, "selectedSize");
	String selectedSizeTitle = Property.getProperty(Constant.OR_FILE, "selectedSizeTitle");
	String colourSelectorFirst = Property.getProperty(Constant.OR_FILE, "colourSelectorFirst");
	String sizeSelectorSecond = Property.getProperty(Constant.OR_FILE, "sizeSelectorSecond");
	String selectedColor = Property.getProperty(Constant.OR_FILE, "selectedColor");
	String sectedColorTitle = Property.getProperty(Constant.OR_FILE, "sectedColorTitle");
	String specialBuy = Property.getProperty(Constant.OR_FILE, "specialBuy");
	String colorVariant = Property.getProperty(Constant.OR_FILE, "containsClass") + "," + Property.getProperty(Constant.OR_FILE, "colorVariantPDP");
	
	
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
	
	public String get_It_Installed() {
		return getItInstalled;
	}
	
	public String get_Message_Available_At_Check() {
		return messageAvailableAtCheck;
	}
	
	public String get_Installation_Icon() {
		return installationIcon;
	}
	
	public String get_Tool_Tip_Icon_Installation() {
		return toolTipIconInstallation;
	}
	
	public String get_Tool_Tip_Message_Installation_Indicator() {
		return toolTipMessageInstallationPDP;
	}
	
	public String get_Close_Button_Tool_Tip_Installation_Indicator() {
		return closeButtonToolTipInstallationPDP;
	}
	
	public String get_Romance_Copy_Section() {
		return romanceCopySection;
	}
	
	public String get_Romance_Copy_Section_Title() {
		return romanceCopySectionTitle;
	}
	
	public String get_Romance_Copy_Content() {
		return romanceCopyContent;
	}
	
	public String get_Product_Manual_Title() {
		return productManualTitle;
	}
	
	public String get_Product_Manual_Description() {
		return productManualDescription;
	}
	
	public String get_Product_Manual_Link() {
		return productManualLink;
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
	
	public String get_View_More_Specifications() {
		return viewMoreSpecificationsButton;
	}
	
	public String get_View_Less_Specifications() {
		return viewLessSpecificationButton;
	}
	
	public String get_Product_Unit_Price() {
		return prductUnitPrice;
	}
	
	public String get_Swatch_With_Size() {
		return swatchWithSize;
	}
	
	public String get_Size_Label() {
		return sizeLabel;
	}
	
	public String get_Unavailable_Size() {
		return unavailableSize;
	}
	
	public String get_Available_Size() {
		return availabeSize;
	}
	
	public String get_Selected_Size() {
		return selectedSize;
	}
	
	public String get_Selected_Size_Title() {
		return selectedSizeTitle;
	}
	
	public String get_Colour_Selector_First() {
		return colourSelectorFirst;
	}
	
	public String get_Size_Selector_Second() {
		return sizeSelectorSecond;
	}
	
	public String get_Selected_Color() {
		return selectedColor;
	}
	
	public String get_Selected_Color_Title() {
		return sectedColorTitle;
	}
	
	public String get_Special_Buy() {
		return specialBuy;
	}
	
	public String get_Color_Variant() {
		return  colorVariant;
	}
 }

