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
 * This file contains the functions of Your Email Has Been Verified Page
 * 
 */

public class Your_Email_Has_Been_Verified_Page extends PageObject {

	
	TestContext testContext;

	public Your_Email_Has_Been_Verified_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that 'your page has been verified' is displayed */
	public void display_Your_Page_Has_been_Verified() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchWindow();
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getYourEmailHasBeenVerifiedLocator().get_Your_Email_Has_Been_Verified())), 15);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getYourEmailHasBeenVerifiedLocator().get_Your_Email_Has_Been_Verified()));
	}

}
