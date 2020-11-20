package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of AEM Link Existing Card 
 * 
 */

public class AEM_Link_Existing_Card_Page_Locator {

	String linkExistingCardTitleAEM = Property.getProperty(Constant.OR_FILE, "linkExistingCardTitleAEM").replace("=", ",");
	String titleField = Property.getProperty(Constant.OR_FILE, "titleField");
	String subTitleField = Property.getProperty(Constant.OR_FILE, "subTitleField");
	String toolTipLabel = Property.getProperty(Constant.OR_FILE, "toolTipLabel");
	String toolTipContent = Property.getProperty(Constant.OR_FILE, "toolTipContent");
	String dontHaveCardLabel = Property.getProperty(Constant.OR_FILE, "dontHaveCardLabel");
	String toolTipHeaderText = Property.getProperty(Constant.OR_FILE, "toolTipHeaderText");
	String getOneHereLabel = Property.getProperty(Constant.OR_FILE, "getOneHereLabel");
	String getOneHereLink = Property.getProperty(Constant.OR_FILE, "getOneHereLink");
	String existingCardCancelCTA = Property.getProperty(Constant.OR_FILE, "existingCardCancelCTA");
	String dontHaveCardPreview = Property.getProperty(Constant.OR_FILE, "dontHaveCardPreview").replace("=", ",");
	String inputField = Property.getProperty(Constant.OR_FILE, "inputField");
	String titleParagraphFormat = Property.getProperty(Constant.OR_FILE, "titleParagraphFormat");
	String titleHeadingFormat = Property.getProperty(Constant.OR_FILE, "titleHeadingFormat");
	String toolTipButtonPreview = Property.getProperty(Constant.OR_FILE, "toolTipButtonPreview");
	String toolTipHeaderTextPreview = Property.getProperty(Constant.OR_FILE, "toolTipHeaderTextPreview");
	String toolTipContentPreview = Property.getProperty(Constant.OR_FILE, "toolTipContentPreview");
	String getOneHerePreview = Property.getProperty(Constant.OR_FILE, "getOneHerePreview");
	String inputFieldPreview = Property.getProperty(Constant.OR_FILE, "inputFieldPreview");
	String linkExistingCardErrorScreenTab = Property.getProperty(Constant.OR_FILE, "linkExistingCardErrorScreenTab");
	String linkExistingCardTryAgainCTA = Property.getProperty(Constant.OR_FILE, "linkExistingCardTryAgainCTA");
	String linkExistingCardCancelCTA = Property.getProperty(Constant.OR_FILE, "linkExistingCardCancelCTA");
	String activeCardValidationTab = Property.getProperty(Constant.OR_FILE, "activeCardValidationTab");
	String activeRewardsCardTitle = Property.getProperty(Constant.OR_FILE, "activeRewardsCardTitle");
	String activeRewardsCardSubTitle = Property.getProperty(Constant.OR_FILE, "activeRewardsCardSubTitle");
	String yobInput = Property.getProperty(Constant.OR_FILE, "yobInput");
	String postalCodeInput = Property.getProperty(Constant.OR_FILE, "postalCodeInput");
	String activeCardContinue = Property.getProperty(Constant.OR_FILE, "activeCardContinue");
	String activeCardCancel = Property.getProperty(Constant.OR_FILE, "activeCardCancel");
	String postalCodeLabel = Property.getProperty(Constant.OR_FILE, "postalCodeLabel");
	String activeValidationErrorImg = Property.getProperty(Constant.OR_FILE, "activeValidationErrorImg");
	String activeValidationErrorTryAgain = Property.getProperty(Constant.OR_FILE, "activeValidationErrorTryAgain");
	String activeValidationErrorCancel = Property.getProperty(Constant.OR_FILE, "activeValidationErrorCancel");
	String activeValidationErrorText = Property.getProperty(Constant.OR_FILE, "activeValidationErrorText");
	String errorImageAlreayLinkCard = Property.getProperty(Constant.OR_FILE, "errorImageAlreayLinkCard");
	String tryAgainBtnAlreadyLinkCard = Property.getProperty(Constant.OR_FILE, "tryAgainBtnAlreadyLinkCard");
	
	/**
	 * gets Locator - Link Existing Card title
	 * 
	 */
	
	public String get_Link_Existing_Card_Title() {
		return linkExistingCardTitleAEM;
	}
	
	/**
	 * gets Locator - Link Existing Card title
	 * 
	 */
	
	public String get_Title_AEM() {
		return titleField;
	}
	
	/**
	 * gets Locator - Link Existing Card title
	 * 
	 */
	
	public String get_Sub_Title_AEM() {
		return subTitleField;
	}
	
	/**
	 * gets Locator - Link Existing Card title
	 * 
	 */
	
	public String get_Tooltip_Label() {
		return toolTipLabel;
	}
	
	/**
	 * gets Locator - Link Existing Card title
	 * 
	 */
	
	public String get_Tooltip_Content() {
		return toolTipContent;
	}
	
	/**
	 * gets Locator - Dont have card text
	 * 
	 */
	
	public String get_Dont_Have_Card_Text() {
		return dontHaveCardLabel;
	}
	
	/**
	 * gets Locator - One Here Field
	 * 
	 */
	
	public String get_One_Here_Text() {
		return getOneHereLabel;
	}
	
	/**
	 * gets Locator - One Here Link
	 * 
	 */
	
	public String get_One_Here_Link() {
		return getOneHereLink;
	}
	
	/**
	 * gets Locator - Cancel CTA
	 * 
	 */
	
	public String get_Cancel_CTA() {
		return existingCardCancelCTA;
	}
	
	/**
	 * gets Locator - Dont have card Text
	 * 
	 */
	
	public String get_Dont_Have_Card_Preview() {
		return dontHaveCardPreview;
	}
	
	/**
	 * gets Locator - Input field Text
	 * 
	 */
	
	public String get_Input_Field_label() {
		return inputField;
	}
	
	/**
	 * gets Locator - Tooltip Header Text
	 * 
	 */
	
	public String get_Tooltip_Header_Text() {
		return toolTipHeaderText;
	}
	
	/**
	 * gets Locator - paragraph format
	 * 
	 */
	
	public String get_Title_Paragraph_Format() {
		return titleParagraphFormat;
	}
	
	/**
	 * gets Locator - Heading 2
	 * 
	 */
	
	public String get_Title_Heading2() {
		return titleHeadingFormat;
	}
	
	/**
	 * gets Locator - Tooltip button
	 * 
	 */
	
	public String get_Tooltip_Button_Preview() {
		return toolTipButtonPreview;
	}
	
	/**
	 * gets Locator - Tooltip Header Text Preview
	 * 
	 */
	
	public String get_Tooltip_Header_Text_Preview() {
		return toolTipHeaderTextPreview;
	}
	
	/**
	 * gets Locator - Tooltip content Preview
	 * 
	 */
	
	public String get_Tooltip_Content_Preview() {
		return toolTipContentPreview;
	}
	
	/**
	 * gets Locator - Get One HerePreview
	 * 
	 */
	
	public String get_One_Here_Preview() {
		return getOneHerePreview;
	}
	
	/**
	 * gets Locator - Get Input Field Preview
	 * 
	 */
	
	public String get_Input_Field_Preview() {
		return inputFieldPreview;
	}
	
	/**
	 * gets Locator - Error Tab
	 * 
	 */
	
	public String get_Error_Tab() {
		return linkExistingCardErrorScreenTab;
	}
	
	/**
	 * gets Locator - Cancel CTA
	 * 
	 */
	
	public String get_TryAgain_CTA_AEM() {
		return linkExistingCardTryAgainCTA;
	}
	
	/**
	 * gets Locator - Cancel CTA
	 * 
	 */
	
	public String get_Cancel_CTA_AEM() {
		return linkExistingCardCancelCTA;
	}
	
	/**
<<<<<<< HEAD
	 * gets Locator - Get Active validation tab
	 * 
	 */
	
	public String get_Active_Card_Validation_Tab() {
		return activeCardValidationTab;
	}
	
	/**
	 * gets Locator - Get Active_Rewards_Card_Title
	 * 
	 */
	
	public String get_Active_Rewards_Card_Title() {
		return activeRewardsCardTitle;
	}
	
	/**
	 * gets Locator - Active_Rewards_Card_SubTitle
	 * 
	 */
	
	public String get_Active_Rewards_Card_SubTitle() {
		return activeRewardsCardSubTitle;
	}
	
	/**
	 * gets Locator - YOB Input field
	 * 
	 */
	
	public String get_Yob_Input() {
		return yobInput;
	}
	
	/**
	 * gets Locator - Postal code input field
	 * 
	 */
	
	public String get_Postal_Code_Input() {
		return postalCodeInput;
	}
	
	/**
	 * gets Locator - Active card continue
	 * 
	 */
	
	public String get_Active_Card_Continue() {
		return activeCardContinue;
	}
	
	/**
	 * gets Locator - Active card cancel
	 * 
	 */
	
	public String get_Active_Card_Cancel() {
		return activeCardCancel;
	}
	
	/**
	 * gets Locator - postal code label
	 * 
	 */
	
	public String get_Postal_Code_Label() {
		return postalCodeLabel;
	}
	
	/**
	 * gets Locator - Error Image
	 * 
	 */
	
	public String get_Error_Image() {
		return activeValidationErrorImg;
	}
	
	/**
	 * gets Locator - Active card Error TryAgain
	 * 
	 */
	
	public String get_Active_Error_TryAgain() {
		return activeValidationErrorTryAgain;
	}
	
	/**
	 * gets Locator - Active card error cancel
	 * 
	 */
	
	public String get_Active_Error_Cancel() {
		return activeValidationErrorCancel;
	}
	
	/**
	 * gets Locator - Active card error Text
	 * 
	 */
	
	public String get_Active_Error_Text() {
		return activeValidationErrorText;
	}

	/**
	 * get Locator - Error Image (Already Link Card)
	 */
	public String getErrorImageAlreadyLinkCard() {
		return errorImageAlreayLinkCard;
	}
	
	/**
	 * get Locator - Try Again Button
	 */
	public String getTryAgainButtonAlreadyLinkCard() {
		return tryAgainBtnAlreadyLinkCard;
	}
	
}
