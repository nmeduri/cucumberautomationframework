package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
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
 * This file contains the functions of PDP Page
 * 
 */

public class AEM_Privacy_Charter_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Privacy_Charter_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to AEM Link Card Page */
	public void navigateTo_Privacy_Charter_Author() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter_Author_Url());

	}
	
	/** This function clicks on privacy  charter panel */
	public void clickPrivacyCharterPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getPrivacyCharterPanel())), 10);
	}
	
	/** update privacy charter header */
	public void updatePricacyCharterHeader() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter()), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter());
	}
	
	/** revert privacy charter header */
	public void revertPricacyCharterHeader() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getPrivacyCharterPanel()), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter_Change());
	}
	
	/** verify privacy charter header updated on site */
	public void verifyUpdatePrivacyCharterHeaderOnSite() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Update_Privacy_Charter_Header())), 10);
		Assert.assertTrue($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Update_Privacy_Charter_Header())), 10).contains(FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter()));
	}
	
	/** update privacy charter content */
	public void updatePricacyCharterContent() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter()), "The Privacy Charter is our commitment to you. It is our organization-wide policy on how all companies in the Canadian Tire family protect your personal information.​\n" + 
				"\n" + 
				"TERMS & CONDITIONS​\n" + 
				"\n" + 
				"PLEASE READ THESE TERMS AND CONDITIONS OF USE CAREFULLY BEFORE USING THIS WEB SITE. Your use of canadiantire.ca is expressly conditioned on your acceptance without modification of the following terms and conditions (the \"Terms and Conditions\"). By using canadiantire.ca, you signify your acceptance of these Terms and Conditions.\n" + 
				"\n" + 
				" \n" + 
				"\n" + 
				"Canadian Tire Corporation, Limited (\"Canadian Tire\") may, in its sole discretion and for any reason, modify, supplement or amend these Terms and Conditions without any notice or liability to you or any other person, by posting revised Terms and Conditions on the canadiantire.ca web site. Your continued use of the canadiantire.ca web site signifies your acceptance of such revised Terms and Conditions, so check back frequently to read the most recent version Test.");
	}
	
	/** verify privacy charter content updated on site */
	public void verifyUpdatePrivacyCharterContentOnSite() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Update_Privacy_Charter_Header())), 10);
		Assert.assertTrue($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Update_Privacy_Charter_Header())), 10).contains(FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter_Content()));
	}
	
	/** revert privacy charter content */
	public void revertPricacyCharterContent() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().getHeaderPrivacyCharter()), "The Privacy Charter is our commitment to you. It is our organization-wide policy on how all companies in the Canadian Tire family protect your personal information.​\n" + 
				"\n" + 
				"TERMS & CONDITIONS​\n" + 
				"\n" + 
				"PLEASE READ THESE TERMS AND CONDITIONS OF USE CAREFULLY BEFORE USING THIS WEB SITE. Your use of canadiantire.ca is expressly conditioned on your acceptance without modification of the following terms and conditions (the \"Terms and Conditions\"). By using canadiantire.ca, you signify your acceptance of these Terms and Conditions.\n" + 
				"\n" + 
				" \n" + 
				"\n" + 
				"Canadian Tire Corporation, Limited (\"Canadian Tire\") may, in its sole discretion and for any reason, modify, supplement or amend these Terms and Conditions without any notice or liability to you or any other person, by posting revised Terms and Conditions on the canadiantire.ca web site. Your continued use of the canadiantire.ca web site signifies your acceptance of such revised Terms and Conditions, so check back frequently to read the most recent version.");
	}
	
	public void updatePrivacyCharterLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().get_Label_Privacy_Charter_Desktop())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().get_Label_Privacy_Charter_Desktop()), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter_Label());
	}
	
	public void revertPrivacyCharterLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().get_Label_Privacy_Charter_Desktop())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPrivacyCharterPageLocator().get_Label_Privacy_Charter_Desktop()), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter__Label_Change());
	}
	
	/** verify privacy charter label updated on site */
	public void verifyUpdatePrivacyCharterLabelOnSite() throws Exception {
		Assert.assertEquals($getText(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().getLabelPrivacyCharter())), 10), FileReaderManager.getInstance().getAEMDataReader().get_Privacy_Charter_Label());
	}
}
