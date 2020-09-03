package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Get_Personalized_Offers_Page_Locator {
	
	
	String nextButton = Property.getProperty(Constant.OR_FILE, "nextButton");
	String headerGetPersonalizedOffersPage = Property.getProperty(Constant.OR_FILE, "headerGetPersonalizedOffersPage");
	String caslCheckbox = Property.getProperty(Constant.OR_FILE, "caslCheckbox");
	String optIn = Property.getProperty(Constant.OR_FILE, "optIn");
	String emailMeAboutOffersAndSales = Property.getProperty(Constant.OR_FILE, "emailMeAboutOffersAndSales");
	String messageEmailMeAboutOffersAndSales = Property.getProperty(Constant.OR_FILE, "messageEmailMeAboutOffersAndSales");
	String toopTipCloseButton = Property.getProperty(Constant.OR_FILE, "toopTipCloseButton");
	String caslSubscriptionToogleOffBydefault = Property.getProperty(Constant.OR_FILE, "caslSubscriptionToogleOffBydefault");
	String caslSubscriptionToogleButton = Property.getProperty(Constant.OR_FILE, "caslSubscriptionToogleButton");
	String ableClickCASLSubscriptionToogle = Property.getProperty(Constant.OR_FILE, "ableClickCASLSubscriptionToogle");
	String offCASLSubscriptionToogleButton = Property.getProperty(Constant.OR_FILE, "offCASLSubscriptionToogleButton");

	
	public String get_Next_Button() {
		
		return nextButton;
		
	}
	
	public String get_Header_Get_Personalized_Offers_Page() {
		return headerGetPersonalizedOffersPage;
	}
	
	public String get_CASL_Checkbox() {
	    return caslCheckbox;
	}
	
	public String get_Opt_In() {
		return optIn;
	}
	
	public String get_Email_Me_About_Offers_And_Sales() {
		return emailMeAboutOffersAndSales;
	}
	
	public String get_Message_Email_Me_About_Offers_And_Sales() {
		return messageEmailMeAboutOffersAndSales;
	}
	
	public String get_Tool_Tip_Close_Button() {
		return toopTipCloseButton;	
	}
	
	public String get_CASL_Subscription_Toogle_Off_Bydefault() {
		return caslSubscriptionToogleOffBydefault;
	}
	
	public String get_CASL_Subscription_Toogle_Button() {
		return caslSubscriptionToogleButton;
	}
	
	public String get_Able_CASL_Subscription_Toogle_Button() {
		return ableClickCASLSubscriptionToogle;
	}
	
	public String get_Off_CASL_Subscription_Toogle_Button() {
		return offCASLSubscriptionToogleButton;
	}
}
