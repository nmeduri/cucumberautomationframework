
package automation.library.pageObjects;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
/**
 * This file contains the functions of Forgot Password Page
 * 
 */
public class Forgot_Password_Page extends PageObject {

	TestContext testContext;

	public Forgot_Password_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that header 'Forgot Password' is displayed */
	public void display_Header_Forgot_Password_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Header_Forgot_Password_Page()));
	}
	
	/** This function click on Back to sign in */
	public void click_Back_To_Sign_In() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Back_To_Sign_In())), 10);
	}
	
	/** This function enter email data in the email field */
	public void enterData_Email(String data) throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Email_Forgot_Password()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Email_Forgot_Password()), data);
	}
	
	/** This function click on send button */
	public void click_Send_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Send_Button()));
	}
	
	/** This function is verify that message 'Invalid Forgot Password Email' is displayed */
	public void displayMessageInvalidForgotPasswordEmail() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Invalid_Forgot_Password_Email_Message()));
	}
	
	/** This function click on resend password link */
	public void clickResendPasswordLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Resend_Password_Link()));
	}
	
	/** This function is verify that Screen Reset Password Screen is displayed */
	public void displayResetPassowrdScreen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Reset_Password_Email_Sent()));
	}
	
	/** This function is verify that Email is not populated in the field */
	public void verifyEmailFieldNotPopulated() throws Exception {
		Assert.assertEquals("", $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Email_Forgot_Password()), "value"));
	}
	
	/** This function is verify that Resent Confirmation Page is displayed */
	public void displayConfirmationResentMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Verification_Password_Link()));
	}

}

