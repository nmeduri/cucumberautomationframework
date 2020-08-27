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

public class Mailinator_Page extends PageObject {

	
	TestContext testContext;

	public Mailinator_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	public void navigate_To_Mailinator() {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Mailinator_Url());
	}
	
	public void enterUserInMailinatorInbox(String data) throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Public_Mailinator_Inbox_Field()), data);;
	}
	
	public void clickGoButton() throws Exception {
		$click($(Loc.ID, testContext.getPageObjectManager().getMailinatorPageLocator().get_Go_Button()));
	}
	
	public void displayVerifyEmailAddress() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address())), 20);
	}
	
	public void displayVerifyEmailAddressOn_Mobile() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address_On_Mobile())), 50);
		Assert.assertEquals("Verify your Triangle ID email address", $getText($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address_On_Mobile())));
	}

}
