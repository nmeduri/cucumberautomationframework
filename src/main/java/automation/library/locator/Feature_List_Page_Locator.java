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
	 String chevronPreviousButton = Property.getProperty(Constant.OR_FILE, "chevronPreviousButton");
	 String chevronNextButton = Property.getProperty(Constant.OR_FILE, "chevronNextButton");
	 String activeSetOfProducts = Property.getProperty(Constant.OR_FILE, "activeSetOfProducts").replace("=", ",");
	 String productOneFromSet = Property.getProperty(Constant.OR_FILE, "productOneFromSet");
	 String productTwoFromSet = Property.getProperty(Constant.OR_FILE, "productTwoFromSet");
	 String paginationDotOneFeature = Property.getProperty(Constant.OR_FILE, "paginationDotOneFeature");
	 String paginationDotFeatured = Property.getProperty(Constant.OR_FILE, "paginationDotFeatured");
	 String paginationDotTwoFeature = Property.getProperty(Constant.OR_FILE, "paginationDotTwoFeature");
	 String featuredListTitle = Property.getProperty(Constant.OR_FILE, "featuredListTitle");
	 String productCardImageFl = Property.getProperty(Constant.OR_FILE, "productCardImageFl");
	 String titleProductCardFl = Property.getProperty(Constant.OR_FILE, "titleProductCardFl");
	 String productCardDescriptionFl = Property.getProperty(Constant.OR_FILE, "productCardDescriptionFl");
	 String learnMoreProductCardfl = Property.getProperty(Constant.OR_FILE, "learnMoreProductCardfl");
	 String keyLineOfAllImages = Property.getProperty(Constant.OR_FILE, "keyLineOfAllImages");
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
	 
	 /**
	  * get Locator - Chevron Previous Button
	  */
	 public String getChevronPreviousButton() {
		 return chevronPreviousButton;
	 }
	 
	 /**
	  * get Locator - Chevron Next Button
	  */
	 public String getChevronNextButton() {
		 return chevronNextButton;
	 }
	 
	 /**
	  * get Locator - Active Sets Of Product
	  */
	 public String getActiveSetOfProducts() {
		 return activeSetOfProducts;
	 }
	 
	 /**
	  * get Locator - Product One From Set
	  */
	 public String getProductOneFromSet() {
		 return productOneFromSet;
	 }
	 
	 /** get Locator - Product Two From Set
	  * 
	  */
	 public String getProductTwoFromSet() {
		 return productTwoFromSet;
	 }
	 
	 /**
	  * get Locator - Pagination Dot One
	  */
	 public String getPaginationDotOne() {
		 return paginationDotOneFeature;
	 }
	 
	 /**
	  * get Locator Pagination Dot
	  */
	 public String getPaginationDot() {
		 return paginationDotFeatured;
	 }
	 
	 /**
	  * get Locator - Pagination Dot (Second Dot)
	  */
	 public String getPaginationDotTwo() {
		 return paginationDotTwoFeature;
	 }
	 
	 /**
	  * get Locator - Featured List Title
	  */
	 public String getFeaturedListTitle() {
		 return featuredListTitle;
	 }
	 
	 /**
	  * get Locator - Product Image
	  */
	 public String getProductImage() {
		 return productCardImageFl;
	 }
	 
	 /**
	  * get Locator - Title on Product Card
	  */
	 public String getProductCardTitle() {
		 return titleProductCardFl;
	 }
	 
	 /**
	  * get Locator - Product Card Description
	  */
	 public String getProductCardDescription() {
		 return productCardDescriptionFl;
	 }
	 
	 /**
	  * get Locator - Learn more (Product Card)
	  */
	 public String getLearnMoreProductCard() {
		 return learnMoreProductCardfl;
	 }
	 /**
	  * get Locator - Key Line of images
	  */
	 public String getKeyLineOfImages() {
		 return keyLineOfAllImages;
	 }
	}
