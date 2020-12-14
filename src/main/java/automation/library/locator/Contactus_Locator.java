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
	String contactUsPanelAEM = Property.getProperty(Constant.OR_FILE, "contactUsPanelAEM").replace("=", ",");
	String additionalInfoMaxCountAEM = Property.getProperty(Constant.OR_FILE, "additionalInfoMaxCountAEM");
	String maxCharAdditonalInfo = Property.getProperty(Constant.OR_FILE, "maxCharAdditonalInfo");
	String yourMessageSectionTitleAEM = Property.getProperty(Constant.OR_FILE, "yourMessageSectionTitleAEM");
	String yourMessageSectionTitle = Property.getProperty(Constant.OR_FILE, "yourMessageSectionTitle");
	String addNoteTextField = Property.getProperty(Constant.OR_FILE, "addNoteTextField");
	String addNoteText = Property.getProperty(Constant.OR_FILE, "addNoteText");
	String ctaButtonLabelAEM = Property.getProperty(Constant.OR_FILE, "ctaButtonLabelAEM");
	String successScreenTabContactAEM = Property.getProperty(Constant.OR_FILE, "successScreenTabContactAEM");
	String successCTALabelAEM = Property.getProperty(Constant.OR_FILE, "successCTALabelAEM");
	String mandatorySuccessLabelAEM = Property.getProperty(Constant.OR_FILE, "mandatorySuccessLabelAEM");
	String successCTAPathAEM = Property.getProperty(Constant.OR_FILE, "successCTAPathAEM");
	String successPathPabelAEM = Property.getProperty(Constant.OR_FILE, "successPathPabelAEM");
	String taretTabSameDifferent = Property.getProperty(Constant.OR_FILE, "taretTabSameDifferent");
	String formValidationMessageTab = Property.getProperty(Constant.OR_FILE, "formValidationMessageTab");
	String configurationTab = Property.getProperty(Constant.OR_FILE, "configurationTab");
	String addButtonDropDown = Property.getProperty(Constant.OR_FILE, "addButtonDropDown");
	String dropDownLabelAEM = Property.getProperty(Constant.OR_FILE, "dropDownLabelAEM");
	String idDropDownAEM = Property.getProperty(Constant.OR_FILE, "idDropDownAEM");
	String removeButtonDropDownOption = Property.getProperty(Constant.OR_FILE, "removeButtonDropDownOption");
	
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
 	
 	/**
 	 * gets Locator - Contact Us Panel
 	 */
 	public String get_Contact_Us_Panel_AEM() throws Exception {
 		return contactUsPanelAEM;
 	}
 	
 	/**
 	 * gets Locator - Additional Max Count
 	 */
 	public String get_Additional_Info_Max_Count_AEM() throws Exception {
 		return additionalInfoMaxCountAEM;
 	}
 	
 	/**
 	 * gets Locator - Max Char Additional Info
 	 */
 	public String get_Max_Char_Additional_Info() throws Exception {
 		return maxCharAdditonalInfo;
 	}
 	
 	/**
 	 * gets Locator - Your Message Section Title 
 	 */
 	public String get_Your_Message_Section_Title_AEM() throws Exception {
 		return yourMessageSectionTitleAEM;
 	}
 	
 	/**
 	 * gets Locator - Your Message section Title
 	 */
 	
 	public String get_Your_Message_Section_Title() throws Exception {
 		return yourMessageSectionTitle;
 	}
 	
 	/**
 	 * gets Locator - Add Note Text
 	 */
 	public String get_Add_Note_Text_AEM() throws Exception {
 		return addNoteTextField;
 	}
 	
 	/**
 	 * gets Locator - Add Note Text
 	 */
 	public String get_Add_Note_Text() throws Exception {
 		return addNoteText;
 	}
 	
 	/**
 	 * gets Locator - CTA Label
 	 */
 	public String get_CTA_Label_AEM() throws Exception {
 		return ctaButtonLabelAEM;
 	}
 	
 	/**
 	 * gets Locator - Success Screen Tab
 	 */
 	public String get_Success_Screen_Tab() throws Exception {
 		return successScreenTabContactAEM;
 	}
 	
 	/**
 	 * gets Locator - Success CTA Label
 	 */
 	public String get_Success_CTA_Label() throws Exception {
 		return successCTALabelAEM;
 	}
 	
 	/**
 	 * gets Locator - Success Label (Mandatory) 
 	 */
 	public String get_Success_Label_Mandatory() throws Exception {
 		return mandatorySuccessLabelAEM;
 	}
 	
 	/**
 	 * gets Locator - Success Path 
 	 */
 	public String get_Success_Path_AEM() throws Exception {
 		return successCTAPathAEM;
 	}
 	
 	/**
 	 * gets Locator - Success Path Label
 	 */
 	public String get_Success_Path_Label() throws Exception {
 		return successPathPabelAEM;
 	}
 	
 	/**
 	 * gets Locator - Target Tab (Same/Different)
 	 */
 	public String get_Target_Success_Open_Tab() throws Exception {
 		return taretTabSameDifferent;
 	}
 	
 	/**
 	 * gets Locator - Form Validation Message Tab
 	 */
 	public String get_Form_Validation_Message_Tab() throws Exception {
 		return formValidationMessageTab;
 	}
 	
 	/**
 	 * gets Locator - Configuration Tab
 	 */
 	public String get_Configuration_Tab() throws Exception {
 		return configurationTab;
 	}
 	
 	/**
 	 * gets Locator - Add Button
 	 */
 	public String get_Add_Button() throws Exception {
 		return addButtonDropDown;
 	}
 	
 	/**
 	 * gets Locator - Label Drop down
 	 */
 	public String get_Label_Drop_Down_AEM() throws Exception {
 		return dropDownLabelAEM;
 	}
 	
 	/**
 	 * gets Locator - ID Drop Down
 	 */
 	public String get_ID_Drop_Down_AEM() throws Exception {
 		return idDropDownAEM;
 	}
 	
 	/**
 	 * gets Locator - Remove Button (Drop Down Option)
 	 */
 	public String get_Remove_Button_Drop_Down_Option() throws Exception {
 		return removeButtonDropDownOption;
 	}
 }





