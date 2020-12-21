package automation.library.pageObjects;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;
import automation.library.logdetail.Log;

/**
 * This file contains the functions of Broad Promo Tiles Page
 * 
 */
public class AEM_Account_Merge_Reward_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Account_Merge_Reward_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to account merge reward Page */
	public void navigateTo_account_merge_Reward_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_mergeReward_URL());
	}
	/** This function navigate to cart fragment Page */
	public void navigateTo_cartFragment_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_cartFragment_URL());
	}
	/** This function click on  merge reward component */
	public void click_merge_reward_component() throws Exception {
		testContext.getPageObjectManager().getPageObject(driver).scrollUp();
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_MergeRewardsComponent())), 10);
	}
	/** This function click on  error screen component */
	public void click_errorScreen_Tab() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_ErrorScreenTab())), 10);
	}
	/** This function update error message in merge reward page */
	public void update_errormessage() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_DefaultErrorMsg())), 10);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_DefaultErrorMsg())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_DefaultErrorMsg())), 10, FileReaderManager.getInstance().getAEMDataReader().get_ErrorMsgMergeReward());
	}
	/** This function update cancel label */
	public void update_cancellabel() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_cancelLabel())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_cancelLabel())), 10, FileReaderManager.getInstance().getAEMDataReader().get_cancelCTALabel_cartFragment());
	}
	/** This function update try agin CTA label  */
	public void update_TryAgainCTA() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_TryAgainCTA())), 10);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMAccountMergeRewardPageLocator().get_TryAgainCTA())), 10, FileReaderManager.getInstance().getAEMDataReader().get_TryAgainCTA_cartFragment());
	}
}