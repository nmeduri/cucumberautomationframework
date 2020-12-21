package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This file contains the locator of AEM merge reward Page
 * 
 */

public class AEM_Account_Merge_Reward_Page_Locator {
	
	String MergeRewardsComponent = Property.getProperty(Constant.OR_FILE, "MergeRewardsComponent");
	String DefaultErrorMsg = Property.getProperty(Constant.OR_FILE, "DefaultErrorMsg");
	String TryAgainCTA = Property.getProperty(Constant.OR_FILE, "TryAgainCTA");
	String cancelLabel = Property.getProperty(Constant.OR_FILE, "cancelLabel");
	String ErrorScreenTab= Property.getProperty(Constant.OR_FILE, "ErrorScreenTab");
	/**
	 * gets Locator - AEM MergeRewards Component
	 * 
	 */
    
	public String get_MergeRewardsComponent() {
		return MergeRewardsComponent;	
	}
	/**
	 * gets Locator - AEM DefaultErrorMsg
	 * 
	 */
    
	public String get_DefaultErrorMsg() {
		return DefaultErrorMsg;	
	}
	/**
	 * gets Locator - AEM TryAgainCTA
	 * 
	 */
    
	public String get_TryAgainCTA() {
		return TryAgainCTA;	
	}
	/**
	 * gets Locator - AEM cancelLabel
	 * 
	 */
    
	public String get_cancelLabel() {
		return cancelLabel;	
	}
	/**
	 * gets Locator - AEM Error Screen Tab
	 * 
	 */
    
	public String get_ErrorScreenTab() {
		return ErrorScreenTab;	
	}
}