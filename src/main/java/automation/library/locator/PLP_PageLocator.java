package automation.library.locator;

import java.util.List;

import org.openqa.selenium.WebElement;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class PLP_PageLocator {
	
	String listView = Property.getProperty(Constant.OR_FILE, "listView");
	String gridView =  Property.getProperty(Constant.OR_FILE, "gridView");
	String productCardImage =  Property.getProperty(Constant.OR_FILE, "productCardImage");
	String listViewButton = Property.getProperty(Constant.OR_FILE, "listViewButton");
	String productCardTitle = Property.getProperty(Constant.OR_FILE, "productCardTitle");
	String pricelowToHigh = Property.getProperty(Constant.OR_FILE, "pricelowToHigh");
	String sortByOption = Property.getProperty(Constant.OR_FILE, "sortByOption");
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
	
	public String get_List_View() {
		
		return listView;
	}
	
	public String get_Grid_View() {
		
		return gridView;
		
	}
	
	public String get_Product_Card_Image() {
		return productCardImage;
	}
	
	public String get_List_View_Button() {
		return listViewButton;
	}
	
	public String get_Product_Card_Title() {
		return productCardTitle;
	}
	
	
	public String get_Price_Low_To_High() {
		return pricelowToHigh;
	}
	
	public String get_Sort_By_Option() {
		return sortByOption;
	}
	
	public String get_Price_High_To_Low() {
		return priceHighToLow;
	}
	
	public String get_Product_Price() {
		return prductPrice;
	}
	
	public String get_Close_Button() {
		return closeButtonMobile;
	}
	
	public String get_New_Arrivals() {
		return newArrivals;
	}
	
	public String get_Customer_Rating_High_To_Low() {
		return customerRatingsHighToLow;
	}
	
	public String get_productContainer() {
		return productContainer;
	}
	
	public String get_productContainerThree() {
		return productContainerThree;
	}
	
	public String get_ratingOne() {
		return ratingOne;
	}
	
	public String get_ratingThree() {
		return ratingThree;
	}
	
	public String get_productContainerOne() {
		return productContainerOne;
	}
}
