package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
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
 * This file contains the functions of PDP Page
 * 
 */

public class AEM_Common_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Common_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function is verify that Arrow Icon is displayed */
	public void clickArrowIcon() throws Exception {

		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getArrowSignIn())), 3);

	}
	
	/** enter username */
	public void enterUsername() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getAEMUserName()), FileReaderManager.getInstance().getAEMDataReader().get_AEM_Admin_User());
	}
	
	/** enter password */
	public void enterPassword() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getAEMPassword()), FileReaderManager.getInstance().getAEMDataReader().get_AEM_Admin_Password());
	}
	
	/** This function clicks on sign in button */
	public void clickSignInButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getAEMSignInButton()));
	}
	
	/** This function clicks on close button */
	public void clickCloseButton() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getCloseButton())), 5);
	}
	
	/** This function clicks on thumbnail SRP */
	public void clickThumbnailSRP() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getThumbnailSRP()));
	}

	/** This function clicks on edit icon */
	public void clickEditIcon() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().getEditIconHeader())));
	}
	
	/** This function click on configure Button */
	public void clickConfigureButton() throws Exception {
		try {
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().getConfigureButton())), 5); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** This function clicks on Page Information */
	public void clickOnPageInformation() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().get_Page_Information())),20);
	}
	
	/** This function clicks on Publish Page */
    public void clickOnPublishPage() throws Exception {
    	$click(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().get_Publish_Page())), 5);
       //((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().get_Publish_Page())),20);
        try {
        if($display($$$$(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().get_SelectAll_Checkbox(), 10))) {
            $click($(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().get_Publish_Button()));
            }
        }
        catch(Exception e) {
            Log.message("select all checkbox not displayed", true);
        }
    }
    
	/** This function clicks on preview button */
	public void clickPreviewButton() throws Exception {
		Thread.sleep(5000);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 5);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 5);
	}
	
	/** This function clicks on Edit button */
	public void clickEditButton() throws Exception {
		Thread.sleep(2000);
		//$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getEditButton())), 20);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMCommonPageLocator().getEditButton())),40);
		driver.navigate().refresh();
	}

	/** This function clicks on preview button */
    public void clickOnThePreviewButton() throws Exception {
        Thread.sleep(5000);
        $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 20);
        $click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 20);
        testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
    }
    
    /** This function clicks on preview button */
    public void clickOnThePreviewButtonAfterRefresh() throws Exception {
    	driver.navigate().refresh();
        Thread.sleep(5000);
        $display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 20);
        $click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMCommonPageLocator().getPreviewButton())), 20);
        testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
    }
	
}
