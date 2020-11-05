package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Footer component page
 * 
 */
public class Feature_List_Page_Locator {
	

	 
	 String learMoreLinkFLFirst = Property.getProperty(Constant.OR_FILE, "learMoreLinkFLFirst");
	 String featueListSubTitlePage = Property.getProperty(Constant.OR_FILE, "featueListSubTitlePage");
	 
	 /**
	  * get Locator - Learn More Link First
	  */
	 public String getLearnMoreLinkFirst() {
		 return learMoreLinkFLFirst;
	 }
	 
	 /**
	  * get Locator - Feature List Sub Title
	  */
	 public String getFeatureListSubTitle() {
		 return featueListSubTitlePage;
	 }
 	
	}
