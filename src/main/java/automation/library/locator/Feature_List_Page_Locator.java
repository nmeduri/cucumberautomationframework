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
	 String featuredListComponent = Property.getProperty(Constant.OR_FILE, "featuredListComponent").replace("=", ",");
	 String featuredListProduct = Property.getProperty(Constant.OR_FILE, "featuredListProduct").replace("=", ",");
	 
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
	 
	 /**
	  * get Locator - Featured List Component
	  */
	 public String getFeaturedListComponent() {
		 return featuredListComponent;
	 }
	 
	 /**
	  * get Locator - Featured List Product
	  */
	 public String getFeaturedListProduct() {
		 return featuredListProduct;
	 }
 	
	}
