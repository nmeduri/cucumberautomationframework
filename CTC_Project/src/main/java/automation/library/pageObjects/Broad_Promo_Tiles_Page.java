package automation.library.pageObjects;

import static org.testng.Assert.fail;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.library.cucumber.TestContext;
import automation.library.enums.Locator.Loc;
import automation.library.logdetail.Log;
import automation.library.managers.FileReaderManager;
import automation.library.selenium.core.PageObject;

/**
 * This file contains the functions of Broad Promo Tiles Page
 * 
 */
public class Broad_Promo_Tiles_Page extends PageObject{
	TestContext testContext;
	public static PropertiesConfiguration conf = new PropertiesConfiguration();

	public Broad_Promo_Tiles_Page(WebDriver driver) {

		super(driver);
		testContext = new TestContext();
	}

	/** This function is verify that BroadPromoTiles EN url is available */
	public void navigateTo_BroadPromoTiles_Page_En() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_BroadPromoTiles_Url_En());
	}

	/** This function is verify that BroadPromoTiles FR url is available */
	public void navigateTo_BroadPromoTiles_Page_Fr() throws Exception {
		driver.navigate().to(FileReaderManager.getInstance().getDataReader().get_BroadPromoTiles_Url_Fr());
	}

	/** This function is verify that BroadPromoTiles Page is displayed */
	public void display_BroadPromoTiles_Page() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).getTitle();
	}

	/** scroll down to page */
	public void scrollDownToBroadPromoTiles() throws Exception {
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).scrollDown(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile())), 20);
	}

	/** This function is verify that Broad Promo Tiles is displayed */
	public void displayBroadPromoTiles() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile())), 20);
	}
	/** This function is verify that 2 Tiles are displayed for Broad Promo component*/
	public void display2TilesForBroadPromoComponent() throws Exception {
		List<WebElement> tileslist = PageObject.getDriver().findElements(By.xpath(testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_Broad_Promo_Component_With_2Tiles()));
		Log.message("Size:-  " + tileslist.size(), true);
		if(tileslist.size()==2) {
			Log.message("2 tiles are displayed for each Broad promo Component", true);
		}else
			Log.message("2 tiles are NOT displayed for each Broad promo Component", true);		
	}
	/** This function is verify that promotion image is displayed for first tile*/
	public void displayPromotionImagesForTiles() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Image())), 20);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2Image())), 20);
	}
	/** This function is verify that promotion title is displayed for first tile*/
	public void displayPromotionTitlesForTiles() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Title()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2Title()));
	}
	/** This function is verify that promotion sub-title is displayed for first tile*/
	public void displayPromotionSubTitleForTile1() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1SubTitle()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2SubTitle()));
	}
	/** This function is verify that promotion CTA button is displayed for first tile*/
	public void displayPromotionCTAButtonForTile1() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2CTAButton()));
	}
	/** This function is verify that promotion key-line is displayed for first tile*/
	public void displayPromotionKeyLineForTile1() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1KeyLine()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2KeyLine()));
	}
	/** This function is verify that promotion offer is displayed for first tile*/
	public void displayPromotionOfferForTile1() throws Exception {
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Offer()));
		$display($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2Offer()));
	}
	/** This function is verify that promotion image is displayed for tile1 in mobile */
	public void displayPromotionImagesForTilesMobile() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Image_Mobile())), 20);
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile2Image_Mobile())), 20);
	Log.message("displayPromotionImagesForTilesMobile: ", true);
	}
	/** This function click on promotion image */
	public void clickOnPromotionImage() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Image())), 20);
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Image())));
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchOnChildWindow();
	}
	/** This function click on promotion CTA button */
	public void clickOnPromotionCTAButton() throws Exception {
		$display(ExpectedConditions.visibilityOfElementLocated($By(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton())), 10);
		$click($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton()));
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton())));
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchOnChildWindow();
	}
	/** This function is verify that Automotive | Canadian Tire Page is displayed */
	public void display_Automotive_Page_Title() throws Exception {
		if(testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle().contains("Automotive | Canadian Tire")) {
			Log.message("Automotive page title is displayed : "+testContext.getPageObjectManager().getPageObject(PageObject.getDriver()).getTitle(), true);
		}else {
			Log.message("Automotive page is not displayed", true);
			fail();
		}
		//testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).closeChildWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).parentWindow();
	}
	/** This function click on promotion image on mobile*/
	public void clickOnPromotionImageOnMobile() throws Exception {
		((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1Image_Mobile())));
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchOnChildWindow();
	}
	/** This function click on promotion CTA button */
	public void clickOnPromotionCTAButtonOnMobile() throws Exception {
		$click($(Loc.XPATH, testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton()));
		//((JavascriptExecutor) PageObject.getDriver()).executeScript("arguments[0].click();", $findElement(By.xpath(testContext.getPageObjectManager().getBroadPromoTilesPageLocator().get_BroadPromoTile1CTAButton())));
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchWindow();
		testContext.getPageObjectManager().getBroadPromoTilesPage(PageObject.getDriver()).switchOnChildWindow();	
	}
	
}
