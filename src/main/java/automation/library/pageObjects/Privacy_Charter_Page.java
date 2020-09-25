package automation.library.pageObjects;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.Constant;
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
 * This file contains the functions of Privacy Charters Page
 * 
 */

public class Privacy_Charter_Page extends PageObject {

	
	TestContext testContext;

	public Privacy_Charter_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that Header Privacy Charter is displayed */
	public void display_Header_Privacy_Charter() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Header_Privacy_Charter()));
	}
	
	/** This function click on privacy charter download link */
	public void clickPrivacyCharterDownloadLink() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPrivacyPageLocator().get_Privacy_Charter_Download_Link()));
	}
	
	/** This function is verify that privacy charter is in PDF format */
	public void verifyDowloadPrivacyChartedInPDFFormat() throws Exception {
		Assert.assertTrue(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).isFileDownloaded(Constant.BASE_PATH, ".pdf"));
	}
	
	/** This function is verify that privacy charter is in PDF format */
	public void verifyDownloadPrivacyFileInPDFFormat() throws Exception {
		String link = $getAttributeValue($(Loc.CLASSNAME, testContext.getPageObjectManager().getPrivacyPageLocator().get_Privacy_Charter_Button_Mobile()), "href");
		Assert.assertTrue(link.contains(".pdf") );
	}

}
