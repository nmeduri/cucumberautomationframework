package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Checkout Page
 * 
 */
public class Merge_Rewards_Locator {

	String mergeRewardsPanel=Property.getProperty(Constant.OR_FILE, "mergeRewardsPanel").replace("=", ",");
	String mergeCardsTab = Property.getProperty(Constant.OR_FILE, "mergeCardsTab");
	String mergeRewardsCardsTitleAEM = Property.getProperty(Constant.OR_FILE, "mergeRewardsCardsTitleAEM");
	String subTitleMergeRewardsCardsAEM = Property.getProperty(Constant.OR_FILE, "subTitleMergeRewardsCardsAEM");
	String mergeRewardsTitle = Property.getProperty(Constant.OR_FILE, "mergeRewardsTitle");
	String mergeRewardsSubTitle = Property.getProperty(Constant.OR_FILE, "mergeRewardsSubTitle");
	String mergeTwoCardsModelTab = Property.getProperty(Constant.OR_FILE, "mergeTwoCardsModelTab");
	String cardInputLabelFieldAEM = Property.getProperty(Constant.OR_FILE, "cardInputLabelFieldAEM");
	String mergeTwoRewardsCardButton = Property.getProperty(Constant.OR_FILE, "mergeTwoRewardsCardButton");
	String cardInputLabel = Property.getProperty(Constant.OR_FILE, "cardInputLabel");
	String toolTipMergerCardFieldAEM = Property.getProperty(Constant.OR_FILE, "toolTipMergerCardFieldAEM");
	String toolTipMergeCardButton = Property.getProperty(Constant.OR_FILE, "toolTipMergeCardButton");
	String toolTipMessageMergeCard = Property.getProperty(Constant.OR_FILE, "toolTipMessageMergeCard");
	String toolTipLabelMergeCardAEM = Property.getProperty(Constant.OR_FILE, "toolTipLabelMergeCardAEM");
	String toolTipLabelMergeCard = Property.getProperty(Constant.OR_FILE, "toolTipLabelMergeCard");
	String mergeCardImageFieldAEM = Property.getProperty(Constant.OR_FILE, "mergeCardImageFieldAEM");
	String mergeCardImage = Property.getProperty(Constant.OR_FILE, "mergeCardImage");
	
	/**
	 * gets Locator - Merge Rewards Panel
	 * 
	 */

	public String get_Merge_Rewards_Panel() {
		return mergeRewardsPanel;	
	}
	
	/**
	 * gets Locator - Merge Cards Tab
	 */
	public String get_Merge_Cards_Tab() {
		return mergeCardsTab;
	}
	
	/**
	 * gets Locator - Merge Rewards Cards Title
	 */
	public String get_Merge_Rewards_Cards_Title_AEM() {
		return mergeRewardsCardsTitleAEM;
	}
	
	/**
	 * gets Locator - Merge Rewards Cards Sub Title
	 */
	public String get_Merge_Rewards_Sub_Title_AEM() {
		return subTitleMergeRewardsCardsAEM;
	}
	
	/**
	 * gets Locator - Merge Rewards Title
	 */
	public String get_Merge_Rewards_Title() {
		return mergeRewardsTitle;
	}
	
	/**
	 * gets Locator - Merge Rewards Sub Title
	 */
	public String get_Merge_Rewards_Sub_Title() {
		return mergeRewardsSubTitle;
	}
	
	/**
	 * gets Locator - Merge Two Cards
	 */
	public String get_Merge_Two_Cards() {
		return mergeTwoCardsModelTab;
	}
	
	/**
	 * gets Locator - Card Input Label
	 */
	public String get_Card_Input_Label() {
		return cardInputLabelFieldAEM;
	}
	
	/**
	 * gets Locator - Merge Two Cards Button
	 */
	public String get_Merge_Two_Card_Button() {
		return mergeTwoRewardsCardButton;
	}
	
	/**
	 * gets Locator - Input Card Label
	 */
	public String get_Input_Card_Label() {
		return cardInputLabel;
	}
	
	/**
	 * gets Locator - Tool Tips Field (AEM)
	 */
	public String get_Tool_Tips_Field_AEM() {
		return toolTipMergerCardFieldAEM;
	}
	
	/**
	 * gets Locator - Tool Tip Button
	 */
	public String get_Tool_Tip_Button() {
		return toolTipMergeCardButton;
	}
	
	/**
	 * gets Locator - Tool Tip Message
	 */
	public String get_Tool_Tip_Message_Merge_Card() {
		return toolTipMessageMergeCard;
	}
	
	/**
	 * gets Locator - Tool Tip Label
	 */
	public String get_Tool_Tip_Label_AEM() {
		return toolTipLabelMergeCardAEM;
	}
	
	/**
	 * gets Locator - Tool Tip Label
	 */
	public String get_Tool_Tip_Label() {
		return toolTipLabelMergeCard;
	}
	
	/**
	 * gets Locator - Merge Card Image
	 */
	public String get_Merge_Card_Image_AEM() {
		return mergeCardImageFieldAEM;
	}
	
	/**
	 * gets Locator - Merge Card Image
	 */
	public String get_Merge_Card_Image() {
		return mergeCardImage;
	}
	
}

