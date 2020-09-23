package automation.library.dataProviders;

import java.util.Properties;

import javax.management.RuntimeErrorException;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class DataReader {
	
	
	private Properties properties;

	public DataReader(){
        
       
   }
	
	
	public String get_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "passwordData");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}
	
	public String get_New_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "newPassword");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}
	
	public String get_UserName_For_One() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameOne");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_UserName_Two() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameTwo");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_UserName_Three() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernamethree");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_UserName_Six() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameSix");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_UserName_Four() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameForResetPassword");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_Username_Five() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameFive");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_UserName_For_Reset_Password() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "usernameForResetPassword");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("UserName Data not specified in the Data file.");
	}
	
	public String get_Retype_Password_Detail() {
		String getRetypePassword = Property.getProperty(Constant.DATA_FILE, "retypePasswordData");
		if(getRetypePassword != null)
			return getRetypePassword;
		else
			throw new RuntimeException("Retype Password Data not specified in the Data file.");
	}
	
	public String get_Incorrect_Retype_Password_Detail() {
		String getRetypePassword = Property.getProperty(Constant.DATA_FILE, "incorrectRetypePassword");
		if(getRetypePassword != null)
			return getRetypePassword;
		else
			throw new RuntimeException("Retype Password Data not specified in the Data file.");
	}
	
	public String get_Email_Detail() {
		String getEmail = Property.getProperty(Constant.DATA_FILE, "emailData");
		if(getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Email Data not specified in the Data file.");
	}
	
	public String get_Mailinator_Url() {
		String getMailinatorUrl = Property.getProperty(Constant.DATA_FILE, "mailinatorUrl");
		if(getMailinatorUrl != null)
			return getMailinatorUrl;
		else 
			throw new RuntimeException("Mailinator url not specified in the Data file.");
	}
	
	public String get_Invalid_Email() {
		String getEmail = Property.getProperty(Constant.DATA_FILE, "invalidEmailData");
		if(getEmail != null)
			return getEmail;
		else
			throw new RuntimeException("Invalid EmailData Data not specified in the Data file.");
	}
	
	public String get_Login_Url() {
		String getLoginUrl = Property.getProperty(Constant.DATA_FILE, "loginUrl");
		if(getLoginUrl != null)
			return getLoginUrl;
		else 
			throw new RuntimeException("Login url not specified in the Data file.");
	}
	
	public String get_Valid_Email_Data() {
		String email = Property.getProperty(Constant.DATA_FILE, "validEmailData");
		if(email != null) 
			return email;
		else
			throw new RuntimeException("Valid Email Data not specified in the Data file.");
	}
	
	public String get_Quantity() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantity");
		if(quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	
	public String get_Quantity_Greater_Than_Maximum_Quantity() {
		String quantity = Property.getProperty(Constant.DATA_FILE, "quantityGreaterThanMaximumQuantity");
		if(quantity != null)
			return quantity;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	
	public String get_Quantity_Not_Integer() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "quantityNotInteger");
		if(quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	
	
	public String get_Quantity_Zero() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "quantityZero");
		if(quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}
	
	
	public String get_Quantity_In_Decimal() {
		String quantityNotInteger = Property.getProperty(Constant.DATA_FILE, "decimalNumbuerInQuantity");
		if(quantityNotInteger != null)
			return quantityNotInteger;
		else
			throw new RuntimeException("Quantity Data not specified in the Data file.");
	}

}
