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
 * This file contains the functions of AEM footer
 * 
 */

public class AEM_Featured_List_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Featured_List_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}

	/** This function navigate to Feature List Author Page Page */
	public void navigateTo_Feature_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Author_Page());

	}
	
	/** This function navigate to Informational Feature List Author Page Page */
	public void navigateTo_informational_Feature_List_Author_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Informational_Feature_List_Author_Page());

	}
	
	/** This function navigate to Feature List Page Page */
	public void navigateTo_Feature_List_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Feature_List_Url());

	}
	
	/** this function clicks on feature list panel */
	public void clickFeatureListPanel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListPanel())), 15);
	}
	
	/** enter feature sub title title */
	public void enterFeatureSubTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
	}
	
	/** reverse feature sub title details */
	public void reverseSubTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First_Change());
	}
	
	/** clear mandatory fields*/
	public void clearMandatoryFields() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
		Thread.sleep(2000);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureAltTextOne())), 5);
	}
	
	/** alert is getting dispalyed for mandatory field */
	public void displayAlertForImageMandatoryField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getErrorAlertMandatory()));
	}
	
	/** reverse feature image one details */
	public void reverseImageOneDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListTitle()), FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}
	
	/** click on select type featured list drop down */
	public void clickSelectTypeDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSelectTypeFeaturedListDropDown())), 5));
	}
	
	/** select image option select type featured list drpp down */
	public void selectImageOptionSelectTypeFeaturedListDropDown() throws Exception {
		$click($(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getImageOptionSelectFeatureList())), 5));
	}
	
	/** verify authroing mini thershold error message */
	public void veifyAuthoringMinimumThersholdErrorMessage() throws Exception {
		String expectedResult = PageObject.getDriver().switchTo().alert().getText();
		Log.message("Alert Text:- " + expectedResult, true);
		Assert.assertEquals(expectedResult, "You have to at least add 4 items in multifield"); 
		PageObject.getDriver().switchTo().alert().accept();
	}
	
	/** enter learn more link detail */
	public void enterLearnMoreLinkDetail() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getLearnMoreLink()), FileReaderManager.getInstance().getAEMDataReader().get_Learn_More_Link_One());
	}
	
	/** verify - Featured list Information Sub Title */
	public void verifyFeaturedListInfomationalSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getFeatureListPageLocator().getFeatureListSubTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** verify - Featured list Image Sub Title */
	public void verifyFeaturedListImageSubTitle() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getFeatureListImageSubTitle())), FileReaderManager.getInstance().getAEMDataReader().get_Sub_Title_First());
		PageObject.getDriver().switchTo().parentFrame();
	}
	
	/** reverse feature sub title details */
	public void reverseFLImageSubTitleDetails() throws Exception{
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMFeatureListPageLocator().getSubTitleFirst()), FileReaderManager.getInstance().getAEMDataReader().get_FL_Image_Sub_Title_First_Change());
	}
	
}
