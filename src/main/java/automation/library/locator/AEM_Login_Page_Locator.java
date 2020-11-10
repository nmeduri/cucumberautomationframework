package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * This file contains the locator of Login page
 * 
 */
public class AEM_Login_Page_Locator {

	String gigyaIntegrationComponentAEM = Property.getProperty(Constant.OR_FILE, "gigyaIntegrationComponentAEM");
	String selectGigyaScreen1AEM = Property.getProperty(Constant.OR_FILE, "selectGigyaScreen1AEM");
	String selectGigyaScreen1ValueAEM = Property.getProperty(Constant.OR_FILE, "selectGigyaScreen1ValueAEM");
	String selectGigyaScreen2AEM = Property.getProperty(Constant.OR_FILE, "selectGigyaScreen2AEM");
	String selectGigyaScreen2ValueAEM = Property.getProperty(Constant.OR_FILE, "selectGigyaScreen2ValueAEM");
	
	
	/**
	 * gets Locator - AEM Gigya Integration Component
	 * 
	 */

	public String getGigyaIntegrationComponentAEM() {
		return gigyaIntegrationComponentAEM;	
	}
	/**
	 * gets Locator - AEM Select Gigya screen1 drop down
	 * 
	 */

	public String getSelectGigyaScreen1AEM() {
		return selectGigyaScreen1AEM;	
	}
	/**
	 * gets Locator - AEM Select Gigya screen1 drop down value
	 * 
	 */

	public String getSelectGigyaScreen1ValueAEM() {
		return selectGigyaScreen1ValueAEM;	
	}
	/**
	 * gets Locator - AEM Select Gigya screen2 drop down
	 * 
	 */

	public String getSelectGigyaScreen2AEM() {
		return selectGigyaScreen2AEM;	
	}
	/**
	 * gets Locator - AEM Select Gigya screen2 drop down value
	 * 
	 */

	public String getSelectGigyaScreen2ValueAEM() {
		return selectGigyaScreen2ValueAEM;	
	}
	
}