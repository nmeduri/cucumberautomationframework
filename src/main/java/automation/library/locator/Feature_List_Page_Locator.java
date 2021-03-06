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
	 
	 String learMoreLinkFLThird = Property.getProperty(Constant.OR_FILE, "learMoreLinkFLThird");
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

	 String productCardFeatureListOne = Property.getProperty(Constant.OR_FILE, "productCardFeatureListOne");
	 String learnMoreFL = Property.getProperty(Constant.OR_FILE, "learnMoreFL");
	 String imageFeatureList = Property.getProperty(Constant.OR_FILE, "imageFeatureList");
	 String descriptiveMessagefl = Property.getProperty(Constant.OR_FILE, "descriptiveMessagefl");
	 String descriptiveTitleFl = Property.getProperty(Constant.OR_FILE, "descriptiveTitleFl");
	 String keyLineOfAllImages = Property.getProperty(Constant.OR_FILE, "keyLineOfAllImages");
	 String paginationDots = Property.getProperty(Constant.OR_FILE, "paginationDots");
	 String activePanel = Property.getProperty(Constant.OR_FILE, "activePanel");
	
	 String productFeatureList = Property.getProperty(Constant.OR_FILE, "productFeatureList");
	 String productCardFeaturedList = Property.getProperty(Constant.OR_FILE, "productCardFeaturedList");
	 String productCardMobile = Property.getProperty(Constant.OR_FILE, "productCardMobile");
	 String ProductListTitle = Property.getProperty(Constant.OR_FILE, "ProductListTitle");
	 String ProductListImage = Property.getProperty(Constant.OR_FILE, "ProductListImage");
	 String swipepaginationButton = Property.getProperty(Constant.OR_FILE, "swipepaginationButton");
	 String clickpaginationbuttons = Property.getProperty(Constant.OR_FILE, "clickpaginationbuttons");
	 String swipefirstbutton = Property.getProperty(Constant.OR_FILE, "clickpaginationbuttons");
	 
	 /**
	  * get Locator - Learn More Link First
	  */
	 public String getLearnMoreLinkFirst() {
		 return learMoreLinkFLFirst;
	 }
	 
	 
	 
	 /**
	  * get Locator - Learn More Link First
	  */
	 public String getLearnMoreLinkFL() {
		 return learMoreLinkFLThird;
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
	  * get Locator - Product Card One
	  */
	 public String getProductCardOne() {
		 return productCardFeatureListOne;
	 }
	 
	 /**
	  * get Locator - Learn More Label
	  */
	 public String get_Learn_More_Label() {
		 return learnMoreFL;
	 }
	 
	 /**
	  * get Locator - Feature List Image
	  */
	 public String get_Feature_List_Image() {
		 return imageFeatureList;
	 }
	 
	 /**
	  * get Locator - Descriptive Message
	  * 
	  */
	 public String getDescriptiveMessageFl() {
		 return descriptiveMessagefl;
	 }
	 
	 /** 
	  * get Locator - Descriptive Title
	  */
	 public String getDescriptiveTitle() {
		 return descriptiveTitleFl;
	 }
	 /**
	  * get Locator - Key Line of images
	  */
	 public String getKeyLineOfImages() {
		 return keyLineOfAllImages;
	 }
	 
	 /**
	  * get Locator - pagination dots
	  */
	 
	 public String get_Pagination_Dots() {
		 return paginationDots;
	 }
	 
	 /**
	  * get Locator - active panel
	  */
	 
	 public String get_Active_Panel() {
		 return activePanel;
	 }
	 
	 /**
	  * get Locator - Product Feature List
	  */
	 public String getProductFeatureList() {
		 return productFeatureList;
	 }
	 /**
	  * get Locator - Product Card
	  */
	 public String getProductCard() {
		 return productCardFeaturedList;
	 }
	 /**
	  * get Locator - Product Card Mobile
	  */
	 public String getProductCardMobile() {
		 return productCardMobile;
	 }
	 /**
	  * get Locator - Product List Title
	  */
	 public String getproductlist_Title() {
		 return ProductListTitle;
	 }
	 
	 /**
	  * get Locator - Product List Image
	  */
	 public String getProductListImage() {
		 return ProductListImage;
	 }
	 /**
	  * get Locator swipeButton -Dot
	  */
	 public String validatePaginationButton() {
		 return swipepaginationButton;
	 }
	 
	 /**
	  * clickpagination buttons
	  */
	 public String swipePaginationButtons() {
		 return clickpaginationbuttons;
	 }
	 /**
	  * clickpagination buttons
	  */
	 public String swipeFirstPaginationButtons() {
		 return swipefirstbutton;
	 }
	}
