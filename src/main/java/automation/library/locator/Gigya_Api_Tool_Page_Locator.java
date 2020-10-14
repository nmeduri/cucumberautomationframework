package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
/**
 * This class contains the locator of Gigya API Tool Page
 * 
 */
public class Gigya_Api_Tool_Page_Locator {
	String apiKey = Property.getProperty(Constant.OR_FILE, "apiKey");
	String userKey = Property.getProperty(Constant.OR_FILE, "userKey");
	String secretKey = Property.getProperty(Constant.OR_FILE, "secretKey");
	String dataCenter = Property.getProperty(Constant.OR_FILE, "dataCenter");
	String dataCenterEndPoint = Property.getProperty(Constant.OR_FILE, "dataCenterEndPoint");
	String parameterLoginName = Property.getProperty(Constant.OR_FILE, "parameterLoginName");
	String parameterLoginValue = Property.getProperty(Constant.OR_FILE, "parameterLoginValue");
	String addTextInputButton = Property.getProperty(Constant.OR_FILE, "addTextInputButton");
	String parameterPassword = Property.getProperty(Constant.OR_FILE, "parameterPassword");
	String parameterPasswordValue = Property.getProperty(Constant.OR_FILE, "parameterPasswordValue");
	String sendRequestButton = Property.getProperty(Constant.OR_FILE, "sendRequestButton");
	
	String response = Property.getProperty(Constant.OR_FILE, "response");
	/**
	 * gets Locator - API Key
	 * 
	 */
	
	public String get_Api_Key() {
		return apiKey;
	}
	/**
	 * gets Locator - User Key
	 * 
	 */
	
	public String get_User_Key() {
		return userKey;
	}
	/**
	 * gets Locator - Secret Key
	 * 
	 */
	
	public String get_Secret_Key() {
		return secretKey;
	}
	/**
	 * gets Locator - Data Center
	 * 
	 */
	
	public String get_Data_Center_Dropdown() {
		return dataCenter;
	}
	/**
	 * gets Locator - Data Center End Point
	 * 
	 */
	
	public String get_Data_Center_End_Point() {
		return dataCenterEndPoint;
	}
	/**
	 * gets Locator - Parameter Login Name
	 * 
	 */
	
	public String get_Parameter_Login_Name() {
		return parameterLoginName;
	}
	/**
	 * gets Locator - Parameter Login Value
	 * 
	 */
	
	public String get_Parameter_Login_Value() {
		return parameterLoginValue;
	}
	/**
	 * gets Locator - Add Text Input Button
	 * 
	 */
	
	public String get_Add_Text_Input_Button() {
		return addTextInputButton;
	}
	/**
	 * gets Locator - Parameter Password
	 * 
	 */
	
	public String get_Parameter_Password() {
		return parameterPassword;
	}
	/**
	 * gets Locator - Parameter Password Value
	 * 
	 */
	
	public String get_Parameter_Password_Value() {
		return parameterPasswordValue;
	}
	/**
	 * gets Locator - send Request Button
	 * 
	 */
	
	public String get_Send_Request_Button() {
		return sendRequestButton;
	}
	/**
	 * gets Locator - response
	 * 
	 */
	
	public String get_response() {
		return response;
	}
}
