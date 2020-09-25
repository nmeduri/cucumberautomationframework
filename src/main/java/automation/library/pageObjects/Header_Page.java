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
 * This file contains the functions of Header Page
 * 
 */
public class Header_Page extends PageObject {

	
	TestContext testContext;

	public Header_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function click on Account */
	public void clickOnAccount() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Account()));
	}
	
	/** This function click on Sign in */
	public void clickSignIn() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Sign_In_Header()));
	}
	
	/** This function click on Header */
	public void clickRegistration() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().get_Header_Locator_Page().get_Registration_Header()));
	}

}
