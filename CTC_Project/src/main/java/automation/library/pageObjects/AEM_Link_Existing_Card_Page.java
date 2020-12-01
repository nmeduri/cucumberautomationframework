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
		Thread.sleep(2000);
		$click(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Link_Existing_Card_Title())),40);
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
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_ButtonFED())));	
	}
	
	
		
	/** This function verify if Cancel CTA label changes reflected in preview */
	public void verifyCancelChangesReflectedFED() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_ButtonFED()));
		String expected = FileReaderManager.getInstance().getAEMDataReader().get_Cancel_CTA_label();
		String actual = $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_ButtonFED()));
		System.out.println(expected);
		System.out.println(actual);
		Assert.assertEquals(expected , actual);
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
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button()));
		String expected = FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_CTA_label();
		String actual = $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_TryAgain_Button()));
		System.out.println(expected);
		System.out.println(actual);
		Assert.assertEquals(expected , actual);
	}

	/** This function enters incorrect card number */
	public void enterDataIncorrectCardNumber() throws Exception {
		driver.navigate().refresh();
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).switchFrameByString("ContentFrame");
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number())), 40);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Enter_Card_Number()), FileReaderManager.getInstance().getDataReader().get_NonExisting_Card_Number());
	}
	
	/** This function clicks on Active validation tab*/
	public void clickOnActiveValidationTab() throws Exception {
		$click(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Validation_Tab())),20);
	}
	
	/** This function verify AEM Active Rewards Card title */
	public void displayActiveRewardsCardTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_Title()));
	}
	
	/** This function verify AEM Active Rewards Card subtitle */
	public void displayActiveRewardsCardSubTitle() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_SubTitle()));
	}
	
	/** enter Data to Title*/
	public void enterDataActiveRewardsCardTitle() throws Exception {
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_Paragraph_Format()));
		//$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Title_Heading2()));
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_Title()));
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_Title())), 10, FileReaderManager.getInstance().getAEMDataReader().get_Active_Rewards_Card_Title_Data());
	}
	
	/** enter Data to SubTitle*/
	public void enterDataActiveRewardsCardSubTitle() throws Exception {
		$clearData($(Loc.XPATH,testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_SubTitle()));
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Rewards_Card_SubTitle())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Rewards_Card_SubTitle_Data());
	}
	
	/** This function verify if Title and subtitle changes reflected in preview */
	public void verifyTitleAndSubTitleChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Rewards_Card_Title_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Ownership_Validation_HeaderText())));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Rewards_Card_SubTitle_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Ownership_Validation_Sub_HeaderText())));
	}

	/** This function verify AEM Yob is displayed */
	public void displayYobInput() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Yob_Input()));
	}
	
	/** This function verify AEM Postal code is displayed */
	public void displayPostalCodeInput() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Postal_Code_Input()));
	}
	
	/** enter Data to Yob*/
	public void enterDataYobInput() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Yob_Input())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Yob_Input())), 5, FileReaderManager.getInstance().getAEMDataReader().get_YOB_Input_Data());
	}
	
	/** enter Data to postal code*/
	public void enterDataPostalCodeInput() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Postal_Code_Input())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Postal_Code_Input())), 5, FileReaderManager.getInstance().getAEMDataReader().get_PostalCode_Input_Data());
	}
	
	/** This function verify if YOB and Postal Code changes reflected in preview */
	public void verifyYobAndPostalCodeChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_YOB_Input_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())));
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_PostalCode_Input_Data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())));
	}
	
	/** This function verify AEM Continue is displayed */
	public void displayContinueCta() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Continue()));
	}
	
	/** enter Data to Continue cta*/
	public void enterDataContinueCta() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Continue())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Continue())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Continue_data());
	}
	
	/** This function verify if Continue changes reflected in preview */
	public void verifyContinueChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Continue_data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Continue_Button())));
	}
	
	/** This function verify AEM Cancel is displayed */
	public void displayCancelCta() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Cancel()));
	}
	
	/** enter Data to Cancel cta*/
	public void enterDataCancelCta() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Cancel())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Card_Cancel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Cancel_data());
	}
	
	/** This function verify if Cancel changes reflected in preview */
	public void verifyActiveCardCancelChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Cancel_data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button())));
	}
	
	/** This function verify AEM Error image field is displayed */
	public void displayErrorImageAEM() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Image_AEM())), 5);
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Image_AEM()));
	}
	
	/** enter Data to Error Image*/
	public void enterDataErrorImage() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Image_AEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Image_AEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Error_Image_data());
	}
	
	/** enter Data to  postal code*/
	public void enterDataPostalCode() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Postal_Code_Rewards())), 5, FileReaderManager.getInstance().getDataReader().get_Postal_Code_Rewards());
	}
	
	/** enter Data to  YOB */
	public void enterDataYob() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth())), 3);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth()));
		$click($(Loc.XPATH, testContext.getPageObjectManager().getANewTriangleRewardsCardLocator().get_Year_Of_Birth_Value_Age_Majority()));
	}
	
	/** This function verify if Cancel changes reflected in preview */
	public void verifyErrorImageChangesReflected() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Error_Img())), 3);
	}
	
	/** This function verify AEM Error text field is displayed */
	public void displayErrorTextAEM() throws Exception {
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Error_Image_AEM())), 5);
		//testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDownToEnd();
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Text()));
	}
	
	/** enter Data to error text*/
	public void enterDataErrorText() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Text())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Text())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Error_Text_data());
	}
	
	/** This function verify if error text changes reflected in preview */
	public void verifyErrorTextChangesReflected() throws Exception {
		System.out.println(FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Error_Text_data());
		
		System.out.println($getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Error_Text())));
		
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Error_Text_data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Active_Error_Text())));
		
	}
	
	/** This function verify AEM Try again is displayed in error screen */
	public void displayTryagainCta() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_TryAgain()));
	}
	
	/** enter Data to Cancel cta*/
	public void enterDataTryAgainCta() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_TryAgain())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_TryAgain())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Try_Again_CTA_label());
	}
	
	/** This function verify AEM Cancel is displayed */
	public void displayErrorScreenCancelCta() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Cancel()));
	}
	
	/** enter Data to Cancel cta*/
	public void enterDataErrorScreenCancelCta() throws Exception {
			$clearData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Cancel())), 5);
			$enterData(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Active_Error_Cancel())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Cancel_data());
	}
	
	/** This function verify AEM Error screen Cancel CTA is present for active validation */
	public void verifyErrorScreenCancelChangesReflected() throws Exception {
		Assert.assertEquals(FileReaderManager.getInstance().getAEMDataReader().get_Active_Card_Cancel_data(), $getText($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Cancel_Button())));	
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
	
	/** enter Data to  upload default error image */
	public void uploadDefaultErrorImage() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Default_Error_Image_Field())), 3);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Pick_Default_Image())), 10);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_CTC_Web_CTR())), 5);
		$click(ExpectedConditions.presenceOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMANewTriangleRewardsCardLocator().get_Link_Rewards_Dam())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMLinkExistingCardLocatorPage().get_Default_Error_Image_Thumbnail())), 10);
		$clickFindElement(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getAEMFooterLocatorPage().get_Select_Aem_Button())), 10);
	}
	
	/** verify button update on screen for already card linked */
	public void verifyDefaultErrorImageChangesReflected() throws Exception {
		String actual = $getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getLinkYourExistingTriangleRewardsAccountLocaoter().get_Default_Error_Image()), "src");
		String expected = (FileReaderManager.getInstance().getAEMDataReader().get_CTC_URL() + FileReaderManager.getInstance().getAEMDataReader().get_Error_Image_Already_Linked_Change());
		Assert.assertEquals(expected, actual);
	}
}
