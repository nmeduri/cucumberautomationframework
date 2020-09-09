package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class PLP_PageLocator {
	
	String listView = Property.getProperty(Constant.OR_FILE, "listView");
	String gridView =  Property.getProperty(Constant.OR_FILE, "gridView");
	String productCardImage =  Property.getProperty(Constant.OR_FILE, "productCardImage");
	String listViewButton = Property.getProperty(Constant.OR_FILE, "listViewButton");
	String productCardTitle = Property.getProperty(Constant.OR_FILE, "productCardTitle");
	String sortByOption = Property.getProperty(Constant.OR_FILE, "sortByOption");
	String priceHighToLow = Property.getProperty(Constant.OR_FILE, "priceHighToLow");
	String prductPrice = Property.getProperty(Constant.OR_FILE, "prductPrice");
	String closeButtonMobile = Property.getProperty(Constant.OR_FILE, "closeButtonMobile");
	String newArrivals = Property.getProperty(Constant.OR_FILE, "newArrivals");
	String customerRatingsHighToLow = Property.getProperty(Constant.OR_FILE, "customerRatingsHighToLow");
	
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
}
