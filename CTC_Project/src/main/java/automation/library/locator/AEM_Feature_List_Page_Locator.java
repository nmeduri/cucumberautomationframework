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
	 String learnMoreaccessibility=Property.getProperty(Constant.OR_FILE, "learnMoreaccessibility");
	 /**
	  * get Locator = Feature List Panel
	  */
	 public String getFeatureListPanel() {
		 return featureListPannel;
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
 	
	}
