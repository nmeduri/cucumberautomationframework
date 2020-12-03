package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Footer component page
 * 
 */
public class AEM_Feature_List_Page_Locator {

	 String featureListPannel = Property.getProperty(Constant.OR_FILE, "featureListPannel").replace("=", ",");
	 String featuredListTitleAEM = Property.getProperty(Constant.OR_FILE, "featuredListTitleAEM");
	 String featureListAltTextOne = Property.getProperty(Constant.OR_FILE, "featureListAltTextOne");
	 String mandatoryAlert = Property.getProperty(Constant.OR_FILE, "mandatoryAlert");
	 String selectFeaturedListDropDown = Property.getProperty(Constant.OR_FILE, "selectFeaturedListDropDown");
	 String imageOptionFeaturedListDropDown = Property.getProperty(Constant.OR_FILE, "imageOptionFeaturedListDropDown");
	 String learMoreLinkFirst = Property.getProperty(Constant.OR_FILE, "learMoreLinkFirst");
	 String subTitleFirstFL = Property.getProperty(Constant.OR_FILE, "subTitleFirstFL").replace("=", ",");
	 String featueListImageSubTitlePage = Property.getProperty(Constant.OR_FILE, "featueListImageSubTitlePage").replace("=", ",");
	 String learnMoreLabelFLAEM = Property.getProperty(Constant.OR_FILE, "learnMoreLabelFLAEM");
	 String imageFeatureListAEM = Property.getProperty(Constant.OR_FILE, "imageFeatureListAEM");
	 String descriptiveMessageFLAEM = Property.getProperty(Constant.OR_FILE, "descriptiveMessageFLAEM");
	 String descriptiveMessageToolTip = Property.getProperty(Constant.OR_FILE, "descriptiveMessageToolTip");
	 String descriptiveMessageToolTipMessage = Property.getProperty(Constant.OR_FILE, "descriptiveMessageToolTipMessage");
	 String descriptiveTitleFlAEM = Property.getProperty(Constant.OR_FILE, "descriptiveTitleFlAEM");
	 String descriptiveTitleToolTip = Property.getProperty(Constant.OR_FILE, "descriptiveTitleToolTip");
	 String titleToolTipFl = Property.getProperty(Constant.OR_FILE, "titleToolTipFl");
	 String firstCardLinkTarget = Property.getProperty(Constant.OR_FILE, "firstCardLinkTarget");
	 String firstCardNewTab = Property.getProperty(Constant.OR_FILE, "firstCardNewTab");
	 String learnMoreaccessibility=Property.getProperty(Constant.OR_FILE, "learnMoreaccessibility");
	 String ProductListComponent=Property.getProperty(Constant.OR_FILE, "ProductListComponent");
	 String productCode=Property.getProperty(Constant.OR_FILE, "productCodeAEM");
	 String productImage=Property.getProperty(Constant.OR_FILE, "productImageAEM");
	 String ProductFetureDeleteAEM=Property.getProperty(Constant.OR_FILE, "ProductFetureDeleteAEM");
	 String ErrorImage=Property.getProperty(Constant.OR_FILE, "ErrorImage");

	 String featuredProductListPannel=Property.getProperty(Constant.OR_FILE, "featuredProductListPannel");
	 //String featuredProductListPannel=Property.getProperty(Constant.OR_FILE, "featuredProductListPannel").replace("=", ",");
	 String titleOfFL=Property.getProperty(Constant.OR_FILE, "titleOfFL");
	 String toolTipOfFLTitle=Property.getProperty(Constant.OR_FILE, "toolTipOfFLTitle");
	 String toolTipMessageOfFLTitle=Property.getProperty(Constant.OR_FILE, "toolTipMessageOfFLTitle").replace("=", ",");
	 String notMandatoryConfiguration=Property.getProperty(Constant.OR_FILE, "notMandatoryConfiguration");
	 String titleOfFeaturedProductList=Property.getProperty(Constant.OR_FILE, "titleOfFeaturedProductList");
	 String redirectionLabel=Property.getProperty(Constant.OR_FILE, "redirectionLabel");
	 String redirectionLabelThisWindow=Property.getProperty(Constant.OR_FILE, "redirectionLabelThisWindow");
	 String enableBadgesAEM=Property.getProperty(Constant.OR_FILE, "enableBadgesAEM");
	 String enableBadgesInPreview =Property.getProperty(Constant.OR_FILE, "enableBadgesInPreview");
	 String enableSaveStoryAEM =Property.getProperty(Constant.OR_FILE, "enableSaveStoryAEM");
	 String disableProductDescription =Property.getProperty(Constant.OR_FILE, "disableProductDescription");
	 String productBrandAEM =Property.getProperty(Constant.OR_FILE, "productBrandAEM");
	 String productTitleAEM =Property.getProperty(Constant.OR_FILE, "productTitleAEM");
	 String productCode1AEM =Property.getProperty(Constant.OR_FILE, "productCode1AEM");
	 String errorAlertForMandatoryFieldAEM =Property.getProperty(Constant.OR_FILE, "errorAlertForMandatoryFieldAEM");
	 String clearProductCode =Property.getProperty(Constant.OR_FILE, "clearProductCode");
	 String errorMessage =Property.getProperty(Constant.OR_FILE, "errorMessage");
	 String titlefrenchlanguage =Property.getProperty(Constant.OR_FILE, "titlefrenchlanguage");
	 String secondprodcode =Property.getProperty(Constant.OR_FILE, "secondprodcode");
	 String clearTitle =Property.getProperty(Constant.OR_FILE, "clearTitle");

	 String showbadges =Property.getProperty(Constant.OR_FILE, "showbadges");

	 String titleverification =Property.getProperty(Constant.OR_FILE, "titleverification");

	 
	 /**
	  * get Locator = Feature List Panel
	  */
	 public String getFeatureListPanel() {
		 return featureListPannel;
	 }
	 /**
	  * get Locator _ error image_author
	  */
	 public String getErrorImage() {
		 return ErrorImage;
	 }
	 /**
	  * get Locator _ Feature List _product list_delete icon_ AEM
	  */
	 public String getProductFetureDeleteAEM() {
		 return ProductFetureDeleteAEM;
	 }
	 /**
	  * get Locator -learn More accessibility
	  */
	 public String getLearnMoreaccessibility() {
		 return learnMoreaccessibility;
	 }
	 
	 /**
	  * get Locator - Feature List Title
	  */
	 public String getFeatureListTitle() {
		 return featuredListTitleAEM;
	 }
	 
	 /**
	  * get Locator - Feature List Alt Text
	  */
	 public String getFeatureAltTextOne() {
		 return featureListAltTextOne;
	 }
	 
	 /**
	  * get Locator - Mandatory Alert For Image
	  */
	 public String getErrorAlertMandatory() {
		 return mandatoryAlert;
	 }
	 
	 /**
	  * get Locator - Featured List Select Type Drop Down
	  */
	 public String getSelectTypeFeaturedListDropDown() {
		 return selectFeaturedListDropDown;
	 }
	 
	 /**
		 * get Locator - Image Option (Select Featured List)
		 */
		public String getImageOptionSelectFeatureList() {
			return imageOptionFeaturedListDropDown;
		}
		
	/**
	 * get Locator - Learn More Link (First Option)	
	 */
	public String getLearnMoreLink() {
		return learMoreLinkFirst;
	}

	/**
	 * get Locator - Sub Title First 
	 */
	public String getSubTitleFirst() {
		return subTitleFirstFL;
	}

	/**
	 * get Locator - Feature List Image Sub Title (First)
	 */
	public String getFeatureListImageSubTitle() {
		return featueListImageSubTitlePage;
	}

	/**
	 * get Locator - Learn More Label
	 */
	public String getLearnMoreLabel() {
		return learnMoreLabelFLAEM;
	}

	/**
	 * get Locator - Feature List Image
	 */
	public String getFeatureListImage() {
		return imageFeatureListAEM;
	}

	/**
	 * get Locator - Descriptive Message
	 */
	public String getDescriptiveMessage() {
		return descriptiveMessageFLAEM;
	}

	/**
	 * get Locator - Descriptive Message Tool Tip
	 */
	public String getDescriptiveMessateToolTip() {
		return descriptiveMessageToolTip;
	}

	/**
	 * get Locator - Descriptive Message (Tool Tip Message)
	 */
	public String getDescriptiveMessageToolTipMessage() {
		return descriptiveMessageToolTipMessage;
	}

	/**
	 * get Locator - Descriptive Title
	 */
	public String getDescriptiveTitle() {
		return descriptiveTitleFlAEM;
	}

	/**
	 * get Locator - Descriptive Title (Tool Tip)
	 */
	public String getDescriptiveTitleToolTip() {
		return descriptiveTitleToolTip;
	}

	/**
	 * get Locator - Title Tool Tip
	 */
	public String getTitleToolTipFl() {
		return titleToolTipFl;
	}
	
	/**
	 * get Locator - First card link target field
	 */
	
	public String get_First_Card_Link_Target() {
		return firstCardLinkTarget;
	}

	/**
	 * get Locator = Featured product List Panel
	 */
	public String getFeaturedProductListPanel() {
		return featuredProductListPannel;
	}
	
	/**
	 * get Locator - First card new tab
	 */
	
	public String get_First_Card_New_Tab() {
		return firstCardNewTab;
	}
 	
	/**
	 * get Locator - ProductListComponent
	 */
	public String getProductListComponent() {
		return ProductListComponent;
	}
	/**
	 * get Locator - productCode
	 */
	public String getproductCode() {
		return productCode;
	}
	/**
	 * get Locator - productImage
	 */
	public String getproductImage() {
		return productImage;
	}
	/**
	 * get Locator - ErrorImage
	 */
	public String get_ErrorImage() {
		return ErrorImage;
	}
	/**
	 * get Locator -FL Title
	 */
	public String getFLTitle() {
		return titleOfFL;
	}
	/**
	 * get Locator -Tool tip of FL Title
	 */
	public String getToolTipOfFLTitle() {
		return toolTipOfFLTitle;
	}
	/**
	 * get Locator -Tool tip Message of FL Title
	 */
	public String getToolTipMessageOfFLTitle() {
		return toolTipMessageOfFLTitle;
	}
	/**
	 * get Locator -Not Mandatory Configuration of FL Title
	 */
	public String getNotMandatoryConfiguration() {
		return notMandatoryConfiguration;
	}
	
	/**
	 * get Locator -Title Of Featured Product List
	 */
	public String getTitleOfFeaturedProductList() {
		return titleOfFeaturedProductList;
	}
	/**
	 * get Locator -Redirection Label
	 */
	public String getRedirectionLabel() {
		return redirectionLabel;
	}
	/**
	 * get Locator -Redirection Label This Window
	 */
	public String getRedirectionLabelThisWindow() {
		return redirectionLabelThisWindow;
	}
	/**
	 * get Locator - Enable Badges
	 */
	public String getEnableBadges() {
		return enableBadgesAEM;
	}
	/**
	 * get Locator - Enable Badges In Preview
	 */
	public String getEnableBadgesInPreview() {
		return enableBadgesInPreview;
	}
	/**
	 * get Locator - Enable Save Story
	 */
	public String getEnableSaveStory() {
		return enableSaveStoryAEM;
	}
	/**
	 * get Locator - Disable Product Description
	 */
	public String getDisableProductDescription() {
		return disableProductDescription;
	}
	/**
	 * get Locator - Product Brand AEM
	 */
	public String getProductBrandAEM() {
		return productBrandAEM;
	}
	/**
	 * get Locator - Product Title AEM
	 */
	public String getProductTitleAEM() {
		return productTitleAEM;
	}
	/**
	 * get Locator - Product Code AEM
	 */
	public String getProductCodeAEM() {
		return productCode1AEM;
	}
	/**
	 * get Locator - Error Alert For Mandatory Field AEM
	 */
	public String getErrorAlertForMandatoryFieldAEM() {
		return errorAlertForMandatoryFieldAEM;
	}
	/**
	 * get Locator - ProductCode 
	 */
	public String getProductCodeToClear() {
		return clearProductCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	
	/**
	 * get Locator - ProductCode 
	 */
	public String getTitle() {
		return titlefrenchlanguage;
	}
	
	/**
	 * get Locator - ProductCode 
	 */
	public String clearTitle() {
		return clearTitle;
	}
	/**
	 * get Locator - ProductCode 
	 */
	public String getProductCode() {
		return clearProductCode;
	}

	
	/**
	 * get Locator - Show Badges 
	 */
	public String getShowBadges() {
		return showbadges;
	}
	/**
	 * get Title - ProductCode 
	 */
	public String getTitleVerification() {
		return titleverification;

	}
}
