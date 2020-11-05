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
	 String featuredListTitle = Property.getProperty(Constant.OR_FILE, "featuredListTitle");
	 String featureListAltTextOne = Property.getProperty(Constant.OR_FILE, "featureListAltTextOne");
	 String mandatoryAlert = Property.getProperty(Constant.OR_FILE, "mandatoryAlert");
	 String selectFeaturedListDropDown = Property.getProperty(Constant.OR_FILE, "selectFeaturedListDropDown");
	 String imageOptionFeaturedListDropDown = Property.getProperty(Constant.OR_FILE, "imageOptionFeaturedListDropDown");
	 String learMoreLinkFirst = Property.getProperty(Constant.OR_FILE, "learMoreLinkFirst");
	 String subTitleFirstFL = Property.getProperty(Constant.OR_FILE, "subTitleFirstFL").replace("=", ",");
	 String featueListImageSubTitlePage = Property.getProperty(Constant.OR_FILE, "featueListImageSubTitlePage").replace("=", ",");
			 
	 
	 /**
	  * get Locator = Feature List Panel
	  */
	 public String getFeatureListPanel() {
		 return featureListPannel;
	 }
	 
	 /**
	  * get Locator - Feature List Title
	  */
	 public String getFeatureListTitle() {
		 return featuredListTitle;
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
 	
	}
