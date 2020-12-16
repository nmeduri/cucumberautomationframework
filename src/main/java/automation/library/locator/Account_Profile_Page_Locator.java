package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of account profile Page
 * 
 */
public class Account_Profile_Page_Locator {
	
	
	String Editbtn = Property.getProperty(Constant.OR_FILE, "Editbtn");
	String firstName = Property.getProperty(Constant.OR_FILE, "firstName");
	String lastName = Property.getProperty(Constant.OR_FILE, "lastName");
	String emailField = Property.getProperty(Constant.OR_FILE, "emailField");
	String YOBAccntProf = Property.getProperty(Constant.OR_FILE, "YOBAccntProf");
	String monthAccntProf=Property.getProperty(Constant.OR_FILE, "monthAccntProf");
	String dateAccntProf=Property.getProperty(Constant.OR_FILE, "dateAccntProf");
	String phonenumberAccntProf = Property.getProperty(Constant.OR_FILE, "phonenumberAccntProf");
	String Savebtn=Property.getProperty(Constant.OR_FILE, "Savebtn");
	String cancelBtn=Property.getProperty(Constant.OR_FILE, "cancelBtn");
	String pwdEditbtn=Property.getProperty(Constant.OR_FILE, "pwdEditbtn");
	String currentPwd=Property.getProperty(Constant.OR_FILE, "currentPwd");
	String newPwd = Property.getProperty(Constant.OR_FILE, "newPwd");
	String confrmpwd=Property.getProperty(Constant.OR_FILE, "confrmpwd");
	String submit=Property.getProperty(Constant.OR_FILE, "submit");
	String cancel=Property.getProperty(Constant.OR_FILE, "cancel");
	String Modalheader=Property.getProperty(Constant.OR_FILE, "Modalheader");
	String Modalclose=Property.getProperty(Constant.OR_FILE, "Modalclose");
	String currentPwdError=Property.getProperty(Constant.OR_FILE, "currentPwdError");
	String newPWDError=Property.getProperty(Constant.OR_FILE, "newPWDError");
	String confirmPwdError=Property.getProperty(Constant.OR_FILE, "confirmPwdError");

	
	   /**
		 * gets Locator - Edit button
		 * 
		 */
	    
		public String getEditbtn() {
			return Editbtn;	
		}
		/**
		 * gets Locator - Modal close
		 * 
		 */
	    
		public String getModalclose() {
			return Modalclose;	
		}
		/**
		 * gets Locator - Edit firstName
		 * 
		 */
	    
		public String getEditfirstName() {
			return firstName;	
		}
		/**
		 * gets Locator - Edit last Name
		 * 
		 */
	    
		public String getEditlastName() {
			return lastName;	
		}
		/**
		 * gets Locator - Edit emailField
		 * 
		 */
	    
		public String getemailField() {
			return emailField;	
		}
		/**
		 * gets Locator - Edit YOB Accnt Prof
		 * 
		 */
	    
		public String getEditYOBAccntProf() {
			return YOBAccntProf;	
		}
		/**
		 * gets Locator - Edit monthAccntProf
		 * 
		 */
	    
		public String getEditmonthAccntProf() {
			return monthAccntProf;	
		}
		/**
		 * gets Locator - Edit dateAccntProf
		 */
	    
		public String getEditdateAccntProf() {
			return dateAccntProf;	
		}
		/**
		 * gets Locator - Edit phonenumber Accnt Prof
		 * 
		 */
	    
		public String getEditphonenumberAccntProf() {
			return phonenumberAccntProf;	
		}
		/**
		 * gets Locator - Savebtn
		 * 
		 */
	    
		public String getEditSavebtn() {
			return Savebtn;	
		}
		/**
		 * gets Locator - Edit cancelBtn
		 * 
		 */
	    
		public String getEditcancelBtn() {
			return cancelBtn;	
		}
		/**
		 * gets Locator - password Edit btn
		 * 
		 */
	    
		public String getpwdEditbtn() {
			return pwdEditbtn;	
		}		
		/**
		 * gets Locator - Edit current Pwd
		 * 
		 */
	    
		public String getcurrentPwd() {
			return currentPwd;	
		}		
		/**
		 * gets Locator - Edit new Pwd
		 * 
		 */
	    
		public String getnewPwd() {
			return newPwd;	
		}		
		/**
		 * gets Locator - Edit confrm pwd
		 * 
		 */
	    
		public String getconfrmpwd() {
			return confrmpwd;	
		}
		/**
		 * gets Locator - pwd submit btn
		 * 
		 */
	    
		public String getsubmitbtn() {
			return submit;	
		}		/**
		 * gets Locator - pwd cancel btn
		 * 
		 */
	    
		public String getcancelbtn() {
			return cancel;	
		}		
		/**
		 * gets Locator - Modal Popup
		 * 
		 */
	    
		public String getModalheader() {
			return Modalheader;	
		}
		/**
		 * gets Locator - current Pwd Error
		 * 
		 */
	    
		public String getcurrentPwdError() {
			return currentPwdError;	
		}
		/**
		 * gets Locator - new PWD Error
		 * 
		 */
	    
		public String getnewPWDError() {
			return newPWDError;	
		}
		/**
		 * gets Locator -confirm Pwd Error
		 * 
		 */
	    
		public String getconfirmPwdError() {
			return confirmPwdError;	
		}
}
