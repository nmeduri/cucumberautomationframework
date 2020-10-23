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

public class AEM_Link_Card_Page extends PageObject {

	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Link_Card_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function naviget to AEM Link Card Page */
	public void navigateTo_Link_Card_Page() throws Exception {

		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Link_Master_Card_Author_Url());

	}
	
	/** This function clicks on link card pannel */
	public void clickLinkCardPannel() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLinkCardPannel())), 5);
	}
	
	/** This function clicks on Error Screen Tab */
	public void clickErrorScreenTab() throws Exception {
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorScreenTab())), 5);
	}
	
	/** This function enter error image detail */
	public void enterErrorImageContent() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLinkCardErrorImageField()), FileReaderManager.getInstance().getAEMDataReader().get_Already_Link_Master_Card_Image());
	}
	
	/** enter link master card details */
	public void enter_link_master_card_details() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLastNameMasterCard()));
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLastNameMasterCard())), 4, FileReaderManager.getInstance().getDataReader().get_Last_Name_Rewards());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getYOBMasterCard())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.ID, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getYearDetail())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getMOBMasterCard())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.ID, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getMOBDetail())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getDOBMasterCardDetail())), 5);
		$click(ExpectedConditions.elementToBeClickable($By(Loc.ID, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getDOBDetail())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getPostalCode())), 4, FileReaderManager.getInstance().getDataReader().get_Postal_Code_Rewards());
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getCardInpput())), 4, FileReaderManager.getInstance().getAEMDataReader().get_Already_Link_Master_Card_Detail());
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button())), 3);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Continue_Button())));
	}
	
	/** verify Error Image changes are reflect on site */
	public void verifyErrorImageChangesReflectOnSite() throws Exception {
		
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Already_Link_Master_Card_Image(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorImagePublish()), "src"));
	}
	
	/** reverse error image changes */
	public void reverseErrorImageChanges() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLastNameMasterCard()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getLinkCardErrorImageField()), FileReaderManager.getInstance().getAEMDataReader().get_Already_Link_Master_Card_Image_Change());
	}
	
	/** This function enter error image text */
	public void enterErrorImageText() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorImageTextField()), FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Text());
	}
	
	/** verify Error Image text changes are reflect on site */
	public void verifyErrorImageTextChangesReflectOnSite() throws Exception {
		
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Text(), $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorImagePublish()), "alt"));
	}
	
	/** reverse error image text changes */
	public void reverseErrorImageTextChanges() throws Exception {
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorImageTextField()), FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Text_Change());
	}
	
	
}
