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

public class AEM_PLP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_PLP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function naviget to PLP Page */
	public void navigateTo_PLP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PLP_Author_Url());

	}
	
	/** This function clicks on PLP Pannel */
	public void clickPLPPannel() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPLPPannel()), 10);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getPLPPannel()));
	}
	
	/** This function update data to Initial Number of Products */
	public void updateDataIntialNumberOfProducts() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts()), FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products());
	}
	
	/** This function is verify that number of product changes are reflected on site */
	public void verifyNumberOfProductsChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_Grid_View_Button()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())), 10);
		Assert.assertTrue($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getShowMore())).contains(FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPLPLocatorPage().get_List_View_Button()));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse the product number changes */
	public void reverseProductNumberChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts())), 5);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMPLPLocatorPage().getInitialNumberOfProducts()), FileReaderManager.getInstance().getAEMDataReader().get_Initial_Number_Of_Products_Reverse_Changes());
	}
	
}
