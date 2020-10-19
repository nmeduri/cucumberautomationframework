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

public class AEM_PDP_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_PDP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to PDP Page */
	public void navigateTo_PDP_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_PDP_Url());

	}
	
	/** This function clicks on specifications section */
	public void clickSpecificationsSection() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsSection()), 10);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsSection())), 5);
	}
	
	/** This function update to specification label */
	public void updateSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Specifications());
	}
	
	/** This function update to view more specification label */
	public void updateViewMoreSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications());
	}
	
	/** This function update to view Less specification label */
	public void updateViewLessSpecificationLabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications());
	}
	
	/** This function update to set number of specifications */
	public void updateSetNumberOfSpecificationsa() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications());
	}
	
	/** This function is verify that changes are reflected on site */
	public void verifyChangesReflectOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Specifications() + "']"));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications())));
		List<Element> list = $$(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_Specifications_In_Tabular_Format());
		Assert.assertEquals(Integer.parseInt(FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications()), list.size());
		$click($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications()));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getPDPPageLocator().get_View_More_Less_Specifications())));
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** revert specifications changes */
	public void reverSpecificationsChanges() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSpecificationsTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewMoreSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_More_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getViewLessSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_View_Less_Specifications_Reverse_Changes());
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().gettAEMPDPPPageLocator().getSetNumberOfSpecifications())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Set_Number_Of_Specifications_Reverse_Changes());
	} 
}
