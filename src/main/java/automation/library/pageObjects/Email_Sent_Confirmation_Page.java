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

public class Email_Sent_Confirmation_Page extends PageObject {

	
	TestContext testContext;

	public Email_Sent_Confirmation_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	public void display_Message_Verification_Email_Sent() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getEmailSentConfirmationLocator().get_Message_Verification_Email_Sent()));
	}
	
	public void click_Resend_Email_Verification() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getEmailSentConfirmationLocator().get_Resend_EMail_Verification()));
	}
	
	public void display_Message_Resend_Verification_Email_Sent() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getEmailSentConfirmationLocator().get_Resend_Verification_Email_Sent_Message()));
	}

}
