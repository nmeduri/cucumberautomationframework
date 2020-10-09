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
 * This file contains the functions of Mailinator Page
 * 
 */
public class Mailinator_Page extends PageObject {

	
	TestContext testContext;

	public Mailinator_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate on Mailinator Page */
	public void navigate_To_Mailinator() {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Mailinator_Url());
	}
	
	/** This function enter user name */
	public void enterUserInMailinatorInbox(String data) throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Public_Mailinator_Inbox_Field()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Public_Mailinator_Inbox_Field()), data);;
	}
	
	/** This function click on Go Button */
	public void clickGoButton() throws Exception {
		$display($(Loc.ID, testContext.getPageObjectManager().getMailinatorPageLocator().get_Go_Button()));
		$click($(Loc.ID, testContext.getPageObjectManager().getMailinatorPageLocator().get_Go_Button()));
	}
	
	/** This function is verify that Email address is displayed */
	public void displayVerifyEmailAddress() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address())), 40);
	}
	
	/** This function is verify that click on verify email address */
	public void clickVerifyEmailAddress() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address())), 40);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address()));
	}
	
	/** This function is verify that email address' is displayed */
	public void displayVerifyEmailAddressOn_Mobile() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address_On_Mobile())), 60);
		Assert.assertEquals("Verify your Triangle ID email address", $getText($(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address_On_Mobile())));
	}
	
	/** This function is verify click on veify email address */
	public void clickVerifyEmailAddressOn_Mobile() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address_On_Mobile())), 50);
	}
	
	/** This function click on click here to verify email */
	public void click_Here_To_Verify_Email() throws Exception {
		Thread.sleep(2000);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath("//*[text()='Got it!']")));
		PageObject.getDriver().switchTo().frame("msg_body");
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getMailinatorPageLocator().get_Click_Here_To_Verify_Email())));
	}
	
	/** This function is verify that 'Click Here To Verify Email' is displayed */
	public void display_Here_To_Verify_Email() throws Exception {
		Thread.sleep(2000);
		PageObject.getDriver().switchTo().frame("msg_body");
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0];", $findElement(By.xpath(testContext.getPageObjectManager().getMailinatorPageLocator().get_Click_Here_To_Verify_Email())));
	}
	
	/** This function is verify that 'Resent Email' is displayed */
	public void displayResentEmail() throws Exception {
		Thread.sleep(3000);
		PageObject.getDriver().navigate().refresh();
		Thread.sleep(2000);
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address())), 10);
		List<Element> list = $$(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address());
		Log.message("Size:- " + list.size(), true);
		Assert.assertEquals(list.size(), 2);
	}
	
	/** This function is verify that 'Resent Email' is displayed */
	public void displayResentEmailMobile() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_More_Email())), 4);
		List<Element> list = $$(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_More_Email());
		Log.message("Size:- " + list.size(), true);
		Assert.assertTrue(list.size() > 1);
	}
	
	/** This function click on previous email */
	public void clickPreviousEmail() throws Exception {
		List<Element> list = $$(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Verify_Your_Email_Address());
		$click(list.get(1));
	}
	
	/** This function click on click here */
	public void clickOnClickHere() throws Exception {
		PageObject.getDriver().switchTo().frame("msg_body");
		Thread.sleep(2000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getMailinatorPageLocator().get_Click_Here())));
	}
	
	/** This function is verify that 'Click Here' is displayed */
	public void displayClickHere() throws Exception {
		PageObject.getDriver().switchTo().frame("msg_body");
		Thread.sleep(2000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0];", $findElement(By.xpath(testContext.getPageObjectManager().getMailinatorPageLocator().get_Click_Here())));
	}

	/** This function is verify that 'Click Here - Mobile' is displayed */
	public void displayClickHereMobile() throws Exception {
		PageObject.getDriver().switchTo().frame("msg_body");
		Thread.sleep(2000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0];", $findElement(By.xpath(testContext.getPageObjectManager().getMailinatorPageLocator().get_Click_Here_Mobile())));
	}
	
	/** This function is verify to Moment Ago is displayed */
	public void displayMomentAgo() throws Exception {
		$display(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getMailinatorPageLocator().get_Moment_Ago())), 10);
	}
	
}
