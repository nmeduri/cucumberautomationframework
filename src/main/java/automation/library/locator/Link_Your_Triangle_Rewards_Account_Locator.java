package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Link Your Triangle Rewards Account
 * 
 */

public class Link_Your_Triangle_Rewards_Account_Locator {
	
	String linkYourTriangleRewardsAccountTitle = Property.getProperty(Constant.OR_FILE, "linkYourTriangleRewardsAccountTitle");
	String getANewTriangleRewards = Property.getProperty(Constant.OR_FILE, "getANewTriangleRewards");
	String triangleRewardCard = Property.getProperty(Constant.OR_FILE, "triangleRewardCard");
	String enterCardNumber = Property.getProperty(Constant.OR_FILE, "enterCardNumber");
	String continueButton = Property.getProperty(Constant.OR_FILE, "continueButton");
	String deactivatedErrorMessage = Property.getProperty(Constant.OR_FILE, "deactivatedErrorMessage");
	String tryAgainButton = Property.getProperty(Constant.OR_FILE, "tryAgainButton");
	String cancelButton = Property.getProperty(Constant.OR_FILE, "cancelButton");
	String errorImage = Property.getProperty(Constant.OR_FILE, "errorImage");
	String triangleIdLogo = Property.getProperty(Constant.OR_FILE, "triangleIdLogo");
	String deactivatedErrorText = Property.getProperty(Constant.OR_FILE, "deactivatedErrorText");
	
	/**
	 * gets Locator - Link Your Triangle Rewards Account (Title)
	 * 
	 */
	
	public String get_Link_Your_Triangle_Rewards_Account_Title() {
		return linkYourTriangleRewardsAccountTitle;
	}
	
	/**
	 * gets Locator - Get A New Triangle Rewards Account (Title)
	 * 
	 */
	
	public String get_A_New_Triangle_Rewards_Account_Title() {
		return getANewTriangleRewards;
		
		
	}
	
	/**
	 * gets Locator - Triangle Reward Card
	 * 
	 */
	
	public String get_Triangle_Reward_Card() {
		return triangleRewardCard;
	}
	
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
	 * gets Locator - Deactivated Error message
	 * 
	 */
	
	public String get_Deactivated_Error_Message() {
		return deactivatedErrorMessage;
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
		return cancelButton;
	}
	
	/**
	 * gets Locator - Error Image
	 * 
	 */
	
	public String get_Error_Image() {
		return errorImage;
	}
	
	/**
	 * gets Locator - Triangle Id Logo
	 * 
	 */
	
	public String get_TriangleId_Logo() {
		return triangleIdLogo;
	}
	
	/**
	 * gets Locator - Deactivated Error Text
	 * 
	 */
	public String get_Deactivated_Error_Text() {
		return deactivatedErrorText;
	}
 }
