package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Link MasterCard 
 * 
 */

public class Link_MasterCard_Page_Locator {
	
	String linkMastercardPageTitle = Property.getProperty(Constant.OR_FILE, "linkMastercardPageTitle");
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
	String lastNameLabel = Property.getProperty(Constant.OR_FILE, "lastNameLabel");
	String continueButtonLabelMasterCard = Property.getProperty(Constant.OR_FILE, "continueButtonLabelMasterCard");
	String cancelButtonMasterCard = Property.getProperty(Constant.OR_FILE, "cancelButtonMasterCard");
	String alreadyLinkedMastercardYear = Property.getProperty(Constant.OR_FILE, "alreadyLinkedMastercardYear");
	String alreadyLinkedMastercardMonth = Property.getProperty(Constant.OR_FILE, "alreadyLinkedMastercardMonth");
	String alreadyLinkedMastercardDate = Property.getProperty(Constant.OR_FILE, "alreadyLinkedMastercardDate");
	String masterCardAlreadyLinkedErrorMessage = Property.getProperty(Constant.OR_FILE, "masterCardAlreadyLinkedErrorMessage").replace("=", ",");
	String masterCardContinueButton = Property.getProperty(Constant.OR_FILE, "masterCardContinueButton");
	String ompCardContinueButton = Property.getProperty(Constant.OR_FILE, "ompCardContinueButton");
	String contactNumberLink = Property.getProperty(Constant.OR_FILE, "contactNumberLink");
	String ompCardYOB = Property.getProperty(Constant.OR_FILE, "ompCardYOB");
	String ompCardLastName = Property.getProperty(Constant.OR_FILE, "ompCardLastName");
	String ompCardInput = Property.getProperty(Constant.OR_FILE, "ompCardInput");
	String ompCardMOB = Property.getProperty(Constant.OR_FILE, "ompCardMOB");
	String ompCardDOB = Property.getProperty(Constant.OR_FILE, "ompCardDOB");
	String ompCardPostalCode = Property.getProperty(Constant.OR_FILE, "ompCardPostalCode");
	String ompCardYear = Property.getProperty(Constant.OR_FILE, "ompCardYear");
	String ompCardMonth = Property.getProperty(Constant.OR_FILE, "ompCardMonth");
	String ompCardDate = Property.getProperty(Constant.OR_FILE, "ompCardDate");
	String ompCardNo = Property.getProperty(Constant.OR_FILE, "ompCardNo");
	String ompCardError = Property.getProperty(Constant.OR_FILE, "ompCardError");
	String ompCardErrorMessage = Property.getProperty(Constant.OR_FILE, "ompCardErrorMessage");
	String callpopupMessage = Property.getProperty(Constant.OR_FILE, "callpopupMessage");
	
	
	
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
	 * gets Locator -  OMPCARD MOB field
	 * 
	 */
	
	public String get_OMPCard_MOB() {
		return ompCardMOB;
	}
	
	
	/**
	 * gets Locator -  MasterCard Postal code 
	 * 
	 */
	
	public String get_MasterCard_Postal_Code() {
		return mastercardPostalCode;
	}
	
	
	
	/**
	 * gets Locator -  MasterCard Postal code 
	 * 
	 */
	
	public String get_OMPCard_Postal_Code() {
		return ompCardPostalCode;
	}
	
	
	/**
	 * gets Locator -  MasterCard DOB field
	 * 
	 */
	
	/**
	 * gets Locator -  MasterCard Postal code 
	 * 
	 */
	
	public String get_ompCard_Postal_Code() {
		return ompCardPostalCode;
	}
	
	/**
	 * gets Locator -  MasterCard DOB field
	 * 
	 */
	
	public String get_MasterCard_DOB() {
		return mastercardDOB;
	}
	
	
	/**
	 * gets Locator -  OMP card DOB field
	 * 
	 */
	
	public String get_OMPCard_DOB() {
		return ompCardDOB;
	}
	
	
	/**
	 * gets Locator -  MasterCard Input Field 
	 * 
	 */
	
	/**
	 * gets Locator -  MasterCard DOB field
	 * 
	 */
	
	public String get_ompCard_DOB() {
		return ompCardDOB;
	}
	
	/**
	 * gets Locator -  MasterCard Input Field 
	 * 
	 */
	
	public String get_MasterCard_Input() {
		return mastercardCardInput;
	}
	
	
	/**
	 * gets Locator -  ompCard Input Field 
	 * 
	 */
	
	public String get_OMPCard_Input() {
		return ompCardInput;
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
	 * gets Locator -  ompCard error
	 * 
	 */
	
	public String get_ompCard_Error() {
		return ompCardError;
	}
	
	
	
	/**
	 * gets Locator -  Customer care no
	 * 
	 */
	
	public String get_Customer_Contact_No() {
		return customerCareNo;
	}
	
	/**
	 * get Locator - Last Name Label
	 */
	public String getLastNameLabel() {
		return lastNameLabel;
	}
	
	/**
	 * get Locator - Continue Button Label
	 */
	public String getContinueButtonLabel() {
		return continueButtonLabelMasterCard;
	}
	
	/**
	 * get Locator - Cancel Button
	 */
	public String getCancelButtonMasterCard() {
		return cancelButtonMasterCard;
	}
	
	/**
	 * gets Locator -  Already Linked MasterCard year
	 * 
	 */
	
	public String get_Already_Linked_MasterCard_Year() {
		return alreadyLinkedMastercardYear;
	}
	
	
	/**
	 * gets Locator -  OMPCard year
	 * 
	 */
	
	public String get_OMP_Card_Year() {
		return ompCardYear;
	}
	
	/**
	 * gets Locator - Already Linked MasterCard Month
	 * 
	 */
	
	public String get_Already_Linked_MasterCard_Month() {
		return alreadyLinkedMastercardMonth;
	}
	
	
	
	
	/**
	 * gets Locator - OMPCard Month
	 * 
	 */
	
	public String get_OMP_Card_Month() {
		return ompCardMonth;
	}
	
	
	/**
	 * get Locator - Already Linked MasterCard Date
	 */
	public String get_Already_Linked_MasterCard_Date() {
		return alreadyLinkedMastercardDate;
	}
	
	
	/**
	 * get Locator - ompCard Date
	 */
	public String get_OMP_Card_Date() {
		return ompCardDate;
	}
	
	
	/**
	 * get Locator - ompCard Number
	 */
	public String get_OMP_Card_Number() {
		return ompCardNo;
	}
	
	/**
	 * get Locator - Already Linked MasterCard error message
	 */
	public String get_Already_Linked_MasterCard_Error_Message() {
		return masterCardAlreadyLinkedErrorMessage;
	}
	
	
	
	/**
	 * get Locator - Already Linked MasterCard error message
	 */
	public String get_ompCard_Error_Message() {
		return ompCardErrorMessage;
	}
	
	
	
	
	/**
	 * get Locator - Already Linked MasterCard error message
	 */
	public String get_call_popup_link() {
		return callpopupMessage;
	}
	
	
	
	/**
	 * gets Locator - Continue button mobile
	 * 
	 */
	
	public String get_Continue_button_Mobile() {
		return ompCardContinueButton;
	}
	
	/**
	 * gets Locator - contact number link
	 * 
	 */
	
	public String get_Contact_Number_Link() {
		return contactNumberLink;
	}
	
	/**
	 * get Locator - MasterCard Continue
	 */
	public String get_MasterCard_ContinueButton() {
		return masterCardContinueButton;
	}
	
	
	
	/**
	 * get Locator - ContactNumber 
	 */
	public String get_ContactNumber() {
		return contactNumberLink;
	}
	
	/**
	 * get Locator - MasterCard Continue
	 */
	public String get_ompCard_ContinueButton() {
		return ompCardContinueButton;
	}
	
}
