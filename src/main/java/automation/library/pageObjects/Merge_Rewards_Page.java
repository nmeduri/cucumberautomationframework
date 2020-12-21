package automation.library.pageObjects;

import static org.testng.Assert.fail;

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
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Checkout Page
 * 
 */
public class Merge_Rewards_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Merge_Rewards_Page(WebDriver driver) {
		super(driver);
		testContext = new TestContext();
	}
	
	/** navigate to author merge rewards page */
	public void navigate_to_merge_rewards_author_page() throws Exception {
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Author_Url());
	}
	
	/** navigate to merge rewards page */
	public void navigate_to_merge_rewards_page() throws Exception {
		PageObject.getDriver().navigate().to(FileReaderManager.getInstance().getDataReader().get_Merge_Rewards_Url());
	}
	
	/** click on merge rewards panel */
	public void clickOnMergeRewardsPanel() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Panel())));
	}
	
	/** click on merge cards tab */
	public void clickOnMergeCardsTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Cards_Tab()));
	}
	
	/** configure merge card title details */
	public void configureMergeCardTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Cards_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Cards_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Title());
	}
	
	/** revert merge card title details */
	public void revertMergeCardTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Cards_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Cards_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Title_Revert());
	}
	
	/** configure merge card sub title details */
	public void configureMergeCardSubTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Sub_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Sub_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Sub_Title());
	}
	
	/** revert merge card sub title details */
	public void revertMergeCardSubTitle() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Sub_Title_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Sub_Title_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Sub_Title_Revert());
	}
	
	/** verify configured merge rewards cards title is displayed on publish page */
	public void configuredMergeRewardsCardsTitleDisplayedOnPublishPage() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated(By.xpath(testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Title())), 40);
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Title());
	}
	
	/** verify configured merge rewards cards title is displayed on publish page */
	public void configuredMergeRewardsCardsSubTitleDisplayedOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Rewards_Sub_Title())), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Rewards_Cards_Sub_Title());
	}
	
	/** click on merge two cards model tab */
	public void clickOnMergeTwoCardsModelTab() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Two_Cards()));
	}
	
	/** configure card input label details */
	public void configureCardInputLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Card_Input_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Card_Input_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Card_Input_Label());
	}
	
	/** revert card input label details */
	public void revertCardInputLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Card_Input_Label()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Card_Input_Label()), FileReaderManager.getInstance().getAEMDataReader().get_Card_Input_Label());
	}
	
	/** click on merge two cards button */
	public void clickOnMergeCardsButton() throws Exception {
		Thread.sleep(10000);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Two_Card_Button())), 40);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Two_Card_Button()));
	}
	
	/** verify configured card input label is displayed on publish page */
	public void configuredCardInputLabelDisplayedOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Input_Card_Label())), FileReaderManager.getInstance().getAEMDataReader().get_Card_Input_Label());
	}
	
	/** configure card input tool tip label details */
	public void configureToolTiptText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tips_Field_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tips_Field_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Merge_Card());
	}
	
	/** revert card input tool tip label details */
	public void revertToolTiptText() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tips_Field_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tips_Field_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Merge_Card_Revert());
	}
	
	/** click on tool tip button */
	public void clickOnToolTipButton() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Button()));
	}
	
	/** verify configured card tool tip is displayed on publish page */
	public void configuredToolTipTextDisplayedOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Message_Merge_Card())), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Merge_Card());
	}
	
	/** configure tool tip label details */
	public void configureToolTiptLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Detail_Merge_Card());
	}
	
	/** revert tool tip label details */
	public void revertToolTiptLabel() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Label_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Label_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Detail_Merge_Card_Revert());
	}
	
	/** verify configured card tool tip label is displayed on publish page */
	public void configuredToolTipLabelDisplayedOnPublishPage() throws Exception {
		Assert.assertEquals($getText($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Tool_Tip_Label())), FileReaderManager.getInstance().getAEMDataReader().get_Tool_Tip_Label_Detail_Merge_Card());
	}
	
	/** configure merge card image details */
	public void configureMergeCardImageDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Card_Image_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Card_Image_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Card_Image());
	}
	
	/** revert merge card image details */
	public void revertMergeCardImageDetails() throws Exception {
		$clearData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Card_Image_AEM()));
		$enterData($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Card_Image_AEM()), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Card_Image_Revert());
	}
	
	/** verify configured merge card image detail is displayed on publish page */
	public void configuredMergeCardImagwDisplayedOnPublishPage() throws Exception {
		Assert.assertEquals($getAttributeValue($(Loc.XPATH, testContext.getPageObjectManager().getMergeRewardsLocator().get_Merge_Card_Image()), "alt"), FileReaderManager.getInstance().getAEMDataReader().get_Merge_Card_Image());
	}
}
