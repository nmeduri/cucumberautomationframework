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

public class AEM_Search_And_SRP_Page extends PageObject {
	
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Search_And_SRP_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function naviget to Search Page */
	public void navigateTo_Search_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_SRP_Url());

	}
	
	/** This function naviget to Place Holder Page */
	public void navigateTo_Place_Holder_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Search_Bar_Url());

	}
	/** This function clicks on Search Title */
	public void clickSearchTitle() throws Exception {
		
		try {
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchTitle())), 5); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	
	/** enter Data to Auto Corrective Search Message */
	public void enterDataAutoCorrectiveSearchMessage() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getAutoCorrectiveSearchMessage())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getAutoCorrectiveSearchMessage())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Corrective_Search_Message()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to Search Title */
	public void enterDataSearchTitle() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchTitleField())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchTitleField())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Search_Title_AEM()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to Result Label */
	public void enterDataResultLabel() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getResultLabelField())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getResultLabelField())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Result_Label()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to No Result Title */
	public void enterDataNoResultTitle() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getNoResultTitleField())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getNoResultTitleField())), 5, FileReaderManager.getInstance().getAEMDataReader().get_No_Result_Title()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to Similar Result Title */
	public void enterDataSimilarResultTitle() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSimilarResultTitle())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSimilarResultTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Similar_Result_Title()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to Suggestive Message */
	public void enterDataSuggestiveMessage() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSuggestiveMessage())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSuggestiveMessage())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Suggestive_Message()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** enter Data to Search Result Threshold */
	public void enterDataSearchResultThresholdMessage() throws Exception {
		try {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchResultThreshold())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchResultThreshold())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Search_Result_Threshold()); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** user clicks on check button */
	public void clickCheckButton() throws Exception {
		try {
			$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton())), 5); 
		}catch(Exception e) {
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).closeChildWindow();
			testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).parentWindow();
			fail();
		}
	}
	
	/** user clicks on done button */
	public void clickDoneButton() throws Exception {
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton())));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton()));
	}
	
	/** This function clicks on Search Bar */
	public void clickSearchBar() throws Exception {
         $click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getSearchBar())), 5);
	}
	
	/** Update Desktop Place holder label */
	public void updateDesktopPlaceHolderLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getDesktopPlaceHolder()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getDesktopPlaceHolder())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Place_Holder_Label());
	} 
	
	/** revert place holder label changes */
	public void revertPlaceHolderLabelChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getDesktopPlaceHolder()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getDesktopPlaceHolder())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Place_Holder_Revert_Label());
	} 
	
	/** This functions verify Place holder label is successfully updated on site */
	public void displayUpdatedPlaceHolderLabelOnSite() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		$displayFindElement(By.xpath("//*[text()='" +  FileReaderManager.getInstance().getAEMDataReader().get_Place_Holder_Label() + "']"));
		PageObject.getDriver().switchTo().parentFrame();
	}
}
