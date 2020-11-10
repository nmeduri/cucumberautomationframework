package automation.library.pageObjects;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.managers.PageObjectManager;
import automation.library.selenium.core.Element;
import automation.library.selenium.core.PageObject;
import automation.library.selenium.exec.driver.factory.DriverFactory;
import cucumber.api.java8.Pa;
import edu.emory.mathcs.backport.java.util.Collections;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Footer Page
 * 
 */

public class AEM_Link_Existing_Card_Page extends PageObject {
	
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Link_Existing_Card_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to AEM Link Existing Card Page */
	public void navigateToLinkExistingCardScreen() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Link_Existing_Card_Url());
	}
	
	/** This function navigate to Link Existing Card Page */
	public void navigateToLinkExistingCardScreenPage() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_Existing_Card_Url());
	}
	
	/** This function clicks on AEM Link Existing Card title */
	public void clickOnAemLinkExistingCardTitle() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Link_Existing_Card_Title())),40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Link_Existing_Card_Title())));
	}
	
	/** This function verify AEM Link Existing Card title */
	public void displayTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM()));
	}
	
	/** This function verify AEM Link Existing Card Sub title */
	public void displaySubTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Sub_Title_AEM()));
	}
	
	/** enter Data to Title property */
	public void enterDataTitle() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_Paragraph_Format()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_Heading2()));
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Link_Card_Page_Title_Data());
	}
	
	/** enter Data to SubTitle property */
	public void enterDataSubTitle() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Sub_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Link_Existing_Card_Sub_Title());
	}
	
	/** enter Data to Tooltip label */
	public void enterDataTooltipLabel() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Label())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Text_label());
	}
	
	/** This function verify in AEM if tooltip label is present */
	public void displayTooltipLabel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Label()));
	}
	
	/** This function verify in AEM if Dont have field is present */
	public void displayDontHaveCardText() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Dont_Have_Card_Text())), 5);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Dont_Have_Card_Text()));
	}
	
	/** This function verify in AEM if Get one here label field is present */
	public void displayGetOneHereLabel() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_One_Here_Text()));
	}
	
	/** This function verify in AEM if Get one here link field is present */
	public void displayGetOneHereLink() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_One_Here_Link()));
	}
	
	/** enter Data to Dont have text */
	public void enterDataDontHaveCardText() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Dont_Have_Card_Text())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Dont_Have_Card_Text());
	}
	
	/** enter Data to Get One Here text */
	public void enterDataGetOneHereLabel() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_One_Here_Text())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_One_Here_Text());
	}
	
	/** enter Data to Get One Here text */
	public void enterDataGetOneHereLink() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_One_Here_Link())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_One_Here_Link());
	}
	
	/** enter Data to Cancel cta */
	public void enterDataCancelCTA() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Cancel_CTA())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Cancel_CTA())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA());
	}
	
	/** This function verify in Preview if Dont have Card label text is present */
	public void displayDontHaveCardPreview() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Dont_Have_Card_Preview()));
	}
	
	/** This function verify AEM Cancel CTA is present */
	public void displayCancelCTA() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Cancel_CTA()));
	}
	
	/** This function verify Title changes reflected in preview */
	public void VerifyTitleTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Link_Card_Page_Title_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Link_Existing_Card_Title())));
	}
	
	/** This function verify Subtile changes reflected in preview */
	public void VerifySubTitleTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Link_Existing_Card_Sub_Title(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Sub_Header())));
	}
	
	/** This function verify AEM Cancel CTA is present */
	public void verifyCancelChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button())));	
	}
	
	/** This function verify if AEM Input field is present */
	public void displayInputField() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Input_Field_label()));
	}
	
	/** enter Data to Input Field*/
	public void enterDataInputField() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Input_Field_label())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Input_Field_label())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Input_Field_Data());
	}
	
	/** This function verify Input Field label changes reflected in preview */
	public void VerifyInputFieldTextChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Input_Field_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Input_Field_Preview())));
	}
	
	/** This function verify Tooltip label changes reflected in preview */
	public void VerifyTooltipLabelChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Text_label(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Tooltip_Message())));
	}
	
	/** This function verify if dont have card label changes reflected in preview */
	public void VerifyLabelChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Text_label(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Tooltip_Message())));
	}
	
	/** This function verify if Get one here link changes reflected in preview */
	public void VerifyLinkChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_One_Here_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_One_Here_Preview())));
	}
	
	/** This function verify if AEM Tooltip Header text field is present */
	public void displayTooltipHeaderText() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Header_Text())), 5);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Header_Text()));
	}
	
	/** This function verify if AEM Tooltip content field is present */
	public void displayTooltipContent() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Content()));
	}
	
	/** enter Data to Tooltip header text*/
	public void enterDataTooltipHeaderText() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Header_Text())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Header_Text())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Header_Text());
	}
	
	/** enter Data to Tooltip Content Text*/
	public void enterDataTooltipContent() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Content())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Content())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Content());
	}
	
	/** This function verify if Tooltip Header text changes reflected in preview */
	public void VerifyTooltipHeaderTextChangesReflected() throws Exception {
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Button_Preview())),20);
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Header_Text(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Header_Text_Preview())));
	}
	
	/** This function verify if Tooltip Content changes reflected in preview */
	public void VerifyTooltipContentChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Tooltip_Content(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Tooltip_Content_Preview())));
	}
	
	/** This function clicks on AEM Link Existing Card Error Tab */
	public void clickOnLinkExistingErrorTab() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Tab())),40);
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Tab())));
	}
	
	/** enter Data to TryAgain CTA*/
	public void enterDataTryAgainText() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_TryAgain_CTA_AEM())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_TryAgain_CTA_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_CTA_label());
	}
	
	/** enter Data to TryAgain CTA*/
	public void enterDataCancelText() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Cancel_CTA_AEM())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Cancel_CTA_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA_label());
	}
	
	/** This function verify if TryAgain CTA label changes reflected in preview */
	public void verifyTryAgainChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_CTA_label(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button())));
	}

	/** This function enters incorrect card number */
	public void enterDataIncorrectCardNumber() throws Exception {
		driver.navigate().refresh();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 40);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_NonExisting_Card_Number());
	}
	
	/** update error already link card image */
	public void updateErrorAlreadyLinkCardImage() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getErrorImageAlreadyLinkCard())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getErrorImageAlreadyLinkCard()), FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Already_Linked());
		$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkCardPageLocator().getErrorImageOption())), 5);
	}
	
	/** revert error already link card image */
	public void revertErrorAlreadyLinkCardImage() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getErrorImageAlreadyLinkCard())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getErrorImageAlreadyLinkCard()), FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Already_Linked_Change());
	}
	
	/** update try again button for already link card image */
	public void updateTryAgainButtonAlreadyCardLink() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getTryAgainButtonAlreadyLinkCard())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getTryAgainButtonAlreadyLinkCard()), FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_Button_Already_Linked());
	}
	
	/** revert try again button label for already link card image */
	public void revertTryAgainButtonAlreadyCardLink() throws Exception {
		$clearData(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getTryAgainButtonAlreadyLinkCard())), 10);
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().getTryAgainButtonAlreadyLinkCard()), FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_Button_Already_Linked_Change());
	}
	
	/** verify error image update on screen for already card linked */
	public void verifyErrorImageUpdateOnScreenForAlreadyCardLinked() throws Exception {
		String expectedResult = $getAttributeValue($(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Error_Image())), 10), "src");
		Log.message("expectedResult:- " + expectedResult, true);
		Log.message("actualResult:- " + FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Already_Linked(), true);
		Assert.assertTrue(expectedResult.contains(FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Already_Linked()));
	}
	
	/** verify button update on screen for already card linked */
	public void verifyButtonTextUpdateOnScreenForAlreadyCardLinked() throws Exception {
		String expectedResult = $getText($(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button())), 10));
		Assert.assertEquals(expectedResult, FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_Button_Already_Linked());
	}
}
