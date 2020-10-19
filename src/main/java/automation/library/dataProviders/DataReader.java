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

	public DataReader(){


	}
	/**
	 * gets password detail
	 * 
	 */

	public String get_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "passwordData");
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getUsername != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getPassword != null)
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
		if(getRetypePassword != null)
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
		if(getUserName != null)
			return getUserName;
		else
			throw new RuntimeException("User Data not specified in the Data file.");
	}

	/**
	 * gets Incorrect Re-Type Password Data
	 * 
	 */

	public String get_Incorrect_Retype_Password_Detail() {
		String getRetypePassword = Property.getProperty(Constant.DATA_FILE, "incorrectRetypePassword");
		if(getRetypePassword != null)
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
		if(getEmail != null)
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
		if(getMailinatorUrl != null)
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
		if(getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Invalid EmailData Data not specified in the Data file.");
	}

	/**
	 * gets Email Detail
	 * 
	 */
	
	public String get_Email_Data() {
		String email = Property.getProperty(Constant.DATA_FILE, "getEmail");
		if(email != null) 
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
		if(getLoginUrl != null)
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
		if(email != null) 
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
		if(quantity != null)
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
		if(quantity != null)
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
		if(quantityNotInteger != null)
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
		if(quantityNotInteger != null)
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
		if(quantityNotInteger != null)
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
		if(getFN != null)
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
		if(getIFN != null)
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
		if(getILN != null)
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
		if(firstName != null)
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
		if(lastName != null)
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
		if(address != null)
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
		if(city != null)
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
		if(postalCode != null)
			return postalCode;
		else
			throw new RuntimeException("Postal Code Data not specified in the Data file.");
	}

	/**
	 * gets Invalid Postal Code
	 * 
	 */

	public String get_InvalidPostal_Code() {
		String postalCode = Property.getProperty(Constant.DATA_FILE, "invalidPostalCode");
		if(postalCode != null)
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
		if(phoneNumber != null)
			return phoneNumber;
		else
			throw new RuntimeException("Phone Number Data not specified in the Data file.");

	}

	/**
	 * gets Last Name
	 * 
	 */
	public String get_LastName() {
		String getLN = Property.getProperty(Constant.DATA_FILE, "LastName");
		if(getLN != null)
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
		if(getAddress != null)
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
		if(cardNo != null)
			return cardNo;
		else
			throw new RuntimeException("Deactivated Card Number not specified in the Data file.");
	}
	/**
	 * gets Deactivated card number
	 * 
	 */
	
	public String get_Loyalty_Card_Number() {
		String cardNo = Property.getProperty(Constant.DATA_FILE, "loyaltyCardNo");
		if(cardNo != null)
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
		if(getProvince != null)
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
		if(email != null) 
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
		if(getsearch != null)
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
		if(email != null) 
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
		if(getGigyaApiKey != null)
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
		if(getGigyaUserKey != null)
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
		if(getGigyaSecretKey != null)
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
		if(getDataCenterEndPoint != null)
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
		if(getParameterLoginName != null)
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
		if(getParameterLoginValue != null)
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
		if(getParameterPasswordName != null)
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
		if(getParameterPasswordValue != null)
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
		if(getDataCenterDropdown != null)
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
		if(getUID != null)
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
		if(getUIDSignature != null)
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
		if(getsignatureTimestamp != null)
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
		if(getGigyaApiToolUrl != null)
			return getGigyaApiToolUrl;
		else 
			throw new RuntimeException("Gigya Tool url not specified in the Data file.");
	}
	
	/**
	 * gets password
	 * 
	 */
	
	
	
	/**
	 * gets password
	 * 
	 */
	
	public String get_Password() {
		String email = Property.getProperty(Constant.DATA_FILE, "getPassword");
		if(email != null) 
			return email;
		else
			throw new RuntimeException("Valid Password Data not specified in the Data file.");
	}
}
