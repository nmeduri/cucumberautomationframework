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
	
	
}
