package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;
/**
 * This file contains the locator of Mailinator Page
 * 
 */
public class Account_Payment_Information_Page_Locator {
	
	
	String cardclosebtn = Property.getProperty(Constant.OR_FILE, "cardclosebtn");
	String cardModal = Property.getProperty(Constant.OR_FILE, "cardModal");
	String cardTitle = Property.getProperty(Constant.OR_FILE, "cardTitle");
	String cardDetail = Property.getProperty(Constant.OR_FILE, "cardDetail");
	String cardExpiry = Property.getProperty(Constant.OR_FILE, "cardExpiry");
	String successMessage=Property.getProperty(Constant.OR_FILE, "successMessage");
	String PaymentInfoTitle=Property.getProperty(Constant.OR_FILE, "PaymentInfoTitle");
	
	   /**
		 * gets Locator - card close btn
		 * 
		 */
	    
		public String getcardclosebtn() {
			return cardclosebtn;	
		}
		 /**
		 * gets Locator - PaymentInfo page Title
		 * 
		 */
	    
		public String getPaymentInfoTitle() {
			return PaymentInfoTitle;	
		}
		/**
		 * gets Locator - success toast Message
		 * 
		 */
	    
		public String getsuccessMessage() {
			return successMessage;	
		}
		/**
		 * gets Locator - cardModal
		 * 
		 */
	    
		public String getcardModal() {
			return cardModal;	
		}
		/**
		 * gets Locator - cardTitle
		 * 
		 */
	    
		public String getcardTitle() {
			return cardTitle;	
		}
		/**
		 * gets Locator - card Detail
		 * 
		 */
	    
		public String getcardDetail() {
			return cardDetail;	
		}
		/**
		 * gets Locator - card Expiry date
		 * 
		 */
	    
		public String getcardExpiry() {
			return cardExpiry;	
		}
		
}