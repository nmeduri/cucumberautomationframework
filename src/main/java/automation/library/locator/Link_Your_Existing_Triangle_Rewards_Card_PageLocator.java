package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains locator of Footer
 * 
 */

public class Link_Your_Existing_Triangle_Rewards_Card_PageLocator {
	
	String enterCardNumber = Property.getProperty(Constant.OR_FILE, "enterCardNumber");
	
	String enterYOB = Property.getProperty(Constant.OR_FILE, "enterYOB");
	String continueButton = Property.getProperty(Constant.OR_FILE, "continueButton").replace("=", ",");
	String tryAgainButton = Property.getProperty(Constant.OR_FILE, "tryAgainButton");
	String cancelButtonExistingCard = Property.getProperty(Constant.OR_FILE, "cancelButtonExistingCard");
	String cancelButtonErrorScreen = Property.getProperty(Constant.OR_FILE, "cancelButtonErrorScreen");
	String deactivatedErrorMessage = Property.getProperty(Constant.OR_FILE, "deactivatedErrorMessage");
	String closedCardErrorMessage = Property.getProperty(Constant.OR_FILE, "closedCardErrorMessage");
	String nonExistingErrorMessage = Property.getProperty(Constant.OR_FILE, "nonexistingCardErrorMessage");
	String errorImage = Property.getProperty(Constant.OR_FILE, "errorImage");
	String deactivatedErrorText = Property.getProperty(Constant.OR_FILE, "deactivatedErrorText");
	String triangleIdLogo = Property.getProperty(Constant.OR_FILE, "triangleIdLogo");
	String linkYourExistingTriangleRewardCardTitle = Property.getProperty(Constant.OR_FILE, "linkYourExistingTriangleRewardCardTitle");
	String headerText = Property.getProperty(Constant.OR_FILE, "headerText");
	String subHeaderText = Property.getProperty(Constant.OR_FILE, "subHeaderText");
	String cardInputPrefilled = Property.getProperty(Constant.OR_FILE, "cardInputPrefilled");
	String tooltipMessage = Property.getProperty(Constant.OR_FILE, "tooltipMessage");
	String tooltip = Property.getProperty(Constant.OR_FILE, "tooltip");
	String generateCardLink = Property.getProperty(Constant.OR_FILE, "generateCardLink");
	String inlineErrorIncorrectFormat = Property.getProperty(Constant.OR_FILE, "inlineErrorIncorrectFormat");
	String invalidCardErrorMessage = Property.getProperty(Constant.OR_FILE, "invalidCardErrorMessage");
	String thresholdErrorMessage = Property.getProperty(Constant.OR_FILE, "thresholdErrorMessage");
	String alreadyEnrolledErrorMessage = Property.getProperty(Constant.OR_FILE, "alreadyEnrolledErrorMessage").replace("=", ",");
	String activeOwnershipValidationHeaderText = Property.getProperty(Constant.OR_FILE, "activeOwnershipValidationHeaderText").replace("=", ",");
	String activeOwnershipValidationSubHeaderText = Property.getProperty(Constant.OR_FILE, "activeOwnershipValidationSubHeaderText").replace("=", ",");
	String activeValidationErrorImg = Property.getProperty(Constant.OR_FILE, "activeValidationErrorImg");
	String activeValidationErrorText = Property.getProperty(Constant.OR_FILE, "activeValidationErrorText");
	String activeValidationTryAgain = Property.getProperty(Constant.OR_FILE, "activeValidationTryAgain");
	String activeValidationCancel = Property.getProperty(Constant.OR_FILE, "activeValidationCancel");
	String defaultErrorImage = Property.getProperty(Constant.OR_FILE, "defaultErrorImage");
	String defaultErrorContent = Property.getProperty(Constant.OR_FILE, "defaultErrorContent");
	String postalCodeInlineError = Property.getProperty(Constant.OR_FILE, "postalCodeInlineError");
	String yobInlineError = Property.getProperty(Constant.OR_FILE, "yobInlineError");
	String incorrectPostalCodeInlineError = Property.getProperty(Constant.OR_FILE, "incorrectPostalCodeInlineError");
	
	
	/**
	 * gets Locator - Enter Card number
	 * 
	 */
	
	public String get_Enter_Card_Number() {
		return enterCardNumber;
	}
	

	
	/**
	 * gets Locator - Enter Card number
	 * 
	 */
	
	public String get_Year_Of_Birth() {
		return enterYOB;
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
	 * gets Locator - Cancel button
	 * 
	 */
	
	public String get_Cancel_Button_error() {
		return cancelButtonErrorScreen;
	}
	
	/**
	 * gets Locator - Deactivated Error message
	 * 
	 */
	
	public String get_Deactivated_Error_Message() {
		return deactivatedErrorMessage;
	}
	/**
	 * gets Locator - Closed card Error message
	 * 
	 */
	
	public String get_ClosedCard_Error_Message() {
		return closedCardErrorMessage;
	}
	/**
	 * gets Locator - Non-Existing card Error message
	 * 
	 */
	
	public String get_nonExistingCard_Error_Message() {
		return nonExistingErrorMessage;
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
	 * gets Locator - Link Your Existing Triangle Reward Card Title
	 * 
	 */
	public String get_Link_Existing_Card_Title() {
		return linkYourExistingTriangleRewardCardTitle;
	}
	
	/**
	 * gets Locator - Header
	 * 
	 */
	
	public String get_Header() {
		return headerText;
	}
	
	/**
	 * gets Locator - Sub header
	 * 
	 */
	
	public String get_Sub_Header() {
		return subHeaderText;
	}
	
	/**
	 * gets Locator - Prefilled card input
	 * 
	 */
	
	public String get_Card_Input_Prefilled() {
		return cardInputPrefilled;
	}
	
	/**
	 * gets Locator - Tooltip message
	 * 
	 */
	
	public String get_Tooltip_Message() {
		return tooltipMessage;
	}
	
	/**
	 * gets Locator - Tooltip
	 * 
	 */
	public String get_Tooltip() {
		return tooltip;
	}
	
	/**
	 * gets Locator - generate card link
	 * 
	 */
	public String get_Generate_Card_link() {
		return generateCardLink;
	}
	
	/**
	 * gets Locator - get Inline error
	 * 
	 */
	public String get_Inline_Error() {
		return inlineErrorIncorrectFormat;
	}
	
	/**
	 * gets Locator - Invalid Card Error
	 * 
	 */
	public String get_Bad_Card_Error() {
		return invalidCardErrorMessage;
	}
	
	/**
	 * gets Locator - Threshold Card Error
	 * 
	 */
	public String get_Threshold_Card_Error() {
		return thresholdErrorMessage;
	}
	
	/**
	 * gets Locator - get Inline error
	 * 
	 */
	public String get_Already_Linked_Card_Error() {
		return alreadyEnrolledErrorMessage;
	}
	
	/**
	 * gets Locator - Header Text
	 * 
	 */
	public String get_Active_Ownership_Validation_HeaderText() {
		return activeOwnershipValidationHeaderText;
	}
	
	/**
	 * gets Locator - get Sub Header Text
	 * 
	 */
	public String get_Active_Ownership_Validation_Sub_HeaderText() {
		return activeOwnershipValidationSubHeaderText;
	}
	
	/**
	 * gets Locator - Active validation Error Img
	 * 
	 */
	public String get_Active_Error_Img() {
		return activeValidationErrorImg;
	}
	
	/**
	 * gets Locator - Active validation Error Text
	 * 
	 */
	public String get_Active_Error_Text() {
		return activeValidationErrorText;
	}
	
	/**
	 * gets Locator - Try Again
	 * 
	 */
	public String get_Active_TryAgain() {
		return activeValidationTryAgain;
	}
	
	/**
	 * gets Locator - Cancel
	 * 
	 */
	public String get_Active_Cancel() {
		return activeValidationCancel;
	}
	
	/**
	 * gets Locator - Default Error Image
	 * 
	 */
	public String get_Default_Error_Image() {
		return defaultErrorImage;
	}
	
	/**
	 * gets Locator - Default Error Image
	 * 
	 */
	public String get_Default_Error_Text() {
		return defaultErrorContent;
	}
	
	/**
	 * gets Locator - Postal code Inline Error
	 * 
	 */
	public String get_Mandatory_Postal_Code_Inline_Error() {
		return postalCodeInlineError;
	}
	
	/**
	 * gets Locator - YOB Inline Error
	 * 
	 */
	public String get_Mandatory_YOB_Inline_Error() {
		return yobInlineError;
	}
	
	/**
	 * gets Locator - Postal code Incorrect Error
	 * 
	 */
	public String get_Incorrect_Postal_Code_Inline_Error() {
		return incorrectPostalCodeInlineError;
	}
 }

