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
 }

