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

}
