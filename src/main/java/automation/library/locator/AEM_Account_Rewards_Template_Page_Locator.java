package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class AEM_Account_Rewards_Template_Page_Locator {
	String dragcomponent = Property.getProperty(Constant.OR_FILE, "dragcomponent");
	String inserticon = Property.getProperty(Constant.OR_FILE, "inserticon");
	String listelements = Property.getProperty(Constant.OR_FILE, "listelements");
	String historycomp = Property.getProperty(Constant.OR_FILE, "historycomp");
	/**
	 * gets Locator - Shipping Info Label
	 * 
	 */

	public String get_dragComponent() {
		return dragcomponent;
	}
	/**
	 * gets Locator - order history component
	 * 
	 */

	public String get_orderHistoryComponent() {
		return historycomp;
	}
	/**
	 * gets Locator -  insertion icon
	 * 
	 */

	public String get_insertIcon() {
		return inserticon;
	}
	/**
	 * gets Locator -  insertion icon
	 * 
	 */

	public String get_ListElements() {
		return listelements;
	}
	
}
