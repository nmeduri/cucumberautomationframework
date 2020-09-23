package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class Footer_PageLocator {
	
	String legalDisclaimer = Property.getProperty(Constant.OR_FILE, "legalDisclaimer");
	String viewMorelegalDisclaimer = Property.getProperty(Constant.OR_FILE, "viewMorelegalDisclaimer");
	String viewLesslegalDisclaimer = Property.getProperty(Constant.OR_FILE, "viewLesslegalDisclaimer");
	String legalDisclaimerRow = Property.getProperty(Constant.OR_FILE, "legalDisclaimerRow");
	String legal = Property.getProperty(Constant.OR_FILE, "legal");
	String termsAndConditions = Property.getProperty(Constant.OR_FILE, "termsAndConditions");
	String privacyPolicy = Property.getProperty(Constant.OR_FILE, "privacyPolicy");
	String siteMap = Property.getProperty(Constant.OR_FILE, "siteMap");
	String accessibility = Property.getProperty(Constant.OR_FILE, "accessibility");
	String candianTireLogoFooter = Property.getProperty(Constant.OR_FILE, "candianTireLogoFooter");
	String copyRightText = Property.getProperty(Constant.OR_FILE, "copyRightText");
	
	
	public String get_Legal_Disclaimer() {
		return legalDisclaimer;
	}
	
	public String get_View_More() {
		return viewMorelegalDisclaimer;
	}
	
	public String get_View_Less() {
		return viewLesslegalDisclaimer;
	}
	
	public String get_Legal_Disclaimer_Row() {
		return legalDisclaimerRow;
	}
	
	public String get_Accessibility() {
		return accessibility;
	}
	
	public String get_Legal() {
		return legal;
	}
	
	public String get_Terms_And_Conditions() {
		return termsAndConditions;
	}
	
	public String get_Privacy_Policy() {
		return privacyPolicy;
	}
	
	public String get_Site_Map() {
		return siteMap;
	}
	
	public String get_Canadian_Tire_Logo() {
		return candianTireLogoFooter;
	}
	
	public String get_Copy_Right_Text() {
		return copyRightText;
	}
 }

