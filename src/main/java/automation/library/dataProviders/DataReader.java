package automation.library.dataProviders;

import java.util.Properties;

import javax.management.RuntimeErrorException;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * gets product data of FED
 * 
 */
public class DataReader {

	private Properties properties;

	public DataReader() {

	}

	/**
	 * gets password detail
	 * 
	 */

	public String get_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "passwordData");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}

	/**
	 * gets New Password Detail
	 * 
	 */

	public String get_New_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "newPassword");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}

	/**
	 * gets User Name - One
	 * 
	 */
	public String get_UserName_For_One() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameOne");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name
	 * 
	 */
	public String get_UserName_2488() {
		String getUsername = Property.getProperty(Constant.DATA_FILE, "username_2488");
		if (getUsername != null)
			return getUsername;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name - Two
	 * 
	 */
	public String get_UserName_Two() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameTwo");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name - Three
	 * 
	 */
	public String get_UserName_Three() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernamethree");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name - Six
	 * 
	 */
	public String get_UserName_Six() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameSix");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name - Four
	 * 
	 */
	public String get_UserName_Four() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameForResetPassword");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets User Name - Five
	 * 
	 */
	public String get_Username_Five() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameFive");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets Reset Password Data
	 * 
	 */

	public String get_UserName_For_Reset_Password() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameForResetPassword");
		if (getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}

	/**
	 * gets Re-Type Password data
	 * 
	 */

	public String get_Retype_Password_Detail() {
		String getRetypePassword = Property.getProperty(Constant.DATA_FILE, "retypePasswordData");
		if (getRetypePassword != null)
			return getRetypePassword;
		else
			throw new RuntimeException("Retype Password Data not specified in the Data file.");
	}

	/**
	 * gets user detail
	 * 
	 */
	public String get_Username_OCCP_1181() {

		String getUserName = Property.getProperty(Constant.DATA_FILE, "username_1181");
		if (getUserName != null)
			return getUserName;
		else
			throw new RuntimeException("User Data not specified in the Data file.");
	}

	/**
	 * gets Product Code
	 * 
	 */
	public String get_Product_Not_Feature() {

		String notFeatureProductCode = Property.getProperty(Constant.DATA_FILE, "notFeatureProductCode");
		if (notFeatureProductCode != null)
			return notFeatureProductCode;
		else
			throw new RuntimeException("Product Code not specified in the Data file.");
	}

	/**
	 * gets Product Code
	 * 
	 */
	public String get_Product_No_Reviews() {

		String notFeatureProductCode = Property.getProperty(Constant.DATA_FILE, "productWithNoReviews");
		if (notFeatureProductCode != null)
			return notFeatureProductCode;
		else
			throw new RuntimeException("Product Code not specified in the Data file.");
	}

	/**
	 * gets Incorrect Re-Type Password Data
	 * 
	 */

	public String get_Incorrect_Retype_Password_Detail() {
		String getRetypePassword = Property.getProperty(Constant.DATA_FILE, "incorrectRetypePassword");
		if (getRetypePassword != null)
			return getRetypePassword;
		else
			throw new RuntimeException("Retype Password Data not specified in the Data file.");
	}

	/**
	 * gets Email Detail
	 * 
	 */

	public String get_Email_Detail() {
		String getEmail = Property.getProperty(Constant.DATA_FILE, "emailData");
		if (getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Email Data not specified in the Data file.");
	}

	/**
	 * gets Malinator URl
	 * 
	 */

	public String get_Mailinator_Url() {
		String getMailinatorUrl = Property.getProperty(Constant.DATA_FILE, "mailinatorUrl");
		if (getMailinatorUrl != null)
			return getMailinatorUrl;
		else
			throw new RuntimeException("Mailinator url not specified in the Data file.");
	}

	/**
	 * gets Invalid Email
	 * 
	 */

	public String get_Invalid_Email() {
		String getEmail = Property.getProperty(Constant.DATA_FILE, "invalidEmailData");
		if (getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Invalid EmailData Data not specified in the Data file.");
	}

	public String get_Email_Data() {
		String email = Property.getProperty(Constant.DATA_FILE, "getEmailData");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}

	/**
	 * gets Login URL
	 * 
	 */

	public String get_Login_Url() {
		String getLoginUrl = Property.getProperty(Constant.DATA_FILE, "loginUrl");
		if (getLoginUrl != null)
			return getLoginUrl;
		else
			throw new RuntimeException("Login url not specified in the Data file.");
	}

	/**
	 * gets Valid Email Detail
	 * 
	 */

	public String get_Valid_Email_Data() {
		String email = Property.getProperty(Constant.DATA_FILE, "validEmailData");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}

	/**
	 * gets quantity
	 * 
	 */

	public String get_Quantity() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantity");
		if (quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

	/**
	 * gets Quantity (Maximum Quantity)
	 * 
	 */

	public String get_Quantity_Greater_Than_Maximum_Quantity() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantityGreaterThanMaximumQuantity");
		if (quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Quantity Data (Not Integer)
	 * 
	 */

	public String get_Quantity_Not_Integer() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "quantityNotInteger");
		if (quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Quantity (Zero)
	 * 
	 */

	public String get_Quantity_Zero() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "quantityZero");
		if (quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Quantity (In Decimal)
	 * 
	 */

	public String get_Quantity_In_Decimal() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "decimalNumbuerInQuantity");
		if (quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

	/**
	 * gets First Name
	 * 
	 */

	public String get_FirstName() {
		String getFN = Property.getProperty(Constant.DATA_FILE, "FirstName");
		if (getFN != null)
			return getFN;
		else
			throw new RuntimeException("First Name Data not specified in the Data file.");
	}

	/**
	 * gets Invalid First Name
	 * 
	 */
	public String get_invalid_FirstName() {
		String getIFN = Property.getProperty(Constant.DATA_FILE, "InvalidFirstName");
		if (getIFN != null)
			return getIFN;
		else
			throw new RuntimeException("Invalid First Name Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Last Name
	 * 
	 */
	public String get_invalid_LastName() {
		String getILN = Property.getProperty(Constant.DATA_FILE, "InvalidLastName");
		if (getILN != null)
			return getILN;
		else
			throw new RuntimeException("Invalid Last Name Data not specified in the Data file.");
	}

	/**
	 * gets First Name
	 * 
	 */

	public String get_First_Name_Rewards() {
		String firstName = Property.getProperty(Constant.DATA_FILE, "firstNameRewards");
		if (firstName != null)
			return firstName;
		else
			throw new RuntimeException("First Name Data not specified in the Data file.");
	}

	/**
	 * gets Second Name
	 * 
	 */

	public String get_Last_Name_Rewards() {
		String lastName = Property.getProperty(Constant.DATA_FILE, "lastNamrRewards");
		if (lastName != null)
			return lastName;
		else
			throw new RuntimeException("Lirst Name Data not specified in the Data file.");
	}

	/**
	 * gets Address
	 * 
	 */

	public String get_Address_Rewards() {
		String address = Property.getProperty(Constant.DATA_FILE, "addressRewards");
		if (address != null)
			return address;
		else
			throw new RuntimeException("Address Data not specified in the Data file.");
	}

	/**
	 * gets City
	 * 
	 */

	public String get_City_Rewards() {
		String city = Property.getProperty(Constant.DATA_FILE, "cityRewards");
		if (city != null)
			return city;
		else
			throw new RuntimeException("City Data not specified in the Data file.");
	}

	/**
	 * gets Postal Code
	 * 
	 */

	public String get_Postal_Code_Rewards() {
		String postalCode = Property.getProperty(Constant.DATA_FILE, "postalCodeRewards");
		if (postalCode != null)
			return postalCode;
		else
			throw new RuntimeException("Postal Code Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Postal Code
	 * 
	 */

	public String get_InvalidPostal_Code() {
		String postalCode = Property.getProperty(Constant.DATA_FILE, "postalCodeRewards");
		if (postalCode != null)
			return postalCode;
		else
			throw new RuntimeException("Invalid postal Code Data not specified in the Data file.");
	}

	/**
	 * gets Phone Number
	 * 
	 */

	public String get_Phone_Number_Rewards() {
		String phoneNumber = Property.getProperty(Constant.DATA_FILE, "phoneNumberRewards");
		if (phoneNumber != null)
			return phoneNumber;
		else
			throw new RuntimeException("Phone Number Data not specified in the Data file.");

	}

	/**
	 * gets Last Name
	 * 
	 */
	public String get_LastName() {
		String getLN = Property.getProperty(Constant.DATA_FILE, "lastName");
		if (getLN != null)
			return getLN;
		else
			throw new RuntimeException("Last Name Data not specified in the Data file.");
	}

	/**
	 * gets Address
	 * 
	 */
	public String get_Address() {
		String getAddress = Property.getProperty(Constant.DATA_FILE, "Address");
		if (getAddress != null)
			return getAddress;
		else
			throw new RuntimeException("Address Data not specified in the Data file.");
	}

	/**
	 * gets Deactivated card number
	 * 
	 */

	public String get_Deactivated_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "deactivatedCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Deactivated Card Number not specified in the Data file.");
	}

	/**
	 * gets activated card number
	 * 
	 */

	public String get_Activated_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "activatedcardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Activated Card Number not specified in the Data file.");
	}

	/**
	 * gets loyalty card number
	 * 
	 */

	public String get_Loyalty_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "loyaltyCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets loyalty card number
	 * 
	 */

	public String get_Pending_Loyalty_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "pendingLoyaltyCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets closed card number
	 * 
	 */
	public String get_Closed_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "closedCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Closed Card Number not specified in the Data file.");
	}

	/**
	 * gets non existing card number
	 * 
	 */

	public String get_NonExisting_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "nonExistingCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Non existing card Number not specified in the Data file.");
	}

	/**
	 * gets Active Ownership Validation screen loyalty card number
	 * 
	 */

	public String get_Active_Ownership_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "activeOwnershipValidationCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets Data - Proivnce
	 * 
	 */
	public String get_Province() {
		String getProvince = Property.getProperty(Constant.DATA_FILE, "Province");
		if (getProvince != null)
			return getProvince;
		else
			throw new RuntimeException("Province Data not specified in the Data file.");
	}

	/**
	 * gets Valid hide link screen Email Detail
	 * 
	 */
	public String get_Hide_Link_Screen_Email_Data() {
		String email = Property.getProperty(Constant.DATA_FILE, "hideLinkScreenEmail");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}

	/**
	 * gets SearchValue
	 * 
	 */
	public String get_Search_Data() {
		String getsearch = Property.getProperty(Constant.DATA_FILE, "searchValue");
		if (getsearch != null)
			return getsearch;
		else
			throw new RuntimeException("Search Data not specified in the Data file.");
	}

	/**
	 * gets Valid Email Data for 2480
	 * 
	 */
	public String get_Valid_Email_Id_2480() {
		String email = Property.getProperty(Constant.DATA_FILE, "validEmailId_2480");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}

	/**
	 * gets Gigya API Key
	 * 
	 */
	public String get_Gigya_Api_Key() {
		String getGigyaApiKey = Property.getProperty(Constant.DATA_FILE, "apiKey");
		if (getGigyaApiKey != null)
			return getGigyaApiKey;
		else
			throw new RuntimeException("apiKey Data not specified in the Data file.");
	}

	/**
	 * gets Gigya User Key
	 * 
	 */
	public String get_Gigya_User_Key() {
		String getGigyaUserKey = Property.getProperty(Constant.DATA_FILE, "userKey");
		if (getGigyaUserKey != null)
			return getGigyaUserKey;
		else
			throw new RuntimeException("userKey Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Secret Key
	 * 
	 */
	public String get_Gigya_Secret_Key() {
		String getGigyaSecretKey = Property.getProperty(Constant.DATA_FILE, "secretKey");
		if (getGigyaSecretKey != null)
			return getGigyaSecretKey;
		else
			throw new RuntimeException("secretKey Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Data Center End Point
	 * 
	 */
	public String get_Gigya_Data_Center_EndPoint() {
		String getDataCenterEndPoint = Property.getProperty(Constant.DATA_FILE, "dataCenterEndPoint");
		if (getDataCenterEndPoint != null)
			return getDataCenterEndPoint;
		else
			throw new RuntimeException("dataCenterEndPoint Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Parameter Login Name
	 * 
	 */
	public String get_Gigya_Parameter_Login_Name() {
		String getParameterLoginName = Property.getProperty(Constant.DATA_FILE, "parameterLoginName");
		if (getParameterLoginName != null)
			return getParameterLoginName;
		else
			throw new RuntimeException("ParameterLoginName Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Parameter Login Value
	 * 
	 */
	public String get_Gigya_Parameter_Login_Value() {
		String getParameterLoginValue = Property.getProperty(Constant.DATA_FILE, "parameterLoginValue");
		if (getParameterLoginValue != null)
			return getParameterLoginValue;
		else
			throw new RuntimeException("ParameterLoginValue Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Parameter Password Name
	 * 
	 */
	public String get_Gigya_Parameter_Password() {
		String getParameterPasswordName = Property.getProperty(Constant.DATA_FILE, "parameterPassword");
		if (getParameterPasswordName != null)
			return getParameterPasswordName;
		else
			throw new RuntimeException("ParameterPasswordName Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Parameter Password Value
	 * 
	 */
	public String get_Gigya_Parameter_Password_Value() {
		String getParameterPasswordValue = Property.getProperty(Constant.DATA_FILE, "parameterPasswordValue");
		if (getParameterPasswordValue != null)
			return getParameterPasswordValue;
		else
			throw new RuntimeException("ParameterPasswordvalue Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Data Center Drop down
	 * 
	 */
	public String get_Gigya_Data_Center_Dropdown() {
		String getDataCenterDropdown = Property.getProperty(Constant.DATA_FILE, "dataCenter");
		if (getDataCenterDropdown != null)
			return getDataCenterDropdown;
		else
			throw new RuntimeException("DataCenterDropdown Data not specified in the Data file.");
	}

	/**
	 * gets Gigya UID in response
	 * 
	 */
	public String get_UID() {
		String getUID = Property.getProperty(Constant.DATA_FILE, "uid");
		if (getUID != null)
			return getUID;
		else
			throw new RuntimeException("UID Data not specified in the Data file.");
	}

	/**
	 * gets Gigya UIDSignature in response
	 * 
	 */
	public String get_UIDSignature() {
		String getUIDSignature = Property.getProperty(Constant.DATA_FILE, "uidSignature");
		if (getUIDSignature != null)
			return getUIDSignature;
		else
			throw new RuntimeException("UIDSignature Data not specified in the Data file.");
	}

	/**
	 * gets Gigya signatureTimestamp in response
	 * 
	 */
	public String get_Signature_Timestamp() {
		String getsignatureTimestamp = Property.getProperty(Constant.DATA_FILE, "signatureTimestamp");
		if (getsignatureTimestamp != null)
			return getsignatureTimestamp;
		else
			throw new RuntimeException("SignatureTimestamp Data not specified in the Data file.");
	}

	/**
	 * gets Gigya Api Tool URL
	 * 
	 */
	public String get_Gigya_Api_Tool_Url() {
		String getGigyaApiToolUrl = Property.getProperty(Constant.DATA_FILE, "gigyaApiToolUrl");
		if (getGigyaApiToolUrl != null)
			return getGigyaApiToolUrl;
		else
			throw new RuntimeException("Gigya Tool url not specified in the Data file.");
	}

	/**
	 * gets password
	 * 
	 */

	public String get_Password() {
		String email = Property.getProperty(Constant.DATA_FILE, "getPasswordData");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Password Data not specified in the Data file.");
	}

	/**
	 * gets Incorrect format card number
	 * 
	 */

	public String get_Incorrect_Format_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "incorrectFormatCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets long characters card number
	 * 
	 */

	public String get_Long_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "longCharCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets balance greater than 100$ card number
	 * 
	 */

	public String get_Threshold_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "thresholdCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets bad card number or invalid card no
	 * 
	 */

	public String get_Bad_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "badCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets already kinked to other account card no
	 * 
	 */

	public String get_Already_Linked_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "alreadyLinkedCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Card Number not specified in the Data file.");
	}

	/**
	 * gets EdgeToEdge Banner url with Image
	 * 
	 */

	public String getEdgeToEdgeBannerUrlWithImageEn() {
		String getEdgeToEdgeBannerUrlWithImageEn = Property.getProperty(Constant.DATA_FILE,
				"edgeToEdgeBannerUrlWithImageEn");
		if (getEdgeToEdgeBannerUrlWithImageEn != null)
			return getEdgeToEdgeBannerUrlWithImageEn;
		else
			throw new RuntimeException(
					"getEdgeToEdgeBannerUrlWithImageEn not specified in the Configuration.properties file.");
	}

	/**
	 * gets EdgeToEdge Banner url without Image
	 * 
	 */

	public String getEdgeToEdgeBannerUrlWithoutImageEn() {
		String getEdgeToEdgeBannerUrlWithoutImageEn = Property.getProperty(Constant.DATA_FILE,
				"edgeToEdgeBannerUrlWithoutImageEn");
		if (getEdgeToEdgeBannerUrlWithoutImageEn != null)
			return getEdgeToEdgeBannerUrlWithoutImageEn;
		else
			throw new RuntimeException(
					"getEdgeToEdgeBannerUrlWithoutImageEn not specified in the Configuration.properties file.");
	}

	/**
	 * gets EdgeToEdge Banner url with Image
	 * 
	 */

	public String getEdgeToEdgeBannerUrlWithImageFr() {
		String getEdgeToEdgeBannerUrlWithImageFr = Property.getProperty(Constant.DATA_FILE,
				"edgeToEdgeBannerUrlWithImageFr");
		if (getEdgeToEdgeBannerUrlWithImageFr != null)
			return getEdgeToEdgeBannerUrlWithImageFr;
		else
			throw new RuntimeException(
					"getEdgeToEdgeBannerUrlWithImageFr not specified in the Configuration.properties file.");
	}

	/**
	 * gets EdgeToEdge Banner url without Image
	 * 
	 */

	public String getEdgeToEdgeBannerUrlWithoutImageFr() {
		String getEdgeToEdgeBannerUrlWithoutImageFr = Property.getProperty(Constant.DATA_FILE,
				"edgeToEdgeBannerUrlWithoutImageFr");
		if (getEdgeToEdgeBannerUrlWithoutImageFr != null)
			return getEdgeToEdgeBannerUrlWithoutImageFr;
		else
			throw new RuntimeException(
					"getEdgeToEdgeBannerUrlWithoutImageFr not specified in the Configuration.properties file.");
	}

	/**
	 * gets PDP Product Url
	 * 
	 */

	public String getPDPProductUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "pdpProductUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("pdpProductUrl not specified in the data.properties file.");
	}

	/**
	 * gets PDP Product Url
	 * 
	 */

	public String getPDPUrlProduct() {
		String url = Property.getProperty(Constant.DATA_FILE, "pdpUrlProduct");
		if (url != null)
			return url;
		else
			throw new RuntimeException("pdpProductUrl not specified in the data.properties file.");
	}
	
	/**
	 * gets PDP Product Url (FR)
	 * 
	 */

	public String getPDPProductFRUrl() {
		String url = Property.getProperty(Constant.DATA_FILE, "pdpProductFRUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("pdpProductUrl not specified in the data.properties file.");
	}

	/**
	 * gets No Service Installation
	 * 
	 */

	public String getProductCodeForNoServiceInstallation() {
		String noServiceInstallationProductCode = Property.getProperty(Constant.DATA_FILE,
				"noServiceInstallationProductCode");
		if (noServiceInstallationProductCode != null)
			return noServiceInstallationProductCode;
		else
			throw new RuntimeException("pdp Product Code not specified in the Configuration.properties file.");
	}

	/**
	 * gets non existing card number
	 * 
	 */

	public String get_Incorrect_MasterCard_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "incorrectMasterCardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Non existing card Number not specified in the Data file.");
	}

	/**
	 * gets Broad Promo Tiles En URL
	 * 
	 */

	public String get_BroadPromoTiles_Url_En() {
		String getBroadPromoTilesUrlEn = Property.getProperty(Constant.DATA_FILE, "broadPromoTilesEn");
		if (getBroadPromoTilesUrlEn != null)
			return getBroadPromoTilesUrlEn;
		else
			throw new RuntimeException("broadPromoTilesEn url not specified in the Data file.");
	}

	/**
	 * gets Broad Promo Tiles Fr URL
	 * 
	 */

	public String get_BroadPromoTiles_Url_Fr() {
		String getBroadPromoTilesUrlFr = Property.getProperty(Constant.DATA_FILE, "broadPromoTilesFr");
		if (getBroadPromoTilesUrlFr != null)
			return getBroadPromoTilesUrlFr;
		else
			throw new RuntimeException("getBroadPromoTilesUrlFr url not specified in the Data file.");
	}

	/**
	 * gets Login URL Fr locale
	 * 
	 */

	public String get_Login_Url_Fr() {
		String getLoginUrlFr = Property.getProperty(Constant.DATA_FILE, "loginUrl_Fr");
		if (getLoginUrlFr != null)
			return getLoginUrlFr;
		else
			throw new RuntimeException("Login Fr locale url not specified in the Data file.");
	}

	/**
	 * gets Login Page Publish URL En locale
	 * 
	 */

	public String get_Login_Page_Publish_Url_En() {
		String getLoginPagePublishUrlEn = Property.getProperty(Constant.DATA_FILE, "loginPagePublishUrl_En");
		if (getLoginPagePublishUrlEn != null)
			return getLoginPagePublishUrlEn;
		else
			throw new RuntimeException("loginPagePublishUrl_En locale url not specified in the Data file.");
	}

	/**
	 * gets Google App Store Url
	 * 
	 */

	public String get_Google_App_Store_Url() {
		String getLoginPagePublishUrlEn = Property.getProperty(Constant.DATA_FILE, "googleAppStoreUrl");
		if (getLoginPagePublishUrlEn != null)
			return getLoginPagePublishUrlEn;
		else
			throw new RuntimeException("googleAppStoreUrl locale url not specified in the Data file.");
	}

	/**
	 * gets Apple App Store Url
	 * 
	 */

	public String get_Apple_App_Store_Url() {
		String getLoginPagePublishUrlEn = Property.getProperty(Constant.DATA_FILE, "AppleAppStoreUrl");
		if (getLoginPagePublishUrlEn != null)
			return getLoginPagePublishUrlEn;
		else
			throw new RuntimeException("AppleAppStoreUrl locale url not specified in the Data file.");
	}

	/**
	 * gets ProductName (Search Product)
	 */
	public String get_Product_Search() {
		String getProduct = Property.getProperty(Constant.DATA_FILE, "serarchProduct");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Footer Url
	 */

	public String get_Footer_Component_Url() {
		String getUrl = Property.getProperty(Constant.DATA_FILE, "getFooterUrl");
		if (getUrl != null)
			return getUrl;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Login Page Publish URL FR locale
	 * 
	 */

	public String get_Login_Page_Publish_Url_Fr() {
		String getLoginPagePublishUrlEn = Property.getProperty(Constant.DATA_FILE, "loginPagePublishUrl_Fr");
		if (getLoginPagePublishUrlEn != null)
			return getLoginPagePublishUrlEn;
		else
			throw new RuntimeException("loginPagePublishUrl_Fr locale url not specified in the Data file.");
	}

	/**
	 * gets Registration Page Publish URL En locale
	 * 
	 */

	public String get_Registration_Page_Publish_Url_En() {
		String getRegistrationPagePublishUrlEn = Property.getProperty(Constant.DATA_FILE,
				"registrationPagePublishUrl_En");
		if (getRegistrationPagePublishUrlEn != null)
			return getRegistrationPagePublishUrlEn;
		else
			throw new RuntimeException("registrationPagePublishUrl_En locale url not specified in the Data file.");
	}

	/**
	 * gets Registration Page Publish URL Fr locale
	 * 
	 */

	public String get_Registration_Page_Publish_Url_Fr() {
		String getRegistrationPagePublishUrlFr = Property.getProperty(Constant.DATA_FILE,
				"registrationPagePublishUrl_Fr");
		if (getRegistrationPagePublishUrlFr != null)
			return getRegistrationPagePublishUrlFr;
		else
			throw new RuntimeException("registrationPagePublishUrl_Fr locale url not specified in the Data file.");
	}

	/**
	 * gets Learn More Link
	 */
	public String get_Learn_More_Link() {
		String learnMoreLink = Property.getProperty(Constant.DATA_FILE, "learnMoreLink");
		if (learnMoreLink != null)
			return learnMoreLink;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Accessibility Link
	 */
	public String get_Accessibility_Link() {
		String accessibilityLink = Property.getProperty(Constant.DATA_FILE, "accessibilityLink");
		if (accessibilityLink != null)
			return accessibilityLink;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets App store Url
	 */
	public String get_AppStore_Url() {
		String Url = Property.getProperty(Constant.DATA_FILE, "googleAppStoreUrl");
		if (Url != null)
			return Url;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets apple App store Url
	 */
	public String get_appleAppStore_Url() {
		String Url = Property.getProperty(Constant.DATA_FILE, "AppleAppStoreUrl");
		if (Url != null)
			return Url;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Sign Up Link
	 */
	public String get_Sign_Up_Link() {
		String signUpUrl = Property.getProperty(Constant.DATA_FILE, "signUpUrl");
		if (signUpUrl != null)
			return signUpUrl;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Footer Url
	 */
	public String get_Footer_Url() {
		String footerUrl = Property.getProperty(Constant.DATA_FILE, "footerUrl");
		if (footerUrl != null)
			return footerUrl;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Sign Up Link
	 */
	public String get_App_Store_Link() {
		String appStoreLogoLink = Property.getProperty(Constant.DATA_FILE, "appStoreLogoLink");
		if (appStoreLogoLink != null)
			return appStoreLogoLink;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Product Code of Add to cart fly out
	 * 
	 */
	public String get_Add_To_Cart_Product_FlyOut() {

		String getAddToCartProductFlyOut = Property.getProperty(Constant.DATA_FILE, "addToCartFlyOutProduct");
		if (getAddToCartProductFlyOut != null)
			return getAddToCartProductFlyOut;
		else
			throw new RuntimeException("addToCartFlyOutProduct Code not specified in the Data file.");
	}

	/**
	 * gets PDP Product Url for FR locale
	 * 
	 */

	public String getPDPProductUrl_Fr() {
		String getPDPProductUrlFr = Property.getProperty(Constant.DATA_FILE, "pdpProductUrl_Fr");
		if (getPDPProductUrlFr != null)
			return getPDPProductUrlFr;
		else
			throw new RuntimeException("pdpProductUrl_Fr not specified in the Configuration.properties file.");
	}

	/**
	 * gets PDP Sort Product Reviews URL
	 */
	public String get_PDP_Sort_Product_Reviews_URL() {
		String Url = Property.getProperty(Constant.DATA_FILE, "pdpSortProductsReviewsURL");
		if (Url != null)
			return Url;
		else
			throw new RuntimeException("Product not specified in the Data file.");
	}

	/**
	 * gets Existing Card Url
	 * 
	 */

	public String get_Existing_Card_Url() {
		String existingLinkCardUrl = Property.getProperty(Constant.DATA_FILE, "existingLinkCardUrl");
		if (existingLinkCardUrl != null)
			return existingLinkCardUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets yopmail Url
	 * 
	 */

	public String get_Yopmail_Url() {
		String Url = Property.getProperty(Constant.DATA_FILE, "yopmailUrl");
		if (Url != null)
			return Url;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Email Detail - Mobile
	 * 
	 */

	public String get_Email_Detail_Mobile() {
		String getEmail = Property.getProperty(Constant.DATA_FILE, "emailDataMobile");
		if (getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Email Data not specified in the Data file.");

	}

	/*
	 * gets Privacy Charter URl
	 * 
	 */

	public String get_Privacy_Charter_Url() {
		String privcacyCharterUrl = Property.getProperty(Constant.DATA_FILE, "privcacyCharterUrl");
		if (privcacyCharterUrl != null)
			return privcacyCharterUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Featured List URl
	 * 
	 */

	public String get_Featured_List_Url() {
		String featuredListUrl = Property.getProperty(Constant.DATA_FILE, "featuredListUrl");
		if (featuredListUrl != null)
			return featuredListUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Featured List URl (More than 4 products)
	 * 
	 */

	public String get_Featured_List_More_Than_Four_Product_Url() {
		String featuredListUrl = Property.getProperty(Constant.DATA_FILE, "featuredListMoreThan4ProductUrl");
		if (featuredListUrl != null)
			return featuredListUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets TwofeaturedTile component URL
	 * 
	 */

	public String get_Twofeatured_Tile_Url() {
		String TwofeaturedTileUrl = Property.getProperty(Constant.DATA_FILE, "twoFeaturedTileComponentURL");
		if (TwofeaturedTileUrl != null)
			return TwofeaturedTileUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets TwofeaturedTile CTA URL
	 * 
	 */

	public String get_Twofeatured_CTALink_Url() {
		String TwofeaturedTileCTAUrl = Property.getProperty(Constant.DATA_FILE, "CTALink");
		if (TwofeaturedTileCTAUrl != null)
			return TwofeaturedTileCTAUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Price Detail Url (PLP)
	 * 
	 */

	public String get_Price_Detail_PLP_Url() {
		String getURl = Property.getProperty(Constant.DATA_FILE, "priceDetailPLPPage");
		if (getURl != null)
			return getURl;
		else
			throw new RuntimeException("Url Data not specified in the Data file.");
	}

	/**
	 * gets Product Code of Q&A Section in PDP
	 * 
	 */
	public String get_Questions_And_Answers_Section() {

		String getQuestionsAndAnswersSection = Property.getProperty(Constant.DATA_FILE, "questionsAndAnswersSection");
		if (getQuestionsAndAnswersSection != null)
			return getQuestionsAndAnswersSection;
		else
			throw new RuntimeException("getQuestionsAndAnswersSection Code not specified in the Data file.");
	}

	/**
	 * gets Product Code of Q&A in PDP
	 * 
	 */
	public String get_Questions_And_Answers() {

		String getQuestionsAndAnswersSection = Property.getProperty(Constant.DATA_FILE, "questionsAndAnswers");
		if (getQuestionsAndAnswersSection != null)
			return getQuestionsAndAnswersSection;
		else
			throw new RuntimeException("getQuestionsAndAnswersSection Code not specified in the Data file.");
	}

	/**
	 * gets PDP Product -Add to Cart URL
	 * 
	 */

	public String get_PDP_product_URL() {
		String pdpAddToCartUrl = Property.getProperty(Constant.DATA_FILE, "pdpAddToCartUrl");
		if (pdpAddToCartUrl != null)
			return pdpAddToCartUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * 
	 * gets PDP Product -Add to Cart URL FR
	 * 
	 */

	public String get_PDP_product_FR_URL() {
		String pdpAddToCartUrlFR = Property.getProperty(Constant.DATA_FILE, "pdpAddToCartUrlFR");
		if (pdpAddToCartUrlFR != null)
			return pdpAddToCartUrlFR;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Featured List Product List URL
	 * 
	 */

	public String get_Featured_List_Product_List_Url() {
		String featuredProductsListUrl = Property.getProperty(Constant.DATA_FILE, "featuredProductListUrl");
		if (featuredProductsListUrl != null)
			return featuredProductsListUrl;
		else
			throw new RuntimeException("featuredProductList url not specified in the Data file.");
	}

	/**
	 * gets Featured List Product List URL
	 * 
	 */

	public String get_Featured_List_Product_List_Url_CA() {
		String featuredProductsListUrl = Property.getProperty(Constant.DATA_FILE, "featuredProductListUrl_ca");
		if (featuredProductsListUrl != null)
			return featuredProductsListUrl;
		else
			throw new RuntimeException("featuredProductList url not specified in the Data file.");
	}

	/**
	 * gets Cart Page URL
	 * 
	 */

	public String get_Cart_Page_Url() {
		String cartPageUrl = Property.getProperty(Constant.DATA_FILE, "cartPageUrl");
		if (cartPageUrl != null)
			return cartPageUrl;
		else
			throw new RuntimeException("cartPageUrl url not specified in the Data file.");
	}

	/**
	 * gets quantity
	 * 
	 */

	public String get_Quantity_4561() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantity_4561");
		if (quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	/**
	 * gets quantity
	 * 
	 */

	public String get_Quantity_3692() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantity_3692");
		if (quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	
	/**
	 * gets PDP Product -Add to Cart URL
	 * 
	 */

	public String get_PLP_Fr_URL() {
		String plpFrUrl = Property.getProperty(Constant.DATA_FILE, "plpFrUrl");
		if (plpFrUrl != null)
			return plpFrUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	public String get_Default_Error_Image_Path() {
		String getPath = Property.getProperty(Constant.DATA_FILE, "defaultErrorImage");
		if (getPath != null)
			return getPath;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Hi Text
	 * 
	 */

	public String get_Hi() {
		String getText = Property.getProperty(Constant.DATA_FILE, "hiText");
		if (getText != null)
			return getText;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Account Text
	 * 
	 */

	public String get_Account_Text() {
		String getText = Property.getProperty(Constant.DATA_FILE, "accountText");
		if (getText != null)
			return getText;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets SRP URl
	 * 
	 */

	public String get_SRP_Url() {
		String getUrl = Property.getProperty(Constant.DATA_FILE, "srpUrl");
		if (getUrl != null)
			return getUrl;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Featured List Product List Fr URL
	 * 
	 */

	public String get_Featured_List_Product_List_Url_Fr() {
		String featuredProductsListUrlFr = Property.getProperty(Constant.DATA_FILE, "featuredProductListUrl_Fr");
		if (featuredProductsListUrlFr != null)
			return featuredProductsListUrlFr;
		else
			throw new RuntimeException("featuredProductListUrl_Fr url not specified in the Data file.");
	}

	/**
	 * gets Account address URL
	 * 
	 */

	public String get_Account_Address_URL() {
		String addressURL = Property.getProperty(Constant.DATA_FILE, "AccountAddressURL");
		if (addressURL != null)
			return addressURL;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Account Email Data_3301
	 * 
	 */
	public String get_Email_Data_3301() {
		String email = Property.getProperty(Constant.DATA_FILE, "username_3301");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}

	/**
	 * gets Account Email Data_3301
	 * 
	 */
	public String get_Password_Data_3301() {
		String email = Property.getProperty(Constant.DATA_FILE, "password_3301");
		if (email != null)
			return email;
		else
			throw new RuntimeException("Valid password Data not specified in the Data file.");
	}

	/**
	 * gets Account Email Data_3301
	 * 
	 */
	public String get_Long_Postal_Code() {
		String getCode = Property.getProperty(Constant.DATA_FILE, "LongPostalCode");
		if (getCode != null)
			return getCode;
		else
			throw new RuntimeException("Valid password Data not specified in the Data file.");
	}

	/**
	 * gets Minimum Price Data
	 * 
	 */
	public String get_Minimum_Price_Data() {
		String data = Property.getProperty(Constant.DATA_FILE, "minimumPrice");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Maximum Price Data
	 * 
	 */
	public String get_Maximum_Price_Data() {
		String data = Property.getProperty(Constant.DATA_FILE, "maxPrice");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Minimum Price Data
	 * 
	 */
	public String get_Minimum_Price_More_Than_Maximum() {
		String data = Property.getProperty(Constant.DATA_FILE, "minimumPriceMoreThanMax");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets pdp Product Badge URL(PerfectGift)
	 * 
	 */
	public String get_pdpProductBadgeURL() {
		String data = Property.getProperty(Constant.DATA_FILE, "pdpProductBadgeURL");
		if (data != null) 
			return data;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}

	/**
	 * gets pdp exclusive Badge URL
	 * 
	 */
	public String get_pdpExclusiveBadgeURL() {
		String data = Property.getProperty(Constant.DATA_FILE, "pdpExclusiveBadgeURL");
		if (data != null)
			return data;
		else
			throw new RuntimeException("URL not specified in the Data file.");
	}

	/**
	 * gets Minimum Price Data (Above Condition)
	 * 
	 */
	public String get_Minimum_Price_In_Range() {
		String data = Property.getProperty(Constant.DATA_FILE, "minimumPriceInRange");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Minimum Price Data (Below Range)
	 * 
	 */
	public String get_Minimum_Price_Below_Range() {
		String data = Property.getProperty(Constant.DATA_FILE, "minimumPriceBelowRange");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Maximum Price Data (Below Range)
	 * 
	 */
	public String get_Maximum_Price_Below_Range() {
		String data = Property.getProperty(Constant.DATA_FILE, "maximiumPriceBelowRange");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Already linked master card last name
	 * 
	 */
	public String get_Already_Linked_Mastercard_LastName_Data() {
		String data = Property.getProperty(Constant.DATA_FILE, "alreadyLinkedMastercardLastName");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Already linked master card last name
	 * 
	 */
	public String get_Already_Linked_Mastercard_PostalCode_Data() {
		String data = Property.getProperty(Constant.DATA_FILE, "alreadyLinkedMastercardPostalCode");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Already linked master card last name
	 * 
	 */
	public String get_Already_Linked_Mastercard_No_Data() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "alreadyLinkedMastercardNo");
		if (cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Masthead Banner Url
	 * 
	 */
	public String get_Masthead_Banner_Url() {
		String data = Property.getProperty(Constant.DATA_FILE, "mastheadBannerUrl");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Masthead Banner Url Fr
	 * 
	 */
	public String get_Masthead_Banner__Fr_Url() {
		String data = Property.getProperty(Constant.DATA_FILE, "mastheadBannerFrUrl");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Masthead Banner zeroReviewUrl
	 */
	public String get_Masthead_Banner__Two_Url() {
		String data = Property.getProperty(Constant.DATA_FILE, "mastheadBannerTwoUrl");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Masthead Banner
	 */
	public String get_Zero_Url_Url() {
		String data = Property.getProperty(Constant.DATA_FILE, "zeroReviewUrl");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets question Answer Review
	 */
	public String get_Question_Answer_Review() {
		String data = Property.getProperty(Constant.DATA_FILE, "questionAnswerReview");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Name Review
	 */
	public String get_Name_Review() {
		String data = Property.getProperty(Constant.DATA_FILE, "nameReview");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Email Review
	 */

	public String get_Email_Review() {
		String data = Property.getProperty(Constant.DATA_FILE, "emailReview");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Email Review
	 */
	public String get_Review_Title_Pop_Up() {
		String data = Property.getProperty(Constant.DATA_FILE, "reviewTitlePopUp");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Email Review Description
	 */
	public String get_Review_Description_Pop_Up() {
		String data = Property.getProperty(Constant.DATA_FILE, "reviewDescriptionPopUp");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Data not specified in the Data file.");
	}

	/**
	 * gets Product Code
	 * 
	 */
	public String get_Product_One_Reviews() {

		String data = Property.getProperty(Constant.DATA_FILE, "get_Product_One_Reviews");
		if (data != null)
			return data;
		else
			throw new RuntimeException("Product Code not specified in the Data file.");
	}
	 
	 /**
		 * gets Online Badge (Product)
		 * 
		 */
		public String get_Product_Online_Badges() {

			String data = Property.getProperty(Constant.DATA_FILE, "onlineBadgeProduct");
			if (data != null)
				return data;
			else
				throw new RuntimeException("Product Code not specified in the Data file.");
		}
		 
		 /**
			 * gets Perfect Gift Badge (Product)
			 * 
			 */
	public String get_Perfect_Gift_Badge() {

				String data = Property.getProperty(Constant.DATA_FILE, "perfectGiftBadgeProduct");
				if (data != null)
					return data;
				else
					throw new RuntimeException("Product Code not specified in the Data file.");
			}
			
		/**
		 * gets valid postal code
		 * 
		 */

		public String get_Valid_Postal_Code() {
			String getData = Property.getProperty(Constant.DATA_FILE, "validPostalCode");
			if (getData != null)
				return getData;
			else
				throw new RuntimeException("Postal code Data not specified in the Data file.");
		}
		
		/**
		 * gets Invalid postal code
		 * 
		 */

		public String get_Invalid_Postal_Code() {
			String getData = Property.getProperty(Constant.DATA_FILE, "invalidPostalCode");
			if (getData != null)
				return getData;
			else
				throw new RuntimeException("Invalid Postal code Data not specified in the Data file.");
		}
		
		/**
		 * gets Out of range postal code
		 * 
		 */

		public String get_OutOfRange_Postal_Code() {
			String getData = Property.getProperty(Constant.DATA_FILE, "outOfRangePostalCode");
			if (getData != null)
				return getData;
			else
				throw new RuntimeException("Out of Range Postal code Data not specified in the Data file.");
		}
		
		/**
		 * gets Mobile breadcrumb data
		 * 
		 */

		public String get_Mobile_Breadcrumb_Data() {
			String getData = Property.getProperty(Constant.DATA_FILE, "mobileBreadcrumbData");
			if (getData != null)
				return getData;
			else
				throw new RuntimeException("Mobile breadcrumb data not specified in the Data file.");
		}

			/**
			 * gets Account Payment Information URL
			 * 
			 */
			public String get_AccountPaymentInfoURL() {

				String data = Property.getProperty(Constant.DATA_FILE, "AccountPaymentInfoURL");
				if (data != null)
					return data;
				else
					throw new RuntimeException("URL not specified in the Data file.");
			}
			

	/**
	 * gets Contact Us URL
	 * 
	 */

	public String get_Contact_Us_Url() {
		String url = Property.getProperty(Constant.DATA_FILE, "contactUsUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}
	
	/**
	 * gets Contact Us Fr URL
	 * 
	 */

	public String get_Contact_Us_Fr_Url() {
		String url = Property.getProperty(Constant.DATA_FILE, "contactUsFrUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Data file.");
	}

	/**
	 * gets Invalid Detail
	 */
	public String get_Invalid_Detail() {

		String data = Property.getProperty(Constant.DATA_FILE, "invalidDetail");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - First Name (More than 50 Char)
	 * 
	 */
	public String get_First_Name_More_Than_50_Char() {

		String data = Property.getProperty(Constant.DATA_FILE, "firstNameMoreThan50Char");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Last Name (More than 50 Char)
	 * 
	 */
	public String get_Last_Name_More_Than_50_Char() {

		String data = Property.getProperty(Constant.DATA_FILE, "lastNameMoreThan50Char");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Email (More than 250 Char)
	 * 
	 */
	public String get_Email_More_Than_250_Char() {

		String data = Property.getProperty(Constant.DATA_FILE, "emailMoeThan250Char");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Order Number (More than 16 Char)
	 * 
	 */
	public String get_Order_Number_More_Than_16_Char() {

		String data = Property.getProperty(Constant.DATA_FILE, "orderNumberMoreThan16Char");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Additional Information (More than 300 Char)
	 * 
	 */
	public String get_Additonal_Infomration_More_Than_300_Char() {

		String data = Property.getProperty(Constant.DATA_FILE, "additonalInformationMoreThan300Char");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Additional Information 
	 * 
	 */
	public String get_Additonal_Infomration_More() {

		String data = Property.getProperty(Constant.DATA_FILE, "additionalInformation");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
	
	/** gets Data - Order Number Detail
	 * 
	 */
	public String get_Order_Number_Detail() {

		String data = Property.getProperty(Constant.DATA_FILE, "orderNumberDetails");
		if (data != null)
			return data;
		else
			throw new RuntimeException("data not specified in the Data file.");
	}
}
