package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

/**
 * This file contains the locator of Get a new triangle Reward Page
 * 
 */
public class Link_reward_ProfileScreen_page_Locator {


	String getTriangleReward=Property.getProperty(Constant.OR_FILE, "getTriangleReward");
	String firstName=Property.getProperty(Constant.OR_FILE, "firstName");
	String lastName=Property.getProperty(Constant.OR_FILE, "lastName");
	String address=Property.getProperty(Constant.OR_FILE, "address");
	String city=Property.getProperty(Constant.OR_FILE, "city");
	String province=Property.getProperty(Constant.OR_FILE, "province");
	String postalCode=Property.getProperty(Constant.OR_FILE, "postalCode");
	String phnNumber=Property.getProperty(Constant.OR_FILE, "phnNumber");
	String Birth=Property.getProperty(Constant.OR_FILE, "Birth");
	String continuebtn= Property.getProperty(Constant.OR_FILE, "continue");
	String cancel=Property.getProperty(Constant.OR_FILE, "cancel");
	String YOBerror=Property.getProperty(Constant.OR_FILE, "YOBerror");
	String FNError=Property.getProperty(Constant.OR_FILE, "FNError");
	String LNError=Property.getProperty(Constant.OR_FILE, "LNError");
	String addressError=Property.getProperty(Constant.OR_FILE, "addressError");
	String cityError=Property.getProperty(Constant.OR_FILE, "cityError");
	String PinError=Property.getProperty(Constant.OR_FILE, "PinError");
	String provinceErr=Property.getProperty(Constant.OR_FILE, "provinceErr");
	String phnError=Property.getProperty(Constant.OR_FILE, "phnError");
	String provinceValue=Property.getProperty(Constant.OR_FILE, "provinceValue");
	String yearOfBirthValue=Property.getProperty(Constant.OR_FILE, "yearOfBirthValue");
	String monthOfBirth=Property.getProperty(Constant.OR_FILE, "monthOfBirth");
	String DOB=Property.getProperty(Constant.OR_FILE, "DOB");
	String monthValue=Property.getProperty(Constant.OR_FILE, "monthValue");
	String DOBValue=Property.getProperty(Constant.OR_FILE, "DOBValue");
    String InvalidLastnameError=Property.getProperty(Constant.OR_FILE, "InvalidLastnameError");
    String InvalidFirstnameError=Property.getProperty(Constant.OR_FILE, "InvalidFirstnameError");


    /**
	 * gets Locator - Triangle Reward
	 * 
	 */
	public String getTriangleReward() {

		return getTriangleReward;
	}	
	/**
	 * gets Locator - First Name
	 * 
	 */
	public String get_FirstName() {

		return firstName;
	}
	
	/**
	 * gets Locator - Last Name
	 * 
	 */
	public String get_LastName() {

		return lastName;
	}
	/**
	 * gets Locator - Address
	 * 
	 */
	public String get_address() {

		return address;
	}
	/**
	 * gets Locator - City
	 * 
	 */
	public String get_city() {

		return city;
	}
	/**
	 * gets Locator - Province
	 * 
	 */
	public String get_province() {

		return province;
	}
	/**
	 * gets Locator - Postal Code
	 * 
	 */
	public String get_PostalCode() {

		return postalCode;
	}
	/**
	 * gets Locator - Phone Number
	 * 
	 */
	public String get_phnNumber() {

		return phnNumber;
	}
	/**
	 * gets Locator - Date of Birth
	 * 
	 */
	public String get_Birth() {

		return Birth;
	}
	/**
	 * gets Locator - Continue Button
	 * 
	 */
	public String get_continuebtn() {

		return continuebtn;
	}
	/**
	 * gets Locator - Cancel Button
	 * 
	 */
	public String Get_cancel() {

		return cancel;
	}
	/**
	 * gets Locator - YOB Error
	 * 
	 */
	public String get_YOBerror() {

		return YOBerror;
	}
	/**
	 * gets Locator - First Name Error
	 * 
	 */
	public String get_FirstNameError() {

		return FNError;
	}
	/**
	 * gets Locator - Last Name Error
	 * 
	 */
	public String get_LastNameError() {

		return LNError;
	}
	/**
	 * gets Locator - Address Error
	 * 
	 */
	public String get_addressError() {

		return addressError;
	}
	/**
	 * gets Locator - City Error
	 * 
	 */
	public String get_cityError() {

		return cityError;
	}
	/**
	 * gets Locator - Postal Code Error
	 * 
	 */
	public String get_PostalCodeError() {
		return PinError;
	}
	/**
	 * gets Locator - Province Error
	 * 
	 */
	public String get_provinceErr() {
		return provinceErr;
	}
	/**
	 * gets Locator - Phone Number Error
	 * 
	 */
	public String get_phnError() {

		return phnError;
	}
	/**
	 * gets Locator - Province
	 * 
	 */
	public String set_Province() {

		return provinceValue;
	}
	/**
	 * gets Locator - Year
	 * 
	 */
	public String set_Year() {

		return yearOfBirthValue;
	}
	/**
	 * gets Locator - Month of Birth
	 * 
	 */
	public String get_MonthOfBirth() {

		return monthOfBirth;
	}
	
	/**
	 * gets Locator - Month of Birth value
	 * 
	 */
	public String get_MOBValue() {

		return monthValue;
	}
	
	/**
	 * gets Locator - Date of Birth
	 * 
	 */
	public String get_DateOfBirth() {

		return DOB;
	}
	
	/**
	 * gets Locator - Date of Birth Value
	 * 
	 */
	public String get_DOBValue() {

		return DOBValue;
	}
	
	/**
	 * gets Locator - Invalid First Name
	 * 
	 */
	public String get_InvalidFastName() {

		return InvalidFirstnameError;
	}
	/**
	 * gets Locator - Invalid Last name
	 * 
	 */
	public String get_InvalidLastName() {

		return InvalidLastnameError;
	}

}
