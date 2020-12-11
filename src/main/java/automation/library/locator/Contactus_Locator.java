package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the Locator of PDP Page
 * 
 */
public class Contactus_Locator {
	
	String firstNameContactUs = Property.getProperty(Constant.OR_FILE, "firstNameContactUs");
	String lastNameContactUs = Property.getProperty(Constant.OR_FILE, "lastNameContactUs");
	String emailContactUs = Property.getProperty(Constant.OR_FILE, "emailContactUs");
	String orderNameContactUs = Property.getProperty(Constant.OR_FILE, "orderNameContactUs");
	String invalidOrderNumberErrorMessage = Property.getProperty(Constant.OR_FILE, "invalidOrderNumberErrorMessage");
	String invalidFirstNameErrorMessage = Property.getProperty(Constant.OR_FILE, "invalidFirstNameErrorMessage");
	String invalidLastNameErrorMessage = Property.getProperty(Constant.OR_FILE, "invalidLastNameErrorMessage");
	String invalidEmailErrorMessage = Property.getProperty(Constant.OR_FILE, "invalidEmailErrorMessage");
	String sendMessageButton = Property.getProperty(Constant.OR_FILE, "sendMessageButton");
	String emptyFirstName = Property.getProperty(Constant.OR_FILE, "emptyFirstName");
	String emptyLastName = Property.getProperty(Constant.OR_FILE, "emptyLastName");
	String emptyEmail = Property.getProperty(Constant.OR_FILE, "emptyEmail");
	String contactUsFormTitle = Property.getProperty(Constant.OR_FILE, "contactUsFormTitle");
	String pleaseSelectSubjectDropDown = Property.getProperty(Constant.OR_FILE, "pleaseSelectSubjectDropDown");
	String additionalInformation = Property.getProperty(Constant.OR_FILE, "additionalInformation");
	String pleaseSelectDropDownOption = Property.getProperty(Constant.OR_FILE, "pleaseSelectDropDownOption");
	String pleaseSelectDropDownSelectedValue = Property.getProperty(Constant.OR_FILE, "pleaseSelectDropDownSelectedValue");
	String additionalInformationCharCount = Property.getProperty(Constant.OR_FILE, "additionalInformationCharCount");
	String labelFirstNameContact = Property.getProperty(Constant.OR_FILE, "labelFirstNameContact");
	String labelLastNameContact = Property.getProperty(Constant.OR_FILE, "labelLastNameContact");
	String contactFormSubmitConfirmationMessage = Property.getProperty(Constant.OR_FILE, "contactFormSubmitConfirmationMessage");
	String continueShoppingButtonContact = Property.getProperty(Constant.OR_FILE, "continueShoppingButtonContact");
	String candianTireLogoHomePage = Property.getProperty(Constant.OR_FILE, "candianTireLogoHomePage");
	
	/**
	 * gets Locator - First Name
	 * 
	 */
	
	public String get_First_Name() {
		
		return firstNameContactUs;
	}
	
	/**
	 * gets Locator - Last Name
	 * 
	 */
	
	public String get_Last_Name() {
		
		return lastNameContactUs;
	}
	
	/**
	 * gets Locator - Email
	 * 
	 */
	
	public String get_Email() {
		
		return emailContactUs;
	}
	
	/**
	 * gets Locator - Order Number
	 * 
	 */
	
	public String get_Order_Number() {
		
		return orderNameContactUs;
	}
	
	/**
	 * gets Locator - Invalid Order Number (Error Message)
	 * 
	 */
	
	public String get_Invalid_Order_Number_Error_Message() {
		
		return invalidOrderNumberErrorMessage;
	}
	
	/**
	 * gets Locator - First Name (Error Message)
	 * 
	 */
	
	public String get_Invalid_First_Name_Error_Message() {
		
		return invalidFirstNameErrorMessage;
	}
	
	/**
	 * gets Locator - Last Name (Error Message)
	 * 
	 */
	
	public String get_Invalid_Last_Name_Error_Message() {
		
		return invalidLastNameErrorMessage;
	}
	
	/**
	 * gets Locator - Email (Error Message)
	 * 
	 */
	
	public String get_Invalid_Email_Error_Message() {
		
		return invalidEmailErrorMessage;
	}
	
	/**
	 * gets Locator - Send Message Button
	 */
	public String get_Send_Message_Button() {
		return sendMessageButton;
	}
	
	/**
	 * gets Locator - Empty Error Message (First Name)
	 */
	public String get_Error_Message_Empty_First_Name() {
		return emptyFirstName;
	}
	
	/**
	 * gets Locator - Empty Error Message (Last Name)
	 */
	public String get_Error_Message_Empty_Last_Name() {
		return emptyLastName;
	}
	
	/**
	 * gets Locator - Empty Error Message (Email)
	 */
	public String get_Error_Message_Empty_Email() {
		return emptyEmail;
	}
	
	/** 
	 * gets Locator - Contact Us Form
	 */
	public String get_Contact_Us_Form_Title() {
		return contactUsFormTitle;
	}
	
	/**
	 * gets Locator - Please select subject (Drop Down)
	 */
	public String get_Please_Select_Subject() {
		return pleaseSelectSubjectDropDown;
	}
	
	/**
	 * gets Locator - Additional Information
	 */
	public String get_Additional_Information() {
		return additionalInformation;
	}
	
	/**
	 * gets Locator - Drop Down Option (Please Select Subject)
	 */
	public String get_Please_Select_Subject_Drop_Down_Option() throws Exception {
		return pleaseSelectDropDownOption;
	}
	
	/**
	 * gets Locator - Please Select Subject Drop Down Value (Selected)
	 */
	public String get_Selected_Value_Drop_Down_Please_Select_Subject() throws Exception {
		return pleaseSelectDropDownSelectedValue;
	}
	
	/**
	 * gets Locator - Additional Information Character Count
	 */
	public String get_Additional_Information_Character_Count() throws Exception {
		return additionalInformationCharCount;
	}
	
	/**
	 * gets Locator - First Name (Label)
	 */
	public String get_First_Name_Label() throws Exception {
		return labelFirstNameContact;
	}
	
	/**
	 * gets Locator - Last Name (Label)
	 */
 	public String get_Last_Name_Label() throws Exception {
 		return labelLastNameContact;
 	}
 	
 	/**
 	 * gets Locator - Contact Form Submission (Confirmation Message)
 	 */
 	public String get_Confirmation_Message_Form_Submit() throws Exception {
 		return contactFormSubmitConfirmationMessage;
 	}
 	
 	/**
 	 * gets Locator - Continue Shopping Button
 	 */
 	public String get_Continue_Shopping_Button() throws Exception {
 		return continueShoppingButtonContact;
 	}
 	
 	/**
 	 * gets Locator - Canadian Tire Logo 
 	 */
 	public String get_Canadian_Tire_Logo() throws Exception {
 		return candianTireLogoHomePage;
 	}
 }





