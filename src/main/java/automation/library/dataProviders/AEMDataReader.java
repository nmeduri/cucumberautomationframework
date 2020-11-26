package automation.library.dataProviders;

import java.util.Properties;

import javax.management.RuntimeErrorException;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * gets product data of FED
 * 
 */
public class AEMDataReader {
	
	
	private Properties properties;

	public AEMDataReader(){
        
       
   }
	/**
	 * gets SRP Url
	 * 
	 */
	
	public String get_SRP_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "srpUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets PLP Author Url
	 * 
	 */
	
	public String get_PLP_Author_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "plpAuthor");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets PLP Author Url
	 * 
	 */
	
	public String get_Link_Master_Card_Author_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "linkMasterCardAuthor");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Footer Author Url
	 * 
	 */
	
	public String get_Footer_Author_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "footerAuthorUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	/**
	 * gets Header Author Url
	 * 
	 */
	
	public String get_Header_Author_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "headerAuthorUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}

	/**
	 * gets Search Bar Url
	 * 
	 */
	
	public String get_Search_Bar_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "searchBar");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	/**
	 * gets Footer component Bar Url
	 * 
	 */
	
	public String get_Footer_Component_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "footerComponentAuthor");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	/**
	 * gets AEM admin user
	 * 
	 */
	
	public String get_AEM_Admin_User() {
		String getUserName = Property.getProperty(Constant.AEM_DATA_FILE, "aem_admin_user");
		if(getUserName != null)
			return getUserName;
		else
			throw new RuntimeException("Username Data not specified in the Data file.");
	}
	
	/**
	 * gets AEM Password
	 * 
	 */
	
	public String get_AEM_Admin_Password() {
		String getPassword = Property.getProperty(Constant.AEM_DATA_FILE, "aem_admin_password");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}
	
	/**
	 * get Corrective Auto Search message
	 */
	
	public String get_Corrective_Search_Message() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "correctiveSearchMessage");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	
	/**
	 * get Search Title
	 */
	
	public String get_Search_Title_AEM() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "searchTitleAEM");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Search Title Message Data not specified in the Data file.");
	}
	
	
	/**
	 * get No Result Title
	 */
	
	public String get_No_Result_Title() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "noResultTitle");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("No Result Title Message Data not specified in the Data file.");
	}
	
	
	/**
	 * get Similar Result Title
	 */
	
	public String get_Similar_Result_Title() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "similarResultTitle");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Similar Result Title Data not specified in the Data file.");
	}
	
	
	/**
	 * get Suggestive Message
	 */
	
	public String get_Suggestive_Message() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "suggestiveMessage");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Suggestive Message Data not specified in the Data file.");
	}
	
	
	/**
	 * get Search Result Thershold
	 */
	
	public String get_Search_Result_Threshold() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "searchResultThreshold");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Search Result Thershold not specified in the Data file.");
	}
	
	/**
	 * get Result Label
	 */
	public String get_Result_Label() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "resultLabel");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Result Label not specified in the Data file.");
	}
	
	/**
	 * gets New Rewards Card Aem Url
	 * 
	 */
	public String get_New_Rewards_Card_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "newRewardsCardUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets New Rewards Card Aem Url
	 * 
	 */
	public String get_New_Rewards_Card_Url_Fed() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "newRewardsCardUrlFED");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * get Corrective Auto Search message
	 */
	
	public String get_Age_Of_Majority_Error_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "ageOfMajorityErrorText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Try_Again_CTA_label() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "tryAgainLabel");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Cancel_CTA_label() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "cancelLabel");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Error_Image() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "errorImage");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Footer_Logo_Alt_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "footerLogoAltText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Copyright_Label_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "copyrighttLabelText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_Legal_Disclaimer_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "legalDisclaimerText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_View_More_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "viewMoreText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	public String get_View_Less_Text() {
		String getMessage = Property.getProperty(Constant.AEM_DATA_FILE, "viewLessText");
		if(getMessage != null)
			return getMessage;
		else
			throw new RuntimeException("Corrective Search Message Data not specified in the Data file.");
	}
	
	/*	
	 * get Place Holder Label (Test)
	 */
	
	public String get_Place_Holder_Label() {
		String getPlaceHolderLabel = Property.getProperty(Constant.AEM_DATA_FILE, "testPlaceHolderLabel");
		if(getPlaceHolderLabel != null)
			return getPlaceHolderLabel;
		else
			throw new RuntimeException("Result Label not specified in the Data file.");
	}
	
	/**
	 * get Place Holder Label (Test)
	 */
	
	public String get_Place_Holder_Revert_Label() {
		String getPlaceHolderLabel = Property.getProperty(Constant.AEM_DATA_FILE, "testPlaceHolderLabelRevertChanges");
		if(getPlaceHolderLabel != null)
			return getPlaceHolderLabel;
		else
			throw new RuntimeException("Result Label not specified in the Data file.");
	}
	
	/**
	 * get Url - PLP Author
	 * 
	 */
	
	public String get_PDP_Url() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "pdpAuthor");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("Result Url not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Specifications
	 * 
	 */
	public String get_Specifications_Reverse_Changes() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "specificationsLabelReverseChanges");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - View more Specifications
	 * 
	 */
	public String get_View_More_Specifications_Reverse_Changes() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "viewMoreSpecificationsReverseChanges");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - View less Specifications
	 * 
	 */
	public String get_View_Less_Specifications_Reverse_Changes() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "viewLessSpecificationsReverseChanges");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - set Number of Specifications
	 * 
	 */
	public String get_Set_Number_Of_Specifications_Reverse_Changes() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "setNumberOfSpecificationsChanges");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Specifications
	 * 
	 */
	public String get_Specifications() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "specificationsLabel");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - View more Specifications
	 * 
	 */
	public String get_View_More_Specifications() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "viewMoreSpecifications");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - View less Specifications
	 * 
	 */
	public String get_View_Less_Specifications() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "viewLessSpecifications");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - set Number of Specifications
	 * 
	 */
	public String get_Set_Number_Of_Specifications() {
		String getSepecifications = Property.getProperty(Constant.AEM_DATA_FILE, "setNumberOfSpecifications");
		if(getSepecifications != null)
			return getSepecifications;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * 
	 * get Data - Initial Number of Products
	 * 
	 */
	public String get_Initial_Number_Of_Products() {
		String getIntialNumberOfProducts = Property.getProperty(Constant.AEM_DATA_FILE, "intialNumberOfProducts");
		if(getIntialNumberOfProducts != null)
			return getIntialNumberOfProducts;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * 
	 * get Data - Initial Number of Products
	 * 
	 */
	public String get_Initial_Number_Of_Products_Reverse_Changes() {
		String getIntialNumberOfProducts = Property.getProperty(Constant.AEM_DATA_FILE, "initialNumberOfProdcutsReverseChanges");
		if(getIntialNumberOfProducts != null)
			return getIntialNumberOfProducts;
		else
			throw new RuntimeException("Result Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Footer-Legal Text
	 * 
	 */
	public String get_Footer_LegalText() {
		String getLegalText = Property.getProperty(Constant.AEM_DATA_FILE, "legalTextLabel");
		if(getLegalText != null)
			return getLegalText;
		else
			throw new RuntimeException("Legal text Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Footer-Legal Text URL
	 * 
	 */
	public String get_Footer_LegalURL() {
		String getLegalURL = Property.getProperty(Constant.AEM_DATA_FILE, "legalTextURLLabel");
		if(getLegalURL != null)
			return getLegalURL;
		else
			throw new RuntimeException("Legal text URL Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Url - Feature List Author Page
	 * 
	 */
	public String get_Feature_List_Author_Page() {
		String getFeatureListAuthorPage = Property.getProperty(Constant.AEM_DATA_FILE, "featureListAuthor");
		if(getFeatureListAuthorPage != null)
			return getFeatureListAuthorPage;
		else
			throw new RuntimeException("URL Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Url - Feature List Author Page FR
	 * 
	 */
	public String get_Feature_List_Author_Page_FR() {
		String getFeatureListAuthorPageFR = Property.getProperty(Constant.AEM_DATA_FILE, "featureListAuthorFR");
		if(getFeatureListAuthorPageFR != null)
			return getFeatureListAuthorPageFR;
		else
			throw new RuntimeException("URL Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Url - Feature List Author Page
	 * 
	 */
	public String get_Informational_Feature_List_Author_Page() {
		String getFeatureListAuthorPage = Property.getProperty(Constant.AEM_DATA_FILE, "informatioalFeatureListAuthor");
		if(getFeatureListAuthorPage != null)
			return getFeatureListAuthorPage;
		else
			throw new RuntimeException("URL Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Footer-terms&Condition Label
	 * 
	 */
	public String get_Footer_termsnCondition() {
		String getTnC = Property.getProperty(Constant.AEM_DATA_FILE, "terms&ConditionLabel");
		if(getTnC != null)
			return getTnC;
		else
			throw new RuntimeException("Terms and Condition text Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-terms&Condition URL
	 * 
	 */
	public String get_Footer_termsnConditionURL() {
		String getTnCURL = Property.getProperty(Constant.AEM_DATA_FILE, "terms&ConditionURLLabel");
		if(getTnCURL != null)
			return getTnCURL;
		else
			throw new RuntimeException("Terms and Condition URL Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-privacy Policy Label
	 * 
	 */
	public String get_Footer_privacyPolicyLabel() {
		String getprivacy = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyLabel");
		if(getprivacy != null)
			return getprivacy;
		else
			throw new RuntimeException("Privacy policy label text Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-privacy Policy URL
	 * 
	 */
	public String get_Footer_privacyPolicyURL() {
		String getprivacyURL = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyURLLabel");
		if(getprivacyURL != null)
			return getprivacyURL;
		else
			throw new RuntimeException("Privacy policy label URL Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-SiteMap Text
	 * 
	 */
	public String get_Footer_siteMapText() {
		String getsitemap = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapLabel");
		if(getsitemap != null)
			return getsitemap;
		else
			throw new RuntimeException("Site map label Data not specified in the Data file.");
	}

	/**
	 * 
	 * get Data - Footer-SiteMap URL
	 * 
	 */
	public String get_Footer_siteMapURL() {
		String getsitemap = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapURLLabel");
		if(getsitemap != null)
			return getsitemap;
		else
			throw new RuntimeException("Site map URL Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Footer-Accessibility Text
	 * 
	 */
	public String get_Footer_AccessibilityText() {
		String getAccessibilityText = Property.getProperty(Constant.AEM_DATA_FILE, "AccessibilityText");
		if(getAccessibilityText != null)
			return getAccessibilityText;
		else
			throw new RuntimeException("Accessibility Text Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-Accessibility URL
	 * 
	 */
	public String get_Footer_AccessibilityURL() {
		String getAccessibilityURL = Property.getProperty(Constant.AEM_DATA_FILE, "AccessibilityURL");
		if(getAccessibilityURL != null)
			return getAccessibilityURL;
		else
			throw new RuntimeException("Accessibility URL Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-CopyrightLabel
	 * 
	 */
	public String get_Footer_CopyrightLabel() {
		String getCopyrightLabel = Property.getProperty(Constant.AEM_DATA_FILE, "CopyrightLabel");
		if(getCopyrightLabel != null)
			return getCopyrightLabel;
		else
			throw new RuntimeException("Copyright Label Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-Legal Disclaimer
	 * 
	 */
	public String get_Footer_LegalDisclaimer() {
		String getlegaldisclaimer = Property.getProperty(Constant.AEM_DATA_FILE, "LegalDisclaimer");
		if(getlegaldisclaimer != null)
			return getlegaldisclaimer;
		else
			throw new RuntimeException("Legal Disclaimer Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-ViewMore
	 * 
	 */
	public String get_Footer_ViewMore() {
		String getViewMore = Property.getProperty(Constant.AEM_DATA_FILE, "ViewMoreText");
		if(getViewMore != null)
			return getViewMore;
		else
			throw new RuntimeException("View More data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Footer-ViewLess
	 * 
	 */
	public String get_Footer_ViewLess() {
		String getViewLess = Property.getProperty(Constant.AEM_DATA_FILE, "ViewLessText");
		if(getViewLess != null)
			return getViewLess;
		else
			throw new RuntimeException("View Less data not specified in the Data file.");
	}
    /**
	 * get Data - Show More Count
	 * 
	 */
	
	public String get_Show_More_Count() {
		String getShowMoreCount = Property.getProperty(Constant.AEM_DATA_FILE, "showMoreCount");
		if(getShowMoreCount != null)
			return getShowMoreCount;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Show More Count
	 * 
	 */
	
	public String get_Show_More_Count_Changes() {
		String showMoreCountChanges = Property.getProperty(Constant.AEM_DATA_FILE, "showMoreCountChanges");
		if(showMoreCountChanges != null)
			return showMoreCountChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	
	/**
	 * 
	 * get Data - Search Response Count
	 * 
	 */
	public String get_Search_Response_Count() {
		String searchResponseCount = Property.getProperty(Constant.AEM_DATA_FILE, "searchResponseCount");
		if(searchResponseCount != null)
			return searchResponseCount;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Search Response Count Changes
	 * 
	 */
	public String get_Search_Response_Count_Changes() {
		String searchResponseCount = Property.getProperty(Constant.AEM_DATA_FILE, "searchResponseCountChanges");
		if(searchResponseCount != null)
			return searchResponseCount;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pagination result message
	 * 
	 */
	public String get_Paginarion_Result_Message() {
		String paginationResultMessage = Property.getProperty(Constant.AEM_DATA_FILE, "paginationResultMessage");
		if(paginationResultMessage != null)
			return paginationResultMessage;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pagination result message
	 * 
	 */
	public String get_Pagination_Result_Message_Changes() {
		String searchResponseCount = Property.getProperty(Constant.AEM_DATA_FILE, "paginationResultMessageChanges");
		if(searchResponseCount != null)
			return searchResponseCount;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * get Url - Broad Promo Tiles Page Author
	 * 
	 */
	
	public String get_Broad_Promo_Tiles_Page_Url() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "broadPromoTilesAuthor");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("broadPromoTilesAuthor Url not specified in the Data file.");
	}
	/**
	 * get Url - Broad Promo Tiles Title 
	 * 
	 */
	
	public String get_Broad_Promo_Tiles_Title() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "broadPromoTilesTitleAEM");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("broadPromoTilesTitle not specified in the Data file.");
	}
	/**
	 * get Url - Image Alt Text Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Image_Alt_Text_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "imageAltTextOfTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("imageAltTextOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Title Of Broad Promo Tile 2 
	 * 
	 */
	
	public String get_Title_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "titleOfTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("titleOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Sub-Title Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Sub_Title_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "subTitleOFTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("subTitleOFTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Button Title Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Button_Title_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "buttonTitleOfTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("buttonTitleOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Button URL Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Button_URL_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "buttonURLOfTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("buttonURLOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Save Story Text Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Save_Story_Text_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "saveStoryTextTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("saveStoryTypeTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Save Story Value Of Broad Promo Tile 2
	 * 
	 */
	
	public String get_Save_Story_Value_Of_Tile2() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "saveStoryValueTile2");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("saveStoryValueTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Image Alt Text Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Image_Alt_Text_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "imageAltTextOfTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("imageAltTextOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Title Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Title_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "titleOfTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("titleOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Sub-Title Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Sub_Title_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "subTitleOFTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("subTitleOFTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Button Title Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Button_Title_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "buttonTitleOfTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("buttonTitleOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Button URL Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Button_URL_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "buttonURLOfTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("buttonURLOfTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Save Story Text Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Save_Story_Text_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "saveStoryTextTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("saveStoryTypeTile1 not specified in the Data file.");
	}
	/**
	 * get Url - Save Story Value Of Broad Promo Tile 1 
	 * 
	 */
	
	public String get_Save_Story_Value_Of_Tile1() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "saveStoryValueTile1");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("saveStoryValueTile1 not specified in the Data file.");
	}
	
	/**
	 * gets Link Existing Card Url
	 * 
	 */
	
	public String get_Link_Existing_Card_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "linkExistingCardUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Link Existing Card Title
	 * 
	 */
	
	public String get_Link_Card_Page_Title_Data() {
		String title = Property.getProperty(Constant.AEM_DATA_FILE, "pagetitleText");
		if(title != null)
			return title;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Link Existing Card Sub Title
	 * 
	 */
	
	public String get_Link_Existing_Card_Sub_Title() {
		String subTitle = Property.getProperty(Constant.AEM_DATA_FILE, "subTitle");
		if(subTitle != null)
			return subTitle;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Tool tip text label
	 * 
	 */
	
	public String get_Tooltip_Text_label() {
		String toolTipText = Property.getProperty(Constant.AEM_DATA_FILE, "toolTipLabelText");
		if(toolTipText != null)
			return toolTipText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Tool tip text label
	 * 
	 */
	
	public String get_Tooltip_Header_Text() {
		String toolTipHeaderText = Property.getProperty(Constant.AEM_DATA_FILE, "toolTipHeaderText");
		if(toolTipHeaderText != null)
			return toolTipHeaderText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Tool tip text label
	 * 
	 */
	
	public String get_Tooltip_Content() {
		String toolTipContent = Property.getProperty(Constant.AEM_DATA_FILE, "toolTipContent");
		if(toolTipContent != null)
			return toolTipContent;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Dont Have Card Text
	 * 
	 */
	
	public String get_Dont_Have_Card_Text() {
		String dontHaveCardText = Property.getProperty(Constant.AEM_DATA_FILE, "dontHaveCardText");
		if(dontHaveCardText != null)
			return dontHaveCardText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Get one here text
	 * 
	 */
	
	public String get_One_Here_Text() {
		String getOneHereText = Property.getProperty(Constant.AEM_DATA_FILE, "getOneHereText");
		if(getOneHereText != null)
			return getOneHereText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Dont Have Card Text
	 * 
	 */
	
	public String get_One_Here_Link() {
		String getOneHereLink = Property.getProperty(Constant.AEM_DATA_FILE, "getOneHereLink");
		if(getOneHereLink != null)
			return getOneHereLink;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Dont Have Card Text
	 * 
	 */
	
	public String get_Cancel_CTA() {
		String cancelCTAText = Property.getProperty(Constant.AEM_DATA_FILE, "cancelCTAText");
		if(cancelCTAText != null)
			return cancelCTAText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Input Field Text
	 * 
	 */
	
	public String get_Input_Field_Data() {
		String inputField = Property.getProperty(Constant.AEM_DATA_FILE, "inputFieldText");
		if(inputField != null)
			return inputField;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	/*	
	 * 
	 * get Data - Show More Button
	 * 
	 */
	public String get_Show_More_Button() {
		String showMoreButtonAEM = Property.getProperty(Constant.AEM_DATA_FILE, "showMoreButtonAEM");
		if(showMoreButtonAEM != null)
			return showMoreButtonAEM;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Show More Button
	 * 
	 */
	public String get_Show_More_Button_Changes() {
		String showMoreButtonChangeAEM = Property.getProperty(Constant.AEM_DATA_FILE, "showMoreButtonChangeAEM");
		if(showMoreButtonChangeAEM != null)
			return showMoreButtonChangeAEM;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - End of Pagination Message
	 * 
	 */
	public String get_End_Of_Pagination_Message() {
		String endOfPaginationMessage = Property.getProperty(Constant.AEM_DATA_FILE, "endOfPaginationMessage");
		if(endOfPaginationMessage != null)
			return endOfPaginationMessage;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - End Of Pagination Message
	 * 
	 */
	public String get_End_Of_Pagination_Message_Changes() {
		String endOfPaginationMessageChange = Property.getProperty(Constant.AEM_DATA_FILE, "endOfPaginationMessageChange");
		if(endOfPaginationMessageChange != null)
			return endOfPaginationMessageChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Back To Top
	 * 
	 */
	public String get_Back_To_Top() {
		String backToTopButtonLabel = Property.getProperty(Constant.AEM_DATA_FILE, "backToTopButtonLabel");
		if(backToTopButtonLabel != null)
			return backToTopButtonLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Back To Top
	 * 
	 */
	public String get_Back_To_Top_Changes() {
		String backToTopButtonLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "backToTopButtonLabelChange");
		if(backToTopButtonLabelChange != null)
			return backToTopButtonLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Url - PLP Author
	 * 
	 */
	
	public String get_Footer_Url() {
		String getFooterUrl = Property.getProperty(Constant.AEM_DATA_FILE, "footerAuthor");
		if(getFooterUrl != null)
			return getFooterUrl;
		else
			throw new RuntimeException("Result Url not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Already Link Master Card Image
	 * 
	 */
	public String get_Already_Link_Master_Card_Image() {
		String alreadyLinkCardErrorImage = Property.getProperty(Constant.AEM_DATA_FILE, "alreadyLinkCardErrorImage");
		if(alreadyLinkCardErrorImage != null)
			return alreadyLinkCardErrorImage;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Already Link Master Card Image Change
	 * 
	 */
	public String get_Already_Link_Master_Card_Image_Change() {
		String alreadyLinkCardErrorImageChange = Property.getProperty(Constant.AEM_DATA_FILE, "backToTopButtonLabelChange");
		if(alreadyLinkCardErrorImageChange != null)
			return alreadyLinkCardErrorImageChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Card Pin
	 * 
	 */
	public String get_Already_Link_Master_Card_Detail() {
		String alreadyLinkedMasterCard = Property.getProperty(Constant.AEM_DATA_FILE, "alreadyLinkedMasterCard");
		if(alreadyLinkedMasterCard != null)
			return alreadyLinkedMasterCard;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Error Image Text (Change)
	 * 
	 */
	public String get_Error_Image_Text_Change() {
		String errorImageTextChagne = Property.getProperty(Constant.AEM_DATA_FILE, "backToTopButtonLabelChange");
		if(errorImageTextChagne != null)
			return errorImageTextChagne;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Error Image Text
	 * 
	 */
	public String get_Error_Image_Text() {
		String errorImageText = Property.getProperty(Constant.AEM_DATA_FILE, "errorImageText");
		if(errorImageText != null)
			return errorImageText;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/*============ Footer ===========*/
	
	/**
	 * 
	 * get Data - Order Status 
	 * 
	 */
	public String get_Order_Status() {
		String orderStatusSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "orderStatusSectionTitle");
		if(orderStatusSectionTitle != null)
			return orderStatusSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pick Up & Delivery
	 * 
	 */
	public String get_PickUp_Delivery() {
		String pickupDeliverySectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "pickupDeliverySectionTitle");
		if(pickupDeliverySectionTitle != null)
			return pickupDeliverySectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Return & Exchange
	 * 
	 */
	public String get_Return_End_Exchange() {
		String returnExchangeSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "returnExchangeSectionTitle");
		if(returnExchangeSectionTitle != null)
			return returnExchangeSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Help FAQ
	 * 
	 */
	public String get_Help_FAQ_Section() {
		String helpFaqSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "helpFaqSectionTitle");
		if(helpFaqSectionTitle != null)
			return helpFaqSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Contact Us
	 * 
	 */
	public String get_Contact_Us() {
		String contactUsSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "contactUsSectionTitle");
		if(contactUsSectionTitle != null)
			return contactUsSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Store Locator
	 * 
	 */
	public String get_Store_Locator() {
		String storeLocatorSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "storeLocatorSectionTitle");
		if(storeLocatorSectionTitle != null)
			return storeLocatorSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Product Result Section
	 * 
	 */
	public String get_Product_Result() {
		String productResultSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "productResultSectionTitle");
		if(productResultSectionTitle != null)
			return productResultSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Safty Data Sheet
	 * 
	 */
	public String get_Safty_Data_Sheet() {
		String saftyDataSheetSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "saftyDataSheetSectionTitle");
		if(saftyDataSheetSectionTitle != null)
			return saftyDataSheetSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**============ Revert Footer Data ==============*/
	
	/**
	 * 
	 * get Data - Order Status 
	 * 
	 */
	public String get_Order_Status_Changes() {
		String orderStatusSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "orderStatusSectionTitleChange");
		if(orderStatusSectionTitle != null)
			return orderStatusSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pick Up & Delivery
	 * 
	 */
	public String get_PickUp_Delivery_Changes() {
		String pickupDeliverySectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "pickupDeliverySectionTitleChange");
		if(pickupDeliverySectionTitle != null)
			return pickupDeliverySectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Return & Exchange
	 * 
	 */
	public String get_Return_End_Exchange_Changes() {
		String returnExchangeSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "returnExchangeSectionTitleChange");
		if(returnExchangeSectionTitle != null)
			return returnExchangeSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Help FAQ
	 * 
	 */
	public String get_Help_FAQ_Section_Changes() {
		String helpFaqSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "helpFaqSectionTitleChange");
		if(helpFaqSectionTitle != null)
			return helpFaqSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Contact Us
	 * 
	 */
	public String get_Contact_Us_Changes() {
		String contactUsSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "contactUsSectionTitleChange");
		if(contactUsSectionTitle != null)
			return contactUsSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Store Locator
	 * 
	 */
	public String get_Store_LocatorChanges() {
		String storeLocatorSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "storeLocatorSectionTitleChange");
		if(storeLocatorSectionTitle != null)
			return storeLocatorSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Product Result Section
	 * 
	 */
	public String get_Product_Result_Changes() {
		String productResultSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "productResultSectionTitleChange");
		if(productResultSectionTitle != null)
			return productResultSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Safty Data Sheet
	 * 
	 */
	public String get_Safty_Data_Sheet_Changes() {
		String saftyDataSheetSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "saftyDataSheetSectionTitleChange");
		if(saftyDataSheetSectionTitle != null)
			return saftyDataSheetSectionTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}

	
	/**
	 * 
	 * get Data - Canadian Tire Financial Services
	 * 
	 */
	public String get_Canadian_Tire_Financial_Services() {
		String canadianTireFinancialServices = Property.getProperty(Constant.AEM_DATA_FILE, "canadianTireFinancialServices");
		if(canadianTireFinancialServices != null)
			return canadianTireFinancialServices;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Installation Assembling
	 * 
	 */
	public String get_Installation_Assembling() {
		String installationAssembling = Property.getProperty(Constant.AEM_DATA_FILE, "installationAssembling");
		if(installationAssembling != null)
			return installationAssembling;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Auto Service Center
	 * 
	 */
	public String get_Auto_Service_Center() {
		String autoServiceCenter = Property.getProperty(Constant.AEM_DATA_FILE, "autoServiceCenter");
		if(autoServiceCenter != null)
			return autoServiceCenter;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Load Tool
	 * 
	 */
	public String get_Load_Tool() {
		String loadTool = Property.getProperty(Constant.AEM_DATA_FILE, "loadTool");
		if(loadTool != null)
			return loadTool;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Gift_Cards() {
		String giftCards = Property.getProperty(Constant.AEM_DATA_FILE, "giftCards");
		if(giftCards != null)
			return giftCards;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Road_Side_Assistance() {
		String roadSideAssistance = Property.getProperty(Constant.AEM_DATA_FILE, "roadSideAssistance");
		if(roadSideAssistance != null)
			return roadSideAssistance;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tested For Life
	 * 
	 */
	public String get_Tested_For_Life() {
		String testedForLife = Property.getProperty(Constant.AEM_DATA_FILE, "testedForLife");
		if(testedForLife != null)
			return testedForLife;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Gift Registry
	 * 
	 */
	public String get_Gift_Registry() {
		String giftRegistry = Property.getProperty(Constant.AEM_DATA_FILE, "giftRegistry");
		if(giftRegistry != null)
			return giftRegistry;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Canadian Tire Financial Services
	 * 
	 */
	public String get_Canadian_Tire_Financial_Services_Changes() {
		String canadianTireFinancialServices = Property.getProperty(Constant.AEM_DATA_FILE, "canadianTireFinancialServicesChanges");
		if(canadianTireFinancialServices != null)
			return canadianTireFinancialServices;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Installation Assembling
	 * 
	 */
	public String get_Installation_Assembling_Changes() {
		String installationAssembling = Property.getProperty(Constant.AEM_DATA_FILE, "installationAssemblingChanges");
		if(installationAssembling != null)
			return installationAssembling;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Auto Service Center
	 * 
	 */
	public String get_Auto_Service_Center_Changes() {
		String autoServiceCenter = Property.getProperty(Constant.AEM_DATA_FILE, "autoServiceCenterChanges");
		if(autoServiceCenter != null)
			return autoServiceCenter;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Load Tool
	 * 
	 */
	public String get_Load_Tool_Changes() {
		String loadTool = Property.getProperty(Constant.AEM_DATA_FILE, "loadToolChanges");
		if(loadTool != null)
			return loadTool;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Gift_Cards_Changes() {
		String giftCards = Property.getProperty(Constant.AEM_DATA_FILE, "giftCardsChanges");
		if(giftCards != null)
			return giftCards;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Road_Side_Assistance_Changes() {
		String roadSideAssistance = Property.getProperty(Constant.AEM_DATA_FILE, "roadSideAssistanceChanges");
		if(roadSideAssistance != null)
			return roadSideAssistance;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tested For Life
	 * 
	 */
	public String get_Tested_For_Life_Changes() {
		String testedForLife = Property.getProperty(Constant.AEM_DATA_FILE, "testedForLifeChanges");
		if(testedForLife != null)
			return testedForLife;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Gift Registry
	 * 
	 */
	public String get_Gift_Registry_Changes() {
		String giftRegistry = Property.getProperty(Constant.AEM_DATA_FILE, "giftRegistryChanges");
		if(giftRegistry != null)
			return giftRegistry;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	
	/****========*/
	
	/**
	 * 
	 * get Data - About Canadian Tire
	 * 
	 */
	public String get_About_Canadian_Tire() {
		String aboutCanadianTire = Property.getProperty(Constant.AEM_DATA_FILE, "aboutCanadianTire");
		if(aboutCanadianTire != null)
			return aboutCanadianTire;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Careers
	 * 
	 */
	public String get_Careers() {
		String careers = Property.getProperty(Constant.AEM_DATA_FILE, "careers");
		if(careers != null)
			return careers;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Triangle ID
	 * 
	 */
	public String get_About_Triangle_ID() {
		String aboutTriangleID = Property.getProperty(Constant.AEM_DATA_FILE, "aboutTriangleID");
		if(aboutTriangleID != null)
			return aboutTriangleID;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Recyling Information
	 * 
	 */
	public String get_Recyling_Information() {
		String recylingInformation = Property.getProperty(Constant.AEM_DATA_FILE, "recylingInformation");
		if(recylingInformation != null)
			return recylingInformation;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Our Brands
	 * 
	 */
	public String get_Our_Brands() {
		String ourBrands = Property.getProperty(Constant.AEM_DATA_FILE, "ourBrands");
		if(ourBrands != null)
			return ourBrands;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Flyer Sign Up
	 * 
	 */
	public String get_Flyer_Sign_Up() {
		String flyerSignUp = Property.getProperty(Constant.AEM_DATA_FILE, "flyerSignUp");
		if(flyerSignUp != null)
			return flyerSignUp;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Sustainablity() {
		String sustainablity = Property.getProperty(Constant.AEM_DATA_FILE, "sustainablity");
		if(sustainablity != null)
			return sustainablity;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Canadian Tire
	 * 
	 */
	public String get_About_Canadian_Tire_Changes() {
		String aboutCanadianTire = Property.getProperty(Constant.AEM_DATA_FILE, "aboutCanadianTireChanges");
		if(aboutCanadianTire != null)
			return aboutCanadianTire;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Careers
	 * 
	 */
	public String get_Careers_Changes() {
		String careers = Property.getProperty(Constant.AEM_DATA_FILE, "careersChanges");
		if(careers != null)
			return careers;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Triangle ID
	 * 
	 */
	public String get_About_Triangle_ID_Changes() {
		String aboutTriangleID = Property.getProperty(Constant.AEM_DATA_FILE, "aboutTriangleIDChanges");
		if(aboutTriangleID != null)
			return aboutTriangleID;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Recyling Information
	 * 
	 */
	public String get_Recyling_Information_Changes() {
		String recylingInformation = Property.getProperty(Constant.AEM_DATA_FILE, "recylingInformationChanges");
		if(recylingInformation != null)
			return recylingInformation;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Our Brands
	 * 
	 */
	public String get_Our_Brands_Changes() {
		String ourBrands = Property.getProperty(Constant.AEM_DATA_FILE, "ourBrandsChanges");
		if(ourBrands != null)
			return ourBrands;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Flyer Sign Up
	 * 
	 */
	public String get_Flyer_Sign_Up_Changes() {
		String flyerSignUp = Property.getProperty(Constant.AEM_DATA_FILE, "flyerSignUpChanges");
		if(flyerSignUp != null)
			return flyerSignUp;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Sustainablity_Changes() {
		String sustainablity = Property.getProperty(Constant.AEM_DATA_FILE, "sustainablityChanges");
		if(sustainablity != null)
			return sustainablity;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	
/*========*/
	
	/**
	 * 
	 * get Data - Privacy Policy
	 * 
	 */
	public String get_Privacy_Policy() {
		String privacyPolicy = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicy");
		if(privacyPolicy != null)
			return privacyPolicy;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Terms and Conditions
	 * 
	 */
	public String get_Terms_And_Conditions() {
		String termsAndCondtions = Property.getProperty(Constant.AEM_DATA_FILE, "termsAndCondtions");
		if(termsAndCondtions != null)
			return termsAndCondtions;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Site Map
	 * 
	 */
	public String get_Site_Map() {
		String siteMap = Property.getProperty(Constant.AEM_DATA_FILE, "siteMap");
		if(siteMap != null)
			return siteMap;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Accessibility
	 * 
	 */
	public String get_Accessibility() {
		String accessibilty = Property.getProperty(Constant.AEM_DATA_FILE, "accessibilty");
		if(accessibilty != null)
			return accessibilty;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Pricing_Policy() {
		String pricingPolicy = Property.getProperty(Constant.AEM_DATA_FILE, "pricingPolicy");
		if(pricingPolicy != null)
			return pricingPolicy;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Privacy Policy
	 * 
	 */
	public String get_Privacy_Policy_Changes() {
		String privacyPolicy = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyChanges");
		if(privacyPolicy != null)
			return privacyPolicy;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Terms and Conditions
	 * 
	 */
	public String get_Terms_And_Conditions_Changes() {
		String termsAndCondtions = Property.getProperty(Constant.AEM_DATA_FILE, "termsAndCondtionsChanges");
		if(termsAndCondtions != null)
			return termsAndCondtions;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Site Map
	 * 
	 */
	public String get_Site_Map_Changes() {
		String siteMap = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapChanges");
		if(siteMap != null)
			return siteMap;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Accessibility
	 * 
	 */
	public String get_AccessibilityChanges() {
		String accessibilty = Property.getProperty(Constant.AEM_DATA_FILE, "accessibiltyChanges");
		if(accessibilty != null)
			return accessibilty;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Pricing_Policy_Changes() {
		String pricingPolicy = Property.getProperty(Constant.AEM_DATA_FILE, "pricingPolicyChanges");
		if(pricingPolicy != null)
			return pricingPolicy;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Order Status Url
	 * 
	 */
	public String get_Order_Status_Url() {
		String orderStatusUrl = Property.getProperty(Constant.AEM_DATA_FILE, "orderStatusUrl");
		if(orderStatusUrl != null)
			return orderStatusUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pick Up & Delivery Url
	 * 
	 */
	public String get_PickUp_Delivery_Url() {
		String pickUpAndDeliveryUrl = Property.getProperty(Constant.AEM_DATA_FILE, "pickUpAndDeliveryUrl");
		if(pickUpAndDeliveryUrl != null)
			return pickUpAndDeliveryUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Return & Exchange Url
	 * 
	 */
	public String get_Return_End_Exchange_Url() {
		String returnsAndExchangeUrl = Property.getProperty(Constant.AEM_DATA_FILE, "returnsAndExchangeUrl");
		if(returnsAndExchangeUrl != null)
			return returnsAndExchangeUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Help FAQ Url
	 * 
	 */
	public String get_Help_FAQ_Section_Url() {
		String helpFAQAUrl = Property.getProperty(Constant.AEM_DATA_FILE, "helpFAQAUrl");
		if(helpFAQAUrl != null)
			return helpFAQAUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Contact Us Url
	 * 
	 */
	public String get_Contact_Us_Url() {
		String contactUsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "contactUsUrl");
		if(contactUsUrl != null)
			return contactUsUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Store Locator
	 * 
	 */
	public String get_Store_Locator_Url() {
		String storeLocatorUrl = Property.getProperty(Constant.AEM_DATA_FILE, "storeLocatorUrl");
		if(storeLocatorUrl != null)
			return storeLocatorUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Product Result Section
	 * 
	 */
	public String get_Product_Result_Url() {
		String productRecallsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "productRecallsUrl");
		if(productRecallsUrl != null)
			return productRecallsUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Safty Data Sheet url
	 * 
	 */
	public String get_Safty_Data_Sheet_Url() {
		String safetyDataSheetsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "safetyDataSheetsUrl");
		if(safetyDataSheetsUrl != null)
			return safetyDataSheetsUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**============ Revert Footer Data ==============*/
	
	/**
	 * 
	 * get Data - Order Status 
	 * 
	 */
	public String get_Order_Status_Url_Changes() {
		String orderStatusUrlUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "orderStatusUrlUrlChange");
		if(orderStatusUrlUrlChange != null)
			return orderStatusUrlUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pick Up & Delivery
	 * 
	 */
	public String get_PickUp_Delivery_Url_Changes() {
		String pickUpAndDeliveryUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "pickUpAndDeliveryUrlChange");
		if(pickUpAndDeliveryUrlChange != null)
			return pickUpAndDeliveryUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Return & Exchange
	 * 
	 */
	public String get_Return_End_Exchange_Url_Changes() {
		String returnsAndExchangeUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "returnsAndExchangeUrlChange");
		if(returnsAndExchangeUrlChange != null)
			return returnsAndExchangeUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Help FAQ
	 * 
	 */
	public String get_Help_FAQ_Section_Url_Changes() {
		String helpFAQAUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "helpFAQAUrlChange");
		if(helpFAQAUrlChange != null)
			return helpFAQAUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Contact Us
	 * 
	 */
	public String get_Contact_Us_Url_Changes() {
		String contactUsUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "contactUsUrlChange");
		if(contactUsUrlChange != null)
			return contactUsUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Store Locator
	 * 
	 */
	public String get_Store_Locator_Url_Changes() {
		String storeLocatorUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "storeLocatorUrlChange");
		if(storeLocatorUrlChange != null)
			return storeLocatorUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Product Result Section
	 * 
	 */
	public String get_Product_Result_Url_Changes() {
		String productRecallsUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "productRecallsUrlChange");
		if(productRecallsUrlChange != null)
			return productRecallsUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Safty Data Sheet
	 * 
	 */
	public String get_Safty_Data_Sheet_Url_Changes() {
		String safetyDataSheetsUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "safetyDataSheetsUrlChange");
		if(safetyDataSheetsUrlChange != null)
			return safetyDataSheetsUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Canadian Tire Financial Services
	 * 
	 */
	public String get_Canadian_Tire_Financial_Services_Url() {
		String canadianTireFinancialServicesUrl = Property.getProperty(Constant.AEM_DATA_FILE, "canadianTireFinancialServicesUrl");
		if(canadianTireFinancialServicesUrl != null)
			return canadianTireFinancialServicesUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Installation Assembling
	 * 
	 */
	public String get_Installation_Assembling_Url() {
		String installationAssemblingUrl = Property.getProperty(Constant.AEM_DATA_FILE, "installationAssemblingUrl");
		if(installationAssemblingUrl != null)
			return installationAssemblingUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Auto Service Center
	 * 
	 */
	public String get_Auto_Service_Center_Url() {
		String autoServiceCenterUrl = Property.getProperty(Constant.AEM_DATA_FILE, "autoServiceCenterUrl");
		if(autoServiceCenterUrl != null)
			return autoServiceCenterUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Load Tool
	 * 
	 */
	public String get_Load_Tool_Url() {
		String loadToolUrl = Property.getProperty(Constant.AEM_DATA_FILE, "loadToolUrl");
		if(loadToolUrl != null)
			return loadToolUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}

	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Gift_Cards_Url() {
		String roadSideAssistanceUrl = Property.getProperty(Constant.AEM_DATA_FILE, "roadSideAssistanceUrl");
		if(roadSideAssistanceUrl != null)
			return roadSideAssistanceUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Road_Side_Assistance_Url() {
		String giftCardsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "giftCardsUrl");
		if(giftCardsUrl != null)
			return giftCardsUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tested For Life
	 * 
	 */
	public String get_Tested_For_Life_Url() {
		String testedForLifeUrl = Property.getProperty(Constant.AEM_DATA_FILE, "testedForLifeUrl");
		if(testedForLifeUrl != null)
			return testedForLifeUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Gift Registry
	 * 
	 */
	public String get_Gift_Registry_Url() {
		String giftRegistryUrl = Property.getProperty(Constant.AEM_DATA_FILE, "giftRegistryUrl");
		if(giftRegistryUrl != null)
			return giftRegistryUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Canadian Tire Financial Services
	 * 
	 */
	public String get_Canadian_Tire_Financial_Services_Url_Changes() {
		String canadianTireFinancialServicesUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "canadianTireFinancialServicesUrlChanges");
		if(canadianTireFinancialServicesUrlChanges != null)
			return canadianTireFinancialServicesUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Installation Assembling
	 * 
	 */
	public String get_Installation_Assembling_Url_Changes() {
		String installationAssemblingUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "installationAssemblingUrlChanges");
		if(installationAssemblingUrlChanges != null)
			return installationAssemblingUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Auto Service Center
	 * 
	 */
	public String get_Auto_Service_Center_Url_Changes() {
		String autoServiceCenterUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "autoServiceCenterUrlChanges");
		if(autoServiceCenterUrlChanges != null)
			return autoServiceCenterUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Load Tool
	 * 
	 */
	public String get_Load_Tool__Url_Changes() {
		String loadToolUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "loadToolUrlChanges");
		if(loadToolUrlChanges != null)
			return loadToolUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Gift_Cards__Url_Changes() {
		String roadSideAssistanceUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "roadSideAssistanceUrlChanges");
		if(roadSideAssistanceUrlChanges != null)
			return roadSideAssistanceUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Road Side Assistance
	 * 
	 */
	public String get_Road_Side_Assistance_Url_Changes() {
		String giftCardsUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "giftCardsUrlChanges");
		if(giftCardsUrlChanges != null)
			return giftCardsUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tested For Life
	 * 
	 */
	public String get_Tested_For_Life_Url_Changes() {
		String testedForLifeUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "testedForLifeUrlChanges");
		if(testedForLifeUrlChanges != null)
			return testedForLifeUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Gift Registry
	 * 
	 */
	public String get_Gift_Registry_Url_Changes() {
		String giftRegistryUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "giftRegistryUrlChanges");
		if(giftRegistryUrlChanges != null)
			return giftRegistryUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Canadian Tire
	 * 
	 */
	public String get_About_Canadian_Tire_Url() {
		String aboutCanadianTireUrl = Property.getProperty(Constant.AEM_DATA_FILE, "aboutCanadianTireUrl");
		if(aboutCanadianTireUrl != null)
			return aboutCanadianTireUrl;

		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Careers
	 * 
	 */
	public String get_Careers_Url() {
		String careersUrl = Property.getProperty(Constant.AEM_DATA_FILE, "careersUrl");
		if(careersUrl != null)
			return careersUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Triangle ID
	 * 
	 */
	public String get_About_Triangle_ID_Url() {
		String aboutTriangleIDUrl = Property.getProperty(Constant.AEM_DATA_FILE, "aboutTriangleIDUrl");
		if(aboutTriangleIDUrl != null)
			return aboutTriangleIDUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Recyling Information
	 * 
	 */
	public String get_Recyling_Information_Url() {
		String recylingInformationUrl = Property.getProperty(Constant.AEM_DATA_FILE, "recylingInformationUrl");
		if(recylingInformationUrl != null)
			return recylingInformationUrl;

		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
<<<<<<< HEAD
	 * get Data - Our Brands
	 * 
	 */
	public String get_Our_Brands_Url() {
		String ourBrandsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "ourBrandsUrl");
		if(ourBrandsUrl != null)
			return ourBrandsUrl;

		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Flyer Sign Up
	 * 
	 */
	public String get_Flyer_Sign_Up_Url() {
		String flyerSignUpUrl = Property.getProperty(Constant.AEM_DATA_FILE, "flyerSignUpUrl");
		if(flyerSignUpUrl != null)
			return flyerSignUpUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Sustainablity_Url() {
		String sustainablityUrl = Property.getProperty(Constant.AEM_DATA_FILE, "sustainablityUrl");
		if(sustainablityUrl != null)
			return sustainablityUrl;

		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Canadian Tire
	 * 
	 */
	public String get_About_Canadian_Tire_Url_Changes() {
		String aboutCanadianTireUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "aboutCanadianTireUrlChanges");
		if(aboutCanadianTireUrlChanges != null)
			return aboutCanadianTireUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Careers
	 * 
	 */
	public String get_Careers_Url_Changes() {
		String careersUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "careersUrlChanges");
		if(careersUrlChanges != null)
			return careersUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - About Triangle ID
	 * 
	 */
	public String get_About_Triangle_ID_Url_Changes() {
		String aboutTriangleIDUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "aboutTriangleIDUrlChanges");
		if(aboutTriangleIDUrlChanges != null)
			return aboutTriangleIDUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Recyling Information
	 * 
	 */
	public String get_Recyling_Information_Url_Changes() {
		String recylingInformationUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "recylingInformationUrlChanges");
		if(recylingInformationUrlChanges != null)
			return recylingInformationUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Our Brands
	 * 
	 */
	public String get_Our_Brands_Url_Changes() {
		String ourBrandsUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "ourBrandsUrlChanges");
		if(ourBrandsUrlChanges != null)
			return ourBrandsUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Flyer Sign Up
	 * 
	 */
	public String get_Flyer_Sign_Up_Url_Changes() {
		String flyerSignUpUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "flyerSignUpUrlChanges");
		if(flyerSignUpUrlChanges != null)
			return flyerSignUpUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sustainability
	 * 
	 */
	public String get_Sustainablity_Changes_Url() {
		String sustainablityUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "sustainablityUrlChanges");
		if(sustainablityUrlChanges != null)
			return sustainablityUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Privacy Policy
	 * 
	 */
	public String get_Privacy_Policy_Url() {
		String privacyPolicyUrl = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyUrl");
		if(privacyPolicyUrl != null)
			return privacyPolicyUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Terms and Conditions
	 * 
	 */
	public String get_Terms_And_Conditions_Url() {
		String termsAndCondtionsUrl = Property.getProperty(Constant.AEM_DATA_FILE, "termsAndCondtionsUrl");
		if(termsAndCondtionsUrl != null)
			return termsAndCondtionsUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Site Map
	 * 
	 */
	public String get_Site_Map_Url() {
		String siteMapUrl = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapUrl");
		if(siteMapUrl != null)
			return siteMapUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Accessibility
	 * 
	 */
	public String get_Accessibility_Url() {
		String accessibiltyUrl = Property.getProperty(Constant.AEM_DATA_FILE, "accessibiltyUrl");
		if(accessibiltyUrl != null)
			return accessibiltyUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pricing Policy
	 * 
	 */
	public String get_Pricing_Policy_Url() {
		String pricingPolicyUrl = Property.getProperty(Constant.AEM_DATA_FILE, "pricingPolicyUrl");
		if(pricingPolicyUrl != null)
			return pricingPolicyUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Privacy Policy
	 * 
	 */
	public String get_Privacy_Policy_Url_Changes() {
		String privacyPolicyUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyUrlChanges");
		if(privacyPolicyUrlChanges != null)
			return privacyPolicyUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Terms and Conditions
	 * 
	 */
	public String get_Terms_And_Conditions_Url_Changes() {
		String termsAndCondtionsUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "termsAndCondtionsUrlChanges");
		if(termsAndCondtionsUrlChanges != null)
			return termsAndCondtionsUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Site Map
	 * 
	 */
	public String get_Site_Map_Url_Changes() {
		String siteMapUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapUrlChanges");
		if(siteMapUrlChanges != null)
			return siteMapUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Accessibility
	 * 
	 */
	public String get_AccessibilityUrlChanges() {
		String accessibiltyYUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "accessibiltyYUrlChanges");
		if(accessibiltyYUrlChanges != null)
			return accessibiltyYUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Pricing Policy
	 * 
	 */
	public String get_Pricing_Policy_Url_Changes() {
		String pricingPolicyUrlChanges = Property.getProperty(Constant.AEM_DATA_FILE, "pricingPolicyUrlChanges");
		if(pricingPolicyUrlChanges != null)
			return pricingPolicyUrlChanges;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data -brand Image alt Text
	 * 
	 */
	public String get_brand_Image_alt_Text() {
		String brandImagealtText = Property.getProperty(Constant.AEM_DATA_FILE, "brandImagealtText");
		if(brandImagealtText != null)
			return brandImagealtText;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -brand Image area label
	 * 
	 */
	public String get_brand_Image_area_label() {
		String area_label = Property.getProperty(Constant.AEM_DATA_FILE, "brandImageAriaLabel");
		if(area_label != null)
			return area_label;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -brand caption text
	 * 
	 */
	public String get_brand_caption_text() {
		String brandCaption = Property.getProperty(Constant.AEM_DATA_FILE, "brandCaptionText");
		if(brandCaption != null)
			return brandCaption;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Courtesy text
	 * 
	 */
	public String get_Courtesy_text() {
		String CourtesyText = Property.getProperty(Constant.AEM_DATA_FILE, "CourtesyText");
		if(CourtesyText != null)
			return CourtesyText;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Courtesy URL
	 * 
	 */
	public String get_Courtesy_Link() {
		String CourtesyLink = Property.getProperty(Constant.AEM_DATA_FILE, "CourtesyLinkURL");
		if(CourtesyLink != null)
			return CourtesyLink;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -CustomerService Label
	 * 
	 */
	public String get_CustomerService_Label() {
		String CustomerServiceLabel = Property.getProperty(Constant.AEM_DATA_FILE, "CustomerServiceLabel");
		if(CustomerServiceLabel != null)
			return CustomerServiceLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -CustomerService URL
	 * 
	 */
	public String get_CustomerService_URL() {
		String CustomerService = Property.getProperty(Constant.AEM_DATA_FILE, "CustomerServiceURL");
		if(CustomerService != null)
			return CustomerService;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Language Label
	 * 
	 */
	public String get_Language_Label(){
		String LanguageLabel = Property.getProperty(Constant.AEM_DATA_FILE, "LanguageLabel");
		if(LanguageLabel != null)
			return LanguageLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Account Label
	 * 
	 */
	public String get_Account_Label(){
		String AccountLabel = Property.getProperty(Constant.AEM_DATA_FILE, "AccountsLabel");
		if(AccountLabel != null)
			return AccountLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -SignIn Label
	 * 
	 */
	public String get_signin_Label(){
		String SigninLabel = Property.getProperty(Constant.AEM_DATA_FILE, "SignInLabel");
		if(SigninLabel != null)
			return SigninLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -SignIn URL
	 * 
	 */
	public String get_signin_URL(){
		String SigninURL = Property.getProperty(Constant.AEM_DATA_FILE, "SignInURL");
		if(SigninURL != null)
			return SigninURL;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Or Text
	 * 
	 */
	public String get_Or_Text(){
		String OrText = Property.getProperty(Constant.AEM_DATA_FILE, "OrText");
		if(OrText != null)
			return OrText;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Resister Label
	 * 
	 */
	public String get_Resister_Label(){
		String ResisterLabel = Property.getProperty(Constant.AEM_DATA_FILE, "ResisterLabel");
		if(ResisterLabel != null)
			return ResisterLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Register URL
	 * 
	 */
	public String get_ResisterURL(){
		String RegisterURL = Property.getProperty(Constant.AEM_DATA_FILE, "ResisterURL");
		if(RegisterURL != null)
			return RegisterURL;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -TriangleReward Label
	 * 
	 */
	public String get_TriangleReward_Label(){
		String TriangleRewardLabel = Property.getProperty(Constant.AEM_DATA_FILE, "TriangleRewardLabel");
		if(TriangleRewardLabel != null)
			return TriangleRewardLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -Greeting Text
	 * 
	 */
	public String get_GreetingText(){
		String GreetingText = Property.getProperty(Constant.AEM_DATA_FILE, "GreetingText");
		if(GreetingText != null)
			return GreetingText;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -SignOut label
	 * 
	 */
	public String get_SignOutText(){
		String signOut = Property.getProperty(Constant.AEM_DATA_FILE, "Signoutlabel");
		if(signOut != null)
			return signOut;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -TriangleRewardsBalance
	 * 
	 */
	public String get_TriangleRewardsBalance(){
		String TriangleRewardsBalance = Property.getProperty(Constant.AEM_DATA_FILE, "TriangleRewardsBalance");
		if(TriangleRewardsBalance != null)
			return TriangleRewardsBalance;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -AccountOption1 label
	 * 
	 */
	public String get_AccountOption1(){
		String AccountOption1 = Property.getProperty(Constant.AEM_DATA_FILE, "AccountOption1");
		if(AccountOption1 != null)
			return AccountOption1;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	/**
	 * 
	 * get Data -AccountOption1 URL
	 * 
	 */
	public String get_AccountOption1URL(){
		String AccountOption1URL = Property.getProperty(Constant.AEM_DATA_FILE, "AccountOption1URL");
		if(AccountOption1URL != null)
			return AccountOption1URL;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Available At Checkout
	 * 
	 */
	public String get_Available_At_Checkout() {
		String availableAtCheckoutLabel = Property.getProperty(Constant.AEM_DATA_FILE, "availableAtCheckoutLabel");
		if(availableAtCheckoutLabel != null)
			return availableAtCheckoutLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Get It Installed Label
	 * 
	 */
	public String get_Get_It_Installed_Label() {
		String getItInstalledLabel = Property.getProperty(Constant.AEM_DATA_FILE, "getItInstalledLabel");
		if(getItInstalledLabel != null)
			return getItInstalledLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tool Tip Message
	 * 
	 */
	public String get_Tool_Tip_Message() {
		String toolTipMessage = Property.getProperty(Constant.AEM_DATA_FILE, "toolTipMessage");
		if(toolTipMessage != null)
			return toolTipMessage;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Available At Checkout
	 * 
	 */
	public String get_Available_At_Checkout_Change() {
		String availableAtCheckoutLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "availableAtCheckoutLabelChange");
		if(availableAtCheckoutLabelChange != null)
			return availableAtCheckoutLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Get It Installed Label
	 * 
	 */
	public String get_Get_It_Installed_Label_Change() {
		String getItInstalledLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "getItInstalledLabelChange");
		if(getItInstalledLabelChange != null)
			return getItInstalledLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Tool Tip Message
	 * 
	 */
	public String get_Tool_Tip_Message_Change() {
		String toolTipMessageChange = Property.getProperty(Constant.AEM_DATA_FILE, "toolTipMessageChange");
		if(toolTipMessageChange != null)
			return toolTipMessageChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Overview Label
	 * 
	 */
	public String get_Overview_Label() {
		String overviewLabel = Property.getProperty(Constant.AEM_DATA_FILE, "overviewLabel");
		if(overviewLabel != null)
			return overviewLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Overview Label
	 * 
	 */
	public String get_Overview_Label_Change() {
		String overviewLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "overviewLabelChange");
		if(overviewLabelChange != null)
			return overviewLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Label
	 * 
	 */
	public String get_User_Manual_Label() {
		String userManualLabel = Property.getProperty(Constant.AEM_DATA_FILE, "userManualLabel");
		if(userManualLabel != null)
			return userManualLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Label Description
	 * 
	 */
	public String get_User_Manual_Label_Description() {
		String userManualDescription = Property.getProperty(Constant.AEM_DATA_FILE, "userManualDescription");
		if(userManualDescription != null)
			return userManualDescription;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Download Link Lable
	 * 
	 */
	public String get_User_Manual_Download_Link_Label() {
		String userManualDownloadLinkLabel = Property.getProperty(Constant.AEM_DATA_FILE, "userManualDownloadLinkLabel");
		if(userManualDownloadLinkLabel != null)
			return userManualDownloadLinkLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Label
	 * 
	 */
	public String get_User_Manual_Label_Change() {
		String userManualLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "userManualLabelChange");
		if(userManualLabelChange != null)
			return userManualLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Description
	 * 
	 */
	public String get_User_Manual_Description_Change() {
		String userManualDescriptionChange = Property.getProperty(Constant.AEM_DATA_FILE, "userManualDescriptionChange");
		if(userManualDescriptionChange != null)
			return userManualDescriptionChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - User Manual Download Link Label
	 * 
	 */
	public String get_User_Manual_Download_Link_Label_Change() {
		String userManualDownloadLinkLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "userManualDownloadLinkLabelChange");
		if(userManualDownloadLinkLabelChange != null)
			return userManualDownloadLinkLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Feature Label Header
	 */
	public String get_Feature_Label_Header() {
		String featureHeaderLabel = Property.getProperty(Constant.AEM_DATA_FILE, "featureHeaderLabel");
		if(featureHeaderLabel != null)
			return featureHeaderLabel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Feature Label Header Change
	 */
	public String get_Feature_Label_Header_Change() {
		String featureHeaderLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "featureHeaderLabelChange");
		if(featureHeaderLabelChange != null)
			return featureHeaderLabelChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Customer Support Title
	 */
	public String get_Customer_Support_Title() {
		String customerSupportTitle = Property.getProperty(Constant.AEM_DATA_FILE, "customerSupportTitle");
		if(customerSupportTitle != null)
			return customerSupportTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Service Installation Title
	 */
	public String get_Service_Installation_Title() {
		String serviceInstallationTitle = Property.getProperty(Constant.AEM_DATA_FILE, "serviceInstallationTitle");
		if(serviceInstallationTitle != null)
			return serviceInstallationTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - About Us Title
	 */
	public String get_About_Us_Title() {
		String aboutUsTitle = Property.getProperty(Constant.AEM_DATA_FILE, "aboutUsTitle");
		if(aboutUsTitle != null)
			return aboutUsTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal Title
	 */
	public String get_Legal_Title() {
		String legalTitle = Property.getProperty(Constant.AEM_DATA_FILE, "legalTitle");
		if(legalTitle != null)
			return legalTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Customer Support Title
	 */
	public String get_Customer_Support_Title_Change() {
		String customerSupportTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "customerSupportTitleChange");
		if(customerSupportTitleChange != null)
			return customerSupportTitleChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Service Installation Change
	 */
	public String get_Service_Installation_Change() {
		String serviceInstallationTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "serviceInstallationTitleChange");
		if(serviceInstallationTitleChange != null)
			return serviceInstallationTitleChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Feature Label Header Change
	 */
	public String get_About_Us_Title_Change() {
		String aboutUsTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "aboutUsTitleChange");
		if(aboutUsTitleChange != null)
			return aboutUsTitleChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal Title Change
	 */
	public String get_Legal_Title_Change() {
		String legalTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "legalTitleChange");
		if(legalTitleChange != null)
			return legalTitleChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Be the First to Know
	 */
	public String get_Be_The_First_To_Know() {
		String beTheFirstKnown = Property.getProperty(Constant.AEM_DATA_FILE, "beTheFirstKnown");
		if(beTheFirstKnown != null)
			return beTheFirstKnown;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Be The First to Know
	 */
	public String get_Be_The_First_To_Know_Change() {
		String beTheFirstKnownChange = Property.getProperty(Constant.AEM_DATA_FILE, "beTheFirstKnownChange");
		if(beTheFirstKnownChange != null)
			return beTheFirstKnownChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Flyer Email Directly
	 */
	public String get_Weekly_Flyer_Email_Directly() {
		String weeklyFlyerEmailDirectly = Property.getProperty(Constant.AEM_DATA_FILE, "weeklyFlyerEmailDirectly");
		if(weeklyFlyerEmailDirectly != null)
			return weeklyFlyerEmailDirectly;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Flyer Email Directly
	 */
	public String get_Weekly_Flyer_Email_Directly_Change() {
		String weeklyFlyerEmailDirectlyChange = Property.getProperty(Constant.AEM_DATA_FILE, "weeklyFlyerEmailDirectlyChange");
		if(weeklyFlyerEmailDirectlyChange != null)
			return weeklyFlyerEmailDirectlyChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Sign Up Detail
	 */
	public String get_Weekly_Sign_Up_Detail() {
		String weeklySignUpDetail = Property.getProperty(Constant.AEM_DATA_FILE, "weeklySignUpDetail");
		if(weeklySignUpDetail != null)
			return weeklySignUpDetail;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Sign Up Detail
	 */
	public String get_Weekly_Sign_Up_Detail_Change() {
		String WeeklySignUpDetailChange = Property.getProperty(Constant.AEM_DATA_FILE, "WeeklySignUpDetailChange");
		if(WeeklySignUpDetailChange != null)
			return WeeklySignUpDetailChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Sign Up URL Detail
	 */
	public String get_Weekly_Sign_Up_Url_Detail() {
		String weeklySignUpUrl = Property.getProperty(Constant.AEM_DATA_FILE, "weeklySignUpUrl");
		if(weeklySignUpUrl != null)
			return weeklySignUpUrl;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Weekly Sign Up URL Detail
	 */
	public String get_Weekly_Sign_Up__Url_Detail_Change() {
		String weeklySignUpUrlChange = Property.getProperty(Constant.AEM_DATA_FILE, "weeklySignUpUrlChange");
		if(weeklySignUpUrlChange != null)
			return weeklySignUpUrlChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	 /** get Url - Experience Fragment Header Simple Page Author
	 * 
	 */
	
	public String get_Experience_Fragment_Header_Simple_Page_Url() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "experienceFragmentHeaderSimpleUrl");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("broadPromoTilesAuthor Url not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Customer Service Label AEM
	 * 
	 */
	public String get_Customer_Service_Label() {
		String orderStatusSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "getCustomerServiceLabel");
		if(orderStatusSectionTitle != null)
			return orderStatusSectionTitle;
		throw new RuntimeException("getCustomerServiceLabel not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Customer Service Contact Number AEM
	 * 
	 */
	public String get_Customer_Service_Contact_Number() {
		String orderStatusSectionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "getCustomerServiceContactNumber");
		if(orderStatusSectionTitle != null)
			return orderStatusSectionTitle;
		throw new RuntimeException("getCustomerServiceLabel not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Login Page author url en locale
	 *  
	 */
	public String get_Login_Page_Url_En() {
		String getloginPageUrlEn = Property.getProperty(Constant.AEM_DATA_FILE, "loginPageUrl_En");
		if(getloginPageUrlEn != null)
			return getloginPageUrlEn;
		throw new RuntimeException("loginPageUrl_En not specified in the Data file.");
	}
	
	/**
	 * get Data - Active Rewards Card Title
	 */
	public String get_Active_Rewards_Card_Title_Data() {
		String activeRewardsCardTitle = Property.getProperty(Constant.AEM_DATA_FILE, "activeRewardsCardTitle");
		if(activeRewardsCardTitle != null)
			return activeRewardsCardTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Active Rewards Card SubTitle
	 */
	public String get_Active_Rewards_Card_SubTitle_Data() {
		String activeRewardsCardSubTitle = Property.getProperty(Constant.AEM_DATA_FILE, "activeRewardsCardSubTitle");
		if(activeRewardsCardSubTitle != null)
			return activeRewardsCardSubTitle;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - YOB
	 */
	public String get_YOB_Input_Data() {
		String yobInput = Property.getProperty(Constant.AEM_DATA_FILE, "yobInput");
		if(yobInput != null)
			return yobInput;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Postal code
	 */
	public String get_PostalCode_Input_Data() {
		String postalCodeInput = Property.getProperty(Constant.AEM_DATA_FILE, "postalCodeInput");
		if(postalCodeInput != null)
			return postalCodeInput;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Active card continue
	 */
	public String get_Active_Card_Continue_data() {
		String activeCardContinue = Property.getProperty(Constant.AEM_DATA_FILE, "activeCardContinue");
		if(activeCardContinue != null)
			return activeCardContinue;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Active card cancel
	 */
	public String get_Active_Card_Cancel_data() {
		String activeCardCancel = Property.getProperty(Constant.AEM_DATA_FILE, "activeCardCancel");
		if(activeCardCancel != null)
			return activeCardCancel;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Active card Error Image
	 */
	public String get_Active_Card_Error_Image_data() {
		String activeValidationErrorImage = Property.getProperty(Constant.AEM_DATA_FILE, "activeValidationErrorImage");
		if(activeValidationErrorImage != null)
			return activeValidationErrorImage;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Active card Error Text
	 */
	public String get_Active_Card_Error_Text_data() {
		String errorTextInput = Property.getProperty(Constant.AEM_DATA_FILE, "errorTextInput");
		if(errorTextInput != null)
			return errorTextInput;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	public String get_AEM_Header_Url() {
		String getUrl = Property.getProperty(Constant.AEM_DATA_FILE, "headerPageUrlAEM");
		if(getUrl != null)
			return getUrl;
		else
			throw new RuntimeException("broadPromoTilesAuthor Url not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Login Page author url fr locale
	 * 
	 */
	public String get_Login_Page_Url_Fr() {
		String getloginPageUrlEn = Property.getProperty(Constant.AEM_DATA_FILE, "loginPageUrl_Fr");
		if(getloginPageUrlEn != null)
			return getloginPageUrlEn;
		throw new RuntimeException("loginPageUrl_En not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Login Registration author url en locale
	 *  
	 */
	public String get_Registration_Page_Url_En() {
		String getloginPageUrlEn = Property.getProperty(Constant.AEM_DATA_FILE, "registrationPageUrl_En");
		if(getloginPageUrlEn != null)
			return getloginPageUrlEn;
		throw new RuntimeException("registrationPageUrl_En not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Login Registration author url fr locale
	 *  
	 */
	public String get_Registration_Page_Url_Fr() {
		String getloginPageUrlEn = Property.getProperty(Constant.AEM_DATA_FILE, "registrationPageUrl_Fr");
		if(getloginPageUrlEn != null)
			return getloginPageUrlEn;
		throw new RuntimeException("registrationPageUrl_Fr not specified in the Data file.");
	}
	/**
	 * get Data - Download App Title
	 */
	public String get_Download_App_Title_Field() {
		String getDownloadAppTitleField = Property.getProperty(Constant.AEM_DATA_FILE, "downloadAppTitle");
		if(getDownloadAppTitleField != null)
			return getDownloadAppTitleField;
		throw new RuntimeException("downloadAppTitle data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Apple App Store Link
	 */
	public String get_Apple_App_Store_URL() {
		String getAppleAppStoreURL = Property.getProperty(Constant.AEM_DATA_FILE, "appleAppStoreURL");
		if(getAppleAppStoreURL != null)
			return getAppleAppStoreURL;
		throw new RuntimeException("appleAppStoreURL data is not specified in the Data file.");
	}
	/**
	 * get Data - Play Store Link
	 */
	public String get_Play_Store_URL() {
		String getPlayStoreURL = Property.getProperty(Constant.AEM_DATA_FILE, "playStoreURL");
		if(getPlayStoreURL != null)
			return getPlayStoreURL;
		throw new RuntimeException("playStoreURL data is not specified in the Data file.");
	}
	/**
	 * get Data - Accessibility Link
	 */
	public String get_Accessibility_URL() {
		String getAccessibilityURL = Property.getProperty(Constant.AEM_DATA_FILE, "accessibilityURL");
		if(getAccessibilityURL != null)
			return getAccessibilityURL;
		throw new RuntimeException("accessibilityURL data is not specified in the Data file.");
	}
	 /** 
	 * get Data - Customer Service Page author url en locale
	 *  
	 */
	public String get_Customer_Service_Page_Url_En() {
		String getCustomerServicePageUrlEn = Property.getProperty(Constant.AEM_DATA_FILE, "customerServiceUrl_En");
		if(getCustomerServicePageUrlEn != null)
			return getCustomerServicePageUrlEn;
		throw new RuntimeException("customerServiceUrl_En not specified in the Data file.");
	}
	/**
	 * 
	 * get Data - Customer Service Page author url fr locale
	 *  
	 */
	public String get_Customer_Service_Page_Url_Fr() {
		String getCustomerServicePageUrlFr = Property.getProperty(Constant.AEM_DATA_FILE, "customerServiceUrl_Fr");
		if(getCustomerServicePageUrlFr != null)
			return getCustomerServicePageUrlFr;
		throw new RuntimeException("customerServiceUrl_En not specified in the Data file.");
	}
	/**
	 * get Data - Customer Service Title 
	 * 
	 */
	
	public String get_Customer_Service_Title() {
		String getCustomerServiceTitle = Property.getProperty(Constant.AEM_DATA_FILE, "titleOfCustomerServiceAEM");
		if(getCustomerServiceTitle != null)
			return getCustomerServiceTitle;
		else
			throw new RuntimeException("titleOfCustomerServiceAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Customer Service Sub Title 
	 * 
	 */
	
	public String get_Customer_Service_Sub_Title() {
		String getCustomerServiceSubTitle = Property.getProperty(Constant.AEM_DATA_FILE, "subTitleOfCustomerServiceAEM");
		if(getCustomerServiceSubTitle != null)
			return getCustomerServiceSubTitle;
		else
			throw new RuntimeException("titleOfCustomerServiceAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Title1 of Link List
	 * 
	 */
	
	public String get_Title1_Link_List() {
		String getTitle1LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "title1OfLinkListAEM");
		if(getTitle1LinkList != null)
			return getTitle1LinkList;
		else
			throw new RuntimeException("title1OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Title2 of Link List
	 * 
	 */
	
	public String get_Title2_Link_List() {
		String getTitle2LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "title2OfLinkListAEM");
		if(getTitle2LinkList != null)
			return getTitle2LinkList;
		else
			throw new RuntimeException("title2OfLinkListAEM is not specified in the Data file.");
	}

	/**
	 * 
	 * get Data - Sub Title
	 *  
	 */
	public String get_Sub_Title_First() {
		String subTitleFirst = Property.getProperty(Constant.AEM_DATA_FILE, "subTitleFirst");
		if(subTitleFirst != null)
			return subTitleFirst;
		throw new RuntimeException("registrationPageUrl_En not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sub Title
	 */
	public String get_Sub_Title_First_Change() {
		String subTitleFirstChange = Property.getProperty(Constant.AEM_DATA_FILE, "subTitleFirstChange");
		if(subTitleFirstChange != null)
			return subTitleFirstChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Sub Title
	 */
	public String get_FL_Image_Sub_Title_First_Change() {
		String subTitleFirstChange = Property.getProperty(Constant.AEM_DATA_FILE, "subFLImageTitleFirst");
		if(subTitleFirstChange != null)
			return subTitleFirstChange;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Feature List Alt Text One
	 *  
	 */
	public String get_Feature_List_Alt_Text_One() {
		String featureListAltTextOne = Property.getProperty(Constant.AEM_DATA_FILE, "featureListAltTextOne");
		if(featureListAltTextOne != null)
			return featureListAltTextOne;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * 
	 * get Data - Learn More Link First
	 *  
	 */
	public String get_Learn_More_Link_One() {
		String learMoreLinkFirstOption = Property.getProperty(Constant.AEM_DATA_FILE, "learMoreLinkFirstOption");
		if(learMoreLinkFirstOption != null)
			return learMoreLinkFirstOption;
		throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * gets Featured List Url
	 * 
	 */
	
	public String get_Feature_List_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "featureListUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	

	public String get_Title3_Link_List() {
		String getTitle3LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "title3OfLinkListAEM");
		if(getTitle3LinkList != null)
			return getTitle3LinkList;
		else
			throw new RuntimeException("title3OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Title4 of Link List
	 * 
	 */
	
	public String get_Title4_Link_List() {
		String getTitle4LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "title4OfLinkListAEM");
		if(getTitle4LinkList != null)
			return getTitle4LinkList;
		else
			throw new RuntimeException("title4OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Title5 of Link List
	 * 
	 */
	
	public String get_Title5_Link_List() {
		String getTitle5LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "title5OfLinkListAEM");
		if(getTitle5LinkList != null)
			return getTitle5LinkList;
		else
			throw new RuntimeException("title5OfLinkListAEM is not specified in the Data file.");
	}
	
	/**
	 * get Data - Title of Accordion
	 * 
	 */
	
	public String get_Accordion_Title() {
		String getAccordionTitle = Property.getProperty(Constant.AEM_DATA_FILE, "AccordionTitle");
		if(getAccordionTitle != null)
			return getAccordionTitle;
		else
			throw new RuntimeException("AccordionTitle is not specified in the Data file.");
	}
	
	/**
	 * get Data - header of Accordion
	 * 
	 */
	
	public String get_Accordion_header() {
		String getAccordionHeader = Property.getProperty(Constant.AEM_DATA_FILE, "AccordionHeader1");
		if(getAccordionHeader != null)
			return getAccordionHeader;
		else
			throw new RuntimeException("Accordion Header is not specified in the Data file.");
	}
	/**
	 * get Data - Description 1 of Link List
	 * 
	 */
	
	public String get_Description1_Link_List() {
		String getDescription1LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "description1OfLinkListAEM");
		if(getDescription1LinkList != null)
			return getDescription1LinkList;
		else
			throw new RuntimeException("description1OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Description 2 of Link List
	 * 
	 */
	
	public String get_Description2_Link_List() {
		String getDescription2LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "description2OfLinkListAEM");
		if(getDescription2LinkList != null)
			return getDescription2LinkList;
		else
			throw new RuntimeException("description2OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Description 3 of Link List
	 * 
	 */
	
	public String get_Description3_Link_List() {
		String getDescription3LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "description3OfLinkListAEM");
		if(getDescription3LinkList != null)
			return getDescription3LinkList;
		else
			throw new RuntimeException("description3OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Description 4 of Link List
	 * 
	 */
	
	public String get_Description4_Link_List() {
		String getDescription4LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "description4OfLinkListAEM");
		if(getDescription4LinkList != null)
			return getDescription4LinkList;
		else
			throw new RuntimeException("description4OfLinkListAEM is not specified in the Data file.");
	}
	/**
	 * get Data - Description 5 of Link List
	 * 
	 */
	
	public String get_Description5_Link_List() {
		String getDescription5LinkList = Property.getProperty(Constant.AEM_DATA_FILE, "description5OfLinkListAEM");
		if(getDescription5LinkList != null)
			return getDescription5LinkList;
		else
			throw new RuntimeException("description4OfLinkListAEM is not specified in the Data file.");
	}

	/**
	 * gets Cart Add to Wishlist
	 * 
	 */
	
	public String get_Add_To_Wishlist_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "addToWishlistAEMUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Wishlist Item Added Message Text
	 * 
	 */
	
	public String get_Wishlist_Item_Added_Label() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "wishlistItemAddedLabel");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets View Wishlist Text
	 * 
	 */
	
	public String get_View_Wishlist_Label() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "viewWishlistLabel");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Wishlist Max Limit Message Text
	 * 
	 */
	
	public String get_Wishlist_Max_Limit_Message() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "wishlistMaxLimitMessage");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * gets Close Text
	 * 
	 */
	
	public String get_Close_Label() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "closeLabel");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	

	/**
	 * gets Services url
	 * 
	 */
	
	public String get_Services_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "servicesAEMUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Description 5 of Link List
	 * 
	 */
	
	public String get_Weekly_Sign_Up_Publish_Url() {
		String getweeklySignUpPublishUrl = Property.getProperty(Constant.AEM_DATA_FILE, "weeklySignUpPublishUrl");
		if(getweeklySignUpPublishUrl != null)
			return getweeklySignUpPublishUrl;
		else
			throw new RuntimeException("weeklySignUpPublishUrl is not specified in the Data file.");
	}
	
	/**
	 * get Data - Link Card Title
	 * 
	 */
	
	public String get_Link_Card_Title() {
		String linkMasterCardTitle = Property.getProperty(Constant.AEM_DATA_FILE, "linkMasterCardTitle");
		if(linkMasterCardTitle != null)
			return linkMasterCardTitle;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	/**
	 * get Data - Link Card Title
	 * 
	 */
	
	public String get_Link_Card_Title_Change() {
		String linkMasterCardTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "linkMasterCardTitleChange");
		if(linkMasterCardTitleChange != null)
			return linkMasterCardTitleChange;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Link Card Publish Url
	 * 
	 */
	
	public String get_Link_Card_Publish_Url() {
		String linkCardPublishUrl = Property.getProperty(Constant.AEM_DATA_FILE, "linkCardPublishUrl");
		if(linkCardPublishUrl != null)
			return linkCardPublishUrl;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Last Name Label
	 * 
	 */
	
	public String get_Last_Name_Label() {
		String lastNameLabel = Property.getProperty(Constant.AEM_DATA_FILE, "lastNameLabel");
		if(lastNameLabel != null)
			return lastNameLabel;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	/**
	 * get Data - Last Name Label Change
	 * 
	 */
	
	public String get_Last_Name_Label_Change() {
		String lastNameLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "lastNameLabelChange");
		if(lastNameLabelChange != null)
			return lastNameLabelChange;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Continue Button
	 * 
	 */
	
	public String get_Continue_Button_Success_Screen() {
		String continueButtonSuccessScreen = Property.getProperty(Constant.AEM_DATA_FILE, "continueButtonSuccessScreen");
		if(continueButtonSuccessScreen != null)
			return continueButtonSuccessScreen;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	/**
	 * get Data - Continue Button
	 * 
	 */
	
	public String get_Continue_Button_Success_Screen_Change() {
		String continueButtonSuccessScreenChange = Property.getProperty(Constant.AEM_DATA_FILE, "continueButtonSuccessScreenChange");
		if(continueButtonSuccessScreenChange != null)
			return continueButtonSuccessScreenChange;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Cancel Button
	 * 
	 */
	
	public String get_Cancel_Button_Master_Card() {
		String cancelButtonMasterCard = Property.getProperty(Constant.AEM_DATA_FILE, "cancelButtonMasterCard");
		if(cancelButtonMasterCard != null)
			return cancelButtonMasterCard;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	/**
	 * get Data - Cancel Button
	 * 
	 */
	
	public String get_Cancel_Button_Master_Card_Change() {
		String cancelButtonMasterCardChange = Property.getProperty(Constant.AEM_DATA_FILE, "cancelButtonMasterCardChange");
		if(cancelButtonMasterCardChange != null)
			return cancelButtonMasterCardChange;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Privacy Charter Url
	 * 
	 */
	
	public String get_Privacy_Charter_Author_Url() {
		String privacyCharterUrlAuthor = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterUrlAuthor");
		if(privacyCharterUrlAuthor != null)
			return privacyCharterUrlAuthor;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Error Image Already Linked
	 * 
	 */
	
	public String get_Error_Image_Already_Linked() {
		String errorImageCardAlreadyLinked = Property.getProperty(Constant.AEM_DATA_FILE, "errorImageCardAlreadyLinked");
		if(errorImageCardAlreadyLinked != null)
			return errorImageCardAlreadyLinked;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Error Image Already Linked
	 * 
	 */
	
	public String get_Error_Image_Already_Linked_Change() {
		String errorImageCardAlreadyLinkedChange = Property.getProperty(Constant.AEM_DATA_FILE, "errorImageCardAlreadyLinkedChange");
		if(errorImageCardAlreadyLinkedChange != null)
			return errorImageCardAlreadyLinkedChange;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Try Again Button Already Linked
	 * 
	 */
	
	public String get_Try_Again_Button_Already_Linked() {
		String tryAgainButtonAlreadyLinkCard = Property.getProperty(Constant.AEM_DATA_FILE, "tryAgainButtonAlreadyLinkCard");
		if(tryAgainButtonAlreadyLinkCard != null)
			return tryAgainButtonAlreadyLinkCard;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Try Again Button Already Linked
	 * 
	 */
	
	public String get_Try_Again_Button_Already_Linked_Change() {
		String tryAgainButtonAlreadyLinkCardChange = Property.getProperty(Constant.AEM_DATA_FILE, "tryAgainButtonAlreadyLinkCardChange");
		if(tryAgainButtonAlreadyLinkCardChange != null)
			return tryAgainButtonAlreadyLinkCardChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Max Suggestion Keywords
	 * 
	 */
	
	public String get_Max_Keywords() {
		String maxSuggestionKeywords = Property.getProperty(Constant.AEM_DATA_FILE, "maxNumberKeywords");
		if(maxSuggestionKeywords != null)
			return maxSuggestionKeywords;
		else
			throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Max Suggestion Keywords
	 * 
	 */
	
	public String get_Max_Keywords_Change() {
		String maxSuggestionKeywordsChange = Property.getProperty(Constant.AEM_DATA_FILE, "maxNumberKeywordsChange");
		if(maxSuggestionKeywordsChange != null)
			return maxSuggestionKeywordsChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Suggestion Keywords Title
	 * 
	 */
	
	public String get_Keywrods_Suggestion_Title() {
		String titleKeywordSuggestions = Property.getProperty(Constant.AEM_DATA_FILE, "titleKeywordSuggestions");
		if(titleKeywordSuggestions != null)
			return titleKeywordSuggestions;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Suggestion Keywords Title
	 * 
	 */
	
	public String get_Keywrods_Suggestion_Title_Change() {
		String titleKeywordSuggestionsChange = Property.getProperty(Constant.AEM_DATA_FILE, "titleKeywordSuggestionsChange");
		if(titleKeywordSuggestionsChange != null)
			return titleKeywordSuggestionsChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Category Keywords Title
	 * 
	 */
	
	public String get_Keywrods_Category_Title() {
		String titleCategorySuggestions = Property.getProperty(Constant.AEM_DATA_FILE, "titleCategorySuggestions");
		if(titleCategorySuggestions != null)
			return titleCategorySuggestions;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Category Keywords Title
	 * 
	 */
	
	public String get_Keywrods_Category_Title_Change() {
		String titleCategorySuggestionsChange = Property.getProperty(Constant.AEM_DATA_FILE, "titleCategorySuggestionsChange");
		if(titleCategorySuggestionsChange != null)
			return titleCategorySuggestionsChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Product Keywords
	 * 
	 */
	
	public String get_Keywrods_Product_Title() {
		String titleProductSuggestions = Property.getProperty(Constant.AEM_DATA_FILE, "titleProductSuggestions");
		if(titleProductSuggestions != null)
			return titleProductSuggestions;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Max Product Keywords
	 * 
	 */
	
	public String get_Keywrods_Product_Title_Change() {
		String titleProductSuggestionsChange = Property.getProperty(Constant.AEM_DATA_FILE, "titleProductSuggestionsChange");
		if(titleProductSuggestionsChange != null)
			return titleProductSuggestionsChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal author Url
	 * 
	 */
	public String get_Legal_Author_Url() {
		String getAuthorURL = Property.getProperty(Constant.AEM_DATA_FILE, "legalTextAuthorUrl");
		if(getAuthorURL != null)
			return getAuthorURL;
		throw new RuntimeException("legalTextAuthorUrl data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Terms & Conditions author Url
	 * 
	 */
	public String get_Terms_And_Conditions_Author_Url() {
		String getAuthorURL = Property.getProperty(Constant.AEM_DATA_FILE, "termsAndConditionsAuthorUrl");
		if(getAuthorURL != null)
			return getAuthorURL;
		throw new RuntimeException("legalTextAuthorUrl data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal author Url
	 * 
	 */
	public String get_Privacy_Policy_Author_Url() {
		String getAuthorURL = Property.getProperty(Constant.AEM_DATA_FILE, "privacyPolicyAuthorUrl");
		if(getAuthorURL != null)
			return getAuthorURL;
		throw new RuntimeException("legalTextAuthorUrl data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal author Url
	 * 
	 */
	public String get_SiteMap_Author_Url() {
		String getAuthorURL = Property.getProperty(Constant.AEM_DATA_FILE, "siteMapTextAuthorUrl");
		if(getAuthorURL != null)
			return getAuthorURL;
		throw new RuntimeException("legalTextAuthorUrl data is not specified in the Data file.");
	}
	
	/**
	 * get Data - Legal author Url
	 * 
	 */
	public String get_Accessibility_Author_Url() {
		String getAuthorURL = Property.getProperty(Constant.AEM_DATA_FILE, "accessibilityTextAuthorUrl");
		if(getAuthorURL != null)
			return getAuthorURL;
		throw new RuntimeException("legalTextAuthorUrl data is not specified in the Data file.");
	}
	/*
	 * gets Size label
	 * 
	 */
	
	public String get_Size_Label() {
		String sizeVariantLabel = Property.getProperty(Constant.AEM_DATA_FILE, "sizeVariantLabel");
		if(sizeVariantLabel != null)
			return sizeVariantLabel;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Size label
	 * 
	 */
	
	public String get_Size_Label_Change() {
		String sizeVariantLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "sizeVariantLabelChange");
		if(sizeVariantLabelChange != null)
			return sizeVariantLabelChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Color label
	 * 
	 */
	
	public String get_Color_Label() {
		String colorVariantLabel = Property.getProperty(Constant.AEM_DATA_FILE, "colorVariantLabel");
		if(colorVariantLabel != null)
			return colorVariantLabel;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Color label
	 * 
	 */
	
	public String get_Color_Label_Change() {
		String colorVariantLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "colorVariantLabelChange");
		if(colorVariantLabelChange != null)
			return colorVariantLabelChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets More Sections
	 * 
	 */
	
	public String get_More_Section_Sticky_TOC() {
		String moreSectionsStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "moreSectionsStickyTOC");
		if(moreSectionsStickyTOC != null)
			return moreSectionsStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Overviews
	 * 
	 */
	
	public String get_Overviews_TOC() {
		String overviewStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "overviewStickyTOC");
		if(overviewStickyTOC != null)
			return overviewStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Specifications
	 * 
	 */
	
	public String get_Specifications_TOC() {
		String specificationsStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "specificationsStickyTOC");
		if(specificationsStickyTOC != null)
			return specificationsStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Resources
	 * 
	 */
	
	public String get_Resources_TOC() {
		String resourcesStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "resourcesStickyTOC");
		if(resourcesStickyTOC != null)
			return resourcesStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Videos
	 * 
	 */
	
	public String get_Videos_TOC() {
		String videosStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "videosStickyTOC");
		if(videosStickyTOC != null)
			return videosStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Availability
	 * 
	 */
	
	public String get_Availability_TOC() {
		String availablityStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "availablityStickyTOC");
		if(availablityStickyTOC != null)
			return availablityStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Rating and Reviews
	 * 
	 */
	
	public String get_Rating_And_Reviews_TOC() {
		String ratingAndReviewsStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "ratingAndReviewsStickyTOC");
		if(ratingAndReviewsStickyTOC != null)
			return ratingAndReviewsStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Questions And Answer
	 * 
	 */
	
	public String get_Questions_And_Answer_TOC() {
		String questionAndAnswersStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "questionAndAnswersStickyTOC");
		if(questionAndAnswersStickyTOC != null)
			return questionAndAnswersStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	public String get_More_Section_Sticky_TOC_Change() {
		String moreSectionsStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "moreSectionsStickyTOCChange");
		if(moreSectionsStickyTOC != null)
			return moreSectionsStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Overviews
	 * 
	 */
	
	public String get_Overviews_TOC_Change() {
		String overviewStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "overviewStickyTOCChange");
		if(overviewStickyTOC != null)
			return overviewStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Specifications
	 * 
	 */
	
	public String get_Specifications_TOC_Change() {
		String specificationsStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "specificationsStickyTOCChange");
		if(specificationsStickyTOC != null)
			return specificationsStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Resources
	 * 
	 */
	
	public String get_Resources_TOC_Change() {
		String resourcesStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "resourcesStickyTOCChange");
		if(resourcesStickyTOC != null)
			return resourcesStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Videos
	 * 
	 */
	
	public String get_Videos_TOC_Change() {
		String videosStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "videosStickyTOCChange");
		if(videosStickyTOC != null)
			return videosStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Availability
	 * 
	 */
	
	public String get_Availability_TOC_Change() {
		String availablityStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "availablityStickyTOCChange");
		if(availablityStickyTOC != null)
			return availablityStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Rating and Reviews
	 * 
	 */
	
	public String get_Rating_And_Reviews_TOC_Change() {
		String ratingAndReviewsStickyTOCChange = Property.getProperty(Constant.AEM_DATA_FILE, "ratingAndReviewsStickyTOCChange");
		if(ratingAndReviewsStickyTOCChange != null)
			return ratingAndReviewsStickyTOCChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * gets Questions And Answer
	 * 
	 */
	
	public String get_Qustions_And_Answer_TOC_Change() {
		String questionAndAnswersStickyTOC = Property.getProperty(Constant.AEM_DATA_FILE, "questionAndAnswersStickyTOCChange");
		if(questionAndAnswersStickyTOC != null)
			return questionAndAnswersStickyTOC;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * get Url - PDP Author
	 * 
	 */
	
	public String get_Pdp_Product_Author_Url() {
		String getPDPUrl = Property.getProperty(Constant.AEM_DATA_FILE, "pdpProductAuthorUrl");
		if(getPDPUrl != null)
			return getPDPUrl;
		else
			throw new RuntimeException("Result Url not specified in the Data file.");
	}
	
	/**
	 * gets Facet Title
	 * 
	 */
	
	public String get_Facet_Title() {
		String facetTitle = Property.getProperty(Constant.AEM_DATA_FILE, "facetTitle");
		if(facetTitle != null)
			return facetTitle;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * get Facet Title
	 * 
	 */
	
	public String get_Selected_Label() {
		String selectedLabel = Property.getProperty(Constant.AEM_DATA_FILE, "selectedLabel");
		if(selectedLabel != null)
			return selectedLabel;
		else
			throw new RuntimeException("Result Url not specified in the Data file.");
	}
	
	/**
	 * gets Selected Label
	 * 
	 */
	
	public String get_Selected_Label_Change() {
		String selectedLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "selectedLabelChange");
		if(selectedLabelChange != null)
			return selectedLabelChange;
		else
			throw new RuntimeException("data Data not specified in the Data file.");
	}
	
	/**
	 * get Selected Label
	 * 
	 */
	
	public String get_Facet_Title_Change() {
		String facetTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "facetTitleChange");
		if(facetTitleChange != null)
			return facetTitleChange;
		else
			throw new RuntimeException("Result Url not specified in the Data file.");
	}
	
	/**
	 * gets Privacy Charter
	 * 
	 */
	
	public String get_Privacy_Charter() {
		String privacyCharterHeader = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterHeader");
		if(privacyCharterHeader != null)
			return privacyCharterHeader;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Privacy Charter
	 * 
	 */
	
	public String get_Privacy_Charter_Change() {
		String privacyCharterHeaderChange = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterHeaderChange");
		if(privacyCharterHeaderChange != null)
			return privacyCharterHeaderChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Privacy Charter
	 * 
	 */
	
	public String get_Privacy_Charter_Content() {
		String privacyCharterBodyContent = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterBodyContent");
		if(privacyCharterBodyContent != null)
			return privacyCharterBodyContent;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Privacy Charter
	 * 
	 */
	
	public String get_Privacy_Charter__Content_Change() {
		String privacyCharterBodyContentChange = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterBodyContentChange");
		if(privacyCharterBodyContentChange != null)
			return privacyCharterBodyContentChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Privacy Charter Label
	 * 
	 */
	
	public String get_Privacy_Charter_Label() {
		String privacyCharterLabel = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterLabel");
		if(privacyCharterLabel != null)
			return privacyCharterLabel;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Privacy Charter Label
	 * 
	 */
	
	public String get_Privacy_Charter__Label_Change() {
		String privacyCharterLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "privacyCharterLabelChange");
		if(privacyCharterLabelChange != null)
			return privacyCharterLabelChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Add to Cart Desktop
	 * 
	 */
	
	public String get_Add_To_Cart_Desktop_Label() {
		String addToCartBtnStickyDesktop = Property.getProperty(Constant.AEM_DATA_FILE, "addToCartBtnStickyDesktop");
		if(addToCartBtnStickyDesktop != null)
			return addToCartBtnStickyDesktop;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Add to Cart Desktop
	 * 
	 */
	
	public String getAdd_To_Cart_Desktop_Label_Change() {
		String addToCartBtnStickyDesktopChange = Property.getProperty(Constant.AEM_DATA_FILE, "addToCartBtnStickyDesktopChange");
		if(addToCartBtnStickyDesktopChange != null)
			return addToCartBtnStickyDesktopChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Add to Cart Mobile
	 * 
	 */
	
	public String get_Add_To_Cart_Mobile_Label() {
		String addToCartBtnStickyMobile = Property.getProperty(Constant.AEM_DATA_FILE, "addToCartBtnStickyMobile");
		if(addToCartBtnStickyMobile != null)
			return addToCartBtnStickyMobile;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Add to Cart Mobile
	 * 
	 */
	
	public String getAdd_To_Cart_Mobile_Label_Change() {
		String addToCartBtnStickyMobileChange = Property.getProperty(Constant.AEM_DATA_FILE, "addToCartBtnStickyMobileChange");
		if(addToCartBtnStickyMobileChange != null)
			return addToCartBtnStickyMobileChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets Two tile component URL
	 * 
	 */
	
	public String get_Two_Tile_Component_Url_AEM() {
		String TwoTileURL = Property.getProperty(Constant.AEM_DATA_FILE, "TwoTileComponentAEMURL");
		if(TwoTileURL != null)
			return TwoTileURL;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Data - Learn More Label
	 */
	public String get_Learn_More_Label() {
		String getLearnMoreLabel = Property.getProperty(Constant.AEM_DATA_FILE, "learnMoreLabel");
		if(getLearnMoreLabel != null)
			return getLearnMoreLabel;
		throw new RuntimeException("learnMoreLabel data is not specified in the Data file.");
	}
	
	/**
	 * gets Learn More Label
	 * 
	 */
	
	public String get_Learn_More_Label_Change() {
		String learnMoreLabelChange = Property.getProperty(Constant.AEM_DATA_FILE, "learnMoreLabelChange");
		if(learnMoreLabelChange != null)
			return learnMoreLabelChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Data - Image (Feature List Page)
	 */
	public String get_Image_Feature_List_Product() {
		String featureListImage = Property.getProperty(Constant.AEM_DATA_FILE, "featureListImage");
		if(featureListImage != null)
			return featureListImage;
		throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Image (Feature List Page)
	 * 
	 */
	
	public String get_Image_Feature_List_Product_Change() {
		String featureListImageChange = Property.getProperty(Constant.AEM_DATA_FILE, "featureListImageChange");
		if(featureListImageChange != null)
			return featureListImageChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Data - Descriptive Message
	 */
	public String get_Descriptive_Message() {
		String descriptiveMessage = Property.getProperty(Constant.AEM_DATA_FILE, "descriptiveMessage");
		if(descriptiveMessage != null)
			return descriptiveMessage;
		throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Data - Descriptive Message
	 * 
	 */
	
	public String get_Descriptive_Message_Change() {
		String descriptiveMessageChange = Property.getProperty(Constant.AEM_DATA_FILE, "descriptiveMessageChange");
		if(descriptiveMessageChange != null)
			return descriptiveMessageChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Data - Descriptive Title
	 */
	public String get_Descriptive_Title() {
		String descriptiveTitle = Property.getProperty(Constant.AEM_DATA_FILE, "descriptiveTitle");
		if(descriptiveTitle != null)
			return descriptiveTitle;
		throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Data - Descriptive Message
	 * 
	 */
	
	public String get_Descriptive_Title_Change() {
		String descriptiveTitleChange = Property.getProperty(Constant.AEM_DATA_FILE, "descriptiveTitleChange");
		if(descriptiveTitleChange != null)
			return descriptiveTitleChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Price Detail Url (PLP)
	 * 
	 */
	
	public String get_Price_Detail_PLP_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "priceDetailsPLPUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	/**
	 * get Data - Now Price Label
	 */
	public String get_Now_Price_Label() {
		String nowLabelPrice = Property.getProperty(Constant.AEM_DATA_FILE, "nowLabelPrice");
		if(nowLabelPrice != null)
			return nowLabelPrice;
		throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Data - Now Price Label
	 * 
	 */
	
	public String get_Now_Price_Label_Change() {
		String nowLabelPriceChange = Property.getProperty(Constant.AEM_DATA_FILE, "nowLabelPriceChange");
		if(nowLabelPriceChange != null)
			return nowLabelPriceChange;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * get Data - FL Title
	 */
	public String get_Fl_Title() {
		String titleFl = Property.getProperty(Constant.AEM_DATA_FILE, "titleFl");
		if(titleFl != null)
			return titleFl;
		throw new RuntimeException("data is not specified in the Data file.");
	}
	
	/**
	 * gets Data - Now Price Label
	 * 
	 */
	
	public String get_Fl_Title_Change() {
		String titleFlChange = Property.getProperty(Constant.AEM_DATA_FILE, "titleFlChange");
		if(titleFlChange != null)
			return titleFlChange;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}

	/**
	 * gets PDP Product add to cart URL
	 * 
	 */
	
	public String get_PDP_AddToCart_AEM() {
		String PDPAem = Property.getProperty(Constant.AEM_DATA_FILE, "pdpProductAuthor");
		if(PDPAem != null)
			return PDPAem;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product cartFlyOut Title_single
	 * 
	 */
	
	public String get_cartFlyOut_Title_single() {
		String singleTitle = Property.getProperty(Constant.AEM_DATA_FILE, "AddtocartSingleTitle");
		if(singleTitle != null)
			return singleTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product cartFlyOut Title_plural
	 * 
	 */
	
	public String get_cartFlyOut_Title_plural() {
		String pluralTitle = Property.getProperty(Constant.AEM_DATA_FILE, "AddtocartPluralTitle");
		if(pluralTitle != null)
			return pluralTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product ContinuetoCart CTA link
	 * 
	 */
	
	public String get_ContinuetoCartCTA() {
		String CTA = Property.getProperty(Constant.AEM_DATA_FILE, "ContinuetoCartCTA");
		if(CTA != null)
			return CTA;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product Cart Link
	 * 
	 */
	
	public String get_CartLink() {
		String CartLink = Property.getProperty(Constant.AEM_DATA_FILE, "CartLink");
		if(CartLink != null)
			return CartLink;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product Continue Shopping CTA
	 * 
	 */
	
	public String get_ContinueShopping_CTA() {
		String ContinueShoppingCTA = Property.getProperty(Constant.AEM_DATA_FILE, "ContinueShoppingCTA");
		if(ContinueShoppingCTA != null)
			return ContinueShoppingCTA;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product ServiceAdd-OnLabel
	 * 
	 */
	
	public String get_ServiceAddOnLabel() {
		String ServiceAddOnLabel = Property.getProperty(Constant.AEM_DATA_FILE, "ServiceAdd-OnLabel");
		if(ServiceAddOnLabel != null)
			return ServiceAddOnLabel;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product ServiceAdd-OnAvailable Label
	 * 
	 */
	
	public String get_ServiceAddOnAvailableLabel() {
		String ServiceAddOnAvailableLabel = Property.getProperty(Constant.AEM_DATA_FILE, "ServiceAdd-OnAvailableLabel");
		if(ServiceAddOnAvailableLabel != null)
			return ServiceAddOnAvailableLabel;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product multiple Service Add-OnAvailable Label
	 * 
	 */
	
	public String get_MultipleServiceAddOnAvailableLabel() {
		String MulServiceAddOnAvailableLabel = Property.getProperty(Constant.AEM_DATA_FILE, "ServiceAdd-OnMultipleAvailableLabel");
		if(MulServiceAddOnAvailableLabel != null)
			return MulServiceAddOnAvailableLabel;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product AddServicetoCart Label
	 * 
	 */
	
	public String get_AddServicetoCartLabel() {
		String AddServicetoCartLabel = Property.getProperty(Constant.AEM_DATA_FILE, "AddServicetoCartLabel");
		if(AddServicetoCartLabel != null)
			return AddServicetoCartLabel;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product ServiceAdd-OnNextSteps label
	 * 
	 */
	
	public String get_ServiceAddOnNextSteps() {
		String ServiceAddOnNextSteps = Property.getProperty(Constant.AEM_DATA_FILE, "ServiceAdd-OnNextSteps");
		if(ServiceAddOnNextSteps != null)
			return ServiceAddOnNextSteps;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets PDP Product Service Add-On Error Message
	 * 
	 */
	
	public String get_ServiceAddOnErrorMessage() {
		String ServiceAddOnErrorMessage = Property.getProperty(Constant.AEM_DATA_FILE, "ServiceAdd-OnErrorMessage");
		if(ServiceAddOnErrorMessage != null)
			return ServiceAddOnErrorMessage;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Broad banner URL AEM
	 * 
	 */
	
	public String get_Broad_Banner_Url_AEM() {
		String BroadBannerURL = Property.getProperty(Constant.AEM_DATA_FILE, "BroadBannerAEM");
		if(BroadBannerURL != null)
			return BroadBannerURL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	
	/**
	 * gets Broad banner URL 
	 * 
	 */
	
	public String get_Broad_Banner_Url() {
		String BroadBannerURL = Property.getProperty(Constant.AEM_DATA_FILE, "BroadBanner");
		if(BroadBannerURL != null)
			return BroadBannerURL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	/**
	 * gets Broad banner background color
	 * 
	 */
	
	public String get_Broad_Banner_BackGroundColor() {
		String BroadBannerBackGroundColor = Property.getProperty(Constant.AEM_DATA_FILE, "BroadBannerBackgroundcolor");
		if(BroadBannerBackGroundColor != null)
			return BroadBannerBackGroundColor;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets Broad banner Title
	 * 
	 */
	
	public String get_Broad_Banner_Title() {
		String BroadBannerTitle = Property.getProperty(Constant.AEM_DATA_FILE, "BroadBannerTitle");
		if(BroadBannerTitle != null)
			return BroadBannerTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}

	/**
	 * gets Edge to edge Broad banner URL
	 * 
	 */
	
	public String get_EdgetoEdge_Banner_URL() {
		String EdgeBannerUrl = Property.getProperty(Constant.AEM_DATA_FILE, "EdgeToEdgeBannerAuthor");
		if(EdgeBannerUrl != null)
			return EdgeBannerUrl;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets Edge to edge Broad banner Title
	 * 
	 */
	
	public String get_EdgetoEdge_Banner_Title() {
		String EdgeBannerTitle = Property.getProperty(Constant.AEM_DATA_FILE, "EdgeToEdgeBannerTitle");
		if(EdgeBannerTitle != null)
			return EdgeBannerTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets Edge to edge Broad banner description
	 * 
	 */
	
	public String get_EdgetoEdge_Banner_Description() {
		String EdgeBannerDesc = Property.getProperty(Constant.AEM_DATA_FILE, "EdgeToEdgeBannerDescription");
		if(EdgeBannerDesc != null)
			return EdgeBannerDesc;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets Edge to edge Broad banner AltText
	 * 
	 */
	
	public String get_EdgetoEdge_Banner_Alttext() {
		String EdgeBannerAltText = Property.getProperty(Constant.AEM_DATA_FILE, "EdgeToEdgeBannerImageAltText");
		if(EdgeBannerAltText != null)
			return EdgeBannerAltText;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets Edge to edge Broad banner background color
	 * 
	 */
	
	public String get_EdgetoEdge_Banner_background_color() {
		String EdgeBannerBG = Property.getProperty(Constant.AEM_DATA_FILE, "EdgEdgeToEdgeBannerbackgroundColoreToEdgeBannerAuthor");
		if(EdgeBannerBG != null)
			return EdgeBannerBG;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	
	/**
	 * gets data Continue
	 * 
	 */
	
	public String get_Success_Screen_Continue_Data() {
		String successScreenContinue = Property.getProperty(Constant.AEM_DATA_FILE, "successScreenContinue");
		if(successScreenContinue != null)
			return successScreenContinue;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}

	/**
	 * gets slim banner URL
	 * 
	 */
	public String get_slim_banner_URL() {
		String slimBannerURL = Property.getProperty(Constant.AEM_DATA_FILE, "slimBannerURLAEM");
		if(slimBannerURL != null)
			return slimBannerURL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	/**
	 * gets slim banner Title
	 * 
	 */
	public String get_slim_banner_title() {
		String slimBannerTitle = Property.getProperty(Constant.AEM_DATA_FILE, "slimBannerTitle");
		if(slimBannerTitle != null)
			return slimBannerTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets slim banner description
	 * 
	 */
	public String get_slim_banner_desc() {
		String slimBannerdesc = Property.getProperty(Constant.AEM_DATA_FILE, "slimBannerdesc");
		if(slimBannerdesc != null)
			return slimBannerdesc;

			else
				throw new RuntimeException("data not specified in the Data file.");
		}	
	/**
	 * gets AEm Url
	 * 
	 */
	
	public String get_AEM_Url() {
		String getURl = Property.getProperty(Constant.AEM_DATA_FILE, "aemUrl");
		if(getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}
	
	
	public String get_Sign_Out_Data() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "signOutData");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/**
	 * gets data ctc URL
	 * 
	 */
	
	public String get_CTC_URL() {
		String getText = Property.getProperty(Constant.AEM_DATA_FILE, "ctcURL");
		if(getText != null)
			return getText;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets incl core Carges label
	 * 
	 */
	
	public String get_incl_CoreCharges_label() {
		String inclCoreCharges = Property.getProperty(Constant.AEM_DATA_FILE, "IncludeCoreChargeLabel");
		if(inclCoreCharges != null)
			return inclCoreCharges;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets content fragment URL
	 * 
	 */
	
	public String get_ContenFragment_URL() {
		String ContenFragment_URL = Property.getProperty(Constant.AEM_DATA_FILE, "ContentFragmentURL");
		if(ContenFragment_URL != null)
			return ContenFragment_URL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	/**
	 * gets content fragment URL
	 * 
	 */
	
	public String get_CommonContent_URL() {
		String CommonContentURL = Property.getProperty(Constant.AEM_DATA_FILE, "CommonContentURL");
		if(CommonContentURL != null)
			return CommonContentURL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	/**
	 * gets plus core Carges label
	 * 
	 */
	
	public String get_plus_CoreCharges_label() {
		String plusCoreCharges = Property.getProperty(Constant.AEM_DATA_FILE, "PlusCoreChargesLabel");
		if(plusCoreCharges != null)
			return plusCoreCharges;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets CoreCharges Tooltip Title label
	 * 
	 */
	
	public String get_CoreChargesTooltipTitle_label() {
		String CoreChargesTooltipTitle = Property.getProperty(Constant.AEM_DATA_FILE, "CoreChargesTooltipTitle");
		if(CoreChargesTooltipTitle != null)
			return CoreChargesTooltipTitle;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets CoreCharges Tooltip message label
	 * 
	 */
	
	public String get_CoreChargesTooltipmessage() {
		String CoreChargesTooltipMessage = Property.getProperty(Constant.AEM_DATA_FILE, "CoreChargesTooltipMessage");
		if(CoreChargesTooltipMessage != null)
			return CoreChargesTooltipMessage;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets featured product list URL
	 * 
	 */
	
	public String get_Featured_ProductList_URL() {
		String FPLURL = Property.getProperty(Constant.AEM_DATA_FILE, "featuredProductListURL");
		if(FPLURL != null)
			return FPLURL;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}
	/**
	 * gets product code
	 * 
	 */
	
	public String get_ProductCode() {
		String pcode = Property.getProperty(Constant.AEM_DATA_FILE, "ProductCode");
		if(pcode != null)
			return pcode;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	/**
	 * gets product image url
	 * 
	 */
	
	public String get_ProductImageURL() {
		String pcode = Property.getProperty(Constant.AEM_DATA_FILE, "ProductImageURL");
		if(pcode != null)
			return pcode;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
}
