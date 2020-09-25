package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Get A New Triangle Rewards Card
 * 
 */

public class Get_A_New_Triangle_Rewards_Card_Locator {
	
	String getaNewTriangleRewardsCardTitle = Property.getProperty(Constant.OR_FILE, "getaNewTriangleRewardsCardTitle");
	String firstNameRewards = Property.getProperty(Constant.OR_FILE, "firstNameRewards");
	String lastNameRewards = Property.getProperty(Constant.OR_FILE, "lastNameRewards");
	String addressRewards = Property.getProperty(Constant.OR_FILE, "addressRewards");
	String cityRewards = Property.getProperty(Constant.OR_FILE, "cityRewards");
	String postalCodeRewards = Property.getProperty(Constant.OR_FILE, "postalCodeRewards");
	String phoneNumberRewards = Property.getProperty(Constant.OR_FILE, "phoneNumberRewards");
	String yearOfBirth = Property.getProperty(Constant.OR_FILE, "yearOfBirth");
	String yearOfBirthValue = Property.getProperty(Constant.OR_FILE, "yearOfBirthValue");
	String province = Property.getProperty(Constant.OR_FILE, "province");
	String provinceValue = Property.getProperty(Constant.OR_FILE, "provinceValue");
	String continueButton = Property.getProperty(Constant.OR_FILE, "continueButton");
	
	/**
	 * gets Locator - Header Get A New Triangle Rewards Card Title
	 * 
	 */
	
	public String get_A_New_Triangle_Rewards_Card_Title() {
		
		return getaNewTriangleRewardsCardTitle;
	}
	
	/**
	 * gets Locator - Get First Name
	 * 
	 */
	
	public String get_First_Name() throws Exception {
		return firstNameRewards;
	}
	
	/**
	 * gets Locator - Last Name
	 * 
	 */
	
	public String get_Last_Name() throws Exception {
		return lastNameRewards;
	}
	
	/**
	 * gets Locator - Address
	 * 
	 */
	
	public String get_Address_Rewards() throws Exception {
		return addressRewards;
	}
	
	/**
	 * gets Locator - City
	 * 
	 */
	
	public String get_City_Rewards() throws Exception {
		return cityRewards;
	}
	
	/**
	 * gets Locator - Postal Code
	 * 
	 */
	
	public String get_Postal_Code_Rewards() throws Exception {
		return postalCodeRewards;
	}
	
	/**
	 * gets Locator - Phone Number
	 * 
	 */
	
	public String get_Phone_Number() throws Exception {
		return phoneNumberRewards;
	}
	
	/**
	 * gets Locator - Year of Birth (Drop Down)
	 * 
	 */
	
	public String get_Year_Of_Birth() throws Exception {
		return yearOfBirth;
	}
	
	/**
	 * gets Locator - Year of Birth Value
	 * 
	 */
	
	public String get_Year_Of_Birth_Value() throws Exception {
		return yearOfBirthValue;
	}
	
	/**
	 * gets Locator - Province (Drop Down)
	 * 
	 */
	
	public String get_Province() throws Exception {
		return province;
	}
	
	/**
	 * gets Locator - Province Value
	 * 
	 */
	
	public String get_Province_Value() throws Exception {
		return provinceValue;
	}
	
	/**
	 * gets Locator - Continue Button
	 * 
	 */
	
	public String get_Continue_Button() throws Exception {
		return continueButton;
	}
 }

