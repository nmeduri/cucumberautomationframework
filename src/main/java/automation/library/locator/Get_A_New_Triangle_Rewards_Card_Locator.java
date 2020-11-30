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
	String yearOfBirth = Property.getProperty(Constant.OR_FILE, "yearOfBirth").replace("=", ",");
	String yearOfBirthValue = Property.getProperty(Constant.OR_FILE, "yearOfBirthValue");
	String province = Property.getProperty(Constant.OR_FILE, "province");
	String provinceValue = Property.getProperty(Constant.OR_FILE, "provinceValue");
	String continueButton = Property.getProperty(Constant.OR_FILE, "continueButton").replace("=", ",");
	String completeYourProfileCancel = Property.getProperty(Constant.OR_FILE, "completeYourProfileCancel");
	String successMessage = Property.getProperty(Constant.OR_FILE, "successMessage");
	String successCardNo = Property.getProperty(Constant.OR_FILE, "successCardNo");
	String phnError = Property.getProperty(Constant.OR_FILE, "phnError");
	String yearOfBirthValueAgeMajority=Property.getProperty(Constant.OR_FILE, "yearOfBirthValueAgeMajority");
	String yearOfBirthValueNoAgeMajority=Property.getProperty(Constant.OR_FILE, "yearOfBirthValueNoAgeMajority");
	String monthOfBirth=Property.getProperty(Constant.OR_FILE, "monthOfBirth");
	String DOB=Property.getProperty(Constant.OR_FILE, "DOB");
	String monthValue=Property.getProperty(Constant.OR_FILE, "monthValue");
	String monthValueAfterCurrentdate=Property.getProperty(Constant.OR_FILE, "monthValueAfterCurrentdate");
	String DOBValue=Property.getProperty(Constant.OR_FILE, "DOBValue");
	String yearOfBirthCompleteYourProfile=Property.getProperty(Constant.OR_FILE, "yearOfBirthCompleteYourProfile");
	
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
	 * gets Locator - Year of Birth Value for age majority check
	 * 
	 */
	
	public String get_Year_Of_Birth_Value_Age_Majority() throws Exception {
		return yearOfBirthValueAgeMajority;
	}
	/**
	 * gets Locator - Year of Birth Value for not reach age majority check
	 * 
	 */
	
	public String get_Year_Of_Birth_Value_No_Age_Majority() throws Exception {
		return yearOfBirthValueNoAgeMajority;
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
	
	/**
	 * gets Locator - Cancel Link
	 * 
	 */
	
	public String get_Cancel_Link() throws Exception {
		return completeYourProfileCancel;
	}
	
	/**
	 * gets Locator - Success message
	 * 
	 */
	
	public String get_Success_Message() throws Exception {
		return successMessage;
	}
	
	/**
	 * gets Locator - Success Card Number
	 * 
	 */
	
	public String get_Success_CardNo() throws Exception {
		return successCardNo;
	}
	
	/**
	 * gets Locator - Phone Error
	 * 
	 */
	
	public String get_Phone_Error() throws Exception {
		return phnError;
	}

	
	/**
	 * gets Locator - Month of birth dropdown
	 * 
	 */
	
	public String get_MonthOfBirth() throws Exception {
		return monthOfBirth;
	}
	/**
	 * gets Locator - date of birth dropdown
	 * 
	 */
	
	public String get_dateOfBirth() throws Exception {
		return DOB;
	}
	/**
	 * gets Locator - date of birth value
	 * 
	 */
	
	public String get_dateOfBirthValue() throws Exception {
		return DOBValue;
	}
	/**
	 * gets Locator - month of birth dropdown
	 * 
	 */
	
	public String get_monthOfBirthValue() throws Exception {
		return monthValue;
	}
	/**
	 * gets Locator - month of birth value after current date
	 * 
	 */
	
	public String get_monthOfBirth_afterCurrentdate() throws Exception {
		return monthValueAfterCurrentdate;
	}
	
	/**
	 * gets Locator - complete your profile Province Value
	 * 
	 */
	
	public String get_YOB_CYP() throws Exception {
		return yearOfBirthCompleteYourProfile;
	}
 }

