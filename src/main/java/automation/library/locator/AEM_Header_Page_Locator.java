package automation.library.locator;
import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Header component page
 * 
 */
public class AEM_Header_Page_Locator {
	
	String brandImageField=Property.getProperty(Constant.OR_FILE, "brandImageField");
	String pencilBannerComponent=Property.getProperty(Constant.OR_FILE, "pencilBannerComponent");
	String pick = Property.getProperty(Constant.OR_FILE, "pick");
	String brandImageText=Property.getProperty(Constant.OR_FILE, "brandImageText");
	String CanadianTierWeb=Property.getProperty(Constant.OR_FILE, "CanadianTierWeb");
	String brandImageLogo=Property.getProperty(Constant.OR_FILE, "brandImageLogo");
	String SelectBtn=Property.getProperty(Constant.OR_FILE, "SelectBtn");
	String brandImageAreaLabel=Property.getProperty(Constant.OR_FILE, "brandImageAreaLabel");
	String brandCaptionText=Property.getProperty(Constant.OR_FILE, "brandCaptionText");
	String configureCourtesyLink=Property.getProperty(Constant.OR_FILE, "configureCourtesyLink");
	String customerServiceLabel=Property.getProperty(Constant.OR_FILE, "customerServiceLabel");
	String customerServiceURL=Property.getProperty(Constant.OR_FILE, "customerServiceURL");
	String languageLabel=Property.getProperty(Constant.OR_FILE, "languageLabel");
    String ErrorImage=Property.getProperty(Constant.OR_FILE, "ErrorImage");
    String HyperLinkBtn=Property.getProperty(Constant.OR_FILE, "HyperLinkBtn");
    String CourtesyPath=Property.getProperty(Constant.OR_FILE, "CourtesyPath");
    String pathCheck=Property.getProperty(Constant.OR_FILE, "pathCheck");
   
    String AccountMenu=Property.getProperty(Constant.OR_FILE, "AccountMenu");
    String AccountsLabel=Property.getProperty(Constant.OR_FILE, "AccountsLabel");
    String SignInLabel=Property.getProperty(Constant.OR_FILE, "SignInLabel");
    String SignInURL=Property.getProperty(Constant.OR_FILE, "SignInURL");
    String orText=Property.getProperty(Constant.OR_FILE, "orText");
    String RegisterLabel=Property.getProperty(Constant.OR_FILE, "RegisterLabel");
    String RegisterURL=Property.getProperty(Constant.OR_FILE, "RegisterURL");
    String TriangleRewardsIcon=Property.getProperty(Constant.OR_FILE, "TriangleRewardsIcon");
    String TriangleRewardsLabel=Property.getProperty(Constant.OR_FILE, "TriangleRewardsLabel");
    String TriangleRewardsRegisterInformation=Property.getProperty(Constant.OR_FILE, "TriangleRewardsRegisterInformation");
    String GreetingText=Property.getProperty(Constant.OR_FILE, "GreetingText");
    String RewardsInfolabel=Property.getProperty(Constant.OR_FILE, "RewardsInfolabel");
    String AccountOptionAfterAuthor=Property.getProperty(Constant.OR_FILE, "AccountOptionAfterAuthor");
    String signInAfterAuthor=Property.getProperty(Constant.OR_FILE, "signInAfterAuthor");
    String registrationAfterAuthor=Property.getProperty(Constant.OR_FILE, "registrationAfterAuthor");
    String PreferenceAfterAuthor=Property.getProperty(Constant.OR_FILE, "PreferanceAfterAuthor");
    String RewardAfterAuthor=Property.getProperty(Constant.OR_FILE, "RewardAfterAuthor");
    String AddressAfterAuthor=Property.getProperty(Constant.OR_FILE, "AddressAfterAuthor");
    String PreferancesAfterAuthor=Property.getProperty(Constant.OR_FILE, "PreferancesAfterAuthor");
    String PaymentInformationAfterAuthor=Property.getProperty(Constant.OR_FILE, "PaymentInformationAfterAuthor");
    String OrderHistoryAfterAuthor=Property.getProperty(Constant.OR_FILE, "OrderHistoryAfterAuthor");
    String PersonalInformation=Property.getProperty(Constant.OR_FILE, "PersonalInformation");
    String Wishlist=Property.getProperty(Constant.OR_FILE, "Wishlist");
    String Signoutlabel=Property.getProperty(Constant.OR_FILE, "Sign-outlabel");
    
    /**
	 * gets Locator - Account Menu component
	 * 
	 */
    
	public String get_AccountMenu() {
		return AccountMenu;	
	}
	
	/**
	 * gets Locator - Account option after author
	 * 
	 */
    
	public String get_AccountOption() {
		return AccountOptionAfterAuthor;	
	}
	/**
	 * gets Locator - Accounts Label
	 * 
	 */
    
	public String get_AccountsLabel() {
		return AccountsLabel;	
	}
	/**
	 * gets Locator - SignIn Label
	 * 
	 */
    
	public String get_SignInLabel() {
		return SignInLabel;	
	}
	/**
	 * gets Locator - SignIn URL
	 * 
	 */
    
	public String get_SignInURL() {
		return SignInURL;	
	}
	/**
	 * gets Locator - orText
	 * 
	 */
    
	public String get_orText() {
		return orText;	
	}
	/**
	 * gets Locator - Register Label
	 * 
	 */
    
	public String get_RegisterLabel() {
		return RegisterLabel;	
	}
	/**
	 * gets Locator - Register URL
	 * 
	 */
    
	public String get_RegisterURL() {
		return RegisterURL;	
	}
	/**
	 * gets Locator - Triangle Rewards Icon
	 * 
	 */
    
	public String get_TriangleRewardsIcon() {
		return TriangleRewardsIcon;	
	}
	/**
	 * gets Locator - TriangleRewards Label
	 * 
	 */
    
	public String get_TriangleRewards_Label() {
		return TriangleRewardsLabel;	
	}
	/**
	 * gets Locator - Triangle Rewards Register Information
	 * 
	 */
    
	public String get_TriangleRewardsRegister_Information() {
		return TriangleRewardsRegisterInformation;	
	}
	/**
	 * gets Locator - GreetingText
	 * 
	 */
    
	public String get_GreetingText() {
		return GreetingText;	
	}
	/**
	 * gets Locator - RewardsInfo label
	 * 
	 */
    
	public String get_RewardsInfolabel() {
		return RewardsInfolabel;	
	}
	/**
	 * gets Locator - Sign-out label
	 * 
	 */
    
	public String get_Signoutlabel() {
		return Signoutlabel;	
	}
	/**
	 * gets Locator - Hyper link Button
	 * 
	 */
    
	public String get_HyperLinkBtn() {
		return HyperLinkBtn;	
	}
	
	/**
	 * gets Locator - Courtesy URL Path
	 * 
	 */
    
	public String get_CourtesyPath() {
		return CourtesyPath;	
	}
	/**
	 * gets Locator - Check button
	 * 
	 */
    
	public String get_path_Check() {
		return pathCheck;	
	}
	 /**
		 * gets Locator - brand Image Field
		 * 
		 */
	    
		public String get_brandImageField() {
			return brandImageField;	
		}
	/**
	 * gets Locator - pencil Banner Component
	 * 
	 */
    
	public String get_pencilBanner_Component() {
		return pencilBannerComponent;	
	}
	/**
	 * gets Locator - pick option in brand image field
	 * 
	 */
    
	public String get_pick_option() {
		return pick;	
	}
	
	/**
	 * gets Locator - brand Image Text
	 * 
	 */
    
	public String get_brandImage_Text() {
		return brandImageText;	
	}
	/**
	 * gets Locator - CanadianTierWeb folder
	 * 
	 */
    
	public String get_CanadianTierWeb_Folder() {
		return CanadianTierWeb;	
	}
	/**
	 * gets Locator - brand Image Logo field
	 * 
	 */
    
	public String get_brandImage_Logo() {
		return brandImageLogo;	
	}
	/**
	 * gets Locator - brandImage Area Label field
	 * 
	 */
	public String get_brandImageArea_Label() {
		return brandImageAreaLabel;	
	}
	
	/**
	 * gets Locator - select button
	 * 
	 */
    
	public String get_SelectBtn() {
		return SelectBtn;	
	}
	/**
	 * gets Locator - brand Caption Text
	 * 
	 */
    
	public String get_brandCaption_Text() {
		return brandCaptionText;	
	}
	/**
	 * gets Locator - configure Courtesy Link
	 * 
	 */
    
	public String get_configure_Courtesy_Link() {
		return configureCourtesyLink;	
	}
	/**
	 * gets Locator - customer Service Label
	 * 
	 */
    
	public String get_customerService_Label() {
		return customerServiceLabel;	
	}
	/**
	 * gets Locator - brand Image Text
	 * 
	 */
    
	public String get_customerService_URL() {
		return customerServiceURL;	
	}
	/**
	 * gets Locator - language Label
	 * 
	 */
    
	public String get_language_Label() {
		return languageLabel;	
	}
	/**
	 * gets Locator - Error Image
	 * 
	 */
    
	public String get_Error_image() {
		return ErrorImage;	
	}
	
	/**
	 * gets Locator - Sign in Label after Update(account)
	 * 
	 */
    
	public String get_SignInLabel_Author() {
		return signInAfterAuthor;	
	}
	/**
	 * gets Locator - Register Label after Update(account)
	 * 
	 */
    
	public String get_RegisterLabel_Author() {
		return registrationAfterAuthor;	
	}
	/**
	 * gets Locator - Preference Label after Update(account)
	 * 
	 */
    
	public String get_Preference_Author() {
		return PreferenceAfterAuthor;	
	}
	/**
	 * gets Locator - Address Label after Update(account)
	 * 
	 */
    
	public String get_Address_Author() {
		return AddressAfterAuthor;	
	}
	/**
	 * gets Locator - Preferences Label after Update(account)
	 * 
	 */
    
	public String get_Preferences_Author() {
		return PreferancesAfterAuthor;	
	}
	/**
	 * gets Locator - PaymentInformation Label after Update(account)
	 * 
	 */
    
	public String get_PaymentInformation_Author() {
		return PaymentInformationAfterAuthor;	
	}
	/**
	 * gets Locator - OrderHistory Label after Update(account)
	 * 
	 */
    
	public String get_OrderHistory_Author() {
		return OrderHistoryAfterAuthor;	
	}
	/**
	 * gets Locator - Personal Information Label after Update(account)
	 * 
	 */
    
	public String get_PersonalInformation_Author() {
		return PersonalInformation;	
	}
	/**
	 * gets Locator - Wishlist Label after Update(account)
	 * 
	 */
    
	public String get_Wishlist_Author() {
		return Wishlist;	
	}
	
}
