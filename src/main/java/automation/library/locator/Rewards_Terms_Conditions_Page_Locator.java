package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains locator of Rewards Terms And Conditions
 * 
 */

public class Rewards_Terms_Conditions_Page_Locator {
	
	String headerRewardsTermsAndConditions = Property.getProperty(Constant.OR_FILE, "headerRewardsTermsAndConditions");
	String buttonRegisterCard = Property.getProperty(Constant.OR_FILE, "buttonRegisterCard");
	String cancelButtonRegisterCard = Property.getProperty(Constant.OR_FILE, "cancelButtonRegisterCard");
	
	
	/**
	 * gets Locator - Rewards Terms & Conditions
	 * 
	 */
	
	public String get_Header_Rewards_Terms_Conditions() {
		return headerRewardsTermsAndConditions;
	}
	
	/**
	 * gets Locator - Register Card Button
	 * 
	 */
	public String get_Button_Register_Card() {
		return buttonRegisterCard;
	}
	

	
	/**
	 * gets Locator - Cancel Button
	 * 
	 */
	public String get_Cancel_Button() {
		return cancelButtonRegisterCard;
	}
 }

