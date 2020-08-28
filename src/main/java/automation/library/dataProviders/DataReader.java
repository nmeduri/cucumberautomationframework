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
	

}
