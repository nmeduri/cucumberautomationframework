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
}
