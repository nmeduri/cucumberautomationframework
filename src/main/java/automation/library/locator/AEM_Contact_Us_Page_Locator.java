package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Contact Us page
 * 
 */
public class AEM_Contact_Us_Page_Locator {
		
	String contactUsComponentAEM = Property.getProperty(Constant.OR_FILE, "contactUsComponentAEM");
	String selectEmailIcon = Property.getProperty(Constant.OR_FILE, "selectEmailIcon");
	String emailIconValue = Property.getProperty(Constant.OR_FILE, "emailIconValue");
	String emailTitle = Property.getProperty(Constant.OR_FILE, "emailTitle");
	String selectFormatForPromoTiles = Property.getProperty(Constant.OR_FILE, "selectFormatForPromoTiles");
	String emailLinkLabel = Property.getProperty(Constant.OR_FILE, "emailLinkLabel");
	String emailLinkValue = Property.getProperty(Constant.OR_FILE, "emailLinkValue");
	String emailLinkTarget = Property.getProperty(Constant.OR_FILE, "emailLinkTarget");
	String emailLinkTargetValue = Property.getProperty(Constant.OR_FILE, "emailLinkTargetValue");
	String selectFormatForPromoTilesValue = Property.getProperty(Constant.OR_FILE, "selectFormatForPromoTilesValue");
	String emailIcon = Property.getProperty(Constant.OR_FILE, "emailIcon");
	String emailText = Property.getProperty(Constant.OR_FILE, "emailText");
	String completeThisFormText = Property.getProperty(Constant.OR_FILE, "completeThisFormText");
	String clickcontactus = Property.getProperty(Constant.OR_FILE, "clickcontactus");
	String contactinfotitle = Property.getProperty(Constant.OR_FILE, "contactinfotitle");
	String subjectlabel = Property.getProperty(Constant.OR_FILE, "subjectlabel");
	String storedetailsaem = Property.getProperty(Constant.OR_FILE, "storedetailsaem");
	String compavailability = Property.getProperty(Constant.OR_FILE, "compavailability");
	String directionlabel = Property.getProperty(Constant.OR_FILE, "directionlabel");

	/**
	 * get Locator Contact Us Component AEM
	 */
	public String getcontactUsComponentAEM() {
		return contactUsComponentAEM;
	}
	
	/**
	 * get Locator Contact Us Component CN
	 */
	public String getcontactUsComponentCN() {
		return clickcontactus;
	}
	/**
	 * get Locator Select Email Icon AEM
	 */
	public String getSelectEmailIconAEM() {
		return selectEmailIcon;
	}
	/**
	 * get Locator Email Icon Value AEM
	 */
	public String getEmailIconValue() {
		return emailIconValue;
	}
	/**
	 * get Locator Email Title AEM
	 */
	public String getEmailTitleAEM() {
		return emailTitle;
	}
	/**
	 * get Locator Email Link Label AEM
	 */
	public String getEmailLinkLabelAEM() {
		return emailLinkLabel;
	}
	/**
	 * get Locator Email Link AEM
	 */
	public String getEmailLinkValueAEM() {
		return emailLinkValue;
	}
	/**
	 * get Locator Select Format For Promo Tiles AEM
	 */
	public String getSelectFormatForPromoTilesAEM() {
		return selectFormatForPromoTiles;
	}
	/**
	 * get Locator Email Link Target AEM
	 */
	public String getEmailLinkTargetAEM() {
		return emailLinkTarget;
	}
	/**
	 * get Locator Email Link Target Value AEM
	 */
	public String getEmailLinkTargetValueAEM() {
		return emailLinkTargetValue;
	}
	/**
	 * get Locator Select Format For Promo Tiles Values AEM
	 */
	public String getSelectFormatForPromoTilesValuesAEM() {
		return selectFormatForPromoTilesValue;
	}
	/**
	 * get Locator Email Icon AEM preview
	 */
	public String getEmailIconAEM() {
		return emailIcon;
	}
	/**
	 * get Locator Email Text AEM
	 */
	public String getEmailTextAEM() {
		return emailText;
	}
	/**
	 * get Locator Complete This Form Text AEM   
	 */
	public String getCompleteThisFormTextAEM() {
		return completeThisFormText;
	}
	
	/**
	 * get Locator Complete This Form Text AEM   
	 */
	public String getcontactInfoTitle() {
		return contactinfotitle;
	}
	
	/**
	 * get Locator  subjectlabel
	 */
	public String getsubjectLabel() {
		return subjectlabel;
	}
	
	/**
	 * get Locator store details AEM   
	 */
	public String getStoreDetailsAEM() {
		return storedetailsaem;
	}
	
	/**
	 * get Locator verifyComponentsAvailabilityInOrder   
	 */
	public String verifyComponentsAvailabilityInOrder() {
		return compavailability;
	}
	
	/**
	 * get Locator getDirectionCTALabel   
	 */
	public String getDirectionCTALabel() {
		return directionlabel;
	}
}
