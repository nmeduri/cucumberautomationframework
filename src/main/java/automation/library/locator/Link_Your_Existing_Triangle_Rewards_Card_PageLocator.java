package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains locator of Footer
 * 
 */

public class Link_Your_Existing_Triangle_Rewards_Card_PageLocator {
	
	String enterCardNumber = Property.getProperty(Constant.OR_FILE, "enterCardNumber");
	String continueButton = Property.getProperty(Constant.OR_FILE, "continueButton");
	String tryAgainButton = Property.getProperty(Constant.OR_FILE, "tryAgainButton");
	String cancelButtonExistingCard = Property.getProperty(Constant.OR_FILE, "cancelButtonExistingCard");
	String deactivatedErrorMessage = Property.getProperty(Constant.OR_FILE, "deactivatedErrorMessage");
	String errorImage = Property.getProperty(Constant.OR_FILE, "errorImage");
	String deactivatedErrorText = Property.getProperty(Constant.OR_FILE, "deactivatedErrorText");
	String triangleIdLogo = Property.getProperty(Constant.OR_FILE, "triangleIdLogo");
	String postalCode_ActivateCard = Property.getProperty(Constant.OR_FILE, "postalCode_ActivateCard");
	String YOB_ActivateCard = Property.getProperty(Constant.OR_FILE, "YOB_ActivateCard");
	
	/**
	 * gets Locator - Enter Card number
	 * 
	 */
	
	public String get_Enter_Card_Number() {
		return enterCardNumber;
	}
	
	/**
	 * gets Locator - Continue button
	 * 
	 */
	
	public String get_Continue_Button() {
		return continueButton;
	}
	
	/**
	 * gets Locator - Try Again button
	 * 
	 */
	
	public String get_TryAgain_Button() {
		return tryAgainButton;
	}
	
	/**
	 * gets Locator - Cancel button
	 * 
	 */
	
	public String get_Cancel_Button() {
		return cancelButtonExistingCard;
	}
	
	/**
	 * gets Locator - Deactivated Error message
	 * 
	 */
	
	public String get_Deactivated_Error_Message() {
		return deactivatedErrorMessage;
	}
	
	/**
	 * gets Locator - Error Image
	 * 
	 */
	
	public String get_Error_Image() {
		return errorImage;
	}
	
	/**
	 * gets Locator - Deactivated Error Text
	 * 
	 */
	public String get_Deactivated_Error_Text() {
		return deactivatedErrorText;
	}
	
	/**
	 * gets Locator - Triangle Id Logo
	 * 
	 */
	public String get_TriangleId_Logo() {
		return triangleIdLogo;
	}
	/**
	 * gets Locator - year of birth in active card
	 * 
	 */
	public String get_YOB_ActivateCard() {
		return YOB_ActivateCard;
	}
	/**
	 * gets Locator - Postal code in active card
	 * 
	 */
	public String get_PostalCode_ActivateCard() {
		return postalCode_ActivateCard;
	}
	
 }

