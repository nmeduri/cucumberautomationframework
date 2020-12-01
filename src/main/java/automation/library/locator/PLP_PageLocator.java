package automation.library.locator;

import java.util.List;

import org.openqa.selenium.WebElement;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of PLP Page
 * 
 */
public class PLP_PageLocator {
	
	String listView = Property.getProperty(Constant.OR_FILE, "listView");
	String gridView =  Property.getProperty(Constant.OR_FILE, "gridView");
	String productCardImage =  Property.getProperty(Constant.OR_FILE, "productCardImage");
	String listViewButton = Property.getProperty(Constant.OR_FILE, "listViewButton");
	String productCardTitle = Property.getProperty(Constant.OR_FILE, "productCardTitle").replace("=", ",");
	String pricelowToHigh = Property.getProperty(Constant.OR_FILE, "pricelowToHigh");
	String sortByOption = Property.getProperty(Constant.OR_FILE, "sortByOption").replace("=", ",");
	String priceHighToLow = Property.getProperty(Constant.OR_FILE, "priceHighToLow");
	String prductPrice = Property.getProperty(Constant.OR_FILE, "prductPrice");
	String closeButtonMobile = Property.getProperty(Constant.OR_FILE, "closeButtonMobile");
	String newArrivals = Property.getProperty(Constant.OR_FILE, "newArrivals");
	String customerRatingsHighToLow = Property.getProperty(Constant.OR_FILE, "customerRatingsHighToLow");
	String productContainer = Property.getProperty(Constant.OR_FILE, "productContainerOne")+","+Property.getProperty(Constant.OR_FILE, "productContainerTwo");
	String productContainerThree = Property.getProperty(Constant.OR_FILE, "productContainerThree");
	String ratingOne = Property.getProperty(Constant.OR_FILE, "ratingOne");
	String ratingThree = Property.getProperty(Constant.OR_FILE, "ratingThree");
	String productContainerOne = Property.getProperty(Constant.OR_FILE, "productContainerOne");
	String customerRating = Property.getProperty(Constant.OR_FILE, "customerRating");
	String zeroProductContainerRating = Property.getProperty(Constant.OR_FILE, "zeroProductContainerRating");
	String primaryImage = Property.getProperty(Constant.OR_FILE, "primaryImage");
	String productBrand = Property.getProperty(Constant.OR_FILE, "productBrand");
	String primaryImageMobile = Property.getProperty(Constant.OR_FILE, "primaryImageMobile");
	String breadcrumb = Property.getProperty(Constant.OR_FILE, "breadcrumb");
	String homePathInBreadcrumb = Property.getProperty(Constant.OR_FILE, "homePathInBreadcrumb");
	String breadcrumbMobile = Property.getProperty(Constant.OR_FILE, "breadcrumbMobile");
	String lastBreadcrumb = Property.getProperty(Constant.OR_FILE, "lastBreadcrumb");
	String listViewButtonMobile = Property.getProperty(Constant.OR_FILE, "listViewButtonMobile");
	String gridViewButton = Property.getProperty(Constant.OR_FILE, "gridViewButton"); 
	String gridViewButtonMobile = Property.getProperty(Constant.OR_FILE, "gridViewButtonMobile");
	String colorNumberTitle = Property.getProperty(Constant.OR_FILE, "colorNumberTitle");
	String moreColor = Property.getProperty(Constant.OR_FILE, "moreColor");
	String productCardReview = Property.getProperty(Constant.OR_FILE, "productCardReview");
	String getProductContainer = Property.getProperty(Constant.OR_FILE, "getProductContainer");
	String getContainer = Property.getProperty(Constant.OR_FILE, "getContainer");
	String totalReviewsButton = Property.getProperty(Constant.OR_FILE, "ratingOne") + Property.getProperty(Constant.OR_FILE, "totalReviewsButton");
	String productCardVariant = Property.getProperty(Constant.OR_FILE, "productCardVariant") + "," + Property.getProperty(Constant.OR_FILE, "productCardVariantTwo");
	String selectProductVariant = Property.getProperty(Constant.OR_FILE, "productCardVariant") + "," + Property.getProperty(Constant.OR_FILE, "selectProductVariant");
	String numberOfColours = Property.getProperty(Constant.OR_FILE, "numberOfColours");
	String productCard = Property.getProperty(Constant.OR_FILE, "productCard");
	String reviewsStars = Property.getProperty(Constant.OR_FILE, "reviewsStars");
	String sortOption = Property.getProperty(Constant.OR_FILE, "sortOption");
	String showMoreButtonButton = Property.getProperty(Constant.OR_FILE, "showMoreButtonButton");
	String endPaginationMessage = Property.getProperty(Constant.OR_FILE, "endPaginationMessage");
	String backToTopButton = Property.getProperty(Constant.OR_FILE, "backToTopButton");
	String newArrivalSelectedSort = Property.getProperty(Constant.OR_FILE, "newArrivalSelectedSort");
	String sortOptionFacet = Property.getProperty(Constant.OR_FILE, "sortOptionFacet");
	String facetTitle = Property.getProperty(Constant.OR_FILE, "facetTitle");
	String colorFacetOption = Property.getProperty(Constant.OR_FILE, "colorFacetOption");
	String selectedLabelFacet = Property.getProperty(Constant.OR_FILE, "selectedLabelFacet");	
	String toogleInStockMyStore = Property.getProperty(Constant.OR_FILE, "toogleInStockMyStore");
	String colorSwatchValue = Property.getProperty(Constant.OR_FILE, "colorSwatchValue").replace("=", ",");
	String colorButtonFacetHorizonatalBar = Property.getProperty(Constant.OR_FILE, "colorButtonFacetHorizonatalBar");
	String closeButtonFacetPopUp = Property.getProperty(Constant.OR_FILE, "closeButtonFacetPopUp");
	String moreFilters = Property.getProperty(Constant.OR_FILE, "moreFilters");
	String sortAndFiltersMobile = Property.getProperty(Constant.OR_FILE, "sortAndFiltersMobile").replace("=", ",");
	String selectedColorFacetText = Property.getProperty(Constant.OR_FILE, "selectedColorFacetText");
	String selectedResultsOnPLP = Property.getProperty(Constant.OR_FILE, "selectedResultsOnPLP");
	String colorSwatchAnotherValue = Property.getProperty(Constant.OR_FILE, "colorSwatchAnotherValue").replace("=", ",");
	String selectedCommaColor = Property.getProperty(Constant.OR_FILE, "selectedCommaColor");
	String priceDetailTabAEM = Property.getProperty(Constant.OR_FILE, "priceDetailTabAEM");
	String priceWasPriceDetail = Property.getProperty(Constant.OR_FILE, "priceWasPriceDetail");
	String seeMoreSorting = Property.getProperty(Constant.OR_FILE, "seeMoreSorting");
	String deliveryPickUpOption = Property.getProperty(Constant.OR_FILE, "deliveryPickUpOption").replace("=", ",");
	String payPickUpOption = Property.getProperty(Constant.OR_FILE, "payPickUpOption").replace("=", ",");
	String homeDeliveryOption = Property.getProperty(Constant.OR_FILE, "homeDeliveryOption").replace("=", ",");
	String facetOptionName = Property.getProperty(Constant.OR_FILE, "facetOptionName");
	String brandFacetOption = Property.getProperty(Constant.OR_FILE, "brandFacetOption").replace("=", ",");
	String brandFacetName = Property.getProperty(Constant.OR_FILE, "brandFacetName");
	String brandFacetResultValue = Property.getProperty(Constant.OR_FILE, "brandFacetResultValue");
	String bransShowMoreLink = Property.getProperty(Constant.OR_FILE, "bransShowMoreLink");
	String brandFacetItem = Property.getProperty(Constant.OR_FILE, "brandFacetItem");
	String brandItemCheckBox = Property.getProperty(Constant.OR_FILE, "brandItemCheckBox");
	String brandShowMoreText = Property.getProperty(Constant.OR_FILE, "brandShowMoreText");	
	String clearAllFacetButton = Property.getProperty(Constant.OR_FILE, "clearAllFacetButton");
	String brandSelectedItemFacet = Property.getProperty(Constant.OR_FILE, "brandSelectedItemFacet");
	String ratingOptionFacet = Property.getProperty(Constant.OR_FILE, "ratingOptionFacet").replace("=", ",");
	String ratingsValue = Property.getProperty(Constant.OR_FILE, "ratingsValue");
	String ratingsValueLabel = Property.getProperty(Constant.OR_FILE, "ratingsValueLabel");
	String ratingPlusMinusIcon = Property.getProperty(Constant.OR_FILE, "ratingPlusMinusIcon");
	String hideRatingSection = Property.getProperty(Constant.OR_FILE, "hideRatingSection");
	String priceFacet = Property.getProperty(Constant.OR_FILE, "priceFacet").replace("=", ",");
	String pricePlusMinusIcon = Property.getProperty(Constant.OR_FILE, "pricePlusMinusIcon").replace("=", ",");
	String minimumPriceFacet = Property.getProperty(Constant.OR_FILE, "minimumPriceFacet");
	String maximumPriceFacet = Property.getProperty(Constant.OR_FILE, "maximumPriceFacet");
	String priceItemCheckbox = Property.getProperty(Constant.OR_FILE, "priceItemCheckbox");
	String viewButton = Property.getProperty(Constant.OR_FILE, "viewButton").replace("=", ",");
	String priceItemTextCheckbox = Property.getProperty(Constant.OR_FILE, "priceItemTextCheckbox");
	String errorMessageMinimumPriceMoreThanMaximum = Property.getProperty(Constant.OR_FILE, "errorMessageMinimumPriceMoreThanMaximum");
	String ratingStarsValue = Property.getProperty(Constant.OR_FILE, "ratingStarsValue");
	String ratingStarsIcon = Property.getProperty(Constant.OR_FILE, "ratingStarsIcon");
	
	/**
	 * gets Locator - List View
	 * 
	 */
	
	public String get_List_View() {
		
		return listView;
	}
	
	/**
	 * gets Locator - Grid View
	 * 
	 */
	
	public String get_Grid_View() {
		
		return gridView;
		
	}
	
	/**
	 * gets Locator - Product Card Image
	 * 
	 */
	
	public String get_Product_Card_Image() {
		return productCardImage;
	}
	
	/**
	 * gets Locator - List View Button
	 * 
	 */
	
	public String get_List_View_Button() {
		return listViewButton;
	}
	
	/**
	 * gets Locator - Product Card Title
	 * 
	 */
	
	public String get_Product_Card_Title() {
		return productCardTitle;
	}
	
	/**
	 * gets Locator - Price Low to High (Sort By)
	 * 
	 */
	
	
	public String get_Price_Low_To_High() {
		return pricelowToHigh;
	}
	
	/**
	 * gets Locator - Sort By Option
	 * 
	 */
	
	public String get_Sort_By_Option() {
		return sortByOption;
	}
	
	/**
	 * gets Locator - Price High to Low (Sort By)
	 * 
	 */
	
	public String get_Price_High_To_Low() {
		return priceHighToLow;
	}
	
	/**
	 * gets Locator - Prodct Price
	 * 
	 */
	
	public String get_Product_Price() {
		return prductPrice;
	}
	
	/**
	 * gets Locator - Close Button (Mobile)
	 * 
	 */
	
	public String get_Close_Button() {
		return closeButtonMobile;
	}
	
	/**
	 * gets Locator - New Arrivals (Sort By)
	 * 
	 */
	
	public String get_New_Arrivals() {
		return newArrivals;
	}
	
	/**
	 * gets Locator - Customer Rating High to Low (Sort By)
	 * 
	 */
	
	public String get_Customer_Rating_High_To_Low() {
		return customerRatingsHighToLow;
	}
	
	/**
	 * gets Locator - Product Container
	 * 
	 */
	
	public String get_productContainer() {
		return productContainer;
	}
	
	/**
	 * gets Locator - product Container (3rd)
	 * 
	 */
	
	public String get_productContainerThree() {
		return productContainerThree;
	}
	
	/**
	 * gets Locator - Rating Part One
	 * 
	 */
	
	public String get_ratingOne() {
		return ratingOne;
	}
	
	/**
	 * gets Locator - Rating Part Two
	 * 
	 */
	
	public String get_ratingThree() {
		return ratingThree;
	}
	
	/**
	 * gets Locator - Product Container One
	 * 
	 */
	
	public String get_productContainerOne() {
		return productContainerOne;
	}
	
	/**
	 * gets Locator - Customer Rating
	 * 
	 */
	
	public String get_customerRating() {
		return customerRating;
	}
	
	/**
	 * gets Locator - Product Container Rating
	 * 
	 */

	public String get_product_Container0_Rating() {
		return zeroProductContainerRating;
	}
	
	/**
	 * gets Locator - Primary Image
	 * 
	 */
	
	public String get_Primary_Image() {
		return primaryImage;
	}
	
	/**
	 * gets Locator - Product Brand
	 * 
	 */
	
	public String get_Product_Brand() {
		return productBrand;
	}
	
	/**
	 * gets Locator - Primary Image (Mobile)
	 * 
	 */
	
	public String get_Primary_Image_Mobile() {
		return primaryImageMobile;
	}
	
	/**
	 * gets Locator - Breadcumb
	 * 
	 */
	
	public String get_Breadcrumb() {
		return breadcrumb;
	}
	
	/**
	 * gets Locator - Home page (Breadcumb Path)
	 * 
	 */
	
	public String get_Homepage_In_Breadcrumb_Path() {
		return homePathInBreadcrumb;
	}
	
	/**
	 * gets Locator - Breadcumb (Mobile)
	 * 
	 */
	
	public String get_Mobile_Breadcrumb() {
		return breadcrumbMobile;
	}
	
	/**
	 * gets Locator - Breadcumb (Last)
	 * 
	 */
	
	public String get_Last_Breadcrumb() {
		return lastBreadcrumb;
	}
	
	/**
	 * gets Locator - List View Button (Mobile)
	 * 
	 */
	
	public String get_List_View_Button_Mobile() {
		return listViewButtonMobile;
	}
	
	/**
	 * gets Locator - Grid View Button
	 * 
	 */
	
	public String get_Grid_View_Button() {
		return gridViewButton;
	}
	
	/**
	 * gets Locator - Grid View Button (Mobile)
	 * 
	 */
	
	public String get_Grid_View_Button_Mobile() {
		return gridViewButtonMobile;
	}
	
	/**
	 * gets Locator - Color Number
	 * 
	 */
	
	public String get_Color_Number() {
		return colorNumberTitle;
	}
	/**
	 * gets Locator - More Color
	 * 
	 */
	public String get_More_Color() {
		return moreColor;
	}
	
	/**
	 * gets Locator - Product Card Review
	 * 
	 */
	
	
	public String get_Product_Card_Review() {
		return productCardReview;
	}
	
	/**
	 * gets Locator - Reviews Button
	 * 
	 */
	
	public String get_Reviews_Button() {
		return totalReviewsButton;
	}
	
	/**
	 * gets Locator - Each Product Container
	 * 
	 */
	
	public String get_Each_Product_Container() {
		return getProductContainer;
	}
	
	/**
	 * gets Locator - Product Container
	 * 
	 */
	
	public String get_Container() {
		return getContainer;
	}
	
	/**
	 * gets Locator - Product Variant
	 * 
	 */

	public String get_Product_Variant() {
		return productCardVariant;
	}
	
	/**
	 * gets Locator - Product Variant (Selected)
	 * 
	 */
	
	public String get_Selected_Product_Variant() {
		return selectProductVariant;
	}
	
	/**
	 * gets Locator - Number of Colour
	 * 
	 */
	
	public String get_Number_Of_Colour() {
		return numberOfColours;
	}
	
	/**
	 * gets Locator - Product Card
	 * 
	 */
	
	public String get_Product_Card() {
		return productCard;
	}
	
	/**
	 * gets Locator - Reviews Start
	 * 
	 */
	
	public String get_Review_Star() {
		return reviewsStars;
	}
	
	/**
	 * 
	 * get Locator - Sort Option
	 * 
	 */
	public String getSortOption() {
		return sortOption;
	}
	
	/**
	 * get Locator - Show More Button
	 */
	public String get_Show_More_Button() {
		return showMoreButtonButton;
	}
	
	/**
	 * get Locator - End Pagination Message
	 */
	public String get_End_Pagination_Message() {
		return endPaginationMessage;
	}
	
	/**
	 * get Locator - Back to Top Button
	 */
	public String get_Back_To_Top_Button() {
		return backToTopButton;
	}
	
	/**
	 * gets Locator - New Arrival Sorting (Selected)
	 */
	public String get_New_Arrival_Selected_Sort() {
		return newArrivalSelectedSort;
	}
	
	/**
	 * gets Locator - Sort Option
	 */
	public String get_Sort_Facet() {
		return sortOptionFacet;
	}
	
	/**
	 * get Locator - Facet Title
	 */
	public String get_Facet_Title() {
		return facetTitle;
	}
	
	/**
	 * get Locator - Color Facet
	 */
	public String get_Color_Facet() {
		return colorFacetOption;
	}
	
	/**
	 * get Locator - Select label facet
	 */
	public String get_Selected_label_facet() {
		return selectedLabelFacet;
	}
	
	/**
	 * get Locator - Toggle In Stock 
	 */
	public String toggleInStockMyStore() {
		return toogleInStockMyStore;
	}
	
	/**
	 * get Locator - Color Swatches option
	 */
	public String getColorSwatchesOption() {
		return colorSwatchValue;
	}
	
	/**
	 * get Locator - Color Option in Facet Horizontal Bar
	 */
	public String getColorOptionInFacetHorizontalBar() {
		return colorButtonFacetHorizonatalBar;
	}
	
	/**
	 * get Locator - Close Button (Facet Popup)
	 */
	public String closeButtonFacetPopUp() throws Exception {
		return closeButtonFacetPopUp;
	}
	
	/**
	 * get Locator - More Filters
	 */
	public String getMoreFilters() throws Exception {
		return moreFilters;
	}
	
	/**
	 * get Locator - Sort and Filters
	 */
	public String getSortAndFilters() throws Exception {
		return sortAndFiltersMobile;
	}
	
	/**
	 * get Locator - Selected color text
	 */
	public String getSelectedColorText() throws Exception {
		return selectedColorFacetText;
	}
	
	/**
	 * get Locator - Color Result
	 */
	public String getFacetResults() throws Exception {
		return selectedResultsOnPLP;
	}
	
	/**
	 * get Locator - Another Color 
	 */
	public String getAnotherColorFacet() throws Exception {
		return colorSwatchAnotherValue;
	}
	
	/**
	 * get Locator - Select Comma Text
	 */
	public String getSelectedCommaText() throws Exception {
		return selectedCommaColor;
	}
	
	/**
	 * get Locator - Price Detail Tab
	 */
	public String getPriceDetailTab() throws Exception {
		return priceDetailTabAEM;
	}
	
	/**
	 * get Locator - Price Was Price Detail
	 */
	public String getPriceWasPriceDetail() throws Exception {
		return priceWasPriceDetail;
	}
	
	/**
	 * gets Locator - See 3 More
	 */
	public String get_See_More() {
		return seeMoreSorting;
	}
	
	/**
	 * gets Locator - Delivery & Pick Up Option
	 */
	public String get_Delivery_And_Pickup_Option() {
		return deliveryPickUpOption;
	}
	
	/**
	 * gets Locator - Pay and Pickup option
	 */
	public String get_Pay_Pickup_Option() {
		return payPickUpOption;
	}
	
	/**
	 * gets Locator - Home Delivery
	 */
	public String get_Home_Delivery() {
		return homeDeliveryOption;
	}
	
	/**
	 * gets Locator - Facet Name
	 */
	public String get_Facet_Name() {
		return facetOptionName;
	}
	
	/**
	 * gets Locator - Brand 
	 */
	public String get_Brand_Facet() {
		return brandFacetOption;
	}
	
	/**
	 * gets Locator - Brand Name
	 */
	public String get_Brand_Name() {
		return brandFacetName;
	}
	
	/**
	 * gets Locator - Brand Value
	 */
	public String get_Brand_Result_Value() {
		return brandFacetResultValue;
	}
	
	public String get_Brand_Show_More() {
		return bransShowMoreLink;
	}
	
	/**
	 * gets Locator - Brand Show More Text
	 */
	public String get_Brand_Show_More_Text() {
		return brandShowMoreText;
	}
	
	/**
	 * gets Locator - Brand Facet Item
	 */
	public String get_Brand_Facet_Item() {
		return brandFacetItem;
	}
	
	/**
	 * gets Locator - Brand Checkbox
	 */
	public String get_Brand_Checkbox() {
		return brandItemCheckBox;
	}
	
	/**
	 * gets Locator - Clear All Button Facet
	 */
	public String get_Clear_All_Button_Facet() {
		return clearAllFacetButton;
	}
	
	/**
	 * gets Locator - Brand Selected Item Facet
	 */
	public String get_Brand_Selected_Item_Facet() {
		return brandSelectedItemFacet;
	}
	
	/**
	 * gets Locator - Rating Option
	 */
	public String get_Rating_Option_Facet() {
		return ratingOptionFacet;
	}
	
	/**
	 * gets Locator - Rating Value Facet
	 */
	public String get_Rating_Value_Facet() {
		return ratingsValue;
	}
	
	/**
	 * gets Locator - Rating Value Label
	 */
	public String get_Rating_Value_Label() {
		return ratingsValueLabel;
	}
	
	/**
	 * gets Locator - Rating Plus Icon
	 */
	public String get_Rating_Plus_Minus_Icon() {
		return ratingPlusMinusIcon;
	}
	
	/**
	 * gets Locator - Rating Section Hide
	 */
	public String get_Rating_Section_Hide() {
		return hideRatingSection;
	}
	
	/**
	 * gets Locator - Price Facet
	 */
	public String get_Price_Facet() {
		return priceFacet;
	}
	
	/**
	 * gets Locator - Price Plus/Minus Icon
	 */
	public String get_Price_Plus_Minus_Icon() {
		return pricePlusMinusIcon;
	}
	
	/**
	 * gets Locator - Minimum Price
	 */
	public String get_Minimum_Price() {
		return  minimumPriceFacet;
	}
	
	/**
	 * gets Locator - Maximum Price
	 */
	public String get_Maximum_Price() {
		return maximumPriceFacet;
	}
	
	/**
	 * gets Locator - Price option Check box Face
	 */
	public String get_Price_Checkbox_Option_Facet() {
		return priceItemCheckbox;
	}
	
	/**
	 * gets Locator - View Button
	 */
	public String get_View_Button() {
		return viewButton;
	}
	
	/**
	 * gets Locator - Price Item Text
	 */
	public String get_Price_Item_Text() {
		return priceItemTextCheckbox;
	}
	
	/**
	 * gets Locator - Error Message (Minimum Price More Than Maximum)
	 */
	public String get_Error_Message_Min_Price_More_Than_Max() {
		return errorMessageMinimumPriceMoreThanMaximum;
	}
	
	/**
	 * gets Rating Stars - Value
	 */
	public String get_Rating_Stars_Value() {
		return ratingStarsValue;
	}
	
	/**
	 * gets Rating Stars Icon
	 */
	public String get_Rating_Stars_Icon() {
		return ratingStarsIcon;
	}
 }
