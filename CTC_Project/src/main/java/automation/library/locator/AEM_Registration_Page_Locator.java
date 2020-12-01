package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Registration page
 * 
 */
public class AEM_Registration_Page_Locator {

	String selectRegistrationGigyaScreen1ValueAEM = Property.getProperty(Constant.OR_FILE, "selectRegistrationGigyaScreen1ValueAEM");
	String selectRegistrationGigyaScreen2ValueAEM = Property.getProperty(Constant.OR_FILE, "selectRegistrationGigyaScreen2ValueAEM");
	
	
	/**
	 * gets Locator - AEM Select Registration from Gigya screen1 drop down value
	 * 
	 */

	public String getSelectRegistrationGigyaScreen1ValueAEM() {
		return selectRegistrationGigyaScreen1ValueAEM;	
	}
	/**
	 * gets Locator - AEM Select Registration from Gigya screen2 drop down value
	 * 
	 */

	public String getSelectRegistrationGigyaScreen2ValueAEM() {
		return selectRegistrationGigyaScreen2ValueAEM;	
	}

}
