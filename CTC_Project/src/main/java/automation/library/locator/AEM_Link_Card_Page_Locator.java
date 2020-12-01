package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class AEM_Link_Card_Page_Locator {
	
	
	String linkCardPannel = Property.getProperty(Constant.OR_FILE, "linkCardPannel").replace("=", ",");
	String errorScreenAEMTab = Property.getProperty(Constant.OR_FILE, "errorScreenTabAEM");
	String linkCardErrorImageField = Property.getProperty(Constant.OR_FILE, "linkCardErrorImageField");
	String lastNameMasterCardAEM = Property.getProperty(Constant.OR_FILE, "lastNameMasterCardAEM");
	String yobMasterCardAEM = Property.getProperty(Constant.OR_FILE, "yobMasterCardAEM");
	String yearDetailMasterCardAEM = Property.getProperty(Constant.OR_FILE, "yearDetailMasterCardAEM");
	String mobMasterCardAEM = Property.getProperty(Constant.OR_FILE, "mobMasterCardAEM");
	String mobDetailMasterCardAEM = Property.getProperty(Constant.OR_FILE, "mobDetailMasterCardAEM");
	String dobMasterCardAEM = Property.getProperty(Constant.OR_FILE, "dobMasterCardAEM");
	String dobDetailMasterCardAEM = Property.getProperty(Constant.OR_FILE, "dobDetailMasterCardAEM");
	String postalCodeMasterCard = Property.getProperty(Constant.OR_FILE, "postalCodeMasterCard");
	String cardInputMasterCard = Property.getProperty(Constant.OR_FILE, "cardInputMasterCard");
	String errorImagePreview = Property.getProperty(Constant.OR_FILE, "errorImagePreview");
	String errorImageTextField = Property.getProperty(Constant.OR_FILE, "errorImageTextField");
	String linkCardTitleAEM = Property.getProperty(Constant.OR_FILE, "linkCardTitleAEM");
	String lastNameLinkMasterCardAEM = Property.getProperty(Constant.OR_FILE, "lastNameLinkMasterCardAEM");
	String successscreenTabAEMLinkCard = Property.getProperty(Constant.OR_FILE, "successscreenTabAEMLinkCard");
	String continueButtonMasterCard = Property.getProperty(Constant.OR_FILE, "continueButtonMasterCard");
	String cancelButtonMasterCardAEM = Property.getProperty(Constant.OR_FILE, "cancelButtonMasterCardAEM");
	String errorImageOption = Property.getProperty(Constant.OR_FILE, "errorImageOption");

    /**
	 * gets Locator - Specifications
	 * 
	 */
    
	public String getLinkCardPannel() {
		return linkCardPannel;	
	}
	
	/**
	 * 
	 * get Locator - Error Screen Tab
	 * 
	 */
	public String getErrorScreenTab() {
		return errorScreenAEMTab;
	}
	
	/**
	 * 
	 * get Locator - Link Card Error Image Field
	 * 
	 */
	public String getLinkCardErrorImageField() {
		return linkCardErrorImageField;
	}
	
	/**
	 * 
	 * get Locator - Last Name Master Card
	 * 
	 */
	public String getLastNameMasterCard() {
		return lastNameMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - Year of Birth Master Card
	 * 
	 */
	public String getYOBMasterCard() {
		return yobMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - Year Detail
	 * 
	 */
	
	public String getYearDetail() {
		return yearDetailMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - Month of Birth Master Card Detail
	 * 
	 */
	public String getMOBMasterCard() {
		return mobMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - MOB Detail
	 * 
	 */
	public String getMOBDetail() {
		return mobDetailMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - Date of Birth Mastet Card Detail
	 * 
	 */
	public String getDOBMasterCardDetail() {
		return dobMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - DOB Detail
	 * 
	 */
	public String getDOBDetail() {
		return dobDetailMasterCardAEM;
	}
	
	/**
	 * 
	 * get Locator - Postal Code
	 * 
	 */
	public String getPostalCode() {
		return postalCodeMasterCard;
	}
	
	/**
	 * 
	 * get Locator - Card Input
	 * 
	 */
	public String getCardInpput() {
		return cardInputMasterCard;
	}
	
	/**
	 * 
	 * get Locator - Error Image Preview
	 * 
	 */
	
	public String getErrorImagePublish() {
		return errorImagePreview;
	}
	
	/**
	 * 
	 * get Locator - Error Image Text Field
	 * 
	 */
	public String getErrorImageTextField() {
		return errorImageTextField;
	}
	
	/**
	 * get Locator - Link Card Title
	 */
	public String getLinkCardTitle() {
		return linkCardTitleAEM;
	}
	
	/**
	 * get Locator - Last Name Label
	 */
	public String get_Last_Name_Label() {
		return lastNameLinkMasterCardAEM;
	}
	
	/**
	 * get Locator - Success Screen Tab
	 */
	public String getSuccessScreenTab() {
		return successscreenTabAEMLinkCard;
	}
	
	/**
	 * get Locator - Continue Button
	 */
	public String getContinueButton() {
		return continueButtonMasterCard;
	}
	
	/**
	 * get Locator - Cancel Button
	 */
	public String getCancelButton() {
		return cancelButtonMasterCardAEM;
	}
	
	/**
	 * get Locator - Error Image Option
	 */
	public String getErrorImageOption() {
		return errorImageOption;
	}
	
	
}
