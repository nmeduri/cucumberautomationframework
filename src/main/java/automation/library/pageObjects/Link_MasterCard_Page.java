package automation.library.pageObjects;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java8.Pa;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;

/**
 * This file contains the functions of Link Master Card Page
 * 
 */

public class Link_MasterCard_Page extends PageObject {
	TestContext testContext;
	
	public Link_MasterCard_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function verify that title link master card is displayed */
	public void displayTitleLinkMasterCardPage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Link_MasterCard_Title()));
	}
	
	/** This function enters invalid master card details */
	public void enterDataInvalidMasterCardDetails() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName()), FileReaderManager.getInstance().getDataReader().get_LastName());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_YOB()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Year()));
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_MOB()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Month()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_DOB()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Date()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Postal_Code()), FileReaderManager.getInstance().getDataReader().get_InvalidPostal_Code());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Input()), FileReaderManager.getInstance().getDataReader().get_Incorrect_MasterCard_Number());
	}
	
	/** This function verify that Error screen with error is displayed */
	public void displayMasterCardIncorrectErrorScreen() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Incorrect_Card_Error())), 40);
	}
	
	/** This function verify that details are not prepopulated */
	public void verifyLinkMastercardIsDisplayedWithoutCardDetails() throws Exception {
		String lastNameValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName()), "value");
		Log.message("Atual Data:- " + lastNameValue.replace(" ", ""), true);
		Assert.assertEquals("", lastNameValue.replace(" ", ""));	
		String PostalValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Postal_Code()), "value");
		Log.message("Atual Data:- " + PostalValue.replace(" ", ""), true);
		Assert.assertEquals("", PostalValue.replace(" ", ""));
		String CardNoValue = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Input()), "value");
		Log.message("Atual Data:- " + CardNoValue.replace(" ", ""), true);
		Assert.assertEquals("", CardNoValue.replace(" ", ""));
	}
	
	/** This function clicks on contact no */
	public void clickOnCustomerContactNo() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollUp();
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Customer_Contact_No())), 20);
	}
	
	/** This function verify that Error screen with error is displayed */
	public void displayCustomerContactNo() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Customer_Contact_No())), 20);
	}
	
	/** This function enters data for already master card details */
	public void enterDataForAlreadyLinkedMasterCardDetails() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName()), FileReaderManager.getInstance().getDataReader().get_Already_Linked_Mastercard_LastName_Data());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_YOB()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Year())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Year()));
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_MOB()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Month()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_DOB()));
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Date())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Date()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Postal_Code()), FileReaderManager.getInstance().getDataReader().get_Already_Linked_Mastercard_PostalCode_Data());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Input()), FileReaderManager.getInstance().getDataReader().get_Already_Linked_Mastercard_No_Data());
	}
	
		/** This function enters data for OMP card details */
	public void enterDataForOMPCardDetails() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName()), FileReaderManager.getInstance().getDataReader().get_OMP_Card_LastName_Data());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_YOB()));
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMP_Card_Year())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMP_Card_Year()));
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_LastName())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMPCard_MOB()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMP_Card_Month()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMPCard_DOB()));
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMP_Card_Date())), 5);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMP_Card_Date()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMPCard_Postal_Code()), FileReaderManager.getInstance().getDataReader().get_OMP_Card_PostalCode_Data());
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_OMPCard_Input()), FileReaderManager.getInstance().getDataReader().get_OMP_Card_No_Data());
	}
	
	
	
	
	/** This function verify that Error screen with error is displayed */
	public void displayOMPCardErrorScreen() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_ompCard_Error_Message())), 40);
	}
	
	
	/** This function verify that Error screen with error is displayed */
	public void displayCallPopUpScreen() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_call_popup_link())), 40);
	}
	
	
	/** This function scrolls down to continue button */
	public void scrollDownToContinue() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(By.xpath(testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Continue_button_Mobile()), 20);	
	}
	
	/** This function verify that master card already enrolled message is displayed */
	public void displayAlreadyEnrolledErrorMessage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_Already_Linked_MasterCard_Error_Message()));
	}
	
	/** This function scrolls to continue button */
	public void scrollToContinueButton() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_Postal_Code())), 5);
	}
	
	/** This function clicks on Continue button */
	public void clickOnMastercardContinueButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_ContinueButton()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_MasterCard_ContinueButton()));
	}
	
	public void callContactNumberPopup() throws Exception {
	//	$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage(PageObject.getDriver().switchTo().alert().accept();
	//	PageObject.getDriver().switchTo().alert().accept();
	
	}
	
	/** This function clicks on contact number */
	public void clickOnContactNumber() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_ContactNumber()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_ContactNumber()));
	}

	/** This function clicks on Continue button */
	public void clickOnOmpCardContinueButton() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_ompCard_ContinueButton()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getLinkMasterCardLocatorPage().get_ompCard_ContinueButton()));
	}
	

	
}
