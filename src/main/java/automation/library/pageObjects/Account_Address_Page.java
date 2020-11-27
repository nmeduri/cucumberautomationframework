package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.logdetail.Log;

/**
 * This file contains the functions of account address Page
 * 
 */
public class Account_Address_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Account_Address_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function display address title in my account address page */
	public void display_addressesTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountAddressPageLocator().get_Addresses_Title())),30);
	}
	/** This function display shipping information title in my account address page */
	public void display_ShippingInfoTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountAddressPageLocator().get_ShippingInfo_Label())),30);
	}
	/** This function display shipping info detail in my account address page */
	public void display_ShippinginfoDetail() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountAddressPageLocator().get_ShippingInfo_Details())),30);
	}
	/** This function display billing information title in my account address page */
	public void display_billingaddressTitle() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountAddressPageLocator().get_BillingInformation_Label())),30);
	}
	/** This function display billing information detail in my account address page */
	public void display_billingaddressdetail() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAccountAddressPageLocator().get_BillingInformation_Info())),30);
	}
	
}