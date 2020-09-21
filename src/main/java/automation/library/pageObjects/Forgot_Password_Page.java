
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

public class Forgot_Password_Page extends PageObject {

	TestContext testContext;

	public Forgot_Password_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	public void display_Header_Forgot_Password_Page() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Header_Forgot_Password_Page()));
	}
	
	public void click_Back_To_Sign_In() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Back_To_Sign_In())), 10);
	}
	
	public void enterData_Email(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Email_Forgot_Password()), data);
	}
	
	public void click_Send_Button() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Send_Button()));
	}
	
	public void displayMessageInvalidForgotPasswordEmail() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Invalid_Forgot_Password_Email_Message()));
	}
	
	public void clickResendPasswordLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Resend_Password_Link()));
	}
	
	public void displayResetPassowrdScreen() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Reset_Password_Email_Sent()));
	}
	
	public void verifyEmailFieldNotPopulated() throws Exception {
		Assert.assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getForgotPasswordLocator().get_Email_Forgot_Password()), "value"), "");
	}

}

