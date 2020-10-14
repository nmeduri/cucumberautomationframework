package automation.library.locator;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.selenium.core.PageObject;
/**
 * This file contains locator of Link Rewards Options Page
 * 
 */
public class Link_Rewards_Options_Page_Locator{
	
	String triangleRewardsCardOption = Property.getProperty(Constant.OR_FILE, "triangleRewardsCardOption");
	String newTriangleRewardsCardOption = Property.getProperty(Constant.OR_FILE, "newTriangleRewardsCardOption");
	String masterTriangleCardOption = Property.getProperty(Constant.OR_FILE, "masterTriangleCardOption");
	String donNotShowMeAgainLabel = Property.getProperty(Constant.OR_FILE, "donNotShowMeAgainLabel");
	String donNotShowMeAgainToggleLeftToRight = Property.getProperty(Constant.OR_FILE, "donNotShowMeAgainToggleLeftToRight");
	String clickOnSkipLink = Property.getProperty(Constant.OR_FILE, "clickOnSkipLink");
	String AccountContent=Property.getProperty(Constant.OR_FILE, "AccountContent");
	String toolTip=Property.getProperty(Constant.OR_FILE, "toolTip");
	String toolTipMessage=Property.getProperty(Constant.OR_FILE, "toolTipMessage");

	/**
	 * gets Locator - Triangle Rewards ™ Card
	 * 
	 */
	
	public String get_Triangle_Rewards_Card_Option() {
		return triangleRewardsCardOption;
	}
	/**
	 * gets Locator - Get a new Triangle Rewards™ Card
	 * 
	 */
	
	public String get_A_New_Triangle_Rewards_Card_Option() {
		return newTriangleRewardsCardOption;
	}
	/**
	 * gets Locator - Triangle™ Mastercard®
	 * 
	 */
	
	public String get_Triangle_Master_Card_Option() {
		return masterTriangleCardOption;
	}
	/**
	 * gets Locator - 'Do not show me this again' toggle button
	 * 
	 */
	
	public String get_Get_Do_Not_Show_Me_This_Again_Toggle() {
		return donNotShowMeAgainLabel;
	}
	/**
	 * gets Locator - 'Do not show me this again' toggle button
	 * 
	 */
	
	public String get_Click_Do_Not_Show_Me_Toggle_Left_TO_Right() {
		return donNotShowMeAgainToggleLeftToRight;
	}
	/**
	 * gets Locator - 'Skip' Link
	 * 
	 */
	public String get_Click_On_Skip_Link() {
		return clickOnSkipLink;
	}
	/**
	 * gets Locator - 'Tool Tip' icon
	 * 
	 */
	public String get_ToolTipICon() {
		return toolTip;
	}
	/**
	 * gets Locator - 'Tool Tip' message
	 * 
	 */
	public String get_ToolTipMessage() {
		return toolTipMessage;
	}
	/**
	 * gets Locator - 'Account content"
	 * 
	 */
	public String get_AccountPage() {
		return AccountContent;
	}
	
}
