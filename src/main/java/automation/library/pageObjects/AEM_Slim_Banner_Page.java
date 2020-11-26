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
/**
 * This file contains the functions of AEM slim banner component page
 * 
 */
public class AEM_Slim_Banner_Page extends PageObject{
TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Slim_Banner_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to slim banner Page */
	public void navigateTo_Slim_banner_Page() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_slim_banner_URL());
	}
	/** This function click on slim banner Page */
	public void click_on_Slim_banner_Page() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getSlimBannerComponentAEM())), 5);
	}
	/** This function update banner type field */
	public void updateBannerTypeLabel() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerTypeFieldAEM())), 5);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerTypeFieldValueAEM())), 5);
	}
	/** This function update banner title field */
	public void updateBannerTitleLabel() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerTitleAEM())), 5);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerTitleAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerTitleAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_slim_banner_title());

	}
	/** This function update banner description field */
	public void updateBannerDescLabel() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerDescriptionAEM())), 5);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerDescriptionAEM())), 5);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerDescriptionAEM())), 5, FileReaderManager.getInstance().getAEMDataReader().get_slim_banner_desc());

	}
	/** This function verify error message when mandatory fields are not filled */
	public void dontFillmandatoryFieldandsave() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerDescriptionAEM())), 5);

		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getBannerDescriptionAEM())), 10
				);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton()));
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMSlimBannerpageLocator().getErrorMessageSlimBannerAEM())), 50);

	}
}