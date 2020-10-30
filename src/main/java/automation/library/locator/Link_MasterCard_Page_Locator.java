package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Link MasterCard 
 * 
 */

public class Link_MasterCard_Page_Locator {
	
	String linkMastercardPageTitle = Property.getProperty(Constant.OR_FILE, "linkMastercardPageTitle").replace("=", ",");
	String mastercardLastName = Property.getProperty(Constant.OR_FILE, "mastercardLastName");
	String mastercardYOB = Property.getProperty(Constant.OR_FILE, "mastercardYOB");
	String mastercardYear = Property.getProperty(Constant.OR_FILE, "mastercardYear");
	String mastercardMOB = Property.getProperty(Constant.OR_FILE, "mastercardMOB");
	String mastercardDOB = Property.getProperty(Constant.OR_FILE, "mastercardDOB");
	String mastercardPostalCode = Property.getProperty(Constant.OR_FILE, "mastercardPostalCode");
	String mastercardCardInput = Property.getProperty(Constant.OR_FILE, "mastercardCardInput");
	String mastercardMonth = Property.getProperty(Constant.OR_FILE, "mastercardMonth");
	String mastercardDate = Property.getProperty(Constant.OR_FILE, "mastercardDate");
	String incorrectMasterCardError = Property.getProperty(Constant.OR_FILE, "incorrectMasterCardError");
	String customerCareNo = Property.getProperty(Constant.OR_FILE, "customerCareNo");
	
	
	/**
	 * gets Locator - Link MasterCard (Title)
	 * 
	 */
	
	public String get_Link_MasterCard_Title() {
		return linkMastercardPageTitle;
	}
	
	/**
	 * gets Locator -  MasterCard LastName field
	 * 
	 */
	
	public String get_MasterCard_LastName() {
		return mastercardLastName;
	}
	
	/**
	 * gets Locator -  MasterCard YOB field
	 * 
	 */
	
	public String get_MasterCard_YOB() {
		return mastercardYOB;
	}
	
	/**
	 * gets Locator -  MasterCard Year 
	 * 
	 */
	
	public String get_MasterCard_Year() {
		return mastercardYear;
	}
	
	/**
	 * gets Locator -  MasterCard MOB field
	 * 
	 */
	
	public String get_MasterCard_MOB() {
		return mastercardMOB;
	}
	
	/**
	 * gets Locator -  MasterCard Postal code 
	 * 
	 */
	
	public String get_MasterCard_Postal_Code() {
		return mastercardPostalCode;
	}
	
	/**
	 * gets Locator -  MasterCard DOB field
	 * 
	 */
	
	public String get_MasterCard_DOB() {
		return mastercardDOB;
	}
	
	/**
	 * gets Locator -  MasterCard Input Field 
	 * 
	 */
	
	public String get_MasterCard_Input() {
		return mastercardCardInput;
	}
	
	/**
	 * gets Locator -  MasterCard Date
	 * 
	 */
	
	public String get_MasterCard_Date() {
		return mastercardDate;
	}
	
	/**
	 * gets Locator -  MasterCard Month
	 * 
	 */
	
	public String get_MasterCard_Month() {
		return mastercardMonth;
	}
	
	/**
	 * gets Locator -  MasterCard DOB field
	 * 
	 */
	
	public String get_MasterCard_Incorrect_Card_Error() {
		return incorrectMasterCardError;
	}

	/**
	 * gets Locator -  Customer care no
	 * 
	 */
	
	public String get_Customer_Contact_No() {
		return customerCareNo;
	}
}
