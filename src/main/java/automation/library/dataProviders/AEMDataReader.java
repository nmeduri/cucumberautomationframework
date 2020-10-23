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
	
	
}
