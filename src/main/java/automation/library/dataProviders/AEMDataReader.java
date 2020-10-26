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
<<<<<<< HEAD
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
}
