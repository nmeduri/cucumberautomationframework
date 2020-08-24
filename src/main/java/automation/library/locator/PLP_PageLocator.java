package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class PLP_PageLocator {
	
	String listView = Property.getProperty(Constant.OR_FILE, "listView");
	String gridView =  Property.getProperty(Constant.OR_FILE, "gridView");
	String productCardImage =  Property.getProperty(Constant.OR_FILE, "productCardImage");
	String listViewButton = Property.getProperty(Constant.OR_FILE, "listViewButton");
	String productCardTitle = Property.getProperty(Constant.OR_FILE, "productCardTitle");
	
	
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
}
