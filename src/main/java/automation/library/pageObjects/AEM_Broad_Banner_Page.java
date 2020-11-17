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
 * This file contains the functions of Broad banner Page
 * 
 */
public class AEM_Broad_Banner_Page extends PageObject{
	TestContext testContext;
	
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public AEM_Broad_Banner_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();

	}
	
	/** This function navigate to Broad Banner Page_AEM */
	public void navigateTo_Broad_Banner_Page_AEM() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getAEMDataReader().get_Broad_Banner_Url_AEM());
	}
	
	
	/** This function clicks on Broad Banner component */
	public void clickBroadPromoTilesComponent() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_broad_Banner_Component())),30);
		testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).scrollDown($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_broad_Banner_Component()), 20);
		//$click(ExpectedConditions.elementToBeClickable($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadPromoTilesPageLocator().getBroadPromoTilesComponent())), 10);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_broad_Banner_Component())));
	}
	/** This function displays banner image field */
	public void displayBannerImageField() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_banner_image_Field())),30);
		}
	/** This function displays Alt Text field */
	public void displayBannerAltTextField() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_ImageAltText())),30);
		}
	/** This function displays image Orientation field */
	public void displayImageOrientation() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_ImageOrientationField())),30);
		}
	/** This function displays banner title field */
	public void displayBannertitleField() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())),30);
		}
	/** This function update banner type field */
	public void updateBannerType() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerType_BroadBanner())),30);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_RegularBannerBroadValue())),30);

	}
	/** This function update background color type field */
	public void updateBackgroundcolor() throws Exception {
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BackgroundColour())),30);
		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BackgroundColour())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Broad_Banner_BackGroundColor());

	}
	/** This function update font color field */
	public void updateFontColor() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_FontColor())),30);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_FontColorWhiteValue())),30);

	}
	/** This function update banner Title field */
	public void updateBannerTitle() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())),30);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())),30);

		$enterData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())), 5, FileReaderManager.getInstance().getAEMDataReader().get_Broad_Banner_Title());

	}
	/** This function update banner Image Orientation field */
	public void updateBannerImageOrientation() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_ImageOrientationField())),30);
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_RightOrientation())),30);

	}
	/** This function clear the mandatory field and click on done button */
	public void clear_the_mandatory_field_and_click_on_done_button() throws Exception {
		$click(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())),30);
		$clearData(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerTitle_BroadBanner())),30);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getAEMSearchAndSRPPageLocator().getCheckButton()));

	}
	/** This function display error image  */
	public void displayErrorImage() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_Error_message()));

	}
	/** This function display updated broad banner changes on site */
	public void displayUpdatedBroadBannerchanges() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getAEMBroadBannerPageLocator().get_BannerImageOnSite()));

	}
	
}